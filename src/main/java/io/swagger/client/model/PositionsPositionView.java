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
import io.swagger.client.model.PositionsPositionViewSettlementInstruction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * PositionsPositionView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class PositionsPositionView {
  @SerializedName("Ask")
  private BigDecimal ask = null;

  @SerializedName("Bid")
  private BigDecimal bid = null;

  @SerializedName("CalculationReliability")
  private String calculationReliability = null;

  @SerializedName("CurrentPrice")
  private BigDecimal currentPrice = null;

  @SerializedName("CurrentPriceDelayMinutes")
  private Long currentPriceDelayMinutes = null;

  @SerializedName("CurrentPriceType")
  private String currentPriceType = null;

  @SerializedName("Exposure")
  private BigDecimal exposure = null;

  @SerializedName("ExposureCurrency")
  private String exposureCurrency = null;

  @SerializedName("ExposureInBaseCurrency")
  private BigDecimal exposureInBaseCurrency = null;

  @SerializedName("InstrumentPriceDayPercentChange")
  private BigDecimal instrumentPriceDayPercentChange = null;

  @SerializedName("ProfitLossOnTrade")
  private BigDecimal profitLossOnTrade = null;

  @SerializedName("ProfitLossOnTradeInBaseCurrency")
  private BigDecimal profitLossOnTradeInBaseCurrency = null;

  @SerializedName("SettlementInstruction")
  private PositionsPositionViewSettlementInstruction settlementInstruction = null;

  @SerializedName("TradeCostsTotal")
  private BigDecimal tradeCostsTotal = null;

  @SerializedName("TradeCostsTotalInBaseCurrency")
  private BigDecimal tradeCostsTotalInBaseCurrency = null;

  public PositionsPositionView ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @Schema(description = "")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public PositionsPositionView bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @Schema(description = "")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public PositionsPositionView calculationReliability(String calculationReliability) {
    this.calculationReliability = calculationReliability;
    return this;
  }

   /**
   * Get calculationReliability
   * @return calculationReliability
  **/
  @Schema(description = "")
  public String getCalculationReliability() {
    return calculationReliability;
  }

  public void setCalculationReliability(String calculationReliability) {
    this.calculationReliability = calculationReliability;
  }

  public PositionsPositionView currentPrice(BigDecimal currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

   /**
   * Get currentPrice
   * @return currentPrice
  **/
  @Schema(description = "")
  public BigDecimal getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(BigDecimal currentPrice) {
    this.currentPrice = currentPrice;
  }

  public PositionsPositionView currentPriceDelayMinutes(Long currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
    return this;
  }

   /**
   * Get currentPriceDelayMinutes
   * @return currentPriceDelayMinutes
  **/
  @Schema(description = "")
  public Long getCurrentPriceDelayMinutes() {
    return currentPriceDelayMinutes;
  }

  public void setCurrentPriceDelayMinutes(Long currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
  }

  public PositionsPositionView currentPriceType(String currentPriceType) {
    this.currentPriceType = currentPriceType;
    return this;
  }

   /**
   * Get currentPriceType
   * @return currentPriceType
  **/
  @Schema(description = "")
  public String getCurrentPriceType() {
    return currentPriceType;
  }

  public void setCurrentPriceType(String currentPriceType) {
    this.currentPriceType = currentPriceType;
  }

  public PositionsPositionView exposure(BigDecimal exposure) {
    this.exposure = exposure;
    return this;
  }

   /**
   * Get exposure
   * @return exposure
  **/
  @Schema(description = "")
  public BigDecimal getExposure() {
    return exposure;
  }

  public void setExposure(BigDecimal exposure) {
    this.exposure = exposure;
  }

  public PositionsPositionView exposureCurrency(String exposureCurrency) {
    this.exposureCurrency = exposureCurrency;
    return this;
  }

   /**
   * Get exposureCurrency
   * @return exposureCurrency
  **/
  @Schema(description = "")
  public String getExposureCurrency() {
    return exposureCurrency;
  }

  public void setExposureCurrency(String exposureCurrency) {
    this.exposureCurrency = exposureCurrency;
  }

  public PositionsPositionView exposureInBaseCurrency(BigDecimal exposureInBaseCurrency) {
    this.exposureInBaseCurrency = exposureInBaseCurrency;
    return this;
  }

   /**
   * Get exposureInBaseCurrency
   * @return exposureInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getExposureInBaseCurrency() {
    return exposureInBaseCurrency;
  }

  public void setExposureInBaseCurrency(BigDecimal exposureInBaseCurrency) {
    this.exposureInBaseCurrency = exposureInBaseCurrency;
  }

  public PositionsPositionView instrumentPriceDayPercentChange(BigDecimal instrumentPriceDayPercentChange) {
    this.instrumentPriceDayPercentChange = instrumentPriceDayPercentChange;
    return this;
  }

   /**
   * Get instrumentPriceDayPercentChange
   * @return instrumentPriceDayPercentChange
  **/
  @Schema(description = "")
  public BigDecimal getInstrumentPriceDayPercentChange() {
    return instrumentPriceDayPercentChange;
  }

  public void setInstrumentPriceDayPercentChange(BigDecimal instrumentPriceDayPercentChange) {
    this.instrumentPriceDayPercentChange = instrumentPriceDayPercentChange;
  }

  public PositionsPositionView profitLossOnTrade(BigDecimal profitLossOnTrade) {
    this.profitLossOnTrade = profitLossOnTrade;
    return this;
  }

   /**
   * Get profitLossOnTrade
   * @return profitLossOnTrade
  **/
  @Schema(description = "")
  public BigDecimal getProfitLossOnTrade() {
    return profitLossOnTrade;
  }

  public void setProfitLossOnTrade(BigDecimal profitLossOnTrade) {
    this.profitLossOnTrade = profitLossOnTrade;
  }

  public PositionsPositionView profitLossOnTradeInBaseCurrency(BigDecimal profitLossOnTradeInBaseCurrency) {
    this.profitLossOnTradeInBaseCurrency = profitLossOnTradeInBaseCurrency;
    return this;
  }

   /**
   * Get profitLossOnTradeInBaseCurrency
   * @return profitLossOnTradeInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getProfitLossOnTradeInBaseCurrency() {
    return profitLossOnTradeInBaseCurrency;
  }

  public void setProfitLossOnTradeInBaseCurrency(BigDecimal profitLossOnTradeInBaseCurrency) {
    this.profitLossOnTradeInBaseCurrency = profitLossOnTradeInBaseCurrency;
  }

  public PositionsPositionView settlementInstruction(PositionsPositionViewSettlementInstruction settlementInstruction) {
    this.settlementInstruction = settlementInstruction;
    return this;
  }

   /**
   * Get settlementInstruction
   * @return settlementInstruction
  **/
  @Schema(description = "")
  public PositionsPositionViewSettlementInstruction getSettlementInstruction() {
    return settlementInstruction;
  }

  public void setSettlementInstruction(PositionsPositionViewSettlementInstruction settlementInstruction) {
    this.settlementInstruction = settlementInstruction;
  }

  public PositionsPositionView tradeCostsTotal(BigDecimal tradeCostsTotal) {
    this.tradeCostsTotal = tradeCostsTotal;
    return this;
  }

   /**
   * Get tradeCostsTotal
   * @return tradeCostsTotal
  **/
  @Schema(description = "")
  public BigDecimal getTradeCostsTotal() {
    return tradeCostsTotal;
  }

  public void setTradeCostsTotal(BigDecimal tradeCostsTotal) {
    this.tradeCostsTotal = tradeCostsTotal;
  }

  public PositionsPositionView tradeCostsTotalInBaseCurrency(BigDecimal tradeCostsTotalInBaseCurrency) {
    this.tradeCostsTotalInBaseCurrency = tradeCostsTotalInBaseCurrency;
    return this;
  }

   /**
   * Get tradeCostsTotalInBaseCurrency
   * @return tradeCostsTotalInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getTradeCostsTotalInBaseCurrency() {
    return tradeCostsTotalInBaseCurrency;
  }

  public void setTradeCostsTotalInBaseCurrency(BigDecimal tradeCostsTotalInBaseCurrency) {
    this.tradeCostsTotalInBaseCurrency = tradeCostsTotalInBaseCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionsPositionView positionsPositionView = (PositionsPositionView) o;
    return Objects.equals(this.ask, positionsPositionView.ask) &&
        Objects.equals(this.bid, positionsPositionView.bid) &&
        Objects.equals(this.calculationReliability, positionsPositionView.calculationReliability) &&
        Objects.equals(this.currentPrice, positionsPositionView.currentPrice) &&
        Objects.equals(this.currentPriceDelayMinutes, positionsPositionView.currentPriceDelayMinutes) &&
        Objects.equals(this.currentPriceType, positionsPositionView.currentPriceType) &&
        Objects.equals(this.exposure, positionsPositionView.exposure) &&
        Objects.equals(this.exposureCurrency, positionsPositionView.exposureCurrency) &&
        Objects.equals(this.exposureInBaseCurrency, positionsPositionView.exposureInBaseCurrency) &&
        Objects.equals(this.instrumentPriceDayPercentChange, positionsPositionView.instrumentPriceDayPercentChange) &&
        Objects.equals(this.profitLossOnTrade, positionsPositionView.profitLossOnTrade) &&
        Objects.equals(this.profitLossOnTradeInBaseCurrency, positionsPositionView.profitLossOnTradeInBaseCurrency) &&
        Objects.equals(this.settlementInstruction, positionsPositionView.settlementInstruction) &&
        Objects.equals(this.tradeCostsTotal, positionsPositionView.tradeCostsTotal) &&
        Objects.equals(this.tradeCostsTotalInBaseCurrency, positionsPositionView.tradeCostsTotalInBaseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ask, bid, calculationReliability, currentPrice, currentPriceDelayMinutes, currentPriceType, exposure, exposureCurrency, exposureInBaseCurrency, instrumentPriceDayPercentChange, profitLossOnTrade, profitLossOnTradeInBaseCurrency, settlementInstruction, tradeCostsTotal, tradeCostsTotalInBaseCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsPositionView {\n");
    
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    calculationReliability: ").append(toIndentedString(calculationReliability)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    currentPriceDelayMinutes: ").append(toIndentedString(currentPriceDelayMinutes)).append("\n");
    sb.append("    currentPriceType: ").append(toIndentedString(currentPriceType)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    exposureCurrency: ").append(toIndentedString(exposureCurrency)).append("\n");
    sb.append("    exposureInBaseCurrency: ").append(toIndentedString(exposureInBaseCurrency)).append("\n");
    sb.append("    instrumentPriceDayPercentChange: ").append(toIndentedString(instrumentPriceDayPercentChange)).append("\n");
    sb.append("    profitLossOnTrade: ").append(toIndentedString(profitLossOnTrade)).append("\n");
    sb.append("    profitLossOnTradeInBaseCurrency: ").append(toIndentedString(profitLossOnTradeInBaseCurrency)).append("\n");
    sb.append("    settlementInstruction: ").append(toIndentedString(settlementInstruction)).append("\n");
    sb.append("    tradeCostsTotal: ").append(toIndentedString(tradeCostsTotal)).append("\n");
    sb.append("    tradeCostsTotalInBaseCurrency: ").append(toIndentedString(tradeCostsTotalInBaseCurrency)).append("\n");
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
