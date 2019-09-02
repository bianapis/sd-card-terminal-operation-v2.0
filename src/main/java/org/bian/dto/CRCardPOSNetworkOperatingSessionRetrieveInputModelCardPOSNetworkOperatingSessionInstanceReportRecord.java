package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord
 */
public class CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord   {
  private String cardPOSNetworkOperatingSessionInstanceReportReference = null;

  private String cardPOSNetworkOperatingSessionInstanceReportType = null;

  private String cardPOSNetworkOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardPOSNetworkOperatingSessionInstanceReportReference
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReportReference() {
    return cardPOSNetworkOperatingSessionInstanceReportReference;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportReference(String cardPOSNetworkOperatingSessionInstanceReportReference) {
    this.cardPOSNetworkOperatingSessionInstanceReportReference = cardPOSNetworkOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardPOSNetworkOperatingSessionInstanceReportType
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReportType() {
    return cardPOSNetworkOperatingSessionInstanceReportType;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportType(String cardPOSNetworkOperatingSessionInstanceReportType) {
    this.cardPOSNetworkOperatingSessionInstanceReportType = cardPOSNetworkOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardPOSNetworkOperatingSessionInstanceReportParameters
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReportParameters() {
    return cardPOSNetworkOperatingSessionInstanceReportParameters;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportParameters(String cardPOSNetworkOperatingSessionInstanceReportParameters) {
    this.cardPOSNetworkOperatingSessionInstanceReportParameters = cardPOSNetworkOperatingSessionInstanceReportParameters;
  }


}

