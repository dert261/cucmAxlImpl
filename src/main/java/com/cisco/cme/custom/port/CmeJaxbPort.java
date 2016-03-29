package com.cisco.cme.custom.port;

import java.io.IOException;
import javax.xml.bind.JAXBException;

import com.cisco.cme.custom.xml.ISgetDevice;
import com.cisco.cme.custom.xml.ISgetDeviceTemplate;
import com.cisco.cme.custom.xml.ISgetExtension;
import com.cisco.cme.custom.xml.ISgetExtensionTemplate;
import com.cisco.cme.custom.xml.ISgetGlobal;
import com.cisco.cme.custom.xml.ISgetPresenceGlobal;
import com.cisco.cme.custom.xml.ISgetSessionServer;
import com.cisco.cme.custom.xml.ISgetSipDevice;
import com.cisco.cme.custom.xml.ISgetSipExtension;
import com.cisco.cme.custom.xml.ISgetUser;
import com.cisco.cme.custom.xml.ISgetUserProfile;
import com.cisco.cme.custom.xml.ISgetUtilityDirectory;
import com.cisco.cme.custom.xml.ISgetVoiceHuntGroup;
import com.cisco.cme.custom.xml.ISgetVoiceRegGlobal;
import com.cisco.cme.custom.xml.Request;
import com.cisco.cme.custom.xml.Response;

public abstract class CmeJaxbPort {
	
	protected abstract Response request(Request request) throws IOException, JAXBException;
	
