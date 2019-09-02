package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveInputModelCaptureInstanceReport
 */
public class BQCaptureRetrieveInputModelCaptureInstanceReport   {
  private String captureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return captureInstanceReportReference
  **/

  public String getCaptureInstanceReportReference() {
    return captureInstanceReportReference;
  }

  public void setCaptureInstanceReportReference(String captureInstanceReportReference) {
    this.captureInstanceReportReference = captureInstanceReportReference;
  }


}

