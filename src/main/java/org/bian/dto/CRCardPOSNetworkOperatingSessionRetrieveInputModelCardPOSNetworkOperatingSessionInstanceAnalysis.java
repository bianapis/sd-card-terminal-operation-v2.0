package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis
 */
public class CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis   {
  private String cardPOSNetworkOperatingSessionInstanceAnalysisReference = null;

  private String cardPOSNetworkOperatingSessionInstanceAnalysisReportType = null;

  private String cardPOSNetworkOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardPOSNetworkOperatingSessionInstanceAnalysisReference
  **/

  public String getCardPOSNetworkOperatingSessionInstanceAnalysisReference() {
    return cardPOSNetworkOperatingSessionInstanceAnalysisReference;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysisReference(String cardPOSNetworkOperatingSessionInstanceAnalysisReference) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysisReference = cardPOSNetworkOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardPOSNetworkOperatingSessionInstanceAnalysisReportType
  **/

  public String getCardPOSNetworkOperatingSessionInstanceAnalysisReportType() {
    return cardPOSNetworkOperatingSessionInstanceAnalysisReportType;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysisReportType(String cardPOSNetworkOperatingSessionInstanceAnalysisReportType) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysisReportType = cardPOSNetworkOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardPOSNetworkOperatingSessionInstanceAnalysisParameters
  **/

  public String getCardPOSNetworkOperatingSessionInstanceAnalysisParameters() {
    return cardPOSNetworkOperatingSessionInstanceAnalysisParameters;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysisParameters(String cardPOSNetworkOperatingSessionInstanceAnalysisParameters) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysisParameters = cardPOSNetworkOperatingSessionInstanceAnalysisParameters;
  }


}

