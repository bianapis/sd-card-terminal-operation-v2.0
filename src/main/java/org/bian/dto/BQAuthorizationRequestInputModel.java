package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationInitiateInputModelAuthorizationInstanceRecord;
import org.bian.dto.BQAuthorizationRequestInputModelCaptureInstanceRecord;
import org.bian.dto.BQCaptureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRequestInputModel
 */
public class BQAuthorizationRequestInputModel   {
  private BQAuthorizationRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private String authorizationInstanceReference = null;

  private BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord = null;

  private Object authorizationRequestActionTaskRecord = null;

  private BQCaptureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQAuthorizationRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQAuthorizationRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Authorization instance 
   * @return authorizationInstanceReference
  **/

  public String getAuthorizationInstanceReference() {
    return authorizationInstanceReference;
  }

  public void setAuthorizationInstanceReference(String authorizationInstanceReference) {
    this.authorizationInstanceReference = authorizationInstanceReference;
  }


  /**
   * Get authorizationInstanceRecord
   * @return authorizationInstanceRecord
  **/

  public BQAuthorizationInitiateInputModelAuthorizationInstanceRecord getAuthorizationInstanceRecord() {
    return authorizationInstanceRecord;
  }

  public void setAuthorizationInstanceRecord(BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord) {
    this.authorizationInstanceRecord = authorizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return authorizationRequestActionTaskRecord
  **/

  public Object getAuthorizationRequestActionTaskRecord() {
    return authorizationRequestActionTaskRecord;
  }

  public void setAuthorizationRequestActionTaskRecord(Object authorizationRequestActionTaskRecord) {
    this.authorizationRequestActionTaskRecord = authorizationRequestActionTaskRecord;
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

