# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapiCsV1AuditOrderactivitiesGet**](DefaultApi.md#openapiCsV1AuditOrderactivitiesGet) | **GET** /openapi/cs/v1/audit/orderactivities | 
[**openapiPortV1AccountsMeGet**](DefaultApi.md#openapiPortV1AccountsMeGet) | **GET** /openapi/port/v1/accounts/me | 
[**openapiPortV1BalancesGet**](DefaultApi.md#openapiPortV1BalancesGet) | **GET** /openapi/port/v1/balances | 
[**openapiPortV1BalancesMeGet**](DefaultApi.md#openapiPortV1BalancesMeGet) | **GET** /openapi/port/v1/balances/me | 
[**openapiPortV1ClientsMeGet**](DefaultApi.md#openapiPortV1ClientsMeGet) | **GET** /openapi/port/v1/clients/me | 
[**openapiPortV1OrdersMeGet**](DefaultApi.md#openapiPortV1OrdersMeGet) | **GET** /openapi/port/v1/orders/me | 
[**openapiPortV1PositionsGet**](DefaultApi.md#openapiPortV1PositionsGet) | **GET** /openapi/port/v1/positions | 
[**openapiPortV1UsersMeGet**](DefaultApi.md#openapiPortV1UsersMeGet) | **GET** /openapi/port/v1/users/me | 
[**openapiRefV1InstrumentsDetailsGet**](DefaultApi.md#openapiRefV1InstrumentsDetailsGet) | **GET** /openapi/ref/v1/instruments/details | 
[**openapiRefV1InstrumentsDetailsUicAssetTypeGet**](DefaultApi.md#openapiRefV1InstrumentsDetailsUicAssetTypeGet) | **GET** /openapi/ref/v1/instruments/details/{Uic}/{AssetType} | 
[**openapiRefV1InstrumentsGet**](DefaultApi.md#openapiRefV1InstrumentsGet) | **GET** /openapi/ref/v1/instruments | 
[**openapiTradeV1InfopricesGet**](DefaultApi.md#openapiTradeV1InfopricesGet) | **GET** /openapi/trade/v1/infoprices | 
[**openapiTradeV2OrdersDelete**](DefaultApi.md#openapiTradeV2OrdersDelete) | **DELETE** /openapi/trade/v2/orders | 
[**openapiTradeV2OrdersOrderIdsDelete**](DefaultApi.md#openapiTradeV2OrdersOrderIdsDelete) | **DELETE** /openapi/trade/v2/orders/{OrderIds} | 
[**openapiTradeV2OrdersPatch**](DefaultApi.md#openapiTradeV2OrdersPatch) | **PATCH** /openapi/trade/v2/orders | 
[**openapiTradeV2OrdersPost**](DefaultApi.md#openapiTradeV2OrdersPost) | **POST** /openapi/trade/v2/orders | 

<a name="openapiCsV1AuditOrderactivitiesGet"></a>
# **openapiCsV1AuditOrderactivitiesGet**
> OrderActivities openapiCsV1AuditOrderactivitiesGet(skiptoken, top, accountKey, clientKey, correlationKey, entryType, fieldGroups, fromDateTime, includeSubAccounts, orderId, status, toDateTime)



Query Order activities history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String skiptoken = "skiptoken_example"; // String | Id token of entity to start taking elements from.
Long top = 789L; // Long | Optional number of elements to retrieve.
String accountKey = "accountKey_example"; // String | If specified will only return entries pertaining to specified Account.
String clientKey = "clientKey_example"; // String | If specified will only return entries pertaining to specified client and its sub clients depending upon includeSubAccounts.
String correlationKey = "correlationKey_example"; // String | If specified, will only return entries with the specified CorrelationKey
String entryType = "entryType_example"; // String | Optional. Defaults to All- Return all entries pertaining to any order. Last- Only return the latest state of an order ignoring ToDateTime (if any). See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderactivityfieldgroup/bf3c014d6f25279ef6c411669ef88cec
String fieldGroups = "fieldGroups_example"; // String | FieldGroups - DisplayAndFormat. See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderactivityfieldgroup/bf3c014d6f25279ef6c411669ef88cec
String fromDateTime = "fromDateTime_example"; // String | (UTC) Only include entries, with a ActivityDateTime greater than or equal to FromDateTime
Boolean includeSubAccounts = true; // Boolean | IncludeSubAccounts- If specified true will return entries for all clients under specified ClientId in a hierarchy.
String orderId = "orderId_example"; // String | Will only return entries pertaining to specified OrderId
String status = "status_example"; // String | If specified will only return entries with the specified OrderStatus. See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderlogstatus/37923e81ea74e6f13b5b8fce7abac894
String toDateTime = "toDateTime_example"; // String | (UTC) Only include entries, with a ActivityDateTime less than or equal to ToDateTime. Cannot be used with EntryType=\"Last\"
try {
    OrderActivities result = apiInstance.openapiCsV1AuditOrderactivitiesGet(skiptoken, top, accountKey, clientKey, correlationKey, entryType, fieldGroups, fromDateTime, includeSubAccounts, orderId, status, toDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiCsV1AuditOrderactivitiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skiptoken** | **String**| Id token of entity to start taking elements from. | [optional]
 **top** | **Long**| Optional number of elements to retrieve. | [optional]
 **accountKey** | **String**| If specified will only return entries pertaining to specified Account. | [optional]
 **clientKey** | **String**| If specified will only return entries pertaining to specified client and its sub clients depending upon includeSubAccounts. | [optional]
 **correlationKey** | **String**| If specified, will only return entries with the specified CorrelationKey | [optional]
 **entryType** | **String**| Optional. Defaults to All- Return all entries pertaining to any order. Last- Only return the latest state of an order ignoring ToDateTime (if any). See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderactivityfieldgroup/bf3c014d6f25279ef6c411669ef88cec | [optional]
 **fieldGroups** | **String**| FieldGroups - DisplayAndFormat. See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderactivityfieldgroup/bf3c014d6f25279ef6c411669ef88cec | [optional]
 **fromDateTime** | **String**| (UTC) Only include entries, with a ActivityDateTime greater than or equal to FromDateTime | [optional]
 **includeSubAccounts** | **Boolean**| IncludeSubAccounts- If specified true will return entries for all clients under specified ClientId in a hierarchy. | [optional]
 **orderId** | **String**| Will only return entries pertaining to specified OrderId | [optional]
 **status** | **String**| If specified will only return entries with the specified OrderStatus. See https://www.developer.saxo/openapi/referencedocs/cs/v1/audit-orderactivities/getorderstatesasync/88396c9accc21e373925b5cd2ce134dd/orderlogstatus/37923e81ea74e6f13b5b8fce7abac894 | [optional]
 **toDateTime** | **String**| (UTC) Only include entries, with a ActivityDateTime less than or equal to ToDateTime. Cannot be used with EntryType&#x3D;\&quot;Last\&quot; | [optional]

### Return type

[**OrderActivities**](OrderActivities.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiPortV1AccountsMeGet"></a>
# **openapiPortV1AccountsMeGet**
> AccountsMe openapiPortV1AccountsMeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AccountsMe result = apiInstance.openapiPortV1AccountsMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1AccountsMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountsMe**](AccountsMe.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiPortV1BalancesGet"></a>
# **openapiPortV1BalancesGet**
> Balances openapiPortV1BalancesGet(accountKey, clientKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountKey = "accountKey_example"; // String | 
String clientKey = "clientKey_example"; // String | 
try {
    Balances result = apiInstance.openapiPortV1BalancesGet(accountKey, clientKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1BalancesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountKey** | **String**|  | [optional]
 **clientKey** | **String**|  | [optional]

### Return type

[**Balances**](Balances.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiPortV1BalancesMeGet"></a>
# **openapiPortV1BalancesMeGet**
> BalancesMe openapiPortV1BalancesMeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    BalancesMe result = apiInstance.openapiPortV1BalancesMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1BalancesMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BalancesMe**](BalancesMe.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiPortV1ClientsMeGet"></a>
# **openapiPortV1ClientsMeGet**
> ClientsMe openapiPortV1ClientsMeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    ClientsMe result = apiInstance.openapiPortV1ClientsMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1ClientsMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClientsMe**](ClientsMe.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiPortV1OrdersMeGet"></a>
# **openapiPortV1OrdersMeGet**
> OrderQuery openapiPortV1OrdersMeGet(fieldGroups)



Get open orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String fieldGroups = "fieldGroups_example"; // String | 
try {
    OrderQuery result = apiInstance.openapiPortV1OrdersMeGet(fieldGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1OrdersMeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldGroups** | **String**|  | [optional]

### Return type

[**OrderQuery**](OrderQuery.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiPortV1PositionsGet"></a>
# **openapiPortV1PositionsGet**
> Positions openapiPortV1PositionsGet(skip, top, accountGroupKey, accountKey, clientKey, fieldGroups, netPositionId, positionId, watchlistId)



Returns a list of positions fulfilling the criteria specified by the query string parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Long skip = 789L; // Long | Optional number of elements to skip.
Long top = 789L; // Long | Optional number of elements to retrieve.
String accountGroupKey = "accountGroupKey_example"; // String | The key of the account group to which the net positions belongs.
String accountKey = "accountKey_example"; // String | The key of the account to which the net positions belongs.
String clientKey = "clientKey_example"; // String | The key of the client to which the net positions belongs.
String fieldGroups = "fieldGroups_example"; // String | Specifies which data to return. Default is [PositionBase,PositionView]. See https://www.developer.saxo/openapi/referencedocs/port/v1/positions/getpositions/72425eee149f25fc39633a79f1d72885/positionfieldgroup/0a3d33a4c6705be8983d98e4fcd1fdf1
String netPositionId = "netPositionId_example"; // String | The id of the netposition to which the position belongs
String positionId = "positionId_example"; // String | The id of the position.
String watchlistId = "watchlistId_example"; // String | Selects only positions those instruments belongs to the given watchlist id
try {
    Positions result = apiInstance.openapiPortV1PositionsGet(skip, top, accountGroupKey, accountKey, clientKey, fieldGroups, netPositionId, positionId, watchlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1PositionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Long**| Optional number of elements to skip. | [optional]
 **top** | **Long**| Optional number of elements to retrieve. | [optional]
 **accountGroupKey** | **String**| The key of the account group to which the net positions belongs. | [optional]
 **accountKey** | **String**| The key of the account to which the net positions belongs. | [optional]
 **clientKey** | **String**| The key of the client to which the net positions belongs. | [optional]
 **fieldGroups** | **String**| Specifies which data to return. Default is [PositionBase,PositionView]. See https://www.developer.saxo/openapi/referencedocs/port/v1/positions/getpositions/72425eee149f25fc39633a79f1d72885/positionfieldgroup/0a3d33a4c6705be8983d98e4fcd1fdf1 | [optional]
 **netPositionId** | **String**| The id of the netposition to which the position belongs | [optional]
 **positionId** | **String**| The id of the position. | [optional]
 **watchlistId** | **String**| Selects only positions those instruments belongs to the given watchlist id | [optional]

### Return type

[**Positions**](Positions.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiPortV1UsersMeGet"></a>
# **openapiPortV1UsersMeGet**
> UsersMe openapiPortV1UsersMeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    UsersMe result = apiInstance.openapiPortV1UsersMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiPortV1UsersMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersMe**](UsersMe.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiRefV1InstrumentsDetailsGet"></a>
# **openapiRefV1InstrumentsDetailsGet**
> InstrumentsDetails openapiRefV1InstrumentsDetailsGet(accountKey, assetTypes, fieldGroups, tags, uics)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountKey = "accountKey_example"; // String | If specified, access permissions to instruments for the specified account will be evaluated. Optional.
String assetTypes = "assetTypes_example"; // String | Comma separated list of one or more asset types to search for. E.g. AssetTypes=FxSpot,Stock. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsformanyinstruments/ad9c80ea6ddc7c7974d653e45a495f87/assettype/c9311a0d718a7ee55bd9b386f1514d00
String fieldGroups = "fieldGroups_example"; // String | Specifies comma-separated list of additional fields to receive. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsformanyinstruments/ad9c80ea6ddc7c7974d653e45a495f87/instrumentfieldgroup/274dbc7f4d3bdd2fbf04928ca746a9c4
String tags = "tags_example"; // String | Allows filtering by display hint, on Stocks, ETFs and ETCs are currently supported. Use <value>null</value> to indicate Tag should not be included in search criteria. Currently only one tag is supported.
BigDecimal uics = new BigDecimal(); // BigDecimal | Limit list to return information for the following Uics.
try {
    InstrumentsDetails result = apiInstance.openapiRefV1InstrumentsDetailsGet(accountKey, assetTypes, fieldGroups, tags, uics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiRefV1InstrumentsDetailsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountKey** | **String**| If specified, access permissions to instruments for the specified account will be evaluated. Optional. | [optional]
 **assetTypes** | **String**| Comma separated list of one or more asset types to search for. E.g. AssetTypes&#x3D;FxSpot,Stock. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsformanyinstruments/ad9c80ea6ddc7c7974d653e45a495f87/assettype/c9311a0d718a7ee55bd9b386f1514d00 | [optional]
 **fieldGroups** | **String**| Specifies comma-separated list of additional fields to receive. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsformanyinstruments/ad9c80ea6ddc7c7974d653e45a495f87/instrumentfieldgroup/274dbc7f4d3bdd2fbf04928ca746a9c4 | [optional]
 **tags** | **String**| Allows filtering by display hint, on Stocks, ETFs and ETCs are currently supported. Use &lt;value&gt;null&lt;/value&gt; to indicate Tag should not be included in search criteria. Currently only one tag is supported. | [optional]
 **uics** | **BigDecimal**| Limit list to return information for the following Uics. | [optional]

### Return type

[**InstrumentsDetails**](InstrumentsDetails.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiRefV1InstrumentsDetailsUicAssetTypeGet"></a>
# **openapiRefV1InstrumentsDetailsUicAssetTypeGet**
> InstrumentDetail openapiRefV1InstrumentsDetailsUicAssetTypeGet(uic, assetType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Long uic = 789L; // Long | The Universal Instrument Code (UIC) of the instrument to get.
String assetType = "assetType_example"; // String | The AssetType of the instrument to get. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsforoneinstrument/4e547901bf01a81683b01ee9ed9aca0b/assettype/c9311a0d718a7ee55bd9b386f1514d00
try {
    InstrumentDetail result = apiInstance.openapiRefV1InstrumentsDetailsUicAssetTypeGet(uic, assetType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiRefV1InstrumentsDetailsUicAssetTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uic** | **Long**| The Universal Instrument Code (UIC) of the instrument to get. |
 **assetType** | **String**| The AssetType of the instrument to get. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsforoneinstrument/4e547901bf01a81683b01ee9ed9aca0b/assettype/c9311a0d718a7ee55bd9b386f1514d00 |

### Return type

[**InstrumentDetail**](InstrumentDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiRefV1InstrumentsGet"></a>
# **openapiRefV1InstrumentsGet**
> Instruments openapiRefV1InstrumentsGet(keyWords, assetTypes, propertyClass, exchangeId, uics)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String keyWords = "keyWords_example"; // String | Search for matching keywords in the instruments. Separate keywords with spaces.
String assetTypes = "assetTypes_example"; // String | Further constrains the list to only include the provided instruments, e.g. FxSpot. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getsummaries/7f1a5b8199f43fc1d794ce9e279d8c34
String propertyClass = "propertyClass_example"; // String | The class of the instruments to include in the search. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getsummaries/7f1a5b8199f43fc1d794ce9e279d8c34/class/0d5bf0f9272bc3a3204368cceedf7d54
String exchangeId = "exchangeId_example"; // String | ID of the exchange that the instruments must match.
BigDecimal uics = new BigDecimal(); // BigDecimal | Limit list to return information for the following Uics
try {
    Instruments result = apiInstance.openapiRefV1InstrumentsGet(keyWords, assetTypes, propertyClass, exchangeId, uics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiRefV1InstrumentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyWords** | **String**| Search for matching keywords in the instruments. Separate keywords with spaces. | [optional]
 **assetTypes** | **String**| Further constrains the list to only include the provided instruments, e.g. FxSpot. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getsummaries/7f1a5b8199f43fc1d794ce9e279d8c34 | [optional]
 **propertyClass** | **String**| The class of the instruments to include in the search. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getsummaries/7f1a5b8199f43fc1d794ce9e279d8c34/class/0d5bf0f9272bc3a3204368cceedf7d54 | [optional]
 **exchangeId** | **String**| ID of the exchange that the instruments must match. | [optional]
 **uics** | **BigDecimal**| Limit list to return information for the following Uics | [optional]

### Return type

[**Instruments**](Instruments.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openapiTradeV1InfopricesGet"></a>
# **openapiTradeV1InfopricesGet**
> InfoPrice openapiTradeV1InfopricesGet(uic, assetType, accountKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Long uic = 789L; // Long | The Universal Instrument Code (UIC) of the instrument to get.
String assetType = "assetType_example"; // String | The AssetType of the instrument to get. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsforoneinstrument/4e547901bf01a81683b01ee9ed9aca0b/assettype/c9311a0d718a7ee55bd9b386f1514d00
String accountKey = "accountKey_example"; // String | Unique key identifying the account used in retrieving the price. Only required when calling context represents an authenticated user.
try {
    InfoPrice result = apiInstance.openapiTradeV1InfopricesGet(uic, assetType, accountKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiTradeV1InfopricesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uic** | **Long**| The Universal Instrument Code (UIC) of the instrument to get. |
 **assetType** | **String**| The AssetType of the instrument to get. See https://www.developer.saxo/openapi/referencedocs/ref/v1/instruments/getdetailsforoneinstrument/4e547901bf01a81683b01ee9ed9aca0b/assettype/c9311a0d718a7ee55bd9b386f1514d00 |
 **accountKey** | **String**| Unique key identifying the account used in retrieving the price. Only required when calling context represents an authenticated user. |

### Return type

[**InfoPrice**](InfoPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiTradeV2OrdersDelete"></a>
# **openapiTradeV2OrdersDelete**
> OrdersCancel openapiTradeV2OrdersDelete(accountKey, assetType, uic)



Cancels all orders for requested instrument and account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String accountKey = "accountKey_example"; // String | Account key.
String assetType = "assetType_example"; // String | Asset type. See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/cancelallorder/261fb62628b4c2cc9278b170429c16fb/assettype/c9311a0d718a7ee55bd9b386f1514d00
Long uic = 789L; // Long | Instrument UIC.
try {
    OrdersCancel result = apiInstance.openapiTradeV2OrdersDelete(accountKey, assetType, uic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiTradeV2OrdersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountKey** | **String**| Account key. |
 **assetType** | **String**| Asset type. See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/cancelallorder/261fb62628b4c2cc9278b170429c16fb/assettype/c9311a0d718a7ee55bd9b386f1514d00 |
 **uic** | **Long**| Instrument UIC. |

### Return type

[**OrdersCancel**](OrdersCancel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiTradeV2OrdersOrderIdsDelete"></a>
# **openapiTradeV2OrdersOrderIdsDelete**
> OrderCancel openapiTradeV2OrdersOrderIdsDelete(orderIds, accountKey)



Cancels one or more orders.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Long orderIds = 789L; // Long | order ID to cancel
String accountKey = "accountKey_example"; // String | account key
try {
    OrderCancel result = apiInstance.openapiTradeV2OrdersOrderIdsDelete(orderIds, accountKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiTradeV2OrdersOrderIdsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **Long**| order ID to cancel |
 **accountKey** | **String**| account key |

### Return type

[**OrderCancel**](OrderCancel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="openapiTradeV2OrdersPatch"></a>
# **openapiTradeV2OrdersPatch**
> OrderPatchResponse openapiTradeV2OrdersPatch(body)



Changes one or more existing orders.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
V2OrdersBody1 body = new V2OrdersBody1(); // V2OrdersBody1 | 
try {
    OrderPatchResponse result = apiInstance.openapiTradeV2OrdersPatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiTradeV2OrdersPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V2OrdersBody1**](V2OrdersBody1.md)|  | [optional]

### Return type

[**OrderPatchResponse**](OrderPatchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

<a name="openapiTradeV2OrdersPost"></a>
# **openapiTradeV2OrdersPost**
> OrderResponse openapiTradeV2OrdersPost(body)



Place a new order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
V2OrdersBody body = new V2OrdersBody(); // V2OrdersBody | 
try {
    OrderResponse result = apiInstance.openapiTradeV2OrdersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#openapiTradeV2OrdersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V2OrdersBody**](V2OrdersBody.md)|  | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

