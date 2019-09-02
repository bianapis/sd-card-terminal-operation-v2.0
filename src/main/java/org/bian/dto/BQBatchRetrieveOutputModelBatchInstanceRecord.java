package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBatchRetrieveOutputModelBatchInstanceRecord
 */
public class BQBatchRetrieveOutputModelBatchInstanceRecord   {
  private String cardTransactionBatchReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the batch of transactions 
   * @return cardTransactionBatchReference
  **/

  public String getCardTransactionBatchReference() {
    return cardTransactionBatchReference;
  }

  public void setCardTransactionBatchReference(String cardTransactionBatchReference) {
    this.cardTransactionBatchReference = cardTransactionBatchReference;
  }


}

