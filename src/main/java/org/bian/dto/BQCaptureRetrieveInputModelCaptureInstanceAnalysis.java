package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveInputModelCaptureInstanceAnalysis
 */
public class BQCaptureRetrieveInputModelCaptureInstanceAnalysis   {
  private String captureInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return captureInstanceAnalysisReference
  **/

  public String getCaptureInstanceAnalysisReference() {
    return captureInstanceAnalysisReference;
  }

  public void setCaptureInstanceAnalysisReference(String captureInstanceAnalysisReference) {
    this.captureInstanceAnalysisReference = captureInstanceAnalysisReference;
  }


}

