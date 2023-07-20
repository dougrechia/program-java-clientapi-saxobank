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
/**
 * InstrumentDetailOrderDistances
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-20T19:32:10.789006533Z[GMT]")

public class InstrumentDetailOrderDistances {
  @SerializedName("EntryDefaultDistance")
  private Integer entryDefaultDistance = null;

  @SerializedName("EntryDefaultDistanceType")
  private String entryDefaultDistanceType = null;

  @SerializedName("LimitDefaultDistance")
  private Integer limitDefaultDistance = null;

  @SerializedName("LimitDefaultDistanceType")
  private String limitDefaultDistanceType = null;

  @SerializedName("StopLimitDefaultDistance")
  private Integer stopLimitDefaultDistance = null;

  @SerializedName("StopLimitDefaultDistanceType")
  private String stopLimitDefaultDistanceType = null;

  @SerializedName("StopLossDefaultDistance")
  private Integer stopLossDefaultDistance = null;

  @SerializedName("StopLossDefaultDistanceType")
  private String stopLossDefaultDistanceType = null;

  @SerializedName("StopLossDefaultEnabled")
  private Boolean stopLossDefaultEnabled = null;

  @SerializedName("StopLossDefaultOrderType")
  private String stopLossDefaultOrderType = null;

  @SerializedName("TakeProfitDefaultDistance")
  private Integer takeProfitDefaultDistance = null;

  @SerializedName("TakeProfitDefaultDistanceType")
  private String takeProfitDefaultDistanceType = null;

  @SerializedName("TakeProfitDefaultEnabled")
  private Boolean takeProfitDefaultEnabled = null;

  public InstrumentDetailOrderDistances entryDefaultDistance(Integer entryDefaultDistance) {
    this.entryDefaultDistance = entryDefaultDistance;
    return this;
  }

   /**
   * Get entryDefaultDistance
   * @return entryDefaultDistance
  **/
  @Schema(description = "")
  public Integer getEntryDefaultDistance() {
    return entryDefaultDistance;
  }

  public void setEntryDefaultDistance(Integer entryDefaultDistance) {
    this.entryDefaultDistance = entryDefaultDistance;
  }

  public InstrumentDetailOrderDistances entryDefaultDistanceType(String entryDefaultDistanceType) {
    this.entryDefaultDistanceType = entryDefaultDistanceType;
    return this;
  }

   /**
   * Get entryDefaultDistanceType
   * @return entryDefaultDistanceType
  **/
  @Schema(description = "")
  public String getEntryDefaultDistanceType() {
    return entryDefaultDistanceType;
  }

  public void setEntryDefaultDistanceType(String entryDefaultDistanceType) {
    this.entryDefaultDistanceType = entryDefaultDistanceType;
  }

  public InstrumentDetailOrderDistances limitDefaultDistance(Integer limitDefaultDistance) {
    this.limitDefaultDistance = limitDefaultDistance;
    return this;
  }

   /**
   * Get limitDefaultDistance
   * @return limitDefaultDistance
  **/
  @Schema(description = "")
  public Integer getLimitDefaultDistance() {
    return limitDefaultDistance;
  }

  public void setLimitDefaultDistance(Integer limitDefaultDistance) {
    this.limitDefaultDistance = limitDefaultDistance;
  }

  public InstrumentDetailOrderDistances limitDefaultDistanceType(String limitDefaultDistanceType) {
    this.limitDefaultDistanceType = limitDefaultDistanceType;
    return this;
  }

   /**
   * Get limitDefaultDistanceType
   * @return limitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getLimitDefaultDistanceType() {
    return limitDefaultDistanceType;
  }

  public void setLimitDefaultDistanceType(String limitDefaultDistanceType) {
    this.limitDefaultDistanceType = limitDefaultDistanceType;
  }

  public InstrumentDetailOrderDistances stopLimitDefaultDistance(Integer stopLimitDefaultDistance) {
    this.stopLimitDefaultDistance = stopLimitDefaultDistance;
    return this;
  }

   /**
   * Get stopLimitDefaultDistance
   * @return stopLimitDefaultDistance
  **/
  @Schema(description = "")
  public Integer getStopLimitDefaultDistance() {
    return stopLimitDefaultDistance;
  }

  public void setStopLimitDefaultDistance(Integer stopLimitDefaultDistance) {
    this.stopLimitDefaultDistance = stopLimitDefaultDistance;
  }

  public InstrumentDetailOrderDistances stopLimitDefaultDistanceType(String stopLimitDefaultDistanceType) {
    this.stopLimitDefaultDistanceType = stopLimitDefaultDistanceType;
    return this;
  }

   /**
   * Get stopLimitDefaultDistanceType
   * @return stopLimitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getStopLimitDefaultDistanceType() {
    return stopLimitDefaultDistanceType;
  }

  public void setStopLimitDefaultDistanceType(String stopLimitDefaultDistanceType) {
    this.stopLimitDefaultDistanceType = stopLimitDefaultDistanceType;
  }

  public InstrumentDetailOrderDistances stopLossDefaultDistance(Integer stopLossDefaultDistance) {
    this.stopLossDefaultDistance = stopLossDefaultDistance;
    return this;
  }

   /**
   * Get stopLossDefaultDistance
   * @return stopLossDefaultDistance
  **/
  @Schema(description = "")
  public Integer getStopLossDefaultDistance() {
    return stopLossDefaultDistance;
  }

  public void setStopLossDefaultDistance(Integer stopLossDefaultDistance) {
    this.stopLossDefaultDistance = stopLossDefaultDistance;
  }

  public InstrumentDetailOrderDistances stopLossDefaultDistanceType(String stopLossDefaultDistanceType) {
    this.stopLossDefaultDistanceType = stopLossDefaultDistanceType;
    return this;
  }

   /**
   * Get stopLossDefaultDistanceType
   * @return stopLossDefaultDistanceType
  **/
  @Schema(description = "")
  public String getStopLossDefaultDistanceType() {
    return stopLossDefaultDistanceType;
  }

  public void setStopLossDefaultDistanceType(String stopLossDefaultDistanceType) {
    this.stopLossDefaultDistanceType = stopLossDefaultDistanceType;
  }

  public InstrumentDetailOrderDistances stopLossDefaultEnabled(Boolean stopLossDefaultEnabled) {
    this.stopLossDefaultEnabled = stopLossDefaultEnabled;
    return this;
  }

   /**
   * Get stopLossDefaultEnabled
   * @return stopLossDefaultEnabled
  **/
  @Schema(description = "")
  public Boolean isStopLossDefaultEnabled() {
    return stopLossDefaultEnabled;
  }

  public void setStopLossDefaultEnabled(Boolean stopLossDefaultEnabled) {
    this.stopLossDefaultEnabled = stopLossDefaultEnabled;
  }

  public InstrumentDetailOrderDistances stopLossDefaultOrderType(String stopLossDefaultOrderType) {
    this.stopLossDefaultOrderType = stopLossDefaultOrderType;
    return this;
  }

   /**
   * Get stopLossDefaultOrderType
   * @return stopLossDefaultOrderType
  **/
  @Schema(description = "")
  public String getStopLossDefaultOrderType() {
    return stopLossDefaultOrderType;
  }

  public void setStopLossDefaultOrderType(String stopLossDefaultOrderType) {
    this.stopLossDefaultOrderType = stopLossDefaultOrderType;
  }

  public InstrumentDetailOrderDistances takeProfitDefaultDistance(Integer takeProfitDefaultDistance) {
    this.takeProfitDefaultDistance = takeProfitDefaultDistance;
    return this;
  }

   /**
   * Get takeProfitDefaultDistance
   * @return takeProfitDefaultDistance
  **/
  @Schema(description = "")
  public Integer getTakeProfitDefaultDistance() {
    return takeProfitDefaultDistance;
  }

  public void setTakeProfitDefaultDistance(Integer takeProfitDefaultDistance) {
    this.takeProfitDefaultDistance = takeProfitDefaultDistance;
  }

  public InstrumentDetailOrderDistances takeProfitDefaultDistanceType(String takeProfitDefaultDistanceType) {
    this.takeProfitDefaultDistanceType = takeProfitDefaultDistanceType;
    return this;
  }

   /**
   * Get takeProfitDefaultDistanceType
   * @return takeProfitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getTakeProfitDefaultDistanceType() {
    return takeProfitDefaultDistanceType;
  }

  public void setTakeProfitDefaultDistanceType(String takeProfitDefaultDistanceType) {
    this.takeProfitDefaultDistanceType = takeProfitDefaultDistanceType;
  }

  public InstrumentDetailOrderDistances takeProfitDefaultEnabled(Boolean takeProfitDefaultEnabled) {
    this.takeProfitDefaultEnabled = takeProfitDefaultEnabled;
    return this;
  }

   /**
   * Get takeProfitDefaultEnabled
   * @return takeProfitDefaultEnabled
  **/
  @Schema(description = "")
  public Boolean isTakeProfitDefaultEnabled() {
    return takeProfitDefaultEnabled;
  }

  public void setTakeProfitDefaultEnabled(Boolean takeProfitDefaultEnabled) {
    this.takeProfitDefaultEnabled = takeProfitDefaultEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentDetailOrderDistances instrumentDetailOrderDistances = (InstrumentDetailOrderDistances) o;
    return Objects.equals(this.entryDefaultDistance, instrumentDetailOrderDistances.entryDefaultDistance) &&
        Objects.equals(this.entryDefaultDistanceType, instrumentDetailOrderDistances.entryDefaultDistanceType) &&
        Objects.equals(this.limitDefaultDistance, instrumentDetailOrderDistances.limitDefaultDistance) &&
        Objects.equals(this.limitDefaultDistanceType, instrumentDetailOrderDistances.limitDefaultDistanceType) &&
        Objects.equals(this.stopLimitDefaultDistance, instrumentDetailOrderDistances.stopLimitDefaultDistance) &&
        Objects.equals(this.stopLimitDefaultDistanceType, instrumentDetailOrderDistances.stopLimitDefaultDistanceType) &&
        Objects.equals(this.stopLossDefaultDistance, instrumentDetailOrderDistances.stopLossDefaultDistance) &&
        Objects.equals(this.stopLossDefaultDistanceType, instrumentDetailOrderDistances.stopLossDefaultDistanceType) &&
        Objects.equals(this.stopLossDefaultEnabled, instrumentDetailOrderDistances.stopLossDefaultEnabled) &&
        Objects.equals(this.stopLossDefaultOrderType, instrumentDetailOrderDistances.stopLossDefaultOrderType) &&
        Objects.equals(this.takeProfitDefaultDistance, instrumentDetailOrderDistances.takeProfitDefaultDistance) &&
        Objects.equals(this.takeProfitDefaultDistanceType, instrumentDetailOrderDistances.takeProfitDefaultDistanceType) &&
        Objects.equals(this.takeProfitDefaultEnabled, instrumentDetailOrderDistances.takeProfitDefaultEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryDefaultDistance, entryDefaultDistanceType, limitDefaultDistance, limitDefaultDistanceType, stopLimitDefaultDistance, stopLimitDefaultDistanceType, stopLossDefaultDistance, stopLossDefaultDistanceType, stopLossDefaultEnabled, stopLossDefaultOrderType, takeProfitDefaultDistance, takeProfitDefaultDistanceType, takeProfitDefaultEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentDetailOrderDistances {\n");
    
    sb.append("    entryDefaultDistance: ").append(toIndentedString(entryDefaultDistance)).append("\n");
    sb.append("    entryDefaultDistanceType: ").append(toIndentedString(entryDefaultDistanceType)).append("\n");
    sb.append("    limitDefaultDistance: ").append(toIndentedString(limitDefaultDistance)).append("\n");
    sb.append("    limitDefaultDistanceType: ").append(toIndentedString(limitDefaultDistanceType)).append("\n");
    sb.append("    stopLimitDefaultDistance: ").append(toIndentedString(stopLimitDefaultDistance)).append("\n");
    sb.append("    stopLimitDefaultDistanceType: ").append(toIndentedString(stopLimitDefaultDistanceType)).append("\n");
    sb.append("    stopLossDefaultDistance: ").append(toIndentedString(stopLossDefaultDistance)).append("\n");
    sb.append("    stopLossDefaultDistanceType: ").append(toIndentedString(stopLossDefaultDistanceType)).append("\n");
    sb.append("    stopLossDefaultEnabled: ").append(toIndentedString(stopLossDefaultEnabled)).append("\n");
    sb.append("    stopLossDefaultOrderType: ").append(toIndentedString(stopLossDefaultOrderType)).append("\n");
    sb.append("    takeProfitDefaultDistance: ").append(toIndentedString(takeProfitDefaultDistance)).append("\n");
    sb.append("    takeProfitDefaultDistanceType: ").append(toIndentedString(takeProfitDefaultDistanceType)).append("\n");
    sb.append("    takeProfitDefaultEnabled: ").append(toIndentedString(takeProfitDefaultEnabled)).append("\n");
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
