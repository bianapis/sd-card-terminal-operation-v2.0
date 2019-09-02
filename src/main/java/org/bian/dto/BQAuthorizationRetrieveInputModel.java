package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis;
import org.bian.dto.BQAuthorizationRetrieveInputModelAuthorizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveInputModel
 */
public class BQAuthorizationRetrieveInputModel   {
  private Object authorizationRetrieveActionTaskRecord = null;

  private String authorizationRetrieveActionRequest = null;

  private BQAuthorizationRetrieveInputModelAuthorizationInstanceReport authorizationInstanceReport = null;

  private BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis authorizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return authorizationRetrieveActionTaskRecord
  **/

  public Object getAuthorizationRetrieveActionTaskRecord() {
    return authorizationRetrieveActionTaskRecord;
  }

  public void setAuthorizationRetrieveActionTaskRecord(Object authorizationRetrieveActionTaskRecord) {
    this.authorizationRetrieveActionTaskRecord = authorizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return authorizationRetrieveActionRequest
  **/

  public String getAuthorizationRetrieveActionRequest() {
    return authorizationRetrieveActionRequest;
  }

  public void setAuthorizationRetrieveActionRequest(String authorizationRetrieveActionRequest) {
    this.authorizationRetrieveActionRequest = authorizationRetrieveActionRequest;
  }


  /**
   * Get authorizationInstanceReport
   * @return authorizationInstanceReport
  **/

  public BQAuthorizationRetrieveInputModelAuthorizationInstanceReport getAuthorizationInstanceReport() {
    return authorizationInstanceReport;
  }

  public void setAuthorizationInstanceReport(BQAuthorizationRetrieveInputModelAuthorizationInstanceReport authorizationInstanceReport) {
    this.authorizationInstanceReport = authorizationInstanceReport;
  }


  /**
   * Get authorizationInstanceAnalysis
   * @return authorizationInstanceAnalysis
  **/

  public BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis getAuthorizationInstanceAnalysis() {
    return authorizationInstanceAnalysis;
  }

  public void setAuthorizationInstanceAnalysis(BQAuthorizationRetrieveInputModelAuthorizationInstanceAnalysis authorizationInstanceAnalysis) {
    this.authorizationInstanceAnalysis = authorizationInstanceAnalysis;
  }


}

