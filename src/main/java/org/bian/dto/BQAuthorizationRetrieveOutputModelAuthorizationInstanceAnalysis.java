package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis
 */
public class BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis   {
  private Object authorizationInstanceAnalysisRecord = null;

  private String authorizationInstanceAnalysisReportType = null;

  private String authorizationInstanceAnalysisParameters = null;

  private Object authorizationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return authorizationInstanceAnalysisRecord
  **/

  public Object getAuthorizationInstanceAnalysisRecord() {
    return authorizationInstanceAnalysisRecord;
  }

  public void setAuthorizationInstanceAnalysisRecord(Object authorizationInstanceAnalysisRecord) {
    this.authorizationInstanceAnalysisRecord = authorizationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return authorizationInstanceAnalysisReportType
  **/

  public String getAuthorizationInstanceAnalysisReportType() {
    return authorizationInstanceAnalysisReportType;
  }

  public void setAuthorizationInstanceAnalysisReportType(String authorizationInstanceAnalysisReportType) {
    this.authorizationInstanceAnalysisReportType = authorizationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return authorizationInstanceAnalysisParameters
  **/

  public String getAuthorizationInstanceAnalysisParameters() {
    return authorizationInstanceAnalysisParameters;
  }

  public void setAuthorizationInstanceAnalysisParameters(String authorizationInstanceAnalysisParameters) {
    this.authorizationInstanceAnalysisParameters = authorizationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return authorizationInstanceAnalysisReport
  **/

  public Object getAuthorizationInstanceAnalysisReport() {
    return authorizationInstanceAnalysisReport;
  }

  public void setAuthorizationInstanceAnalysisReport(Object authorizationInstanceAnalysisReport) {
    this.authorizationInstanceAnalysisReport = authorizationInstanceAnalysisReport;
  }


}

