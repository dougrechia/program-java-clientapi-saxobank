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
 * The Order Duration. See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/changeorder/9304f171cf009b860f398733b4ae32ef/orderduration/e4b428c63c994fe617135f739171ede3
 */
@Schema(description = "The Order Duration. See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/changeorder/9304f171cf009b860f398733b4ae32ef/orderduration/e4b428c63c994fe617135f739171ede3")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class Openapitradev2ordersOrderDuration1 {
  @SerializedName("DurationType")
  private String durationType = null;

  @SerializedName("ExpirationDateContainsTime")
  private Boolean expirationDateContainsTime = null;

  @SerializedName("ExpirationDateTime")
  private String expirationDateTime = null;

  public Openapitradev2ordersOrderDuration1 durationType(String durationType) {
    this.durationType = durationType;
    return this;
  }

   /**
   * Get durationType
   * @return durationType
  **/
  @Schema(description = "")
  public String getDurationType() {
    return durationType;
  }

  public void setDurationType(String durationType) {
    this.durationType = durationType;
  }

  public Openapitradev2ordersOrderDuration1 expirationDateContainsTime(Boolean expirationDateContainsTime) {
    this.expirationDateContainsTime = expirationDateContainsTime;
    return this;
  }

   /**
   * Get expirationDateContainsTime
   * @return expirationDateContainsTime
  **/
  @Schema(description = "")
  public Boolean isExpirationDateContainsTime() {
    return expirationDateContainsTime;
  }

  public void setExpirationDateContainsTime(Boolean expirationDateContainsTime) {
    this.expirationDateContainsTime = expirationDateContainsTime;
  }

  public Openapitradev2ordersOrderDuration1 expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Get expirationDateTime
   * @return expirationDateTime
  **/
  @Schema(description = "")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Openapitradev2ordersOrderDuration1 openapitradev2ordersOrderDuration1 = (Openapitradev2ordersOrderDuration1) o;
    return Objects.equals(this.durationType, openapitradev2ordersOrderDuration1.durationType) &&
        Objects.equals(this.expirationDateContainsTime, openapitradev2ordersOrderDuration1.expirationDateContainsTime) &&
        Objects.equals(this.expirationDateTime, openapitradev2ordersOrderDuration1.expirationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationType, expirationDateContainsTime, expirationDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Openapitradev2ordersOrderDuration1 {\n");
    
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    expirationDateContainsTime: ").append(toIndentedString(expirationDateContainsTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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
