package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureInitiateInputModelCaptureInstanceRecord;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaptureInitiateInputModel
 */
public class BQCaptureInitiateInputModel   {
  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private Object captureInitiateActionRecord = null;

  private BQCaptureInitiateInputModelCaptureInstanceRecord captureInstanceRecord = null;


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
   * @return captureInitiateActionRecord
  **/

  public Object getCaptureInitiateActionRecord() {
    return captureInitiateActionRecord;
  }

  public void setCaptureInitiateActionRecord(Object captureInitiateActionRecord) {
    this.captureInitiateActionRecord = captureInitiateActionRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQCaptureInitiateInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQCaptureInitiateInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


}

