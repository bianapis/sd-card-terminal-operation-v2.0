package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveInputModelBatchInstanceAnalysis
 */
public class BQBatchRetrieveInputModelBatchInstanceAnalysis   {
  private String batchInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return batchInstanceAnalysisReference
  **/

  public String getBatchInstanceAnalysisReference() {
    return batchInstanceAnalysisReference;
  }

  public void setBatchInstanceAnalysisReference(String batchInstanceAnalysisReference) {
    this.batchInstanceAnalysisReference = batchInstanceAnalysisReference;
  }


}

