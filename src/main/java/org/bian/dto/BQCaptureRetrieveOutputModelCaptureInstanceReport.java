package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveOutputModelCaptureInstanceReport
 */
public class BQCaptureRetrieveOutputModelCaptureInstanceReport   {
  private Object captureInstanceReportRecord = null;

  private String captureInstanceReportType = null;

  private String captureInstanceReportParameters = null;

  private Object captureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return captureInstanceReportRecord
  **/

  public Object getCaptureInstanceReportRecord() {
    return captureInstanceReportRecord;
  }

  public void setCaptureInstanceReportRecord(Object captureInstanceReportRecord) {
    this.captureInstanceReportRecord = captureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return captureInstanceReportType
  **/

  public String getCaptureInstanceReportType() {
    return captureInstanceReportType;
  }

  public void setCaptureInstanceReportType(String captureInstanceReportType) {
    this.captureInstanceReportType = captureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return captureInstanceReportParameters
  **/

  public String getCaptureInstanceReportParameters() {
    return captureInstanceReportParameters;
  }

  public void setCaptureInstanceReportParameters(String captureInstanceReportParameters) {
    this.captureInstanceReportParameters = captureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return captureInstanceReport
  **/

  public Object getCaptureInstanceReport() {
    return captureInstanceReport;
  }

  public void setCaptureInstanceReport(Object captureInstanceReport) {
    this.captureInstanceReport = captureInstanceReport;
  }


}

