package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchUpdateInputModelBatchInstanceRecord;
import org.bian.dto.BQBatchUpdateInputModelCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBatchUpdateInputModel
 */
public class BQBatchUpdateInputModel   {
  private BQBatchUpdateInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private String batchInstanceReference = null;

  private BQBatchUpdateInputModelBatchInstanceRecord batchInstanceRecord = null;

  private Object batchUpdateActionTaskRecord = null;

  private String batchUpdateActionRequest = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQBatchUpdateInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQBatchUpdateInputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card POS Network Operating Session instance 
   * @return cardPOSNetworkOperatingSessionInstanceReference
  **/

  public String getCardPOSNetworkOperatingSessionInstanceReference() {
    return cardPOSNetworkOperatingSessionInstanceReference;
  }

  public void setCardPOSNetworkOperatingSessionInstanceReference(String cardPOSNetworkOperatingSessionInstanceReference) {
    this.cardPOSNetworkOperatingSessionInstanceReference = cardPOSNetworkOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Batch instance 
   * @return batchInstanceReference
  **/

  public String getBatchInstanceReference() {
    return batchInstanceReference;
  }

  public void setBatchInstanceReference(String batchInstanceReference) {
    this.batchInstanceReference = batchInstanceReference;
  }


  /**
   * Get batchInstanceRecord
   * @return batchInstanceRecord
  **/

  public BQBatchUpdateInputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchUpdateInputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return batchUpdateActionTaskRecord
  **/

  public Object getBatchUpdateActionTaskRecord() {
    return batchUpdateActionTaskRecord;
  }

  public void setBatchUpdateActionTaskRecord(Object batchUpdateActionTaskRecord) {
    this.batchUpdateActionTaskRecord = batchUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return batchUpdateActionRequest
  **/

  public String getBatchUpdateActionRequest() {
    return batchUpdateActionRequest;
  }

  public void setBatchUpdateActionRequest(String batchUpdateActionRequest) {
    this.batchUpdateActionRequest = batchUpdateActionRequest;
  }


}

