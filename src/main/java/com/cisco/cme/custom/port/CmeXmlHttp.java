package com.cisco.cme.custom.port;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.codec.binary.Base64;

import com.cisco.cme.custom.xml.Axl;
import com.cisco.cme.custom.xml.Body;
import com.cisco.cme.custom.xml.Envelope;
import com.cisco.cme.custom.xml.ObjectFactory;
import com.cisco.cme.custom.xml.Request;
import com.cisco.cme.custom.xml.Response;


public class CmeXmlHttp extends CmeJaxbPort{
	
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	private String host;
	private String username;
	private String password;
	
	public CmeXmlHttp(String host, String username, String password) {
		super();
		this.host = host;
		this.username = username;
		this.password = password;
		this.marshaller = marshaller();
		this.unmarshaller = unmarshaller();
	}
	
	private Marshaller marshaller() {
		Marshaller marshaller = null;
		try {
			JAXBContext jc = JAXBContext.newInstance("com.cisco.cme.custom.xml");
			marshaller = jc.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return marshaller;
	}
	
	private Unmarshaller unmarshaller() {
		Unmarshaller unmarshaller = null;
		try {
			JAXBContext jc = JAXBContext.newInstance("com.cisco.cme.custom.xml");
			unmarshaller = jc.createUnmarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return unmarshaller;
	}
	
	private HttpURLConnection httpUrlConnection(){
		HttpURLConnection httpUrlConnection = null;
		if(host!=null){
			try {
				httpUrlConnection = (HttpURLConnection) new URL("http://"+host+"/ios_xml_app/cme").openConnection();
				httpUrlConnection = setPacketProperties(httpUrlConnection);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return httpUrlConnection;
	}
	
	private String baseEncoding(){
		return Base64.encodeBase64String((username+":"+password).getBytes());
	}
	
	private HttpURLConnection setPacketProperties(HttpURLConnection httpUrlConnection) throws ProtocolException{
		if(httpUrlConnection!=null){
			httpUrlConnection.setRequestMethod("POST");
		    httpUrlConnection.setRequestProperty("content-type", "text/xml; charset=utf-8");
		    httpUrlConnection.setRequestProperty("accept", "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2");
		    httpUrlConnection.setRequestProperty("Authorization", "Basic "+baseEncoding());
		    httpUrlConnection.setRequestProperty("Connection", "keep-alive");
		    httpUrlConnection.setDoInput(true);
		    httpUrlConnection.setDoOutput(true);
		    httpUrlConnection.setConnectTimeout( 20000 );
		    httpUrlConnection.setReadTimeout( 20000 );
		    httpUrlConnection.setUseCaches (false);
		    httpUrlConnection.setDefaultUseCaches (false);
		}
	    return httpUrlConnection;
	}
	
	protected Response request(Request request) throws IOException, JAXBException{
		Response response = null;
		HttpURLConnection httpUrlConnection = httpUrlConnection();
	    if(httpUrlConnection!=null){
	    	Axl axlRequest = new Axl();
		    axlRequest.setRequest(request);
		    Body body = new Body();
		    body.setAxl(axlRequest);
		    Envelope envelope = new Envelope();
		    envelope.setBody(body);
		    
		    ObjectFactory objectFactory = new ObjectFactory();
	        JAXBElement<Envelope> soapRequest =  objectFactory.createEnvelopeSoapEnv(envelope);
	        	        
		    OutputStreamWriter writer = new OutputStreamWriter( httpUrlConnection.getOutputStream() );
		    marshaller.marshal(soapRequest, new StreamResult(writer));
		    writer.flush();
		    writer.close();
		    		    
		    // reading the response
		    InputStreamReader reader = new InputStreamReader( httpUrlConnection.getInputStream() );
		    Envelope result = (Envelope) JAXBIntrospector.getValue(unmarshaller.unmarshal(new StreamSource(reader)));
		    		    
		    if(result!=null){
		    	response = result.getBody().getAxl().getResponse();
		    }
	    }
	    return response;
    }
}
