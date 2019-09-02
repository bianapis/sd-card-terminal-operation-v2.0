package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBatchRequestInputModelBatchInstanceRecord;
import org.bian.dto.BQBatchRequestInputModelCaptureInstanceRecord;
import org.bian.dto.BQCaptureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQBatchRequestInputModel
 */
public class BQBatchRequestInputModel   {
  private BQBatchRequestInputModelCaptureInstanceRecord captureInstanceRecord = null;

  private String cardPOSNetworkOperatingSessionInstanceReference = null;

  private String batchInstanceReference = null;

  private BQBatchRequestInputModelBatchInstanceRecord batchInstanceRecord = null;

  private Object batchRequestActionTaskRecord = null;

  private BQCaptureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQBatchRequestInputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQBatchRequestInputModelCaptureInstanceRecord captureInstanceRecord) {
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

  public BQBatchRequestInputModelBatchInstanceRecord getBatchInstanceRecord() {
    return batchInstanceRecord;
  }

  public void setBatchInstanceRecord(BQBatchRequestInputModelBatchInstanceRecord batchInstanceRecord) {
    this.batchInstanceRecord = batchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return batchRequestActionTaskRecord
  **/

  public Object getBatchRequestActionTaskRecord() {
    return batchRequestActionTaskRecord;
  }

  public void setBatchRequestActionTaskRecord(Object batchRequestActionTaskRecord) {
    this.batchRequestActionTaskRecord = batchRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQCaptureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQCaptureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

