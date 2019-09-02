package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveOutputModelBatchInstanceReport
 */
public class BQBatchRetrieveOutputModelBatchInstanceReport   {
  private Object batchInstanceReportRecord = null;

  private String batchInstanceReportType = null;

  private String batchInstanceReportParameters = null;

  private Object batchInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return batchInstanceReportRecord
  **/

  public Object getBatchInstanceReportRecord() {
    return batchInstanceReportRecord;
  }

  public void setBatchInstanceReportRecord(Object batchInstanceReportRecord) {
    this.batchInstanceReportRecord = batchInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return batchInstanceReportType
  **/

  public String getBatchInstanceReportType() {
    return batchInstanceReportType;
  }

  public void setBatchInstanceReportType(String batchInstanceReportType) {
    this.batchInstanceReportType = batchInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return batchInstanceReportParameters
  **/

  public String getBatchInstanceReportParameters() {
    return batchInstanceReportParameters;
  }

  public void setBatchInstanceReportParameters(String batchInstanceReportParameters) {
    this.batchInstanceReportParameters = batchInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return batchInstanceReport
  **/

  public Object getBatchInstanceReport() {
    return batchInstanceReport;
  }

  public void setBatchInstanceReport(Object batchInstanceReport) {
    this.batchInstanceReport = batchInstanceReport;
  }


}

