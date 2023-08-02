/*
 * Saxobank trading API
 * Saxobank trading API
 *
 * OpenAPI spec version: 0.1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * PositionsPositionViewSettlementInstruction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class PositionsPositionViewSettlementInstruction {
  @SerializedName("ActualRolloverAmount")
  private BigDecimal actualRolloverAmount = null;

  @SerializedName("ActualSettlementAmount")
  private BigDecimal actualSettlementAmount = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("IsSettlementInstructionsAllowed")
  private Boolean isSettlementInstructionsAllowed = null;

  @SerializedName("Month")
  private Long month = null;

  @SerializedName("SettlementType")
  private String settlementType = null;

  @SerializedName("Year")
  private Long year = null;

  public PositionsPositionViewSettlementInstruction actualRolloverAmount(BigDecimal actualRolloverAmount) {
    this.actualRolloverAmount = actualRolloverAmount;
    return this;
  }

   /**
   * Get actualRolloverAmount
   * @return actualRolloverAmount
  **/
  @Schema(description = "")
  public BigDecimal getActualRolloverAmount() {
    return actualRolloverAmount;
  }

  public void setActualRolloverAmount(BigDecimal actualRolloverAmount) {
    this.actualRolloverAmount = actualRolloverAmount;
  }

  public PositionsPositionViewSettlementInstruction actualSettlementAmount(BigDecimal actualSettlementAmount) {
    this.actualSettlementAmount = actualSettlementAmount;
    return this;
  }

   /**
   * Get actualSettlementAmount
   * @return actualSettlementAmount
  **/
  @Schema(description = "")
  public BigDecimal getActualSettlementAmount() {
    return actualSettlementAmount;
  }

  public void setActualSettlementAmount(BigDecimal actualSettlementAmount) {
    this.actualSettlementAmount = actualSettlementAmount;
  }

  public PositionsPositionViewSettlementInstruction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PositionsPositionViewSettlementInstruction isSettlementInstructionsAllowed(Boolean isSettlementInstructionsAllowed) {
    this.isSettlementInstructionsAllowed = isSettlementInstructionsAllowed;
    return this;
  }

   /**
   * Get isSettlementInstructionsAllowed
   * @return isSettlementInstructionsAllowed
  **/
  @Schema(description = "")
  public Boolean isIsSettlementInstructionsAllowed() {
    return isSettlementInstructionsAllowed;
  }

  public void setIsSettlementInstructionsAllowed(Boolean isSettlementInstructionsAllowed) {
    this.isSettlementInstructionsAllowed = isSettlementInstructionsAllowed;
  }

  public PositionsPositionViewSettlementInstruction month(Long month) {
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @Schema(description = "")
  public Long getMonth() {
    return month;
  }

  public void setMonth(Long month) {
    this.month = month;
  }

  public PositionsPositionViewSettlementInstruction settlementType(String settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @Schema(description = "")
  public String getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }

  public PositionsPositionViewSettlementInstruction year(Long year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionsPositionViewSettlementInstruction positionsPositionViewSettlementInstruction = (PositionsPositionViewSettlementInstruction) o;
    return Objects.equals(this.actualRolloverAmount, positionsPositionViewSettlementInstruction.actualRolloverAmount) &&
        Objects.equals(this.actualSettlementAmount, positionsPositionViewSettlementInstruction.actualSettlementAmount) &&
        Objects.equals(this.amount, positionsPositionViewSettlementInstruction.amount) &&
        Objects.equals(this.isSettlementInstructionsAllowed, positionsPositionViewSettlementInstruction.isSettlementInstructionsAllowed) &&
        Objects.equals(this.month, positionsPositionViewSettlementInstruction.month) &&
        Objects.equals(this.settlementType, positionsPositionViewSettlementInstruction.settlementType) &&
        Objects.equals(this.year, positionsPositionViewSettlementInstruction.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualRolloverAmount, actualSettlementAmount, amount, isSettlementInstructionsAllowed, month, settlementType, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsPositionViewSettlementInstruction {\n");
    
    sb.append("    actualRolloverAmount: ").append(toIndentedString(actualRolloverAmount)).append("\n");
    sb.append("    actualSettlementAmount: ").append(toIndentedString(actualSettlementAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isSettlementInstructionsAllowed: ").append(toIndentedString(isSettlementInstructionsAllowed)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