	private Response soapRequest(Request request){
		Response response = null;
		try {
			response = request(request);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	//---------- Global Settings ---------------//
	public Response getGlobalSettings(){
		Request request = new Request();
		request.setISgetGlobal(new ISgetGlobal());
		return soapRequest(request);
	}
	
	//---------- Device ---------------//
	public Response getAllDevices(){
		Request request = new Request();
		ISgetDevice devReq = new ISgetDevice();
		devReq.setISKeyword("all");
		request.setISgetDevice(devReq);
		return soapRequest(request);
	}
	public Response getAllDevicesByTag(){
		Request request = new Request();
		ISgetDevice devReq = new ISgetDevice();
		devReq.setISKeyword("allTag");
		request.setISgetDevice(devReq);
		return soapRequest(request);
	}
	public Response getDeviceById(String id){
		Request request = new Request();
		ISgetDevice devReq = new ISgetDevice();
		devReq.setISDevID(id);
		request.setISgetDevice(devReq);
		return soapRequest(request);
	}
	public Response getDeviceByName(String name){
		Request request = new Request();
		ISgetDevice devReq = new ISgetDevice();
		devReq.setISDevName(name);
		request.setISgetDevice(devReq);
		return soapRequest(request);
	}
	
	//---------- Extension ---------------//
	public Response getAllExtensions(){
		Request request = new Request();
		ISgetExtension extReq = new ISgetExtension();
		extReq.setISKeyword("all");
		request.setISgetExtension(extReq);
		return soapRequest(request);
	}
	public Response getAllExtensionsByTag(){
		Request request = new Request();
		ISgetExtension extReq = new ISgetExtension();
		extReq.setISKeyword("allTag");
		request.setISgetExtension(extReq);
		return soapRequest(request);
	}
	public Response getExtensionById(String id){
		Request request = new Request();
		ISgetExtension extReq = new ISgetExtension();
		extReq.setISExtID(id);
		request.setISgetExtension(extReq);
		return soapRequest(request);
	}
	public Response getExtensionByNumber(String number){
		Request request = new Request();
		ISgetExtension extReq = new ISgetExtension();
		extReq.setISExtNumber(number);
		request.setISgetExtension(extReq);
		return soapRequest(request);
	}
	
	//---------- Global SIP Settings ---------------//
	public Response getGlobalSipSettings(){
		Request request = new Request();
		request.setISgetVoiceRegGlobal(new ISgetVoiceRegGlobal());
		return soapRequest(request);
	}
	//---------- SIP Devices ---------------//
	public Response getAllSipDevices(){
		Request request = new Request();
		ISgetSipDevice devReq = new ISgetSipDevice();
		devReq.setISKeyword("all");
		request.setISgetSipDevice(devReq);
		return soapRequest(request);
	}
	public Response getAllSipDevicesByTag(){
		Request request = new Request();
		ISgetSipDevice devReq = new ISgetSipDevice();
		devReq.setISKeyword("allTag");
		request.setISgetSipDevice(devReq);
		return soapRequest(request);
	}
	public Response getSipDeviceById(String id){
		Request request = new Request();
		ISgetSipDevice devReq = new ISgetSipDevice();
		devReq.setISPoolID(id);
		request.setISgetSipDevice(devReq);
		return soapRequest(request);
	}
	public Response getSipDeviceByName(String name){
		Request request = new Request();
		ISgetSipDevice devReq = new ISgetSipDevice();
		devReq.setISPoolName(name);
		request.setISgetSipDevice(devReq);
		return soapRequest(request);
	}
	
	//---------- SIP Extension ---------------//
	public Response getAllSipExtensions(){
		Request request = new Request();
		ISgetSipExtension extReq = new ISgetSipExtension();
		extReq.setISKeyword("all");
		request.setISgetSipExtension(extReq);
		return soapRequest(request);
	}
	public Response getAllSipExtensionsByTag(){
		Request request = new Request();
		ISgetSipExtension extReq = new ISgetSipExtension();
		extReq.setISKeyword("allTag");
		request.setISgetSipExtension(extReq);
		return soapRequest(request);
	}
	public Response getSipExtensionById(String id){
		Request request = new Request();
		ISgetSipExtension extReq = new ISgetSipExtension();
		extReq.setISVoiceRegDNID(id);
		request.setISgetSipExtension(extReq);
		return soapRequest(request);
	}
	public Response getSipExtensionByNumber(String number){
		Request request = new Request();
		ISgetSipExtension extReq = new ISgetSipExtension();
		extReq.setISVoiceRegNumber(number);
		request.setISgetSipExtension(extReq);
		return soapRequest(request);
	}
	
	//---------- Sip Presence Global ---------//
	public Response getSipPresenceGlobal(){
		Request request = new Request();
		ISgetPresenceGlobal presenceReq = new ISgetPresenceGlobal();
		request.setISgetPresenceGlobal(presenceReq);
		return soapRequest(request);
	}
	
	//---------- Sip Session Server ---------//
	public Response getAllSipSessionServer(){
		Request request = new Request();
		ISgetSessionServer sessServerReq = new ISgetSessionServer();
		sessServerReq.setISKeyword("all");
		request.setISgetSessionServer(sessServerReq);
		return soapRequest(request);
	}
	
	public Response getSipSessionServerById(String id){
		Request request = new Request();
		ISgetSessionServer sessServerReq = new ISgetSessionServer();
		sessServerReq.setISSessionServerID(id);
		request.setISgetSessionServer(sessServerReq);
		return soapRequest(request);
	}
	
	public Response getSipSessionServerByName(String name){
		Request request = new Request();
		ISgetSessionServer sessServerReq = new ISgetSessionServer();
		sessServerReq.setISSessionServerName(name);
		request.setISgetSessionServer(sessServerReq);
		return soapRequest(request);
	}
	
	//---------- User ---------------//
	public Response getUserById(String id){
		Request request = new Request();
		ISgetUser usrReq = new ISgetUser();
		usrReq.setISuserID(id);
		request.setISgetUser(usrReq);
		return soapRequest(request);
	}
		
	//---------- User Profile ---------------//
	public Response getAllUserProfiles(){
		Request request = new Request();
		ISgetUserProfile usrProfReq = new ISgetUserProfile();
		usrProfReq.setISKeyword("all");
		request.setISgetUserProfile(usrProfReq);
		return soapRequest(request);
	}
	public Response getUserProfileById(String id){
		Request request = new Request();
		ISgetUserProfile usrProfReq = new ISgetUserProfile();
		usrProfReq.setISuserID(id);
		request.setISgetUserProfile(usrProfReq);
		return soapRequest(request);
	}
	
	//---------- Voice Hunt Group ---------//
	public Response getAllVoiceHuntGroups(){
		Request request = new Request();
		ISgetVoiceHuntGroup huntGroupReq = new ISgetVoiceHuntGroup();
		huntGroupReq.setISKeyword("all");
		request.setISgetVoiceHuntGroup(huntGroupReq);
		return soapRequest(request);
	}
		
	public Response getVoiceHuntGroupById(String id){
		Request request = new Request();
		ISgetVoiceHuntGroup huntGroupReq = new ISgetVoiceHuntGroup();
		huntGroupReq.setISVoiceHuntGroupID(id);
		request.setISgetVoiceHuntGroup(huntGroupReq);
		return soapRequest(request);
	}
		
	//---------- Voice Hunt Group ---------//
	public Response getAllUtilityDirectory(){
		Request request = new Request();
		ISgetUtilityDirectory utilDirReq = new ISgetUtilityDirectory();
		request.setISgetUtilityDirectory(utilDirReq);
		return soapRequest(request);
	}
	
	//---------- Device Template---------------//
	public Response getAllDeviceTemplates(){
		Request request = new Request();
		ISgetDeviceTemplate devTempReq = new ISgetDeviceTemplate();
		devTempReq.setISKeyword("all");
		request.setISgetDeviceTemplate(devTempReq);
		return soapRequest(request);
	}
	public Response getDeviceTemplateById(String id){
		Request request = new Request();
		ISgetDeviceTemplate devTempReq = new ISgetDeviceTemplate();
		devTempReq.setISDevTemplateID(id);
		request.setISgetDeviceTemplate(devTempReq);
		return soapRequest(request);
	}
	public Response getDeviceTemplateAvailable(){
		Request request = new Request();
		ISgetDeviceTemplate devTempReq = new ISgetDeviceTemplate();
		devTempReq.setISKeyword("available");
		request.setISgetDeviceTemplate(devTempReq);
		return soapRequest(request);
	}
		
	//---------- Extension Template---------------//
	public Response getAllExtensionTemplates(){
		Request request = new Request();
		ISgetExtensionTemplate extTempReq = new ISgetExtensionTemplate();
		extTempReq.setISKeyword("all");
		request.setISgetExtensionTemplate(extTempReq);
		return soapRequest(request);
	}
	public Response getExtensionTemplateById(String id){
		Request request = new Request();
		ISgetExtensionTemplate extTempReq = new ISgetExtensionTemplate();
		extTempReq.setISExtTemplateID(id);
		request.setISgetExtensionTemplate(extTempReq);
		return soapRequest(request);
	}
	public Response getExtensionTemplateAvailable(){
		Request request = new Request();
		ISgetExtensionTemplate extTempReq = new ISgetExtensionTemplate();
		extTempReq.setISKeyword("available");
		request.setISgetExtensionTemplate(extTempReq);
		return soapRequest(request);
	}
}
