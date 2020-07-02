/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingApi.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.psd.cloud.sdk.api;

import com.aspose.psd.cloud.sdk.model.*;
import com.aspose.psd.cloud.sdk.invoker.*;
import com.aspose.psd.cloud.sdk.invoker.internal.*;
import com.aspose.psd.cloud.sdk.invoker.internal.requesthandlers.*;
import com.aspose.psd.cloud.sdk.model.requests.*;

import java.io.File;
import java.util.HashMap;

/**
 * Aspose.Psd Cloud API
 */
public class ImagingApi 
{
    /**
     * Current SDK version
     */
    public static final String Version = "20.6";

    /**
     * The configuration
     */
    public Configuration Configuration;
    
    /**
     * The API invoker
     */
    private ApiInvoker apiInvoker;
       
    /**
     * Initializes a new instance of the ImagingApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public ImagingApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public ImagingApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initImagingApi(config);
    }
    
    /**
     * Initializes a new instance of the ImagingApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debugMode If debug mode is enabled.
     * @throws Exception 
     */
    public ImagingApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initImagingApi(config);
    }
    
    /**
     * Initializes a new instance of the ImagingApi class.
     * @param configuration Configuration settings.
     */
    private void initImagingApi(Configuration configuration)
    {
        this.Configuration = configuration;
        int handlersCount = configuration.OnPremise ? 2 : 3;
        IRequestHandler[] requestHandlers = new IRequestHandler[handlersCount];
        requestHandlers[--handlersCount] = new ApiExceptionRequestHandler();
        requestHandlers[--handlersCount] = new DebugLogRequestHandler(this.Configuration);
        if (!configuration.OnPremise)
        {
            requestHandlers[--handlersCount] = new AuthRequestHandler(this.Configuration);
        }
        
        this.apiInvoker = new ApiInvoker(requestHandlers, this.Configuration);
    }
    
    /**
     * Copy file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFile(CopyFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/file/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Copy folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFolder(CopyFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/folder/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createCroppedImage(CreateCroppedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createCroppedImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling createCroppedImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling createCroppedImage");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling createCroppedImage");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling createCroppedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/crop";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "width", request.width);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "height", request.height);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createDeskewedImage(CreateDeskewedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createDeskewedImage");
      }
       // verify the required parameter 'request.resizeProportionally' is set
      if (request.resizeProportionally== null) {
        throw new ApiException(400, "Missing the required parameter 'request.resizeProportionally' when calling createDeskewedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/deskew";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resizeProportionally", request.resizeProportionally);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Create the folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createFolder(CreateFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling createFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createGrayscaledImage(CreateGrayscaledImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createGrayscaledImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/grayscale";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedPsd(CreateModifiedPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createResizedImage(CreateResizedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createResizedImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling createResizedImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling createResizedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createRotateFlippedImage(CreateRotateFlippedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createRotateFlippedImage");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling createRotateFlippedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createSavedImageAs(CreateSavedImageAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createSavedImageAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createSavedImageAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/saveAs";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createUpdatedImage(CreateUpdatedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling createUpdatedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/updateImage";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectWidth", request.rectWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectHeight", request.rectHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipMethod", request.rotateFlipMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Crop an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] cropImage(CropImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling cropImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling cropImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling cropImage");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling cropImage");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling cropImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/crop";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "width", request.width);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "height", request.height);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Delete file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFile(DeleteFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFolder(DeleteFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Deskew an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] deskewImage(DeskewImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling deskewImage");
      }
       // verify the required parameter 'request.resizeProportionally' is set
      if (request.resizeProportionally== null) {
        throw new ApiException(400, "Missing the required parameter 'request.resizeProportionally' when calling deskewImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/deskew";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resizeProportionally", request.resizeProportionally);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Download file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] downloadFile(DownloadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse extractImageProperties(ExtractImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling extractImageProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
            if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Apply filtering effects to an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] filterEffectImage(FilterEffectImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling filterEffectImage");
      }
       // verify the required parameter 'request.filterType' is set
      if (request.filterType== null) {
        throw new ApiException(400, "Missing the required parameter 'request.filterType' when calling filterEffectImage");
      }
       // verify the required parameter 'request.filterProperties' is set
      if (request.filterProperties== null) {
        throw new ApiException(400, "Missing the required parameter 'request.filterProperties' when calling filterEffectImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/filterEffect";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "filterType", request.filterType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.filterProperties);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get disc usage
     * 
     * @param request Holds parameters for this request invocation.
     * @return DiscUsage
     * @throws Exception 
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/disc";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), DiscUsage.class);
    }
  
    /**
     * Get file versions
     * 
     * @param request Holds parameters for this request invocation.
     * @return FileVersions
     * @throws Exception 
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFileVersions");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/version/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FileVersions.class);
    }
  
    /**
     * Get all files and folders within a folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesList
     * @throws Exception 
     */
    public FilesList getFilesList(GetFilesListRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFilesList");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FilesList.class);
    }
  
    /**
     * Get properties of an image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse getImageProperties(GetImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Grayscale an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] grayscaleImage(GrayscaleImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling grayscaleImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/grayscale";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing PSD image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyPsd(ModifyPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Move file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFile(MoveFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/file/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Move folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFolder(MoveFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/folder/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Check if file or folder exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return ObjectExist
     * @throws Exception 
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling objectExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/exist/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), ObjectExist.class);
    }
  
    /**
     * Resize an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] resizeImage(ResizeImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling resizeImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling resizeImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling resizeImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate and/or flip an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] rotateFlipImage(RotateFlipImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling rotateFlipImage");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling rotateFlipImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export existing image to another format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] saveImageAs(SaveImageAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveImageAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveImageAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/saveAs";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Check if storage exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return StorageExist
     * @throws Exception 
     */
    public StorageExist storageExists(StorageExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.storageName' is set
      if (request.storageName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.storageName' when calling storageExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/{storageName}/exist";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "storageName", request.storageName);
      
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), StorageExist.class);
    }
  
    /**
     * Perform scaling, cropping and flipping of an existing image in a single request.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] updateImage(UpdateImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling updateImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling updateImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling updateImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling updateImage");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling updateImage");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling updateImage");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling updateImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/{name}/updateImage";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectWidth", request.rectWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectHeight", request.rectHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipMethod", request.rotateFlipMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Upload file
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws Exception 
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
      }
       // verify the required parameter 'request.file' is set
      if (request.File== null) {
        throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/psd/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            if (request.File != null) 
      {
          formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FilesUploadResult.class);
    }
  
}
