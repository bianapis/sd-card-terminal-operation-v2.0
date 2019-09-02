/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardTerminalOperationApiServiceImpl implements CardTerminalOperationApiService {

	public SDCardTerminalOperationActivateOutputModel activate(SDCardTerminalOperationActivateInputModel request){
		return JsonReader.read("activate-SDCardTerminalOperationActivateOutputModel.json",new TypeReference<SDCardTerminalOperationActivateOutputModel>(){});
	}
	
	public SDCardTerminalOperationConfigureOutputModel configure(String sdReferenceId, SDCardTerminalOperationConfigureInputModel request){
		return JsonReader.read("configure-SDCardTerminalOperationConfigureOutputModel.json",new TypeReference<SDCardTerminalOperationConfigureOutputModel>(){});
	}
	
	public CRCardPOSNetworkOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardPOSNetworkOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRCardPOSNetworkOperatingSessionControlOutputModel.json",new TypeReference<CRCardPOSNetworkOperatingSessionControlOutputModel>(){});
	}
	
	public SDCardTerminalOperationFeedbackOutputModel feedback(String sdReferenceId, SDCardTerminalOperationFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardTerminalOperationFeedbackOutputModel.json",new TypeReference<SDCardTerminalOperationFeedbackOutputModel>(){});
	}
	
	public CRCardPOSNetworkOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCardPOSNetworkOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRCardPOSNetworkOperatingSessionInitiateOutputModel.json",new TypeReference<CRCardPOSNetworkOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQAuthorizationInitiateOutputModel initiateAuthorization(String sdReferenceId, String crReferenceId, BQAuthorizationInitiateInputModel request){
		return JsonReader.read("initiate-BQAuthorizationInitiateOutputModel.json",new TypeReference<BQAuthorizationInitiateOutputModel>(){});
	}
	
	public BQBatchInitiateOutputModel initiateBatch(String sdReferenceId, String crReferenceId, BQBatchInitiateInputModel request){
		return JsonReader.read("initiate-BQBatchInitiateOutputModel.json",new TypeReference<BQBatchInitiateOutputModel>(){});
	}
	
	public BQCaptureInitiateOutputModel initiateCapture(String sdReferenceId, String crReferenceId, BQCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQCaptureInitiateOutputModel.json",new TypeReference<BQCaptureInitiateOutputModel>(){});
	}
	
	public BQAuthorizationRequestOutputModel requestAuthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthorizationRequestInputModel request){
		return JsonReader.read("request-BQAuthorizationRequestOutputModel.json",new TypeReference<BQAuthorizationRequestOutputModel>(){});
	}
	
	public BQBatchRequestOutputModel requestBatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBatchRequestInputModel request){
		return JsonReader.read("request-BQBatchRequestOutputModel.json",new TypeReference<BQBatchRequestOutputModel>(){});
	}
	
	public BQCaptureRequestOutputModel requestCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureRequestInputModel request){
		return JsonReader.read("request-BQCaptureRequestOutputModel.json",new TypeReference<BQCaptureRequestOutputModel>(){});
	}
	
	public BQAuthorizationRetrieveOutputModel retrieveAuthorization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthorizationRetrieveOutputModel.json",new TypeReference<BQAuthorizationRetrieveOutputModel>(){});
	}
	
	public BQBatchRetrieveOutputModel retrieveBatch(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBatchRetrieveOutputModel.json",new TypeReference<BQBatchRetrieveOutputModel>(){});
	}
	
	public BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaptureRetrieveOutputModel.json",new TypeReference<BQCaptureRetrieveOutputModel>(){});
	}
	
	public CRCardPOSNetworkOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardPOSNetworkOperatingSessionRetrieveOutputModel.json",new TypeReference<CRCardPOSNetworkOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardTerminalOperationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardTerminalOperationRetrieveOutputModel.json",new TypeReference<SDCardTerminalOperationRetrieveOutputModel>(){});
	}
	
	public CRCardPOSNetworkOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardPOSNetworkOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRCardPOSNetworkOperatingSessionUpdateOutputModel.json",new TypeReference<CRCardPOSNetworkOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQBatchUpdateOutputModel updateBatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBatchUpdateInputModel request){
		return JsonReader.read("update-BQBatchUpdateOutputModel.json",new TypeReference<BQBatchUpdateOutputModel>(){});
	}
	
	public BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request){
		return JsonReader.read("update-BQCaptureUpdateOutputModel.json",new TypeReference<BQCaptureUpdateOutputModel>(){});
	}
	
}
