/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CardTerminalOperationApiController {

	@Autowired
	CardTerminalOperationApiService service;
	
	@Operate.Activate
	public BianResponse<SDCardTerminalOperationActivateOutputModel> activate(@RequestBody BianRequest<SDCardTerminalOperationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDCardTerminalOperationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardTerminalOperationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRCardPOSNetworkOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardPOSNetworkOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDCardTerminalOperationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardTerminalOperationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRCardPOSNetworkOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCardPOSNetworkOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("authorization")
	@Operate.Initiate
	public BianResponse<BQAuthorizationInitiateOutputModel> initiateAuthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAuthorizationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAuthorization(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("batch")
	@Operate.Initiate
	public BianResponse<BQBatchInitiateOutputModel> initiateBatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBatchInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBatch(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.Initiate
	public BianResponse<BQCaptureInitiateOutputModel> initiateCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCaptureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCapture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authorization")
	@Operate.Request
	public BianResponse<BQAuthorizationRequestOutputModel> requestAuthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAuthorizationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAuthorization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("batch")
	@Operate.Request
	public BianResponse<BQBatchRequestOutputModel> requestBatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBatchRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestBatch(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.Request
	public BianResponse<BQCaptureRequestOutputModel> requestCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("authorization")
	@Operate.Retrieve
	public BianResponse<BQAuthorizationRetrieveOutputModel> retrieveAuthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthorization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("batch")
	@Operate.Retrieve
	public BianResponse<BQBatchRetrieveOutputModel> retrieveBatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBatch(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("capture")
	@Operate.Retrieve
	public BianResponse<BQCaptureRetrieveOutputModel> retrieveCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.Retrieve
	public BianResponse<CRCardPOSNetworkOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDCardTerminalOperationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRCardPOSNetworkOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardPOSNetworkOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("batch")
	@Operate.Update
	public BianResponse<BQBatchUpdateOutputModel> updateBatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBatchUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBatch(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.Update
	public BianResponse<BQCaptureUpdateOutputModel> updateCapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
