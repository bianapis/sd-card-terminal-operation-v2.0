package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;
import org.bian.dto.CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSNetworkOperatingSessionRetrieveOutputModel
 */
public class CRCardPOSNetworkOperatingSessionRetrieveOutputModel   {
  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionRetrieveActionTaskReference = null;

  private Object cardPOSNetworkOperatingSessionRetrieveActionTaskRecord = null;

  private String cardPOSNetworkOperatingSessionRetrieveActionResponse = null;

  private CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord cardPOSNetworkOperatingSessionInstanceReportRecord = null;

  private CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis cardPOSNetworkOperatingSessionInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card POS Network Operating Session instance retrieve service call 
   * @return cardPOSNetworkOperatingSessionRetrieveActionTaskReference
  **/

  public String getCardPOSNetworkOperatingSessionRetrieveActionTaskReference() {
    return cardPOSNetworkOperatingSessionRetrieveActionTaskReference;
  }

  public void setCardPOSNetworkOperatingSessionRetrieveActionTaskReference(String cardPOSNetworkOperatingSessionRetrieveActionTaskReference) {
    this.cardPOSNetworkOperatingSessionRetrieveActionTaskReference = cardPOSNetworkOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardPOSNetworkOperatingSessionRetrieveActionResponse
  **/

  public String getCardPOSNetworkOperatingSessionRetrieveActionResponse() {
    return cardPOSNetworkOperatingSessionRetrieveActionResponse;
  }

  public void setCardPOSNetworkOperatingSessionRetrieveActionResponse(String cardPOSNetworkOperatingSessionRetrieveActionResponse) {
    this.cardPOSNetworkOperatingSessionRetrieveActionResponse = cardPOSNetworkOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get cardPOSNetworkOperatingSessionInstanceReportRecord
   * @return cardPOSNetworkOperatingSessionInstanceReportRecord
  **/

  public CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord getCardPOSNetworkOperatingSessionInstanceReportRecord() {
    return cardPOSNetworkOperatingSessionInstanceReportRecord;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReportRecord(CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceReportRecord cardPOSNetworkOperatingSessionInstanceReportRecord) {
    this.cardPOSNetworkOperatingSessionInstanceReportRecord = cardPOSNetworkOperatingSessionInstanceReportRecord;
  }


  /**
   * Get cardPOSNetworkOperatingSessionInstanceAnalysis
   * @return cardPOSNetworkOperatingSessionInstanceAnalysis
  **/

  public CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis getCardPOSNetworkOperatingSessionInstanceAnalysis() {
    return cardPOSNetworkOperatingSessionInstanceAnalysis;
  }

  public void setCardPOSNetworkOperatingSessionInstanceAnalysis(CRCardPOSNetworkOperatingSessionRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceAnalysis cardPOSNetworkOperatingSessionInstanceAnalysis) {
    this.cardPOSNetworkOperatingSessionInstanceAnalysis = cardPOSNetworkOperatingSessionInstanceAnalysis;
  }


}

