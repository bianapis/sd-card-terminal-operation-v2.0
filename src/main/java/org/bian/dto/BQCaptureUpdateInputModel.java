package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureUpdateInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaptureUpdateInputModel
 */
public class BQCaptureUpdateInputModel   {
  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private String captureInstanceReference = null;

  private BQCaptureUpdateInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private Object captureUpdateActionTaskRecord = null;

  private String captureUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card POS Network Operating Session instance 
   * @return cardPOSNetworkOperatingSessionInstanceReference
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReference() {
    return cardPOSNetworkOperatingSessionInstanceReference;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReference(String cardPOSNetworkOperatingSessionInstanceReference) {
    this.cardPOSNetworkOperatingSessionInstanceReference = cardPOSNetworkOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capture instance 
   * @return captureInstanceReference
  **/

  public String getCaptureInstanceReference() {
    return captureInstanceReference;
  }

  public void setCaptureInstanceReference(String captureInstanceReference) {
    this.captureInstanceReference = captureInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return captureUpdateActionRequest
  **/

  public String getCaptureUpdateActionRequest() {
    return captureUpdateActionRequest;
  }

  public void setCaptureUpdateActionRequest(String captureUpdateActionRequest) {
    this.captureUpdateActionRequest = captureUpdateActionRequest;
  }


}

