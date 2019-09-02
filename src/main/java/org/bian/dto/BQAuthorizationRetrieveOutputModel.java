package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthorizationInitiateInputModelAuthorizationInstanceRecord;
import org.bian.dto.BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis;
import org.bian.dto.BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport;
import org.bian.dto.BQAuthorizationRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthorizationRetrieveOutputModel
 */
public class BQAuthorizationRetrieveOutputModel   {
  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private BQAuthorizationRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord = null;

  private String authorizationRetrieveActionTaskReference = null;

  private Object authorizationRetrieveActionTaskRecord = null;

  private String authorizationRetrieveActionResponse = null;

  private BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport authorizationInstanceReport = null;

  private BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis authorizationInstanceAnalysis = null;


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
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQAuthorizationRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQAuthorizationRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get authorizationInstanceRecord
   * @return authorizationInstanceRecord
  **/

  public BQAuthorizationInitiateInputModelAuthorizationInstanceRecord getAuthorizationInstanceRecord() {
    return authorizationInstanceRecord;
  }

  public void setAuthorizationInstanceRecord(BQAuthorizationInitiateInputModelAuthorizationInstanceRecord authorizationInstanceRecord) {
    this.authorizationInstanceRecord = authorizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Authorization instance retrieve service call 
   * @return authorizationRetrieveActionTaskReference
  **/

  public String getAuthorizationRetrieveActionTaskReference() {
    return authorizationRetrieveActionTaskReference;
  }

  public void setAuthorizationRetrieveActionTaskReference(String authorizationRetrieveActionTaskReference) {
    this.authorizationRetrieveActionTaskReference = authorizationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return authorizationRetrieveActionTaskRecord
  **/

  public Object getAuthorizationRetrieveActionTaskRecord() {
    return authorizationRetrieveActionTaskRecord;
  }

  public void setAuthorizationRetrieveActionTaskRecord(Object authorizationRetrieveActionTaskRecord) {
    this.authorizationRetrieveActionTaskRecord = authorizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return authorizationRetrieveActionResponse
  **/

  public String getAuthorizationRetrieveActionResponse() {
    return authorizationRetrieveActionResponse;
  }

  public void setAuthorizationRetrieveActionResponse(String authorizationRetrieveActionResponse) {
    this.authorizationRetrieveActionResponse = authorizationRetrieveActionResponse;
  }


  /**
   * Get authorizationInstanceReport
   * @return authorizationInstanceReport
  **/

  public BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport getAuthorizationInstanceReport() {
    return authorizationInstanceReport;
  }

  public void setAuthorizationInstanceReport(BQAuthorizationRetrieveOutputModelAuthorizationInstanceReport authorizationInstanceReport) {
    this.authorizationInstanceReport = authorizationInstanceReport;
  }


  /**
   * Get authorizationInstanceAnalysis
   * @return authorizationInstanceAnalysis
  **/

  public BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis getAuthorizationInstanceAnalysis() {
    return authorizationInstanceAnalysis;
  }

  public void setAuthorizationInstanceAnalysis(BQAuthorizationRetrieveOutputModelAuthorizationInstanceAnalysis authorizationInstanceAnalysis) {
    this.authorizationInstanceAnalysis = authorizationInstanceAnalysis;
  }


}

