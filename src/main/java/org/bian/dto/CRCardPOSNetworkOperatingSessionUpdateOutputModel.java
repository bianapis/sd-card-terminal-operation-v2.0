package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionUpdateOutputModel
 */
public class CRCardPOSNetworkOperatingSessionUpdateOutputModel   {
  private String cardPOSNetworkOperatingSessionUpdateActionTaskReference = null;

  private Object cardPOSNetworkOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardPOSNetworkOperatingSessionUpdateActionTaskReference
  **/

  public String getCardPOSNetworkOperatingSessionUpdateActionTaskReference() {
    return cardPOSNetworkOperatingSessionUpdateActionTaskReference;
  }

  public void setCardPOSNetworkOperatingSessionUpdateActionTaskReference(String cardPOSNetworkOperatingSessionUpdateActionTaskReference) {
    this.cardPOSNetworkOperatingSessionUpdateActionTaskReference = cardPOSNetworkOperatingSessionUpdateActionTaskReference;
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

