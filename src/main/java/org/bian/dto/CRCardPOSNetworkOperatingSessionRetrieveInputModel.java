package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveInputModel
 */
public class CRCardPOSNetworkOperatingSessionRetrieveInputModel   {
  private Object cardPOSNetworkOperatingSessionRetrieveActionTaskRecord = null;

  private String cardPOSNetworkOperatingSessionRetrieveActionRequest = null;

  private CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord cardPOSNetworkOperatingSessionInstanceReportRecord = null;

  private CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis cardPOSNetworkOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardPOSNetworkOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getCardPOSNetworkOperatingSessionRetrieveActionTaskRecord() {
    return cardPOSNetworkOperatingSessionRetrieveActionTaskRecord;
  }

  public void setCardPOSNetworkOperatingSessionRetrieveActionTaskRecord(Object cardPOSNetworkOperatingSessionRetrieveActionTaskRecord) {
    this.cardPOSNetworkOperatingSessionRetrieveActionTaskRecord = cardPOSNetworkOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardPOSNetworkOperatingSessionRetrieveActionRequest
  **/

  public String getCardPOSNetworkOperatingSessionRetrieveActionRequest() {
    return cardPOSNetworkOperatingSessionRetrieveActionRequest;
  }

  public void setCardPOSNetworkOperatingSessionRetrieveActionRequest(String cardPOSNetworkOperatingSessionRetrieveActionRequest) {
    this.cardPOSNetworkOperatingSessionRetrieveActionRequest = cardPOSNetworkOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get cardPOSNetworkOperatingSessionInstanceReportRecord
   * @return cardPOSNetworkOperatingSessionInstanceReportRecord
  **/

  public CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord getCardPOSNetworkOperatingSessionInstanceReportRecord() {
    return cardPOSNetworkOperatingSessionInstanceReportRecord;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportRecord(CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceReportRecord cardPOSNetworkOperatingSessionInstanceReportRecord) {
    this.cardPOSNetworkOperatingSessionInstanceReportRecord = cardPOSNetworkOperatingSessionInstanceReportRecord;
  }


  /**
   * Get cardPOSNetworkOperatingSessionInstanceAnalysis
   * @return cardPOSNetworkOperatingSessionInstanceAnalysis
  **/

  public CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis getCardPOSNetworkOperatingSessionInstanceAnalysis() {
    return cardPOSNetworkOperatingSessionInstanceAnalysis;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysis(CRCardPOSNetworkOperatingSessionRetrieveInputModelCardPOSNetworkOperatingSessionInstanceAnalysis cardPOSNetworkOperatingSessionInstanceAnalysis) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysis = cardPOSNetworkOperatingSessionInstanceAnalysis;
  }


}

