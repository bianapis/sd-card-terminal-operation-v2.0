package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionUpdateInputModel
 */
public class CRCardPOSNetworkOperatingSessionUpdateInputModel   {
  private String cardTerminalOperationServicingSessionReference = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private Object cardPOSNetworkOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardPOSNetworkOperatingSessionUpdateActionTaskRecord
  **/

  public Object getCardPOSNetworkOperatingSessionUpdateActionTaskRecord() {
    return cardPOSNetworkOperatingSessionUpdateActionTaskRecord;
  }

  public void setCardPOSNetworkOperatingSessionUpdateActionTaskRecord(Object cardPOSNetworkOperatingSessionUpdateActionTaskRecord) {
    this.cardPOSNetworkOperatingSessionUpdateActionTaskRecord = cardPOSNetworkOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

