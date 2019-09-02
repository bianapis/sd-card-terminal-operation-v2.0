package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveInputModelBatchInstanceReport
 */
public class BQBatchRetrieveInputModelBatchInstanceReport   {
  private String batchInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return batchInstanceReportReference
  **/

  public String getBatchInstanceReportReference() {
    return batchInstanceReportReference;
  }

  public void setBatchInstanceReportReference(String batchInstanceReportReference) {
    this.batchInstanceReportReference = batchInstanceReportReference;
  }


}

