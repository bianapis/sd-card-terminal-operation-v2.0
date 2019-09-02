package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthorizationInitiateInputModelAuthorizationInstanceRecord
 */
public class BQAuthorizationInitiateInputModelAuthorizationInstanceRecord   {
  private String authorizationTransactionDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time the authorization is obtained 
   * @return authorizationTransactionDateTime
  **/

  public String getAuthorizationTransactionDateTime() {
    return authorizationTransactionDateTime;
  }

  public void setAuthorizationTransactionDateTime(String authorizationTransactionDateTime) {
    this.authorizationTransactionDateTime = authorizationTransactionDateTime;
  }


}

