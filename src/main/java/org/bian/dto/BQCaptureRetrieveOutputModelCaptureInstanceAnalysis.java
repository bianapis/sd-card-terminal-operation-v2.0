package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveOutputModelCaptureInstanceAnalysis
 */
public class BQCaptureRetrieveOutputModelCaptureInstanceAnalysis   {
  private Object captureInstanceAnalysisRecord = null;

  private String captureInstanceAnalysisReportType = null;

  private String captureInstanceAnalysisParameters = null;

  private Object captureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return captureInstanceAnalysisRecord
  **/

  public Object getCaptureInstanceAnalysisRecord() {
    return captureInstanceAnalysisRecord;
  }

  public void setCaptureInstanceAnalysisRecord(Object captureInstanceAnalysisRecord) {
    this.captureInstanceAnalysisRecord = captureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return captureInstanceAnalysisReportType
  **/

  public String getCaptureInstanceAnalysisReportType() {
    return captureInstanceAnalysisReportType;
  }

  public void setCaptureInstanceAnalysisReportType(String captureInstanceAnalysisReportType) {
    this.captureInstanceAnalysisReportType = captureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return captureInstanceAnalysisParameters
  **/

  public String getCaptureInstanceAnalysisParameters() {
    return captureInstanceAnalysisParameters;
  }

  public void setCaptureInstanceAnalysisParameters(String captureInstanceAnalysisParameters) {
    this.captureInstanceAnalysisParameters = captureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return captureInstanceAnalysisReport
  **/

  public Object getCaptureInstanceAnalysisReport() {
    return captureInstanceAnalysisReport;
  }

  public void setCaptureInstanceAnalysisReport(Object captureInstanceAnalysisReport) {
    this.captureInstanceAnalysisReport = captureInstanceAnalysisReport;
  }


}

