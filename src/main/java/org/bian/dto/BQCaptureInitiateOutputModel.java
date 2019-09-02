package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureInitiateOutputModel
 */
public class BQCaptureInitiateOutputModel   {
  private String captureInstanceReference = null;

  private String captureInitiateActionReference = null;

  private Object captureInitiateActionRecord = null;

  private String captureInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capture instance 
   * @return captureInstanceReference
  **/

  public String getCaptureInstanceReference() {
    return captureInstanceReference;
  }

  public void setCaptureInstanceReference(String captureInstanceReference) {
    this.captureInstanceReference = captureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return captureInitiateActionReference
  **/

  public String getCaptureInitiateActionReference() {
    return captureInitiateActionReference;
  }

  public void setCaptureInitiateActionReference(String captureInitiateActionReference) {
    this.captureInitiateActionReference = captureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return captureInitiateActionRecord
  **/

  public Object getCaptureInitiateActionRecord() {
    return captureInitiateActionRecord;
  }

  public void setCaptureInitiateActionRecord(Object captureInitiateActionRecord) {
    this.captureInitiateActionRecord = captureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Capture instance (e.g. initialised, pending, active) 
   * @return captureInstanceStatus
  **/

  public String getCaptureInstanceStatus() {
    return captureInstanceStatus;
  }

  public void setCaptureInstanceStatus(String captureInstanceStatus) {
    this.captureInstanceStatus = captureInstanceStatus;
  }


}

