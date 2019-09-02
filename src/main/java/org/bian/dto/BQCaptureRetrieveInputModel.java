package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureRetrieveInputModelCaptureInstanceAnalysis;
import org.bian.dto.BQCaptureRetrieveInputModelCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveInputModel
 */
public class BQCaptureRetrieveInputModel   {
  private Object captureRetrieveActionTaskRecord = null;

  private String captureRetrieveActionRequest = null;

  private BQCaptureRetrieveInputModelCaptureInstanceReport captureInstanceReport = null;

  private BQCaptureRetrieveInputModelCaptureInstanceAnalysis captureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return captureRetrieveActionTaskRecord
  **/

  public Object getCaptureRetrieveActionTaskRecord() {
    return captureRetrieveActionTaskRecord;
  }

  public void setCaptureRetrieveActionTaskRecord(Object captureRetrieveActionTaskRecord) {
    this.captureRetrieveActionTaskRecord = captureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return captureRetrieveActionRequest
  **/

  public String getCaptureRetrieveActionRequest() {
    return captureRetrieveActionRequest;
  }

  public void setCaptureRetrieveActionRequest(String captureRetrieveActionRequest) {
    this.captureRetrieveActionRequest = captureRetrieveActionRequest;
  }


  /**
   * Get captureInstanceReport
   * @return captureInstanceReport
  **/

  public BQCaptureRetrieveInputModelCaptureInstanceReport getCaptureInstanceReport() {
    return captureInstanceReport;
  }

  public void setCaptureInstanceReport(BQCaptureRetrieveInputModelCaptureInstanceReport captureInstanceReport) {
    this.captureInstanceReport = captureInstanceReport;
  }


  /**
   * Get captureInstanceAnalysis
   * @return captureInstanceAnalysis
  **/

  public BQCaptureRetrieveInputModelCaptureInstanceAnalysis getCaptureInstanceAnalysis() {
    return captureInstanceAnalysis;
  }

  public void setCaptureInstanceAnalysis(BQCaptureRetrieveInputModelCaptureInstanceAnalysis captureInstanceAnalysis) {
    this.captureInstanceAnalysis = captureInstanceAnalysis;
  }


}

