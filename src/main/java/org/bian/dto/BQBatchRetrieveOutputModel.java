package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchRetrieveOutputModelBatchInstanceAnalysis;
import org.bian.dto.BQBatchRetrieveOutputModelBatchInstanceRecord;
import org.bian.dto.BQBatchRetrieveOutputModelBatchInstanceReport;
import org.bian.dto.BQBatchRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveOutputModel
 */
public class BQBatchRetrieveOutputModel   {
  private BQBatchRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord = null;

  private BQBatchRetrieveOutputModelBatchInstanceRecord batchInstanceRecord = null;

  private String batchRetrieveActionTaskReference = null;

  private Object batchRetrieveActionTaskRecord = null;

  private String batchRetrieveActionResponse = null;

  private BQBatchRetrieveOutputModelBatchInstanceReport batchInstanceReport = null;

  private BQBatchRetrieveOutputModelBatchInstanceAnalysis batchInstanceAnalysis = null;


  /**
   * Get cardPOSNetworkOperatingSessionInstanceRecord
   * @return cardPOSNetworkOperatingSessionInstanceRecord
  **/

  public BQBatchRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceRecord getCardPOSNetworkOperatingSessionInstanceRecord() {
    return cardPOSNetworkOperatingSessionInstanceRecord;
  }

  public void setCardPOSNetworkOperatingSessionInstanceRecord(BQBatchRetrieveOutputModelCardPOSNetworkOperatingSessionInstanceRecord cardPOSNetworkOperatingSessionInstanceRecord) {
    this.cardPOSNetworkOperatingSessionInstanceRecord = cardPOSNetworkOperatingSessionInstanceRecord;
  }


  /**
   * Get batchInstanceRecord
   * @return batchInstanceRecord
  **/

  public BQBatchRetrieveOutputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchRetrieveOutputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Batch instance retrieve service call 
   * @return batchRetrieveActionTaskReference
  **/

  public String getBatchRetrieveActionTaskReference() {
    return batchRetrieveActionTaskReference;
  }

  public void setBatchRetrieveActionTaskReference(String batchRetrieveActionTaskReference) {
    this.batchRetrieveActionTaskReference = batchRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return batchRetrieveActionTaskRecord
  **/

  public Object getBatchRetrieveActionTaskRecord() {
    return batchRetrieveActionTaskRecord;
  }

  public void setBatchRetrieveActionTaskRecord(Object batchRetrieveActionTaskRecord) {
    this.batchRetrieveActionTaskRecord = batchRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return batchRetrieveActionResponse
  **/

  public String getBatchRetrieveActionResponse() {
    return batchRetrieveActionResponse;
  }

  public void setBatchRetrieveActionResponse(String batchRetrieveActionResponse) {
    this.batchRetrieveActionResponse = batchRetrieveActionResponse;
  }


  /**
   * Get batchInstanceReport
   * @return batchInstanceReport
  **/

  public BQBatchRetrieveOutputModelBatchInstanceReport getBatchInstanceReport() {
    return batchInstanceReport;
  }

  public void setBatchInstanceReport(BQBatchRetrieveOutputModelBatchInstanceReport batchInstanceReport) {
    this.batchInstanceReport = batchInstanceReport;
  }


  /**
   * Get batchInstanceAnalysis
   * @return batchInstanceAnalysis
  **/

  public BQBatchRetrieveOutputModelBatchInstanceAnalysis getBatchInstanceAnalysis() {
    return batchInstanceAnalysis;
  }

  public void setBatchInstanceAnalysis(BQBatchRetrieveOutputModelBatchInstanceAnalysis batchInstanceAnalysis) {
    this.batchInstanceAnalysis = batchInstanceAnalysis;
  }


}

