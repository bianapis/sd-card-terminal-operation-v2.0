package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionControlOutputModel
 */
public class CRCardPOSNetworkOperatingSessionControlOutputModel   {
  private String cardPOSNetworkOperatingSessionControlActionTaskReference = null;

  private Object cardPOSNetworkOperatingSessionControlActionTaskRecord = null;

  private String cardPOSNetworkOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card POS Network Operating Session instance control processing service call 
   * @return cardPOSNetworkOperatingSessionControlActionTaskReference
  **/

  public String getCardPOSNetworkOperatingSessionControlActionTaskReference() {
    return cardPOSNetworkOperatingSessionControlActionTaskReference;
  }

  public void setCardPOSNetworkOperatingSessionControlActionTaskReference(String cardPOSNetworkOperatingSessionControlActionTaskReference) {
    this.cardPOSNetworkOperatingSessionControlActionTaskReference = cardPOSNetworkOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cardPOSNetworkOperatingSessionControlActionTaskRecord
  **/

  public Object getCardPOSNetworkOperatingSessionControlActionTaskRecord() {
    return cardPOSNetworkOperatingSessionControlActionTaskRecord;
  }

  public void setCardPOSNetworkOperatingSessionControlActionTaskRecord(Object cardPOSNetworkOperatingSessionControlActionTaskRecord) {
    this.cardPOSNetworkOperatingSessionControlActionTaskRecord = cardPOSNetworkOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cardPOSNetworkOperatingSessionControlActionResponse
  **/

  public String getCardPOSNetworkOperatingSessionControlActionResponse() {
    return cardPOSNetworkOperatingSessionControlActionResponse;
  }

  public void setCardPOSNetworkOperatingSessionControlActionResponse(String cardPOSNetworkOperatingSessionControlActionResponse) {
    this.cardPOSNetworkOperatingSessionControlActionResponse = cardPOSNetworkOperatingSessionControlActionResponse;
  }


}

