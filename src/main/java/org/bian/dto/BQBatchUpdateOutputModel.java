package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchUpdateInputModelBatchInstanceRecord;
import org.bian.dto.BQBatchUpdateInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBatchUpdateOutputModel
 */
public class BQBatchUpdateOutputModel   {
  private BQBatchUpdateInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQBatchUpdateInputModelBatchInstanceRecord batchInstanceRecord = null;

  private String batchUpdateActionTaskReference = null;

  private Object batchUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQBatchUpdateInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQBatchUpdateInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get batchInstanceRecord
   * @return batchInstanceRecord
  **/

  public BQBatchUpdateInputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchUpdateInputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return batchUpdateActionTaskReference
  **/

  public String getBatchUpdateActionTaskReference() {
    return batchUpdateActionTaskReference;
  }

  public void setBatchUpdateActionTaskReference(String batchUpdateActionTaskReference) {
    this.batchUpdateActionTaskReference = batchUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return batchUpdateActionTaskRecord
  **/

  public Object getBatchUpdateActionTaskRecord() {
    return batchUpdateActionTaskRecord;
  }

  public void setBatchUpdateActionTaskRecord(Object batchUpdateActionTaskRecord) {
    this.batchUpdateActionTaskRecord = batchUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

