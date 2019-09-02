package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis
 */
public class BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis   {
  private String authorizationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return authorizationInstanceAnalysisReference
  **/

  public String getAuthorizationInstanceAnalysisReference() {
    return authorizationInstanceAnalysisReference;
  }

  public void setAuthorizationInstanceAnalysisReference(String authorizationInstanceAnalysisReference) {
    this.authorizationInstanceAnalysisReference = authorizationInstanceAnalysisReference;
  }


}

