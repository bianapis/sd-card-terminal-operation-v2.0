package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveOutputModelBatchInstanceAnalysis
 */
public class BQBatchRetrieveOutputModelBatchInstanceAnalysis   {
  private Object batchInstanceAnalysisRecord = null;

  private String batchInstanceAnalysisReportType = null;

  private String batchInstanceAnalysisParameters = null;

  private Object batchInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return batchInstanceAnalysisRecord
  **/

  public Object getBatchInstanceAnalysisRecord() {
    return batchInstanceAnalysisRecord;
  }

  public void setBatchInstanceAnalysisRecord(Object batchInstanceAnalysisRecord) {
    this.batchInstanceAnalysisRecord = batchInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return batchInstanceAnalysisReportType
  **/

  public String getBatchInstanceAnalysisReportType() {
    return batchInstanceAnalysisReportType;
  }

  public void setBatchInstanceAnalysisReportType(String batchInstanceAnalysisReportType) {
    this.batchInstanceAnalysisReportType = batchInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return batchInstanceAnalysisParameters
  **/

  public String getBatchInstanceAnalysisParameters() {
    return batchInstanceAnalysisParameters;
  }

  public void setBatchInstanceAnalysisParameters(String batchInstanceAnalysisParameters) {
    this.batchInstanceAnalysisParameters = batchInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return batchInstanceAnalysisReport
  **/

  public Object getBatchInstanceAnalysisReport() {
    return batchInstanceAnalysisReport;
  }

  public void setBatchInstanceAnalysisReport(Object batchInstanceAnalysisReport) {
    this.batchInstanceAnalysisReport = batchInstanceAnalysisReport;
  }


}

