package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationInitiateInputModelAuthorizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthorizationInitiateOutputModel
 */
public class BQAuthorizationInitiateOutputModel   {
  private String authorizationInstanceReference = null;

  private String authorizationInitiateActionReference = null;

  private Object authorizationInitiateActionRecord = null;

  private String authorizationInstanceStatus = null;

  private BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Authorization instance 
   * @return authorizationInstanceReference
  **/

  public String getAuthorizationInstanceReference() {
    return authorizationInstanceReference;
  }

  public void setAuthorizationInstanceReference(String authorizationInstanceReference) {
    this.authorizationInstanceReference = authorizationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return authorizationInitiateActionReference
  **/

  public String getAuthorizationInitiateActionReference() {
    return authorizationInitiateActionReference;
  }

  public void setAuthorizationInitiateActionReference(String authorizationInitiateActionReference) {
    this.authorizationInitiateActionReference = authorizationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return authorizationInitiateActionRecord
  **/

  public Object getAuthorizationInitiateActionRecord() {
    return authorizationInitiateActionRecord;
  }

  public void setAuthorizationInitiateActionRecord(Object authorizationInitiateActionRecord) {
    this.authorizationInitiateActionRecord = authorizationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Authorization instance (e.g. initialised, pending, active) 
   * @return authorizationInstanceStatus
  **/

  public String getAuthorizationInstanceStatus() {
    return authorizationInstanceStatus;
  }

  public void setAuthorizationInstanceStatus(String authorizationInstanceStatus) {
    this.authorizationInstanceStatus = authorizationInstanceStatus;
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


}

