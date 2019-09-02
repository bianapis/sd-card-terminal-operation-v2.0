package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationInitiateInputModelAuthorizationInstanceRecord;
import org.bian.dto.BQAuthorizationRequestInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRequestOutputModel
 */
public class BQAuthorizationRequestOutputModel   {
  private BQAuthorizationRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord = null;

  private String authorizationRequestActionTaskReference = null;

  private Object authorizationRequestActionTaskRecord = null;

  private String authorizationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQAuthorizationRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQAuthorizationRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get authorizationInstanceRecord
   * @return authorizationInstanceRecord
  **/

  public BQAuthorizationInitiateInputModelAuthorizationInstanceRecord getAuthorizationInstanceRecord() {
    return authorizationInstanceRecord;
  }

  public void setAuthorizationInstanceRecord(BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord) {
    this.authorizationInstanceRecord = authorizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Authorization instance request service call 
   * @return authorizationRequestActionTaskReference
  **/

  public String getAuthorizationRequestActionTaskReference() {
    return authorizationRequestActionTaskReference;
  }

  public void setAuthorizationRequestActionTaskReference(String authorizationRequestActionTaskReference) {
    this.authorizationRequestActionTaskReference = authorizationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return authorizationRequestActionTaskRecord
  **/

  public Object getAuthorizationRequestActionTaskRecord() {
    return authorizationRequestActionTaskRecord;
  }

  public void setAuthorizationRequestActionTaskRecord(Object authorizationRequestActionTaskRecord) {
    this.authorizationRequestActionTaskRecord = authorizationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Authorization service request record 
   * @return authorizationRequestRecordReference
  **/

  public String getAuthorizationRequestRecordReference() {
    return authorizationRequestRecordReference;
  }

  public void setAuthorizationRequestRecordReference(String authorizationRequestRecordReference) {
    this.authorizationRequestRecordReference = authorizationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

