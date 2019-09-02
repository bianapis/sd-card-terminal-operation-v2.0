package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport
 */
public class BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport   {
  private Object authorizationInstanceReportRecord = null;

  private String authorizationInstanceReportType = null;

  private String authorizationInstanceReportParameters = null;

  private Object authorizationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return authorizationInstanceReportRecord
  **/

  public Object getAuthorizationInstanceReportRecord() {
    return authorizationInstanceReportRecord;
  }

  public void setAuthorizationInstanceReportRecord(Object authorizationInstanceReportRecord) {
    this.authorizationInstanceReportRecord = authorizationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return authorizationInstanceReportType
  **/

  public String getAuthorizationInstanceReportType() {
    return authorizationInstanceReportType;
  }

  public void setAuthorizationInstanceReportType(String authorizationInstanceReportType) {
    this.authorizationInstanceReportType = authorizationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return authorizationInstanceReportParameters
  **/

  public String getAuthorizationInstanceReportParameters() {
    return authorizationInstanceReportParameters;
  }

  public void setAuthorizationInstanceReportParameters(String authorizationInstanceReportParameters) {
    this.authorizationInstanceReportParameters = authorizationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return authorizationInstanceReport
  **/

  public Object getAuthorizationInstanceReport() {
    return authorizationInstanceReport;
  }

  public void setAuthorizationInstanceReport(Object authorizationInstanceReport) {
    this.authorizationInstanceReport = authorizationInstanceReport;
  }


}

