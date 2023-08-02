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
import java.util.ArrayList;
import java.util.List;
/**
 * ClientsMe
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class ClientsMe {
  @SerializedName("AccountValueProtectionLimit")
  private BigDecimal accountValueProtectionLimit = null;

  @SerializedName("AllowedNettingProfiles")
  private List<String> allowedNettingProfiles = null;

  @SerializedName("AllowedTradingSessions")
  private String allowedTradingSessions = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientKey")
  private String clientKey = null;

  @SerializedName("ClientType")
  private String clientType = null;

  @SerializedName("CurrencyDecimals")
  private Integer currencyDecimals = null;

  @SerializedName("DefaultAccountId")
  private String defaultAccountId = null;

  @SerializedName("DefaultAccountKey")
  private String defaultAccountKey = null;

  @SerializedName("DefaultCurrency")
  private String defaultCurrency = null;

  @SerializedName("ForceOpenDefaultValue")
  private Boolean forceOpenDefaultValue = null;

  @SerializedName("IsMarginTradingAllowed")
  private Boolean isMarginTradingAllowed = null;

  @SerializedName("IsVariationMarginEligible")
  private Boolean isVariationMarginEligible = null;

  @SerializedName("LegalAssetTypes")
  private List<String> legalAssetTypes = null;

  @SerializedName("LegalAssetTypesAreIndicative")
  private Boolean legalAssetTypesAreIndicative = null;

  @SerializedName("MarginCalculationMethod")
  private String marginCalculationMethod = null;

  @SerializedName("MarginMonitoringMode")
  private String marginMonitoringMode = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PartnerPlatformId")
  private String partnerPlatformId = null;

  @SerializedName("PositionNettingMethod")
  private String positionNettingMethod = null;

  @SerializedName("PositionNettingMode")
  private String positionNettingMode = null;

  @SerializedName("PositionNettingProfile")
  private String positionNettingProfile = null;

  @SerializedName("ReduceExposureOnly")
  private Boolean reduceExposureOnly = null;

  @SerializedName("SupportsAccountValueProtectionLimit")
  private Boolean supportsAccountValueProtectionLimit = null;

  public ClientsMe accountValueProtectionLimit(BigDecimal accountValueProtectionLimit) {
    this.accountValueProtectionLimit = accountValueProtectionLimit;
    return this;
  }

   /**
   * Get accountValueProtectionLimit
   * @return accountValueProtectionLimit
  **/
  @Schema(description = "")
  public BigDecimal getAccountValueProtectionLimit() {
    return accountValueProtectionLimit;
  }

  public void setAccountValueProtectionLimit(BigDecimal accountValueProtectionLimit) {
    this.accountValueProtectionLimit = accountValueProtectionLimit;
  }

  public ClientsMe allowedNettingProfiles(List<String> allowedNettingProfiles) {
    this.allowedNettingProfiles = allowedNettingProfiles;
    return this;
  }

  public ClientsMe addAllowedNettingProfilesItem(String allowedNettingProfilesItem) {
    if (this.allowedNettingProfiles == null) {
      this.allowedNettingProfiles = new ArrayList<String>();
    }
    this.allowedNettingProfiles.add(allowedNettingProfilesItem);
    return this;
  }

   /**
   * Get allowedNettingProfiles
   * @return allowedNettingProfiles
  **/
  @Schema(description = "")
  public List<String> getAllowedNettingProfiles() {
    return allowedNettingProfiles;
  }

  public void setAllowedNettingProfiles(List<String> allowedNettingProfiles) {
    this.allowedNettingProfiles = allowedNettingProfiles;
  }

  public ClientsMe allowedTradingSessions(String allowedTradingSessions) {
    this.allowedTradingSessions = allowedTradingSessions;
    return this;
  }

   /**
   * Get allowedTradingSessions
   * @return allowedTradingSessions
  **/
  @Schema(description = "")
  public String getAllowedTradingSessions() {
    return allowedTradingSessions;
  }

  public void setAllowedTradingSessions(String allowedTradingSessions) {
    this.allowedTradingSessions = allowedTradingSessions;
  }

  public ClientsMe clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ClientsMe clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Get clientKey
   * @return clientKey
  **/
  @Schema(description = "")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public ClientsMe clientType(String clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @Schema(description = "")
  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public ClientsMe currencyDecimals(Integer currencyDecimals) {
    this.currencyDecimals = currencyDecimals;
    return this;
  }

   /**
   * Get currencyDecimals
   * @return currencyDecimals
  **/
  @Schema(description = "")
  public Integer getCurrencyDecimals() {
    return currencyDecimals;
  }

  public void setCurrencyDecimals(Integer currencyDecimals) {
    this.currencyDecimals = currencyDecimals;
  }

  public ClientsMe defaultAccountId(String defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

   /**
   * Get defaultAccountId
   * @return defaultAccountId
  **/
  @Schema(description = "")
  public String getDefaultAccountId() {
    return defaultAccountId;
  }

  public void setDefaultAccountId(String defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }

  public ClientsMe defaultAccountKey(String defaultAccountKey) {
    this.defaultAccountKey = defaultAccountKey;
    return this;
  }

   /**
   * Get defaultAccountKey
   * @return defaultAccountKey
  **/
  @Schema(description = "")
  public String getDefaultAccountKey() {
    return defaultAccountKey;
  }

  public void setDefaultAccountKey(String defaultAccountKey) {
    this.defaultAccountKey = defaultAccountKey;
  }

  public ClientsMe defaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @Schema(description = "")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public ClientsMe forceOpenDefaultValue(Boolean forceOpenDefaultValue) {
    this.forceOpenDefaultValue = forceOpenDefaultValue;
    return this;
  }

   /**
   * Get forceOpenDefaultValue
   * @return forceOpenDefaultValue
  **/
  @Schema(description = "")
  public Boolean isForceOpenDefaultValue() {
    return forceOpenDefaultValue;
  }

  public void setForceOpenDefaultValue(Boolean forceOpenDefaultValue) {
    this.forceOpenDefaultValue = forceOpenDefaultValue;
  }

  public ClientsMe isMarginTradingAllowed(Boolean isMarginTradingAllowed) {
    this.isMarginTradingAllowed = isMarginTradingAllowed;
    return this;
  }

   /**
   * Get isMarginTradingAllowed
   * @return isMarginTradingAllowed
  **/
  @Schema(description = "")
  public Boolean isIsMarginTradingAllowed() {
    return isMarginTradingAllowed;
  }

  public void setIsMarginTradingAllowed(Boolean isMarginTradingAllowed) {
    this.isMarginTradingAllowed = isMarginTradingAllowed;
  }

  public ClientsMe isVariationMarginEligible(Boolean isVariationMarginEligible) {
    this.isVariationMarginEligible = isVariationMarginEligible;
    return this;
  }

   /**
   * Get isVariationMarginEligible
   * @return isVariationMarginEligible
  **/
  @Schema(description = "")
  public Boolean isIsVariationMarginEligible() {
    return isVariationMarginEligible;
  }

  public void setIsVariationMarginEligible(Boolean isVariationMarginEligible) {
    this.isVariationMarginEligible = isVariationMarginEligible;
  }

  public ClientsMe legalAssetTypes(List<String> legalAssetTypes) {
    this.legalAssetTypes = legalAssetTypes;
    return this;
  }

  public ClientsMe addLegalAssetTypesItem(String legalAssetTypesItem) {
    if (this.legalAssetTypes == null) {
      this.legalAssetTypes = new ArrayList<String>();
    }
    this.legalAssetTypes.add(legalAssetTypesItem);
    return this;
  }

   /**
   * Get legalAssetTypes
   * @return legalAssetTypes
  **/
  @Schema(description = "")
  public List<String> getLegalAssetTypes() {
    return legalAssetTypes;
  }

  public void setLegalAssetTypes(List<String> legalAssetTypes) {
    this.legalAssetTypes = legalAssetTypes;
  }

  public ClientsMe legalAssetTypesAreIndicative(Boolean legalAssetTypesAreIndicative) {
    this.legalAssetTypesAreIndicative = legalAssetTypesAreIndicative;
    return this;
  }

   /**
   * Get legalAssetTypesAreIndicative
   * @return legalAssetTypesAreIndicative
  **/
  @Schema(description = "")
  public Boolean isLegalAssetTypesAreIndicative() {
    return legalAssetTypesAreIndicative;
  }

  public void setLegalAssetTypesAreIndicative(Boolean legalAssetTypesAreIndicative) {
    this.legalAssetTypesAreIndicative = legalAssetTypesAreIndicative;
  }

  public ClientsMe marginCalculationMethod(String marginCalculationMethod) {
    this.marginCalculationMethod = marginCalculationMethod;
    return this;
  }

   /**
   * Get marginCalculationMethod
   * @return marginCalculationMethod
  **/
  @Schema(description = "")
  public String getMarginCalculationMethod() {
    return marginCalculationMethod;
  }

  public void setMarginCalculationMethod(String marginCalculationMethod) {
    this.marginCalculationMethod = marginCalculationMethod;
  }

  public ClientsMe marginMonitoringMode(String marginMonitoringMode) {
    this.marginMonitoringMode = marginMonitoringMode;
    return this;
  }

   /**
   * Get marginMonitoringMode
   * @return marginMonitoringMode
  **/
  @Schema(description = "")
  public String getMarginMonitoringMode() {
    return marginMonitoringMode;
  }

  public void setMarginMonitoringMode(String marginMonitoringMode) {
    this.marginMonitoringMode = marginMonitoringMode;
  }

  public ClientsMe name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientsMe partnerPlatformId(String partnerPlatformId) {
    this.partnerPlatformId = partnerPlatformId;
    return this;
  }

   /**
   * Get partnerPlatformId
   * @return partnerPlatformId
  **/
  @Schema(description = "")
  public String getPartnerPlatformId() {
    return partnerPlatformId;
  }

  public void setPartnerPlatformId(String partnerPlatformId) {
    this.partnerPlatformId = partnerPlatformId;
  }

  public ClientsMe positionNettingMethod(String positionNettingMethod) {
    this.positionNettingMethod = positionNettingMethod;
    return this;
  }

   /**
   * Get positionNettingMethod
   * @return positionNettingMethod
  **/
  @Schema(description = "")
  public String getPositionNettingMethod() {
    return positionNettingMethod;
  }

  public void setPositionNettingMethod(String positionNettingMethod) {
    this.positionNettingMethod = positionNettingMethod;
  }

  public ClientsMe positionNettingMode(String positionNettingMode) {
    this.positionNettingMode = positionNettingMode;
    return this;
  }

   /**
   * Get positionNettingMode
   * @return positionNettingMode
  **/
  @Schema(description = "")
  public String getPositionNettingMode() {
    return positionNettingMode;
  }

  public void setPositionNettingMode(String positionNettingMode) {
    this.positionNettingMode = positionNettingMode;
  }

  public ClientsMe positionNettingProfile(String positionNettingProfile) {
    this.positionNettingProfile = positionNettingProfile;
    return this;
  }

   /**
   * Get positionNettingProfile
   * @return positionNettingProfile
  **/
  @Schema(description = "")
  public String getPositionNettingProfile() {
    return positionNettingProfile;
  }

  public void setPositionNettingProfile(String positionNettingProfile) {
    this.positionNettingProfile = positionNettingProfile;
  }

  public ClientsMe reduceExposureOnly(Boolean reduceExposureOnly) {
    this.reduceExposureOnly = reduceExposureOnly;
    return this;
  }

   /**
   * Get reduceExposureOnly
   * @return reduceExposureOnly
  **/
  @Schema(description = "")
  public Boolean isReduceExposureOnly() {
    return reduceExposureOnly;
  }

  public void setReduceExposureOnly(Boolean reduceExposureOnly) {
    this.reduceExposureOnly = reduceExposureOnly;
  }

  public ClientsMe supportsAccountValueProtectionLimit(Boolean supportsAccountValueProtectionLimit) {
    this.supportsAccountValueProtectionLimit = supportsAccountValueProtectionLimit;
    return this;
  }

   /**
   * Get supportsAccountValueProtectionLimit
   * @return supportsAccountValueProtectionLimit
  **/
  @Schema(description = "")
  public Boolean isSupportsAccountValueProtectionLimit() {
    return supportsAccountValueProtectionLimit;
  }

  public void setSupportsAccountValueProtectionLimit(Boolean supportsAccountValueProtectionLimit) {
    this.supportsAccountValueProtectionLimit = supportsAccountValueProtectionLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientsMe clientsMe = (ClientsMe) o;
    return Objects.equals(this.accountValueProtectionLimit, clientsMe.accountValueProtectionLimit) &&
        Objects.equals(this.allowedNettingProfiles, clientsMe.allowedNettingProfiles) &&
        Objects.equals(this.allowedTradingSessions, clientsMe.allowedTradingSessions) &&
        Objects.equals(this.clientId, clientsMe.clientId) &&
        Objects.equals(this.clientKey, clientsMe.clientKey) &&
        Objects.equals(this.clientType, clientsMe.clientType) &&
        Objects.equals(this.currencyDecimals, clientsMe.currencyDecimals) &&
        Objects.equals(this.defaultAccountId, clientsMe.defaultAccountId) &&
        Objects.equals(this.defaultAccountKey, clientsMe.defaultAccountKey) &&
        Objects.equals(this.defaultCurrency, clientsMe.defaultCurrency) &&
        Objects.equals(this.forceOpenDefaultValue, clientsMe.forceOpenDefaultValue) &&
        Objects.equals(this.isMarginTradingAllowed, clientsMe.isMarginTradingAllowed) &&
        Objects.equals(this.isVariationMarginEligible, clientsMe.isVariationMarginEligible) &&
        Objects.equals(this.legalAssetTypes, clientsMe.legalAssetTypes) &&
        Objects.equals(this.legalAssetTypesAreIndicative, clientsMe.legalAssetTypesAreIndicative) &&
        Objects.equals(this.marginCalculationMethod, clientsMe.marginCalculationMethod) &&
        Objects.equals(this.marginMonitoringMode, clientsMe.marginMonitoringMode) &&
        Objects.equals(this.name, clientsMe.name) &&
        Objects.equals(this.partnerPlatformId, clientsMe.partnerPlatformId) &&
        Objects.equals(this.positionNettingMethod, clientsMe.positionNettingMethod) &&
        Objects.equals(this.positionNettingMode, clientsMe.positionNettingMode) &&
        Objects.equals(this.positionNettingProfile, clientsMe.positionNettingProfile) &&
        Objects.equals(this.reduceExposureOnly, clientsMe.reduceExposureOnly) &&
        Objects.equals(this.supportsAccountValueProtectionLimit, clientsMe.supportsAccountValueProtectionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountValueProtectionLimit, allowedNettingProfiles, allowedTradingSessions, clientId, clientKey, clientType, currencyDecimals, defaultAccountId, defaultAccountKey, defaultCurrency, forceOpenDefaultValue, isMarginTradingAllowed, isVariationMarginEligible, legalAssetTypes, legalAssetTypesAreIndicative, marginCalculationMethod, marginMonitoringMode, name, partnerPlatformId, positionNettingMethod, positionNettingMode, positionNettingProfile, reduceExposureOnly, supportsAccountValueProtectionLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientsMe {\n");
    
    sb.append("    accountValueProtectionLimit: ").append(toIndentedString(accountValueProtectionLimit)).append("\n");
    sb.append("    allowedNettingProfiles: ").append(toIndentedString(allowedNettingProfiles)).append("\n");
    sb.append("    allowedTradingSessions: ").append(toIndentedString(allowedTradingSessions)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    currencyDecimals: ").append(toIndentedString(currencyDecimals)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    defaultAccountKey: ").append(toIndentedString(defaultAccountKey)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    forceOpenDefaultValue: ").append(toIndentedString(forceOpenDefaultValue)).append("\n");
    sb.append("    isMarginTradingAllowed: ").append(toIndentedString(isMarginTradingAllowed)).append("\n");
    sb.append("    isVariationMarginEligible: ").append(toIndentedString(isVariationMarginEligible)).append("\n");
    sb.append("    legalAssetTypes: ").append(toIndentedString(legalAssetTypes)).append("\n");
    sb.append("    legalAssetTypesAreIndicative: ").append(toIndentedString(legalAssetTypesAreIndicative)).append("\n");
    sb.append("    marginCalculationMethod: ").append(toIndentedString(marginCalculationMethod)).append("\n");
    sb.append("    marginMonitoringMode: ").append(toIndentedString(marginMonitoringMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerPlatformId: ").append(toIndentedString(partnerPlatformId)).append("\n");
    sb.append("    positionNettingMethod: ").append(toIndentedString(positionNettingMethod)).append("\n");
    sb.append("    positionNettingMode: ").append(toIndentedString(positionNettingMode)).append("\n");
    sb.append("    positionNettingProfile: ").append(toIndentedString(positionNettingProfile)).append("\n");
    sb.append("    reduceExposureOnly: ").append(toIndentedString(reduceExposureOnly)).append("\n");
    sb.append("    supportsAccountValueProtectionLimit: ").append(toIndentedString(supportsAccountValueProtectionLimit)).append("\n");
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
