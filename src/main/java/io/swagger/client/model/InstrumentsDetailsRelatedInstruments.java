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
 * InstrumentsDetailsRelatedInstruments
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class InstrumentsDetailsRelatedInstruments {
  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("Uic")
  private Long uic = null;

  public InstrumentsDetailsRelatedInstruments assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public InstrumentsDetailsRelatedInstruments uic(Long uic) {
    this.uic = uic;
    return this;
  }

   /**
   * Get uic
   * @return uic
  **/
  @Schema(description = "")
  public Long getUic() {
    return uic;
  }

  public void setUic(Long uic) {
    this.uic = uic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentsDetailsRelatedInstruments instrumentsDetailsRelatedInstruments = (InstrumentsDetailsRelatedInstruments) o;
    return Objects.equals(this.assetType, instrumentsDetailsRelatedInstruments.assetType) &&
        Objects.equals(this.uic, instrumentsDetailsRelatedInstruments.uic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, uic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentsDetailsRelatedInstruments {\n");
    
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
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
