package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord
 */
public class CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord   {
  private String cardPOSTerminalOperatingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the service availability through the session 
   * @return cardPOSTerminalOperatingSchedule
  **/

  public String getCardPOSTerminalOperatingSchedule() {
    return cardPOSTerminalOperatingSchedule;
  }

  public void setCardPOSTerminalOperatingSchedule(String cardPOSTerminalOperatingSchedule) {
    this.cardPOSTerminalOperatingSchedule = cardPOSTerminalOperatingSchedule;
  }


}

