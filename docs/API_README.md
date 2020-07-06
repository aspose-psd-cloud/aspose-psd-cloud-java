<a name="documentation-for-api-endpoints"></a>
## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PsdApi* | [**copyFile**](PsdApi.md#copyfile) | **PUT** /psd/storage/file/copy/{srcPath} | Copy file
*PsdApi* | [**copyFolder**](PsdApi.md#copyfolder) | **PUT** /psd/storage/folder/copy/{srcPath} | Copy folder
*PsdApi* | [**createCroppedImage**](PsdApi.md#createcroppedimage) | **POST** /psd/crop | Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createDeskewedImage**](PsdApi.md#createdeskewedimage) | **POST** /psd/deskew | Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createFolder**](PsdApi.md#createfolder) | **PUT** /psd/storage/folder/{path} | Create the folder
*PsdApi* | [**createGrayscaledImage**](PsdApi.md#creategrayscaledimage) | **POST** /psd/grayscale | Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createModifiedPsd**](PsdApi.md#createmodifiedpsd) | **POST** /psd/psd | Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createResizedImage**](PsdApi.md#createresizedimage) | **POST** /psd/resize | Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createRotateFlippedImage**](PsdApi.md#createrotateflippedimage) | **POST** /psd/rotateflip | Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**createSavedImageAs**](PsdApi.md#createsavedimageas) | **POST** /psd/saveAs | Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
*PsdApi* | [**createUpdatedImage**](PsdApi.md#createupdatedimage) | **POST** /psd/updateImage | Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**cropImage**](PsdApi.md#cropimage) | **GET** /psd/{name}/crop | Crop an existing image.
*PsdApi* | [**deleteFile**](PsdApi.md#deletefile) | **DELETE** /psd/storage/file/{path} | Delete file
*PsdApi* | [**deleteFolder**](PsdApi.md#deletefolder) | **DELETE** /psd/storage/folder/{path} | Delete folder
*PsdApi* | [**deskewImage**](PsdApi.md#deskewimage) | **GET** /psd/{name}/deskew | Deskew an existing image.
*PsdApi* | [**downloadFile**](PsdApi.md#downloadfile) | **GET** /psd/storage/file/{path} | Download file
*PsdApi* | [**extractImageProperties**](PsdApi.md#extractimageproperties) | **POST** /psd/properties | Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*PsdApi* | [**filterEffectImage**](PsdApi.md#filtereffectimage) | **PUT** /psd/{name}/filterEffect | Apply filtering effects to an existing image.
*PsdApi* | [**getDiscUsage**](PsdApi.md#getdiscusage) | **GET** /psd/storage/disc | Get disc usage
*PsdApi* | [**getFileVersions**](PsdApi.md#getfileversions) | **GET** /psd/storage/version/{path} | Get file versions
*PsdApi* | [**getFilesList**](PsdApi.md#getfileslist) | **GET** /psd/storage/folder/{path} | Get all files and folders within a folder
*PsdApi* | [**getImageProperties**](PsdApi.md#getimageproperties) | **GET** /psd/{name}/properties | Get properties of an image.
*PsdApi* | [**grayscaleImage**](PsdApi.md#grayscaleimage) | **GET** /psd/{name}/grayscale | Grayscale an existing image.
*PsdApi* | [**modifyPsd**](PsdApi.md#modifypsd) | **GET** /psd/{name}/psd | Update parameters of existing PSD image.
*PsdApi* | [**moveFile**](PsdApi.md#movefile) | **PUT** /psd/storage/file/move/{srcPath} | Move file
*PsdApi* | [**moveFolder**](PsdApi.md#movefolder) | **PUT** /psd/storage/folder/move/{srcPath} | Move folder
*PsdApi* | [**objectExists**](PsdApi.md#objectexists) | **GET** /psd/storage/exist/{path} | Check if file or folder exists
*PsdApi* | [**resizeImage**](PsdApi.md#resizeimage) | **GET** /psd/{name}/resize | Resize an existing image.
*PsdApi* | [**rotateFlipImage**](PsdApi.md#rotateflipimage) | **GET** /psd/{name}/rotateflip | Rotate and/or flip an existing image.
*PsdApi* | [**saveImageAs**](PsdApi.md#saveimageas) | **GET** /psd/{name}/saveAs | Export existing image to another format.
*PsdApi* | [**storageExists**](PsdApi.md#storageexists) | **GET** /psd/storage/{storageName}/exist | Check if storage exists
*PsdApi* | [**updateImage**](PsdApi.md#updateimage) | **GET** /psd/{name}/updateImage | Perform scaling, cropping and flipping of an existing image in a single request.
*PsdApi* | [**uploadFile**](PsdApi.md#uploadfile) | **PUT** /psd/storage/file/{path} | Upload file


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.aspose.psd.cloud.sdk.model.DiscUsage](DiscUsage.md)
 - [com.aspose.psd.cloud.sdk.model.Error](Error.md)
 - [com.aspose.psd.cloud.sdk.model.ErrorDetails](ErrorDetails.md)
 - [com.aspose.psd.cloud.sdk.model.FileVersions](FileVersions.md)
 - [com.aspose.psd.cloud.sdk.model.FilesList](FilesList.md)
 - [com.aspose.psd.cloud.sdk.model.FilesUploadResult](FilesUploadResult.md)
 - [com.aspose.psd.cloud.sdk.model.FilterPropertiesBase](FilterPropertiesBase.md)
 - [com.aspose.psd.cloud.sdk.model.ImagingResponse](ImagingResponse.md)
 - [com.aspose.psd.cloud.sdk.model.ObjectExist](ObjectExist.md)
 - [com.aspose.psd.cloud.sdk.model.PsdProperties](PsdProperties.md)
 - [com.aspose.psd.cloud.sdk.model.StorageExist](StorageExist.md)
 - [com.aspose.psd.cloud.sdk.model.StorageFile](StorageFile.md)
 - [com.aspose.psd.cloud.sdk.model.BigRectangularFilterProperties](BigRectangularFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.BilateralSmoothingFilterProperties](BilateralSmoothingFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.ConvolutionFilterProperties](ConvolutionFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.DeconvolutionFilterProperties](DeconvolutionFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.FileVersion](FileVersion.md)
 - [com.aspose.psd.cloud.sdk.model.MedianFilterProperties](MedianFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.SmallRectangularFilterProperties](SmallRectangularFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.GaussWienerFilterProperties](GaussWienerFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.GaussianBlurFilterProperties](GaussianBlurFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.MotionWienerFilterProperties](MotionWienerFilterProperties.md)
 - [com.aspose.psd.cloud.sdk.model.SharpenFilterProperties](SharpenFilterProperties.md)

