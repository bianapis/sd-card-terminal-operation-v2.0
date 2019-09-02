package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchRetrieveInputModelBatchInstanceAnalysis;
import org.bian.dto.BQBatchRetrieveInputModelBatchInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveInputModel
 */
public class BQBatchRetrieveInputModel   {
  private Object batchRetrieveActionTaskRecord = null;

  private String batchRetrieveActionRequest = null;

  private BQBatchRetrieveInputModelBatchInstanceReport batchInstanceReport = null;

  private BQBatchRetrieveInputModelBatchInstanceAnalysis batchInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return batchRetrieveActionTaskRecord
  **/

  public Object getBatchRetrieveActionTaskRecord() {
    return batchRetrieveActionTaskRecord;
  }

  public void setBatchRetrieveActionTaskRecord(Object batchRetrieveActionTaskRecord) {
    this.batchRetrieveActionTaskRecord = batchRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return batchRetrieveActionRequest
  **/

  public String getBatchRetrieveActionRequest() {
    return batchRetrieveActionRequest;
  }

  public void setBatchRetrieveActionRequest(String batchRetrieveActionRequest) {
    this.batchRetrieveActionRequest = batchRetrieveActionRequest;
  }


  /**
   * Get batchInstanceReport
   * @return batchInstanceReport
  **/

  public BQBatchRetrieveInputModelBatchInstanceReport getBatchInstanceReport() {
    return batchInstanceReport;
  }

  public void setBatchInstanceReport(BQBatchRetrieveInputModelBatchInstanceReport batchInstanceReport) {
    this.batchInstanceReport = batchInstanceReport;
  }


  /**
   * Get batchInstanceAnalysis
   * @return batchInstanceAnalysis
  **/

  public BQBatchRetrieveInputModelBatchInstanceAnalysis getBatchInstanceAnalysis() {
    return batchInstanceAnalysis;
  }

  public void setBatchInstanceAnalysis(BQBatchRetrieveInputModelBatchInstanceAnalysis batchInstanceAnalysis) {
    this.batchInstanceAnalysis = batchInstanceAnalysis;
  }


}

