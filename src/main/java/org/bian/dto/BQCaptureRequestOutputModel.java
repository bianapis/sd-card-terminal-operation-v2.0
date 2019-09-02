package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureRequestInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaptureRequestOutputModel
 */
public class BQCaptureRequestOutputModel   {
  private BQCaptureRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String captureRequestActionTaskReference = null;

  private Object captureRequestActionTaskRecord = null;

  private String captureRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQCaptureRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQCaptureRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Capture instance request service call 
   * @return captureRequestActionTaskReference
  **/

  public String getCaptureRequestActionTaskReference() {
    return captureRequestActionTaskReference;
  }

  public void setCaptureRequestActionTaskReference(String captureRequestActionTaskReference) {
    this.captureRequestActionTaskReference = captureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return captureRequestActionTaskRecord
  **/

  public Object getCaptureRequestActionTaskRecord() {
    return captureRequestActionTaskRecord;
  }

  public void setCaptureRequestActionTaskRecord(Object captureRequestActionTaskRecord) {
    this.captureRequestActionTaskRecord = captureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capture service request record 
   * @return captureRequestRecordReference
  **/

  public String getCaptureRequestRecordReference() {
    return captureRequestRecordReference;
  }

  public void setCaptureRequestRecordReference(String captureRequestRecordReference) {
    this.captureRequestRecordReference = captureRequestRecordReference;
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

