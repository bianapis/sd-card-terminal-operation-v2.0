package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationInitiateInputModelAuthorizationInstanceRecord;
import org.bian.dto.BQAuthorizationInitiateInputModelCaptureInstanceRecord;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthorizationInitiateInputModel
 */
public class BQAuthorizationInitiateInputModel   {
  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private BQAuthorizationInitiateInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private Object authorizationInitiateActionRecord = null;

  private BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord = null;


  /**
   * Get cardPOSNetworkOperatingSessionInstanceRecord
   * @return cardPOSNetworkOperatingSessionInstanceRecord
  **/

  public CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord getCardPOSNetworkOperatingSessionInstanceRecord() {
    return cardPOSNetworkOperatingSessionInstanceRecord;
  }

  public void setCardPOSNetworkOperatingSessionInstanceRecord(CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord) {
    this.cardPOSNetworkOperatingSessionInstanceRecord = cardPOSNetworkOperatingSessionInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQAuthorizationInitiateInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQAuthorizationInitiateInputModelCaptureInstanceRecord captureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return authorizationInitiateActionRecord
  **/

  public Object getAuthorizationInitiateActionRecord() {
    return authorizationInitiateActionRecord;
  }

  public void setAuthorizationInitiateActionRecord(Object authorizationInitiateActionRecord) {
    this.authorizationInitiateActionRecord = authorizationInitiateActionRecord;
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


}

