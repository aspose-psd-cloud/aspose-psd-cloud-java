<a name="documentation-for-api-endpoints"></a>
## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ImagingApi* | [**copyFile**](ImagingApi.md#copyfile) | **PUT** /psd/storage/file/copy/{srcPath} | Copy file
*ImagingApi* | [**copyFolder**](ImagingApi.md#copyfolder) | **PUT** /psd/storage/folder/copy/{srcPath} | Copy folder
*ImagingApi* | [**createCroppedImage**](ImagingApi.md#createcroppedimage) | **POST** /psd/crop | Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createDeskewedImage**](ImagingApi.md#createdeskewedimage) | **POST** /psd/deskew | Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createFolder**](ImagingApi.md#createfolder) | **PUT** /psd/storage/folder/{path} | Create the folder
*ImagingApi* | [**createGrayscaledImage**](ImagingApi.md#creategrayscaledimage) | **POST** /psd/grayscale | Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedPsd**](ImagingApi.md#createmodifiedpsd) | **POST** /psd/psd | Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createResizedImage**](ImagingApi.md#createresizedimage) | **POST** /psd/resize | Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createRotateFlippedImage**](ImagingApi.md#createrotateflippedimage) | **POST** /psd/rotateflip | Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createSavedImageAs**](ImagingApi.md#createsavedimageas) | **POST** /psd/saveAs | Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
*ImagingApi* | [**createUpdatedImage**](ImagingApi.md#createupdatedimage) | **POST** /psd/updateImage | Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**cropImage**](ImagingApi.md#cropimage) | **GET** /psd/{name}/crop | Crop an existing image.
*ImagingApi* | [**deleteFile**](ImagingApi.md#deletefile) | **DELETE** /psd/storage/file/{path} | Delete file
*ImagingApi* | [**deleteFolder**](ImagingApi.md#deletefolder) | **DELETE** /psd/storage/folder/{path} | Delete folder
*ImagingApi* | [**deskewImage**](ImagingApi.md#deskewimage) | **GET** /psd/{name}/deskew | Deskew an existing image.
*ImagingApi* | [**downloadFile**](ImagingApi.md#downloadfile) | **GET** /psd/storage/file/{path} | Download file
*ImagingApi* | [**extractImageProperties**](ImagingApi.md#extractimageproperties) | **POST** /psd/properties | Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**filterEffectImage**](ImagingApi.md#filtereffectimage) | **PUT** /psd/{name}/filterEffect | Apply filtering effects to an existing image.
*ImagingApi* | [**getDiscUsage**](ImagingApi.md#getdiscusage) | **GET** /psd/storage/disc | Get disc usage
*ImagingApi* | [**getFileVersions**](ImagingApi.md#getfileversions) | **GET** /psd/storage/version/{path} | Get file versions
*ImagingApi* | [**getFilesList**](ImagingApi.md#getfileslist) | **GET** /psd/storage/folder/{path} | Get all files and folders within a folder
*ImagingApi* | [**getImageProperties**](ImagingApi.md#getimageproperties) | **GET** /psd/{name}/properties | Get properties of an image.
*ImagingApi* | [**grayscaleImage**](ImagingApi.md#grayscaleimage) | **GET** /psd/{name}/grayscale | Grayscale an existing image.
*ImagingApi* | [**modifyPsd**](ImagingApi.md#modifypsd) | **GET** /psd/{name}/psd | Update parameters of existing PSD image.
*ImagingApi* | [**moveFile**](ImagingApi.md#movefile) | **PUT** /psd/storage/file/move/{srcPath} | Move file
*ImagingApi* | [**moveFolder**](ImagingApi.md#movefolder) | **PUT** /psd/storage/folder/move/{srcPath} | Move folder
*ImagingApi* | [**objectExists**](ImagingApi.md#objectexists) | **GET** /psd/storage/exist/{path} | Check if file or folder exists
*ImagingApi* | [**resizeImage**](ImagingApi.md#resizeimage) | **GET** /psd/{name}/resize | Resize an existing image.
*ImagingApi* | [**rotateFlipImage**](ImagingApi.md#rotateflipimage) | **GET** /psd/{name}/rotateflip | Rotate and/or flip an existing image.
*ImagingApi* | [**saveImageAs**](ImagingApi.md#saveimageas) | **GET** /psd/{name}/saveAs | Export existing image to another format.
*ImagingApi* | [**storageExists**](ImagingApi.md#storageexists) | **GET** /psd/storage/{storageName}/exist | Check if storage exists
*ImagingApi* | [**updateImage**](ImagingApi.md#updateimage) | **GET** /psd/{name}/updateImage | Perform scaling, cropping and flipping of an existing image in a single request.
*ImagingApi* | [**uploadFile**](ImagingApi.md#uploadfile) | **PUT** /psd/storage/file/{path} | Upload file


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

