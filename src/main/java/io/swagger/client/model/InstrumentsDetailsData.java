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
import io.swagger.client.model.InstrumentsDetailsExchange;
import io.swagger.client.model.InstrumentsDetailsFormat;
import io.swagger.client.model.InstrumentsDetailsIpoDetails;
import io.swagger.client.model.InstrumentsDetailsOrderDistances;
import io.swagger.client.model.InstrumentsDetailsRelatedInstruments;
import io.swagger.client.model.InstrumentsDetailsRelatedOptionRootsEnhanced;
import io.swagger.client.model.InstrumentsDetailsTickSizeScheme;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * InstrumentsDetailsData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class InstrumentsDetailsData {
  @SerializedName("AffiliateInfoRequired")
  private Boolean affiliateInfoRequired = null;

  @SerializedName("AmountDecimals")
  private Long amountDecimals = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("DefaultAmount")
  private BigDecimal defaultAmount = null;

  @SerializedName("DefaultSlippage")
  private BigDecimal defaultSlippage = null;

  @SerializedName("DefaultSlippageType")
  private String defaultSlippageType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Exchange")
  private InstrumentsDetailsExchange exchange = null;

  @SerializedName("Format")
  private InstrumentsDetailsFormat format = null;

  @SerializedName("GroupId")
  private Long groupId = null;

  @SerializedName("IncrementSize")
  private Long incrementSize = null;

  @SerializedName("IpoDetails")
  private InstrumentsDetailsIpoDetails ipoDetails = null;

  @SerializedName("IsBarrierEqualsStrike")
  private Boolean isBarrierEqualsStrike = null;

  @SerializedName("IsComplex")
  private Boolean isComplex = null;

  @SerializedName("IsExtendedTradingHoursEnabled")
  private Boolean isExtendedTradingHoursEnabled = null;

  @SerializedName("IsPEAEligible")
  private Boolean isPEAEligible = null;

  @SerializedName("IsPEASMEEligible")
  private Boolean isPEASMEEligible = null;

  @SerializedName("IsRedemptionByAmounts")
  private Boolean isRedemptionByAmounts = null;

  @SerializedName("IsSwitchBySameCurrency")
  private Boolean isSwitchBySameCurrency = null;

  @SerializedName("IsSystematicInternaliser")
  private Boolean isSystematicInternaliser = null;

  @SerializedName("IsTradable")
  private Boolean isTradable = null;

  @SerializedName("LotSizeType")
  private String lotSizeType = null;

  @SerializedName("MinimumTradeSize")
  private Long minimumTradeSize = null;

  @SerializedName("NonTradableReason")
  private String nonTradableReason = null;

  @SerializedName("OrderDistances")
  private InstrumentsDetailsOrderDistances orderDistances = null;

  @SerializedName("PriceCurrency")
  private String priceCurrency = null;

  @SerializedName("PriceToContractFactor")
  private BigDecimal priceToContractFactor = null;

  @SerializedName("PrimaryListing")
  private Long primaryListing = null;

  @SerializedName("RelatedInstruments")
  private List<InstrumentsDetailsRelatedInstruments> relatedInstruments = null;

  @SerializedName("RelatedOptionRoots")
  private List<Long> relatedOptionRoots = null;

  @SerializedName("RelatedOptionRootsEnhanced")
  private List<InstrumentsDetailsRelatedOptionRootsEnhanced> relatedOptionRootsEnhanced = null;

  @SerializedName("StandardAmounts")
  private List<Long> standardAmounts = null;

  @SerializedName("SupportedOrderTriggerPriceTypes")
  private List<String> supportedOrderTriggerPriceTypes = null;

  @SerializedName("SupportedOrderTypes")
  private List<String> supportedOrderTypes = null;

  @SerializedName("SupportedStrategies")
  private List<String> supportedStrategies = null;

  @SerializedName("Symbol")
  private String symbol = null;

  @SerializedName("TickSizeScheme")
  private InstrumentsDetailsTickSizeScheme tickSizeScheme = null;

  @SerializedName("TradableAs")
  private List<String> tradableAs = null;

  @SerializedName("TradableOn")
  private List<String> tradableOn = null;

  @SerializedName("TradingSignals")
  private String tradingSignals = null;

  @SerializedName("TradingStatus")
  private String tradingStatus = null;

  @SerializedName("Uic")
  private Long uic = null;

  public InstrumentsDetailsData affiliateInfoRequired(Boolean affiliateInfoRequired) {
    this.affiliateInfoRequired = affiliateInfoRequired;
    return this;
  }

   /**
   * Get affiliateInfoRequired
   * @return affiliateInfoRequired
  **/
  @Schema(description = "")
  public Boolean isAffiliateInfoRequired() {
    return affiliateInfoRequired;
  }

  public void setAffiliateInfoRequired(Boolean affiliateInfoRequired) {
    this.affiliateInfoRequired = affiliateInfoRequired;
  }

  public InstrumentsDetailsData amountDecimals(Long amountDecimals) {
    this.amountDecimals = amountDecimals;
    return this;
  }

   /**
   * Get amountDecimals
   * @return amountDecimals
  **/
  @Schema(description = "")
  public Long getAmountDecimals() {
    return amountDecimals;
  }

  public void setAmountDecimals(Long amountDecimals) {
    this.amountDecimals = amountDecimals;
  }

  public InstrumentsDetailsData assetType(String assetType) {
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

  public InstrumentsDetailsData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @Schema(description = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public InstrumentsDetailsData defaultAmount(BigDecimal defaultAmount) {
    this.defaultAmount = defaultAmount;
    return this;
  }

   /**
   * Get defaultAmount
   * @return defaultAmount
  **/
  @Schema(description = "")
  public BigDecimal getDefaultAmount() {
    return defaultAmount;
  }

  public void setDefaultAmount(BigDecimal defaultAmount) {
    this.defaultAmount = defaultAmount;
  }

  public InstrumentsDetailsData defaultSlippage(BigDecimal defaultSlippage) {
    this.defaultSlippage = defaultSlippage;
    return this;
  }

   /**
   * Get defaultSlippage
   * @return defaultSlippage
  **/
  @Schema(description = "")
  public BigDecimal getDefaultSlippage() {
    return defaultSlippage;
  }

  public void setDefaultSlippage(BigDecimal defaultSlippage) {
    this.defaultSlippage = defaultSlippage;
  }

  public InstrumentsDetailsData defaultSlippageType(String defaultSlippageType) {
    this.defaultSlippageType = defaultSlippageType;
    return this;
  }

   /**
   * Get defaultSlippageType
   * @return defaultSlippageType
  **/
  @Schema(description = "")
  public String getDefaultSlippageType() {
    return defaultSlippageType;
  }

  public void setDefaultSlippageType(String defaultSlippageType) {
    this.defaultSlippageType = defaultSlippageType;
  }

  public InstrumentsDetailsData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InstrumentsDetailsData exchange(InstrumentsDetailsExchange exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public InstrumentsDetailsExchange getExchange() {
    return exchange;
  }

  public void setExchange(InstrumentsDetailsExchange exchange) {
    this.exchange = exchange;
  }

  public InstrumentsDetailsData format(InstrumentsDetailsFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public InstrumentsDetailsFormat getFormat() {
    return format;
  }

  public void setFormat(InstrumentsDetailsFormat format) {
    this.format = format;
  }

  public InstrumentsDetailsData groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(description = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InstrumentsDetailsData incrementSize(Long incrementSize) {
    this.incrementSize = incrementSize;
    return this;
  }

   /**
   * Get incrementSize
   * @return incrementSize
  **/
  @Schema(description = "")
  public Long getIncrementSize() {
    return incrementSize;
  }

  public void setIncrementSize(Long incrementSize) {
    this.incrementSize = incrementSize;
  }

  public InstrumentsDetailsData ipoDetails(InstrumentsDetailsIpoDetails ipoDetails) {
    this.ipoDetails = ipoDetails;
    return this;
  }

   /**
   * Get ipoDetails
   * @return ipoDetails
  **/
  @Schema(description = "")
  public InstrumentsDetailsIpoDetails getIpoDetails() {
    return ipoDetails;
  }

  public void setIpoDetails(InstrumentsDetailsIpoDetails ipoDetails) {
    this.ipoDetails = ipoDetails;
  }

  public InstrumentsDetailsData isBarrierEqualsStrike(Boolean isBarrierEqualsStrike) {
    this.isBarrierEqualsStrike = isBarrierEqualsStrike;
    return this;
  }

   /**
   * Get isBarrierEqualsStrike
   * @return isBarrierEqualsStrike
  **/
  @Schema(description = "")
  public Boolean isIsBarrierEqualsStrike() {
    return isBarrierEqualsStrike;
  }

  public void setIsBarrierEqualsStrike(Boolean isBarrierEqualsStrike) {
    this.isBarrierEqualsStrike = isBarrierEqualsStrike;
  }

  public InstrumentsDetailsData isComplex(Boolean isComplex) {
    this.isComplex = isComplex;
    return this;
  }

   /**
   * Get isComplex
   * @return isComplex
  **/
  @Schema(description = "")
  public Boolean isIsComplex() {
    return isComplex;
  }

  public void setIsComplex(Boolean isComplex) {
    this.isComplex = isComplex;
  }

  public InstrumentsDetailsData isExtendedTradingHoursEnabled(Boolean isExtendedTradingHoursEnabled) {
    this.isExtendedTradingHoursEnabled = isExtendedTradingHoursEnabled;
    return this;
  }

   /**
   * Get isExtendedTradingHoursEnabled
   * @return isExtendedTradingHoursEnabled
  **/
  @Schema(description = "")
  public Boolean isIsExtendedTradingHoursEnabled() {
    return isExtendedTradingHoursEnabled;
  }

  public void setIsExtendedTradingHoursEnabled(Boolean isExtendedTradingHoursEnabled) {
    this.isExtendedTradingHoursEnabled = isExtendedTradingHoursEnabled;
  }

  public InstrumentsDetailsData isPEAEligible(Boolean isPEAEligible) {
    this.isPEAEligible = isPEAEligible;
    return this;
  }

   /**
   * Get isPEAEligible
   * @return isPEAEligible
  **/
  @Schema(description = "")
  public Boolean isIsPEAEligible() {
    return isPEAEligible;
  }

  public void setIsPEAEligible(Boolean isPEAEligible) {
    this.isPEAEligible = isPEAEligible;
  }

  public InstrumentsDetailsData isPEASMEEligible(Boolean isPEASMEEligible) {
    this.isPEASMEEligible = isPEASMEEligible;
    return this;
  }

   /**
   * Get isPEASMEEligible
   * @return isPEASMEEligible
  **/
  @Schema(description = "")
  public Boolean isIsPEASMEEligible() {
    return isPEASMEEligible;
  }

  public void setIsPEASMEEligible(Boolean isPEASMEEligible) {
    this.isPEASMEEligible = isPEASMEEligible;
  }

  public InstrumentsDetailsData isRedemptionByAmounts(Boolean isRedemptionByAmounts) {
    this.isRedemptionByAmounts = isRedemptionByAmounts;
    return this;
  }

   /**
   * Get isRedemptionByAmounts
   * @return isRedemptionByAmounts
  **/
  @Schema(description = "")
  public Boolean isIsRedemptionByAmounts() {
    return isRedemptionByAmounts;
  }

  public void setIsRedemptionByAmounts(Boolean isRedemptionByAmounts) {
    this.isRedemptionByAmounts = isRedemptionByAmounts;
  }

  public InstrumentsDetailsData isSwitchBySameCurrency(Boolean isSwitchBySameCurrency) {
    this.isSwitchBySameCurrency = isSwitchBySameCurrency;
    return this;
  }

   /**
   * Get isSwitchBySameCurrency
   * @return isSwitchBySameCurrency
  **/
  @Schema(description = "")
  public Boolean isIsSwitchBySameCurrency() {
    return isSwitchBySameCurrency;
  }

  public void setIsSwitchBySameCurrency(Boolean isSwitchBySameCurrency) {
    this.isSwitchBySameCurrency = isSwitchBySameCurrency;
  }

  public InstrumentsDetailsData isSystematicInternaliser(Boolean isSystematicInternaliser) {
    this.isSystematicInternaliser = isSystematicInternaliser;
    return this;
  }

   /**
   * Get isSystematicInternaliser
   * @return isSystematicInternaliser
  **/
  @Schema(description = "")
  public Boolean isIsSystematicInternaliser() {
    return isSystematicInternaliser;
  }

  public void setIsSystematicInternaliser(Boolean isSystematicInternaliser) {
    this.isSystematicInternaliser = isSystematicInternaliser;
  }

  public InstrumentsDetailsData isTradable(Boolean isTradable) {
    this.isTradable = isTradable;
    return this;
  }

   /**
   * Get isTradable
   * @return isTradable
  **/
  @Schema(description = "")
  public Boolean isIsTradable() {
    return isTradable;
  }

  public void setIsTradable(Boolean isTradable) {
    this.isTradable = isTradable;
  }

  public InstrumentsDetailsData lotSizeType(String lotSizeType) {
    this.lotSizeType = lotSizeType;
    return this;
  }

   /**
   * Get lotSizeType
   * @return lotSizeType
  **/
  @Schema(description = "")
  public String getLotSizeType() {
    return lotSizeType;
  }

  public void setLotSizeType(String lotSizeType) {
    this.lotSizeType = lotSizeType;
  }

  public InstrumentsDetailsData minimumTradeSize(Long minimumTradeSize) {
    this.minimumTradeSize = minimumTradeSize;
    return this;
  }

   /**
   * Get minimumTradeSize
   * @return minimumTradeSize
  **/
  @Schema(description = "")
  public Long getMinimumTradeSize() {
    return minimumTradeSize;
  }

  public void setMinimumTradeSize(Long minimumTradeSize) {
    this.minimumTradeSize = minimumTradeSize;
  }

  public InstrumentsDetailsData nonTradableReason(String nonTradableReason) {
    this.nonTradableReason = nonTradableReason;
    return this;
  }

   /**
   * Get nonTradableReason
   * @return nonTradableReason
  **/
  @Schema(description = "")
  public String getNonTradableReason() {
    return nonTradableReason;
  }

  public void setNonTradableReason(String nonTradableReason) {
    this.nonTradableReason = nonTradableReason;
  }

  public InstrumentsDetailsData orderDistances(InstrumentsDetailsOrderDistances orderDistances) {
    this.orderDistances = orderDistances;
    return this;
  }

   /**
   * Get orderDistances
   * @return orderDistances
  **/
  @Schema(description = "")
  public InstrumentsDetailsOrderDistances getOrderDistances() {
    return orderDistances;
  }

  public void setOrderDistances(InstrumentsDetailsOrderDistances orderDistances) {
    this.orderDistances = orderDistances;
  }

  public InstrumentsDetailsData priceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
    return this;
  }

   /**
   * Get priceCurrency
   * @return priceCurrency
  **/
  @Schema(description = "")
  public String getPriceCurrency() {
    return priceCurrency;
  }

  public void setPriceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
  }

  public InstrumentsDetailsData priceToContractFactor(BigDecimal priceToContractFactor) {
    this.priceToContractFactor = priceToContractFactor;
    return this;
  }

   /**
   * Get priceToContractFactor
   * @return priceToContractFactor
  **/
  @Schema(description = "")
  public BigDecimal getPriceToContractFactor() {
    return priceToContractFactor;
  }

  public void setPriceToContractFactor(BigDecimal priceToContractFactor) {
    this.priceToContractFactor = priceToContractFactor;
  }

  public InstrumentsDetailsData primaryListing(Long primaryListing) {
    this.primaryListing = primaryListing;
    return this;
  }

   /**
   * Get primaryListing
   * @return primaryListing
  **/
  @Schema(description = "")
  public Long getPrimaryListing() {
    return primaryListing;
  }

  public void setPrimaryListing(Long primaryListing) {
    this.primaryListing = primaryListing;
  }

  public InstrumentsDetailsData relatedInstruments(List<InstrumentsDetailsRelatedInstruments> relatedInstruments) {
    this.relatedInstruments = relatedInstruments;
    return this;
  }

  public InstrumentsDetailsData addRelatedInstrumentsItem(InstrumentsDetailsRelatedInstruments relatedInstrumentsItem) {
    if (this.relatedInstruments == null) {
      this.relatedInstruments = new ArrayList<InstrumentsDetailsRelatedInstruments>();
    }
    this.relatedInstruments.add(relatedInstrumentsItem);
    return this;
  }

   /**
   * Get relatedInstruments
   * @return relatedInstruments
  **/
  @Schema(description = "")
  public List<InstrumentsDetailsRelatedInstruments> getRelatedInstruments() {
    return relatedInstruments;
  }

  public void setRelatedInstruments(List<InstrumentsDetailsRelatedInstruments> relatedInstruments) {
    this.relatedInstruments = relatedInstruments;
  }

  public InstrumentsDetailsData relatedOptionRoots(List<Long> relatedOptionRoots) {
    this.relatedOptionRoots = relatedOptionRoots;
    return this;
  }

  public InstrumentsDetailsData addRelatedOptionRootsItem(Long relatedOptionRootsItem) {
    if (this.relatedOptionRoots == null) {
      this.relatedOptionRoots = new ArrayList<Long>();
    }
    this.relatedOptionRoots.add(relatedOptionRootsItem);
    return this;
  }

   /**
   * Get relatedOptionRoots
   * @return relatedOptionRoots
  **/
  @Schema(description = "")
  public List<Long> getRelatedOptionRoots() {
    return relatedOptionRoots;
  }

  public void setRelatedOptionRoots(List<Long> relatedOptionRoots) {
    this.relatedOptionRoots = relatedOptionRoots;
  }

  public InstrumentsDetailsData relatedOptionRootsEnhanced(List<InstrumentsDetailsRelatedOptionRootsEnhanced> relatedOptionRootsEnhanced) {
    this.relatedOptionRootsEnhanced = relatedOptionRootsEnhanced;
    return this;
  }

  public InstrumentsDetailsData addRelatedOptionRootsEnhancedItem(InstrumentsDetailsRelatedOptionRootsEnhanced relatedOptionRootsEnhancedItem) {
    if (this.relatedOptionRootsEnhanced == null) {
      this.relatedOptionRootsEnhanced = new ArrayList<InstrumentsDetailsRelatedOptionRootsEnhanced>();
    }
    this.relatedOptionRootsEnhanced.add(relatedOptionRootsEnhancedItem);
    return this;
  }

   /**
   * Get relatedOptionRootsEnhanced
   * @return relatedOptionRootsEnhanced
  **/
  @Schema(description = "")
  public List<InstrumentsDetailsRelatedOptionRootsEnhanced> getRelatedOptionRootsEnhanced() {
    return relatedOptionRootsEnhanced;
  }

  public void setRelatedOptionRootsEnhanced(List<InstrumentsDetailsRelatedOptionRootsEnhanced> relatedOptionRootsEnhanced) {
    this.relatedOptionRootsEnhanced = relatedOptionRootsEnhanced;
  }

  public InstrumentsDetailsData standardAmounts(List<Long> standardAmounts) {
    this.standardAmounts = standardAmounts;
    return this;
  }

  public InstrumentsDetailsData addStandardAmountsItem(Long standardAmountsItem) {
    if (this.standardAmounts == null) {
      this.standardAmounts = new ArrayList<Long>();
    }
    this.standardAmounts.add(standardAmountsItem);
    return this;
  }

   /**
   * Get standardAmounts
   * @return standardAmounts
  **/
  @Schema(description = "")
  public List<Long> getStandardAmounts() {
    return standardAmounts;
  }

  public void setStandardAmounts(List<Long> standardAmounts) {
    this.standardAmounts = standardAmounts;
  }

  public InstrumentsDetailsData supportedOrderTriggerPriceTypes(List<String> supportedOrderTriggerPriceTypes) {
    this.supportedOrderTriggerPriceTypes = supportedOrderTriggerPriceTypes;
    return this;
  }

  public InstrumentsDetailsData addSupportedOrderTriggerPriceTypesItem(String supportedOrderTriggerPriceTypesItem) {
    if (this.supportedOrderTriggerPriceTypes == null) {
      this.supportedOrderTriggerPriceTypes = new ArrayList<String>();
    }
    this.supportedOrderTriggerPriceTypes.add(supportedOrderTriggerPriceTypesItem);
    return this;
  }

   /**
   * Get supportedOrderTriggerPriceTypes
   * @return supportedOrderTriggerPriceTypes
  **/
  @Schema(description = "")
  public List<String> getSupportedOrderTriggerPriceTypes() {
    return supportedOrderTriggerPriceTypes;
  }

  public void setSupportedOrderTriggerPriceTypes(List<String> supportedOrderTriggerPriceTypes) {
    this.supportedOrderTriggerPriceTypes = supportedOrderTriggerPriceTypes;
  }

  public InstrumentsDetailsData supportedOrderTypes(List<String> supportedOrderTypes) {
    this.supportedOrderTypes = supportedOrderTypes;
    return this;
  }

  public InstrumentsDetailsData addSupportedOrderTypesItem(String supportedOrderTypesItem) {
    if (this.supportedOrderTypes == null) {
      this.supportedOrderTypes = new ArrayList<String>();
    }
    this.supportedOrderTypes.add(supportedOrderTypesItem);
    return this;
  }

   /**
   * Get supportedOrderTypes
   * @return supportedOrderTypes
  **/
  @Schema(description = "")
  public List<String> getSupportedOrderTypes() {
    return supportedOrderTypes;
  }

  public void setSupportedOrderTypes(List<String> supportedOrderTypes) {
    this.supportedOrderTypes = supportedOrderTypes;
  }

  public InstrumentsDetailsData supportedStrategies(List<String> supportedStrategies) {
    this.supportedStrategies = supportedStrategies;
    return this;
  }

  public InstrumentsDetailsData addSupportedStrategiesItem(String supportedStrategiesItem) {
    if (this.supportedStrategies == null) {
      this.supportedStrategies = new ArrayList<String>();
    }
    this.supportedStrategies.add(supportedStrategiesItem);
    return this;
  }

   /**
   * Get supportedStrategies
   * @return supportedStrategies
  **/
  @Schema(description = "")
  public List<String> getSupportedStrategies() {
    return supportedStrategies;
  }

  public void setSupportedStrategies(List<String> supportedStrategies) {
    this.supportedStrategies = supportedStrategies;
  }

  public InstrumentsDetailsData symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public InstrumentsDetailsData tickSizeScheme(InstrumentsDetailsTickSizeScheme tickSizeScheme) {
    this.tickSizeScheme = tickSizeScheme;
    return this;
  }

   /**
   * Get tickSizeScheme
   * @return tickSizeScheme
  **/
  @Schema(description = "")
  public InstrumentsDetailsTickSizeScheme getTickSizeScheme() {
    return tickSizeScheme;
  }

  public void setTickSizeScheme(InstrumentsDetailsTickSizeScheme tickSizeScheme) {
    this.tickSizeScheme = tickSizeScheme;
  }

  public InstrumentsDetailsData tradableAs(List<String> tradableAs) {
    this.tradableAs = tradableAs;
    return this;
  }

  public InstrumentsDetailsData addTradableAsItem(String tradableAsItem) {
    if (this.tradableAs == null) {
      this.tradableAs = new ArrayList<String>();
    }
    this.tradableAs.add(tradableAsItem);
    return this;
  }

   /**
   * Get tradableAs
   * @return tradableAs
  **/
  @Schema(description = "")
  public List<String> getTradableAs() {
    return tradableAs;
  }

  public void setTradableAs(List<String> tradableAs) {
    this.tradableAs = tradableAs;
  }

  public InstrumentsDetailsData tradableOn(List<String> tradableOn) {
    this.tradableOn = tradableOn;
    return this;
  }

  public InstrumentsDetailsData addTradableOnItem(String tradableOnItem) {
    if (this.tradableOn == null) {
      this.tradableOn = new ArrayList<String>();
    }
    this.tradableOn.add(tradableOnItem);
    return this;
  }

   /**
   * Get tradableOn
   * @return tradableOn
  **/
  @Schema(description = "")
  public List<String> getTradableOn() {
    return tradableOn;
  }

  public void setTradableOn(List<String> tradableOn) {
    this.tradableOn = tradableOn;
  }

  public InstrumentsDetailsData tradingSignals(String tradingSignals) {
    this.tradingSignals = tradingSignals;
    return this;
  }

   /**
   * Get tradingSignals
   * @return tradingSignals
  **/
  @Schema(description = "")
  public String getTradingSignals() {
    return tradingSignals;
  }

  public void setTradingSignals(String tradingSignals) {
    this.tradingSignals = tradingSignals;
  }

  public InstrumentsDetailsData tradingStatus(String tradingStatus) {
    this.tradingStatus = tradingStatus;
    return this;
  }

   /**
   * Get tradingStatus
   * @return tradingStatus
  **/
  @Schema(description = "")
  public String getTradingStatus() {
    return tradingStatus;
  }

  public void setTradingStatus(String tradingStatus) {
    this.tradingStatus = tradingStatus;
  }

  public InstrumentsDetailsData uic(Long uic) {
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
    InstrumentsDetailsData instrumentsDetailsData = (InstrumentsDetailsData) o;
    return Objects.equals(this.affiliateInfoRequired, instrumentsDetailsData.affiliateInfoRequired) &&
        Objects.equals(this.amountDecimals, instrumentsDetailsData.amountDecimals) &&
        Objects.equals(this.assetType, instrumentsDetailsData.assetType) &&
        Objects.equals(this.currencyCode, instrumentsDetailsData.currencyCode) &&
        Objects.equals(this.defaultAmount, instrumentsDetailsData.defaultAmount) &&
        Objects.equals(this.defaultSlippage, instrumentsDetailsData.defaultSlippage) &&
        Objects.equals(this.defaultSlippageType, instrumentsDetailsData.defaultSlippageType) &&
        Objects.equals(this.description, instrumentsDetailsData.description) &&
        Objects.equals(this.exchange, instrumentsDetailsData.exchange) &&
        Objects.equals(this.format, instrumentsDetailsData.format) &&
        Objects.equals(this.groupId, instrumentsDetailsData.groupId) &&
        Objects.equals(this.incrementSize, instrumentsDetailsData.incrementSize) &&
        Objects.equals(this.ipoDetails, instrumentsDetailsData.ipoDetails) &&
        Objects.equals(this.isBarrierEqualsStrike, instrumentsDetailsData.isBarrierEqualsStrike) &&
        Objects.equals(this.isComplex, instrumentsDetailsData.isComplex) &&
        Objects.equals(this.isExtendedTradingHoursEnabled, instrumentsDetailsData.isExtendedTradingHoursEnabled) &&
        Objects.equals(this.isPEAEligible, instrumentsDetailsData.isPEAEligible) &&
        Objects.equals(this.isPEASMEEligible, instrumentsDetailsData.isPEASMEEligible) &&
        Objects.equals(this.isRedemptionByAmounts, instrumentsDetailsData.isRedemptionByAmounts) &&
        Objects.equals(this.isSwitchBySameCurrency, instrumentsDetailsData.isSwitchBySameCurrency) &&
        Objects.equals(this.isSystematicInternaliser, instrumentsDetailsData.isSystematicInternaliser) &&
        Objects.equals(this.isTradable, instrumentsDetailsData.isTradable) &&
        Objects.equals(this.lotSizeType, instrumentsDetailsData.lotSizeType) &&
        Objects.equals(this.minimumTradeSize, instrumentsDetailsData.minimumTradeSize) &&
        Objects.equals(this.nonTradableReason, instrumentsDetailsData.nonTradableReason) &&
        Objects.equals(this.orderDistances, instrumentsDetailsData.orderDistances) &&
        Objects.equals(this.priceCurrency, instrumentsDetailsData.priceCurrency) &&
        Objects.equals(this.priceToContractFactor, instrumentsDetailsData.priceToContractFactor) &&
        Objects.equals(this.primaryListing, instrumentsDetailsData.primaryListing) &&
        Objects.equals(this.relatedInstruments, instrumentsDetailsData.relatedInstruments) &&
        Objects.equals(this.relatedOptionRoots, instrumentsDetailsData.relatedOptionRoots) &&
        Objects.equals(this.relatedOptionRootsEnhanced, instrumentsDetailsData.relatedOptionRootsEnhanced) &&
        Objects.equals(this.standardAmounts, instrumentsDetailsData.standardAmounts) &&
        Objects.equals(this.supportedOrderTriggerPriceTypes, instrumentsDetailsData.supportedOrderTriggerPriceTypes) &&
        Objects.equals(this.supportedOrderTypes, instrumentsDetailsData.supportedOrderTypes) &&
        Objects.equals(this.supportedStrategies, instrumentsDetailsData.supportedStrategies) &&
        Objects.equals(this.symbol, instrumentsDetailsData.symbol) &&
        Objects.equals(this.tickSizeScheme, instrumentsDetailsData.tickSizeScheme) &&
        Objects.equals(this.tradableAs, instrumentsDetailsData.tradableAs) &&
        Objects.equals(this.tradableOn, instrumentsDetailsData.tradableOn) &&
        Objects.equals(this.tradingSignals, instrumentsDetailsData.tradingSignals) &&
        Objects.equals(this.tradingStatus, instrumentsDetailsData.tradingStatus) &&
        Objects.equals(this.uic, instrumentsDetailsData.uic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateInfoRequired, amountDecimals, assetType, currencyCode, defaultAmount, defaultSlippage, defaultSlippageType, description, exchange, format, groupId, incrementSize, ipoDetails, isBarrierEqualsStrike, isComplex, isExtendedTradingHoursEnabled, isPEAEligible, isPEASMEEligible, isRedemptionByAmounts, isSwitchBySameCurrency, isSystematicInternaliser, isTradable, lotSizeType, minimumTradeSize, nonTradableReason, orderDistances, priceCurrency, priceToContractFactor, primaryListing, relatedInstruments, relatedOptionRoots, relatedOptionRootsEnhanced, standardAmounts, supportedOrderTriggerPriceTypes, supportedOrderTypes, supportedStrategies, symbol, tickSizeScheme, tradableAs, tradableOn, tradingSignals, tradingStatus, uic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentsDetailsData {\n");
    
    sb.append("    affiliateInfoRequired: ").append(toIndentedString(affiliateInfoRequired)).append("\n");
    sb.append("    amountDecimals: ").append(toIndentedString(amountDecimals)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    defaultAmount: ").append(toIndentedString(defaultAmount)).append("\n");
    sb.append("    defaultSlippage: ").append(toIndentedString(defaultSlippage)).append("\n");
    sb.append("    defaultSlippageType: ").append(toIndentedString(defaultSlippageType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    incrementSize: ").append(toIndentedString(incrementSize)).append("\n");
    sb.append("    ipoDetails: ").append(toIndentedString(ipoDetails)).append("\n");
    sb.append("    isBarrierEqualsStrike: ").append(toIndentedString(isBarrierEqualsStrike)).append("\n");
    sb.append("    isComplex: ").append(toIndentedString(isComplex)).append("\n");
    sb.append("    isExtendedTradingHoursEnabled: ").append(toIndentedString(isExtendedTradingHoursEnabled)).append("\n");
    sb.append("    isPEAEligible: ").append(toIndentedString(isPEAEligible)).append("\n");
    sb.append("    isPEASMEEligible: ").append(toIndentedString(isPEASMEEligible)).append("\n");
    sb.append("    isRedemptionByAmounts: ").append(toIndentedString(isRedemptionByAmounts)).append("\n");
    sb.append("    isSwitchBySameCurrency: ").append(toIndentedString(isSwitchBySameCurrency)).append("\n");
    sb.append("    isSystematicInternaliser: ").append(toIndentedString(isSystematicInternaliser)).append("\n");
    sb.append("    isTradable: ").append(toIndentedString(isTradable)).append("\n");
    sb.append("    lotSizeType: ").append(toIndentedString(lotSizeType)).append("\n");
    sb.append("    minimumTradeSize: ").append(toIndentedString(minimumTradeSize)).append("\n");
    sb.append("    nonTradableReason: ").append(toIndentedString(nonTradableReason)).append("\n");
    sb.append("    orderDistances: ").append(toIndentedString(orderDistances)).append("\n");
    sb.append("    priceCurrency: ").append(toIndentedString(priceCurrency)).append("\n");
    sb.append("    priceToContractFactor: ").append(toIndentedString(priceToContractFactor)).append("\n");
    sb.append("    primaryListing: ").append(toIndentedString(primaryListing)).append("\n");
    sb.append("    relatedInstruments: ").append(toIndentedString(relatedInstruments)).append("\n");
    sb.append("    relatedOptionRoots: ").append(toIndentedString(relatedOptionRoots)).append("\n");
    sb.append("    relatedOptionRootsEnhanced: ").append(toIndentedString(relatedOptionRootsEnhanced)).append("\n");
    sb.append("    standardAmounts: ").append(toIndentedString(standardAmounts)).append("\n");
    sb.append("    supportedOrderTriggerPriceTypes: ").append(toIndentedString(supportedOrderTriggerPriceTypes)).append("\n");
    sb.append("    supportedOrderTypes: ").append(toIndentedString(supportedOrderTypes)).append("\n");
    sb.append("    supportedStrategies: ").append(toIndentedString(supportedStrategies)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tickSizeScheme: ").append(toIndentedString(tickSizeScheme)).append("\n");
    sb.append("    tradableAs: ").append(toIndentedString(tradableAs)).append("\n");
    sb.append("    tradableOn: ").append(toIndentedString(tradableOn)).append("\n");
    sb.append("    tradingSignals: ").append(toIndentedString(tradingSignals)).append("\n");
    sb.append("    tradingStatus: ").append(toIndentedString(tradingStatus)).append("\n");
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
