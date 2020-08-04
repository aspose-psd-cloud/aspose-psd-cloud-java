# com.aspose.psd.cloud.sdk.api.PsdApi

<a name="copyFile"></a>
## **copyFile**
> void copyFile(CopyFileRequest request)

Copy file

### **CopyFileRequest** Parameters
```java
CopyFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(CopyFolderRequest request)

Copy folder

### **CopyFolderRequest** Parameters
```java
CopyFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createCroppedImage"></a>
## **createCroppedImage**
> byte[] createCroppedImage(CreateCroppedImageRequest request)

Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateCroppedImageRequest** Parameters
```java
CreateCroppedImageRequest(
    byte[] imageData, 
    Integer x, 
    Integer y, 
    Integer width, 
    Integer height, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **width** | **Integer**| Width of cropping rectangle. |
 **height** | **Integer**| Height of cropping rectangle. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createDeskewedImage"></a>
## **createDeskewedImage**
> byte[] createDeskewedImage(CreateDeskewedImageRequest request)

Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateDeskewedImageRequest** Parameters
```java
CreateDeskewedImageRequest(
    byte[] imageData, 
    Boolean resizeProportionally, 
    String bkColor, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **resizeProportionally** | **Boolean**| Resize proportionally |
 **bkColor** | **String**| Background color | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image) | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(CreateFolderRequest request)

Create the folder

### **CreateFolderRequest** Parameters
```java
CreateFolderRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createGrayscaledImage"></a>
## **createGrayscaledImage**
> byte[] createGrayscaledImage(CreateGrayscaledImageRequest request)

Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateGrayscaledImageRequest** Parameters
```java
CreateGrayscaledImageRequest(
    byte[] imageData, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image) | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedPsd"></a>
