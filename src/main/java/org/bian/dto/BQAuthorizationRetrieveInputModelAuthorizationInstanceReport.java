package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveInputModelAuthorizationInstanceReport
 */
public class BQAuthorizationRetrieveInputModelAuthorizationInstanceReport   {
  private String authorizationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return authorizationInstanceReportReference
  **/

  public String getAuthorizationInstanceReportReference() {
    return authorizationInstanceReportReference;
  }

  public void setAuthorizationInstanceReportReference(String authorizationInstanceReportReference) {
    this.authorizationInstanceReportReference = authorizationInstanceReportReference;
  }


}

