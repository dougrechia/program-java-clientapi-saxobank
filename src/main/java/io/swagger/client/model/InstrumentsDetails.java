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
import io.swagger.client.model.InstrumentsDetailsData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InstrumentsDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-20T19:53:46.685908542Z[GMT]")

public class InstrumentsDetails {
  @SerializedName("__next")
  private String _next = null;

  @SerializedName("Data")
  private List<InstrumentsDetailsData> data = null;

  public InstrumentsDetails _next(String _next) {
    this._next = _next;
    return this;
  }

   /**
   * Get _next
   * @return _next
  **/
  @Schema(description = "")
  public String getNext() {
    return _next;
  }

  public void setNext(String _next) {
    this._next = _next;
  }

  public InstrumentsDetails data(List<InstrumentsDetailsData> data) {
    this.data = data;
    return this;
  }

  public InstrumentsDetails addDataItem(InstrumentsDetailsData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<InstrumentsDetailsData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<InstrumentsDetailsData> getData() {
    return data;
  }

  public void setData(List<InstrumentsDetailsData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentsDetails instrumentsDetails = (InstrumentsDetails) o;
    return Objects.equals(this._next, instrumentsDetails._next) &&
        Objects.equals(this.data, instrumentsDetails.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_next, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentsDetails {\n");
    
    sb.append("    _next: ").append(toIndentedString(_next)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
