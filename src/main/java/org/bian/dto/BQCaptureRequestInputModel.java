package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureRequestInputModelCaptureInstanceRecord;
import org.bian.dto.BQCaptureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCaptureRequestInputModel
 */
public class BQCaptureRequestInputModel   {
  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private String captureInstanceReference = null;

  private BQCaptureRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private Object captureRequestActionTaskRecord = null;

  private BQCaptureRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQCaptureRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQCaptureRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return captureRequestActionTaskRecord
  **/

  public Object getCaptureRequestActionTaskRecord() {
    return captureRequestActionTaskRecord;
  }

  public void setCaptureRequestActionTaskRecord(Object captureRequestActionTaskRecord) {
    this.captureRequestActionTaskRecord = captureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQCaptureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQCaptureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

