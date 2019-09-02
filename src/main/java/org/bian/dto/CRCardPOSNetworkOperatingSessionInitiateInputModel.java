package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionInitiateInputModel
 */
public class CRCardPOSNetworkOperatingSessionInitiateInputModel   {
  private String cardTerminalOperationServicingSessionReference = null;

  private Object cardPOSNetworkOperatingSessionInitiateActionRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceStatus = null;

  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardPOSNetworkOperatingSessionInitiateActionRecord
  **/

  public Object getCardPOSNetworkOperatingSessionInitiateActionRecord() {
    return cardPOSNetworkOperatingSessionInitiateActionRecord;
  }

  public void setCardPOSNetworkOperatingSessionInitiateActionRecord(Object cardPOSNetworkOperatingSessionInitiateActionRecord) {
    this.cardPOSNetworkOperatingSessionInitiateActionRecord = cardPOSNetworkOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card POS Network Operating Session instance (e.g. initialised, pending, active) 
   * @return cardPOSNetworkOperatingSessionInstanceStatus
  **/

  public String getCardPOSNetworkOperatingSessionInstanceStatus() {
    return cardPOSNetworkOperatingSessionInstanceStatus;
  }

  public void setCardPOSNetworkOperatingSessionInstanceStatus(String cardPOSNetworkOperatingSessionInstanceStatus) {
    this.cardPOSNetworkOperatingSessionInstanceStatus = cardPOSNetworkOperatingSessionInstanceStatus;
  }


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


}

