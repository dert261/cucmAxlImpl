package com.cisco.risapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-06-29T10:51:42.638+03:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "RISService70", 
                  wsdlLocation = "file:schema/RISPort/RISService70.wsdl",
                  targetNamespace = "http://schemas.cisco.com/ast/soap") 
public class RISService70 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.cisco.com/ast/soap", "RISService70");
    public final static QName RisPort70 = new QName("http://schemas.cisco.com/ast/soap", "RisPort70");
    static {
        URL url = null;
        try {
            url = new URL("file:schema/RISPort/RISService70.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RISService70.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:schema/RISPort/RISService70.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RISService70(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RISService70(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RISService70() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RISService70(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RISService70(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RISService70(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RisPortType
     */
    @WebEndpoint(name = "RisPort70")
    public RisPortType getRisPort70() {
        return super.getPort(RisPort70, RisPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RisPortType
     */
    @WebEndpoint(name = "RisPort70")
    public RisPortType getRisPort70(WebServiceFeature... features) {
        return super.getPort(RisPort70, RisPortType.class, features);
    }

}
