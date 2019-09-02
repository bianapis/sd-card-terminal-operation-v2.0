package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureRetrieveOutputModelCaptureInstanceAnalysis;
import org.bian.dto.BQCaptureRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQCaptureRetrieveOutputModelCaptureInstanceReport;
import org.bian.dto.CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaptureRetrieveOutputModel
 */
public class BQCaptureRetrieveOutputModel   {
  private CRCardPOSNetworkOperatingSessionInitiateInputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private BQCaptureRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String captureRetrieveActionTaskReference = null;

  private Object captureRetrieveActionTaskRecord = null;

  private String captureRetrieveActionResponse = null;

  private BQCaptureRetrieveOutputModelCaptureInstanceReport captureInstanceReport = null;

  private BQCaptureRetrieveOutputModelCaptureInstanceAnalysis captureInstanceAnalysis = null;


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

  public BQCaptureRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQCaptureRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Capture instance retrieve service call 
   * @return captureRetrieveActionTaskReference
  **/

  public String getCaptureRetrieveActionTaskReference() {
    return captureRetrieveActionTaskReference;
  }

  public void setCaptureRetrieveActionTaskReference(String captureRetrieveActionTaskReference) {
    this.captureRetrieveActionTaskReference = captureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return captureRetrieveActionTaskRecord
  **/

  public Object getCaptureRetrieveActionTaskRecord() {
    return captureRetrieveActionTaskRecord;
  }

  public void setCaptureRetrieveActionTaskRecord(Object captureRetrieveActionTaskRecord) {
    this.captureRetrieveActionTaskRecord = captureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return captureRetrieveActionResponse
  **/

  public String getCaptureRetrieveActionResponse() {
    return captureRetrieveActionResponse;
  }

  public void setCaptureRetrieveActionResponse(String captureRetrieveActionResponse) {
    this.captureRetrieveActionResponse = captureRetrieveActionResponse;
  }


  /**
   * Get captureInstanceReport
   * @return captureInstanceReport
  **/

  public BQCaptureRetrieveOutputModelCaptureInstanceReport getCaptureInstanceReport() {
    return captureInstanceReport;
  }

  public void setCaptureInstanceReport(BQCaptureRetrieveOutputModelCaptureInstanceReport captureInstanceReport) {
    this.captureInstanceReport = captureInstanceReport;
  }


  /**
   * Get captureInstanceAnalysis
   * @return captureInstanceAnalysis
  **/

  public BQCaptureRetrieveOutputModelCaptureInstanceAnalysis getCaptureInstanceAnalysis() {
    return captureInstanceAnalysis;
  }

  public void setCaptureInstanceAnalysis(BQCaptureRetrieveOutputModelCaptureInstanceAnalysis captureInstanceAnalysis) {
    this.captureInstanceAnalysis = captureInstanceAnalysis;
  }


}

