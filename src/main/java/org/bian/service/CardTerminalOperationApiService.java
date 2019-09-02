/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTerminalOperationApiService {

	SDCardTerminalOperationActivateOutputModel activate(SDCardTerminalOperationActivateInputModel request);
	
	SDCardTerminalOperationConfigureOutputModel configure(String sdReferenceId, SDCardTerminalOperationConfigureInputModel request);
	
	CRCardPOSNetworkOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardPOSNetworkOperatingSessionControlInputModel request);
	
	SDCardTerminalOperationFeedbackOutputModel feedback(String sdReferenceId, SDCardTerminalOperationFeedbackInputModel request);
	
	CRCardPOSNetworkOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCardPOSNetworkOperatingSessionInitiateInputModel request);
	
	BQAuthorizationInitiateOutputModel initiateAuthorization(String sdReferenceId, String crReferenceId, BQAuthorizationInitiateInputModel request);
	
	BQBatchInitiateOutputModel initiateBatch(String sdReferenceId, String crReferenceId, BQBatchInitiateInputModel request);
	
	BQCaptureInitiateOutputModel initiateCapture(String sdReferenceId, String crReferenceId, BQCaptureInitiateInputModel request);
	
	BQAuthorizationRequestOutputModel requestAuthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthorizationRequestInputModel request);
	
	BQBatchRequestOutputModel requestBatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBatchRequestInputModel request);
	
	BQCaptureRequestOutputModel requestCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureRequestInputModel request);
	
	BQAuthorizationRetrieveOutputModel retrieveAuthorization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBatchRetrieveOutputModel retrieveBatch(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCardPOSNetworkOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardTerminalOperationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardPOSNetworkOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardPOSNetworkOperatingSessionUpdateInputModel request);
	
	BQBatchUpdateOutputModel updateBatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBatchUpdateInputModel request);
	
	BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request);
	
}
