package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis
 */
public class CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis   {
  private String cardPOSNetworkOperatingSessionInstanceAnalysisData = null;

  private String cardPOSNetworkOperatingSessionInstanceAnalysisReportType = null;

  private Object cardPOSNetworkOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardPOSNetworkOperatingSessionInstanceAnalysisData
  **/

  public String getCardPOSNetworkOperatingSessionInstanceAnalysisData() {
    return cardPOSNetworkOperatingSessionInstanceAnalysisData;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysisData(String cardPOSNetworkOperatingSessionInstanceAnalysisData) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysisData = cardPOSNetworkOperatingSessionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardPOSNetworkOperatingSessionInstanceAnalysisReport
  **/

  public Object getCardPOSNetworkOperatingSessionInstanceAnalysisReport() {
    return cardPOSNetworkOperatingSessionInstanceAnalysisReport;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysisReport(Object cardPOSNetworkOperatingSessionInstanceAnalysisReport) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysisReport = cardPOSNetworkOperatingSessionInstanceAnalysisReport;
  }


}

