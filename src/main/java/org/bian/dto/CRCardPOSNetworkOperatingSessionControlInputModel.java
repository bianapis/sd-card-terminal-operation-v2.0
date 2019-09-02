package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSNetworkOperatingSessionControlInputModelCardPOSNetworkOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionControlInputModel
 */
public class CRCardPOSNetworkOperatingSessionControlInputModel   {
  private String cardTerminalOperationServicingSessionReference = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private Object cardPOSNetworkOperatingSessionControlActionTaskRecord = null;

  private CRCardPOSNetworkOperatingSessionControlInputModelCardPOSNetworkOperatingSessionControlActionRequest cardPOSNetworkOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardTerminalOperationServicingSessionReference
  **/

  public String getCardTerminalOperationServicingSessionReference() {
    return cardTerminalOperationServicingSessionReference;
  }

  public void setCardTerminalOperationServicingSessionReference(String cardTerminalOperationServicingSessionReference) {
    this.cardTerminalOperationServicingSessionReference = cardTerminalOperationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card POS Network Operating Session instance 
   * @return cardPOSNetworkOperatingSessionInstanceReference
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReference() {
    return cardPOSNetworkOperatingSessionInstanceReference;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReference(String cardPOSNetworkOperatingSessionInstanceReference) {
    this.cardPOSNetworkOperatingSessionInstanceReference = cardPOSNetworkOperatingSessionInstanceReference;
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
   * Get cardPOSNetworkOperatingSessionControlActionRequest
   * @return cardPOSNetworkOperatingSessionControlActionRequest
  **/

  public CRCardPOSNetworkOperatingSessionControlInputModelCardPOSNetworkOperatingSessionControlActionRequest getCardPOSNetworkOperatingSessionControlActionRequest() {
    return cardPOSNetworkOperatingSessionControlActionRequest;
  }

  public void setCardPOSNetworkOperatingSessionControlActionRequest(CRCardPOSNetworkOperatingSessionControlInputModelCardPOSNetworkOperatingSessionControlActionRequest cardPOSNetworkOperatingSessionControlActionRequest) {
    this.cardPOSNetworkOperatingSessionControlActionRequest = cardPOSNetworkOperatingSessionControlActionRequest;
  }


}

