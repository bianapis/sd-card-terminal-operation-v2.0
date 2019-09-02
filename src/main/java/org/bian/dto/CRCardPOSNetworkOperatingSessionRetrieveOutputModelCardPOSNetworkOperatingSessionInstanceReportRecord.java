package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord
 */
public class CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord   {
  private String cardPOSNetworkOperatingSessionInstanceReportData = null;

  private String cardPOSNetworkOperatingSessionInstanceReportType = null;

  private Object cardPOSNetworkOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardPOSNetworkOperatingSessionInstanceReportData
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReportData() {
    return cardPOSNetworkOperatingSessionInstanceReportData;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportData(String cardPOSNetworkOperatingSessionInstanceReportData) {
    this.cardPOSNetworkOperatingSessionInstanceReportData = cardPOSNetworkOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardPOSNetworkOperatingSessionInstanceReport
  **/

  public Object getCardPOSNetworkOperatingSessionInstanceReport() {
    return cardPOSNetworkOperatingSessionInstanceReport;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReport(Object cardPOSNetworkOperatingSessionInstanceReport) {
    this.cardPOSNetworkOperatingSessionInstanceReport = cardPOSNetworkOperatingSessionInstanceReport;
  }


}

