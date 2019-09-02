package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchRequestInputModelBatchInstanceRecord;
import org.bian.dto.BQBatchRequestInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBatchRequestOutputModel
 */
public class BQBatchRequestOutputModel   {
  private BQBatchRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQBatchRequestInputModelBatchInstanceRecord batchInstanceRecord = null;

  private String batchRequestActionTaskReference = null;

  private Object batchRequestActionTaskRecord = null;

  private String batchRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQBatchRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQBatchRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get batchInstanceRecord
   * @return batchInstanceRecord
  **/

  public BQBatchRequestInputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchRequestInputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Batch instance request service call 
   * @return batchRequestActionTaskReference
  **/

  public String getBatchRequestActionTaskReference() {
    return batchRequestActionTaskReference;
  }

  public void setBatchRequestActionTaskReference(String batchRequestActionTaskReference) {
    this.batchRequestActionTaskReference = batchRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return batchRequestActionTaskRecord
  **/

  public Object getBatchRequestActionTaskRecord() {
    return batchRequestActionTaskRecord;
  }

  public void setBatchRequestActionTaskRecord(Object batchRequestActionTaskRecord) {
    this.batchRequestActionTaskRecord = batchRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Batch service request record 
   * @return batchRequestRecordReference
  **/

  public String getBatchRequestRecordReference() {
    return batchRequestRecordReference;
  }

  public void setBatchRequestRecordReference(String batchRequestRecordReference) {
    this.batchRequestRecordReference = batchRequestRecordReference;
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

