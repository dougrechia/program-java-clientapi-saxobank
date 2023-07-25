# AuthClientApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authdataGet**](AuthClientApi.md#authdataGet) | **GET** /authdata | 

<a name="authdataGet"></a>
# **authdataGet**
> AuthData authdataGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthClientApi;


AuthClientApi apiInstance = new AuthClientApi();
try {
    AuthData result = apiInstance.authdataGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientApi#authdataGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthData**](AuthData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

