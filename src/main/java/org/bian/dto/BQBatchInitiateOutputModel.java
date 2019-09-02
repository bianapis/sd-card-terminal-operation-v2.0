package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchInitiateInputModelBatchInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBatchInitiateOutputModel
 */
public class BQBatchInitiateOutputModel   {
  private String batchInstanceReference = null;

  private String batchInitiateActionReference = null;

  private Object batchInitiateActionRecord = null;

  private String batchInstanceStatus = null;

  private BQBatchInitiateInputModelBatchInstanceRecord batchInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Batch instance 
   * @return batchInstanceReference
  **/

  public String getBatchInstanceReference() {
    return batchInstanceReference;
  }

  public void setBatchInstanceReference(String batchInstanceReference) {
    this.batchInstanceReference = batchInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return batchInitiateActionReference
  **/

  public String getBatchInitiateActionReference() {
    return batchInitiateActionReference;
  }

  public void setBatchInitiateActionReference(String batchInitiateActionReference) {
    this.batchInitiateActionReference = batchInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return batchInitiateActionRecord
  **/

  public Object getBatchInitiateActionRecord() {
    return batchInitiateActionRecord;
  }

  public void setBatchInitiateActionRecord(Object batchInitiateActionRecord) {
    this.batchInitiateActionRecord = batchInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Batch instance (e.g. initialised, pending, active) 
   * @return batchInstanceStatus
  **/

  public String getBatchInstanceStatus() {
    return batchInstanceStatus;
  }

  public void setBatchInstanceStatus(String batchInstanceStatus) {
    this.batchInstanceStatus = batchInstanceStatus;
  }


  /**
   * Get batchInstanceRecord
   * @return batchInstanceRecord
  **/

  public BQBatchInitiateInputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchInitiateInputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


}

