package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureUpdateInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaptureUpdateOutputModel
 */
public class BQCaptureUpdateOutputModel   {
  private BQCaptureUpdateInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String captureUpdateActionTaskReference = null;

  private Object captureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQCaptureUpdateInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQCaptureUpdateInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return captureUpdateActionTaskReference
  **/

  public String getCaptureUpdateActionTaskReference() {
    return captureUpdateActionTaskReference;
  }

  public void setCaptureUpdateActionTaskReference(String captureUpdateActionTaskReference) {
    this.captureUpdateActionTaskReference = captureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return captureUpdateActionTaskRecord
  **/

  public Object getCaptureUpdateActionTaskRecord() {
    return captureUpdateActionTaskRecord;
  }

  public void setCaptureUpdateActionTaskRecord(Object captureUpdateActionTaskRecord) {
    this.captureUpdateActionTaskRecord = captureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