## **createModifiedPsd**
> byte[] createModifiedPsd(CreateModifiedPsdRequest request)

Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedPsdRequest** Parameters
```java
CreateModifiedPsdRequest(
    byte[] imageData, 
    Integer channelsCount, 
    String compressionMethod, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **channelsCount** | **Integer**| Count of color channels. | [optional] [default to 4]
 **compressionMethod** | **String**| Compression method (for now, raw and RLE are supported). | [optional] [default to rle]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createResizedImage"></a>
## **createResizedImage**
> byte[] createResizedImage(CreateResizedImageRequest request)

Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateResizedImageRequest** Parameters
```java
CreateResizedImageRequest(
    byte[] imageData, 
    Integer newWidth, 
    Integer newHeight, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createRotateFlippedImage"></a>
## **createRotateFlippedImage**
> byte[] createRotateFlippedImage(CreateRotateFlippedImageRequest request)

Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateRotateFlippedImageRequest** Parameters
```java
CreateRotateFlippedImageRequest(
    byte[] imageData, 
    String method, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **method** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createSavedImageAs"></a>
## **createSavedImageAs**
> byte[] createSavedImageAs(CreateSavedImageAsRequest request)

Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             

### **CreateSavedImageAsRequest** Parameters
```java
CreateSavedImageAsRequest(
    byte[] imageData, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createUpdatedImage"></a>
## **createUpdatedImage**
> byte[] createUpdatedImage(CreateUpdatedImageRequest request)

Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateUpdatedImageRequest** Parameters
```java
CreateUpdatedImageRequest(
    byte[] imageData, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **newWidth** | **Integer**| New width of the scaled image. |
 **newHeight** | **Integer**| New height of the scaled image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **rectWidth** | **Integer**| Width of cropping rectangle. |
 **rectHeight** | **Integer**| Height of cropping rectangle. |
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="cropImage"></a>
## **cropImage**
> byte[] cropImage(CropImageRequest request)

Crop an existing image.

### **CropImageRequest** Parameters
```java
CropImageRequest(
    String name, 
    Integer x, 
    Integer y, 
    Integer width, 
    Integer height, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **width** | **Integer**| Width of cropping rectangle |
 **height** | **Integer**| Height of cropping rectangle. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(DeleteFileRequest request)

Delete file

### **DeleteFileRequest** Parameters
```java
DeleteFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(DeleteFolderRequest request)

Delete folder

### **DeleteFolderRequest** Parameters
```java
DeleteFolderRequest(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deskewImage"></a>
## **deskewImage**
> byte[] deskewImage(DeskewImageRequest request)

Deskew an existing image.

### **DeskewImageRequest** Parameters
```java
DeskewImageRequest(
    String name, 
    Boolean resizeProportionally, 
    String bkColor, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Image file name. |
 **resizeProportionally** | **Boolean**| Resize proportionally |
 **bkColor** | **String**| Background color | [optional]
 **folder** | **String**| Folder | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(DownloadFileRequest request)

Download file

### **DownloadFileRequest** Parameters
```java
DownloadFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractImageProperties"></a>
## **extractImageProperties**
> [ImagingResponse](ImagingResponse.md) extractImageProperties(ExtractImagePropertiesRequest request)

Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **ExtractImagePropertiesRequest** Parameters
```java
ExtractImagePropertiesRequest(
    byte[] imageData)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="filterEffectImage"></a>
## **filterEffectImage**
> byte[] filterEffectImage(FilterEffectImageRequest request)

Apply filtering effects to an existing image.

### **FilterEffectImageRequest** Parameters
```java
FilterEffectImageRequest(
    String name, 
    String filterType, 
    FilterPropertiesBase filterProperties, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **filterType** | **String**| Filter type (BigRectangular, SmallRectangular, Median, GaussWiener, MotionWiener, GaussianBlur, Sharpen, BilateralSmoothing). |
 **filterProperties** | [**FilterPropertiesBase**](FilterPropertiesBase.md)| Filter properties. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequest request)

Get disc usage

### **GetDiscUsageRequest** Parameters
```java
GetDiscUsageRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequest request)

Get file versions

### **GetFileVersionsRequest** Parameters
```java
GetFileVersionsRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequest request)

Get all files and folders within a folder

### **GetFilesListRequest** Parameters
```java
GetFilesListRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageProperties"></a>
## **getImageProperties**
> [ImagingResponse](ImagingResponse.md) getImageProperties(GetImagePropertiesRequest request)

Get properties of an image.

### **GetImagePropertiesRequest** Parameters
```java
GetImagePropertiesRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="grayscaleImage"></a>
## **grayscaleImage**
> byte[] grayscaleImage(GrayscaleImageRequest request)

Grayscale an existing image.

### **GrayscaleImageRequest** Parameters
```java
GrayscaleImageRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Image file name. |
 **folder** | **String**| Folder | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyPsd"></a>
## **modifyPsd**
> byte[] modifyPsd(ModifyPsdRequest request)

Update parameters of existing PSD image.

### **ModifyPsdRequest** Parameters
```java
ModifyPsdRequest(
    String name, 
    Integer channelsCount, 
    String compressionMethod, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **channelsCount** | **Integer**| Count of color channels. | [optional] [default to 4]
 **compressionMethod** | **String**| Compression method (for now, raw and RLE are supported). | [optional] [default to rle]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(MoveFileRequest request)

Move file

### **MoveFileRequest** Parameters
```java
MoveFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(MoveFolderRequest request)

Move folder

### **MoveFolderRequest** Parameters
```java
MoveFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequest request)

Check if file or folder exists

### **ObjectExistsRequest** Parameters
```java
ObjectExistsRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="resizeImage"></a>
## **resizeImage**
> byte[] resizeImage(ResizeImageRequest request)

Resize an existing image.

### **ResizeImageRequest** Parameters
```java
ResizeImageRequest(
    String name, 
    Integer newWidth, 
    Integer newHeight, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="rotateFlipImage"></a>
## **rotateFlipImage**
> byte[] rotateFlipImage(RotateFlipImageRequest request)

Rotate and/or flip an existing image.

### **RotateFlipImageRequest** Parameters
```java
RotateFlipImageRequest(
    String name, 
    String method, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **method** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="saveImageAs"></a>
## **saveImageAs**
> byte[] saveImageAs(SaveImageAsRequest request)

Export existing image to another format.

### **SaveImageAsRequest** Parameters
```java
SaveImageAsRequest(
    String name, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. |
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(StorageExistsRequest request)

Check if storage exists

### **StorageExistsRequest** Parameters
```java
StorageExistsRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="updateImage"></a>
## **updateImage**
> byte[] updateImage(UpdateImageRequest request)

Perform scaling, cropping and flipping of an existing image in a single request.

### **UpdateImageRequest** Parameters
```java
UpdateImageRequest(
    String name, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **newWidth** | **Integer**| New width of the scaled image. |
 **newHeight** | **Integer**| New height of the scaled image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **rectWidth** | **Integer**| Width of cropping rectangle. |
 **rectHeight** | **Integer**| Height of cropping rectangle. |
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequest request)

Upload file

### **UploadFileRequest** Parameters
```java
UploadFileRequest(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

