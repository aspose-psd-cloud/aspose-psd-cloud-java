# Aspose.PSD Cloud Java SDK
[Aspose.PSD Cloud](https://products.aspose.cloud/psd) is a true [REST API](https://apireference.aspose.cloud/psd/) that enables you to perform a wide range of PSD image processing operations including creation, manipulation and conversion in the cloud, with zero initial costs. Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process images in the language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. 

This repository contains [Aspose.PSD Cloud Java SDK](https://products.aspose.cloud/psd/java) source code. This SDK allows you to work with Aspose.PSD Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

To use this SDK, you will need App SID and App Key which can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (free registration in Aspose Cloud is required for this).

## Key Features
#### Supported Operations
* Export
* Resize
* Crop
* Rotate and Flip
* Deskew
* Grayscale
* Apply filtering effect
* Retrieve & update image properties

For the complete list of use-cases, please refer to the [format support document](https://docs.aspose.cloud/display/psdcloud/Supported+File+Formats) to see what you can achieve!

#### Storage API support
Since version 19.4, SDK includes support of storage operations for better user experience and unification, so now there's no need to use 2 different SDKs!

It gives you an ability to:
* Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default)
* Create, copy, move and delete folders
* Copy and move files and folders across separate storages in the scope of a single operation
* Check if certain file, folder or storage exists

Detailed official documentation can be found at the [following link](https://docs.aspose.cloud/display/psdcloud).

## Getting Started
2. **Minimum requirements**. This SDK requires [Java 1.6 or later](https://java.com/download/).
3. **Add Aspose.PSD Cloud Java SDK to your project**. 

Add Aspose Cloud repository to your pom.xml.
```xml
<profiles>
    <profile>
        <repositories>
            <repository>
                <id>AsposeJavaAPI</id>
                <name>Aspose Java API</name>
                <url>https://repository.aspose.cloud/repo/</url>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <releases>
                    <enabled>true</enabled>
                </releases>
            </repository>
        </repositories>
        <id>repositoryProfile</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
    </profile>
</profiles>
```
Add Aspose.PSD Cloud Java SDK as a dependency.
```xml
<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-psd-cloud</artifactId>
        <version>20.8</version>
    </dependency>
</dependencies>
```
4. **Using the SDK**. The best way to become familiar with how to use the SDK is to read the [Developer Guide](https://docs.aspose.cloud/display/psdcloud/Developer+Guide). The [Getting Started Guide](https://docs.aspose.cloud/display/psdcloud/Getting+Started) will help you to become familiar with the common concepts.

## Quick Examples
Please, look at [Examples](EXAMPLES.md) document for basic usage or use the [Examples](Examples) folder for more sophisticated scenarios.

#### Aspose Cloud-hosted service VS on-premise deployment (*experimental feature*)
Starting from v19.7, you can choose either to use Aspose Cloud-hosted image processing service (the standard way) or the Docker image from Docker Hub deployed on-premise to serve the requests.
The details about key differences and deployment process will be described on the dedicated Docker Hub page as soon as it's released.

To succeed with your on-premise service usage by the SDK, you need to:
1. Use the new API class constructors with either single base URL parameter, or additional API version and debug mode parameters.
```java
PsdApi psdApi = new PsdApi("yourServiceUrl");
```
2. Set *storage* or *storageName* parameters for each request where they're present (mandatory!).

## Content
You may check our full [API endpoints list](docs/API_README.md#documentation-for-api-endpoints) or [models available](docs/API_README.md#documentation-for-models) in the SDK.

## Dependencies
* [Java 1.6 or later](https://java.com/download/)

## Licensing
All Aspose.PSD Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

## Contact Us
Your feedback is very important to us. Please feel free to contact via
+ [**Free Support Forum**](https://forum.aspose.cloud/c/psd)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)

## Resources
+ [**Web API reference**](https://apireference.aspose.cloud/psd/)
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/psd)
+ [**Documentation**](https://docs.aspose.cloud/display/psdcloud/Home)
+ [**Blog**](https://blog.aspose.cloud/category/aspose-products/aspose.psd-cloud/)

## Other languages
We generate our SDKs in different languages so you may check if yours is available in our [repository](https://github.com/aspose-psd-cloud). If you don't find your language in the list, feel free to request it from us, or use raw REST API requests as you can find it [here](https://products.aspose.cloud/psd/curl).

## Code generator
The solution is updated using [code generator](https://github.com/aspose-psd-cloud/aspose-psd-cloud-codegen).