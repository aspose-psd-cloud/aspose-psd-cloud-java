/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ResizeApiTests.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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
package com.aspose.psd.cloud.test.api;

import com.aspose.psd.cloud.sdk.model.ImagingResponse;
import com.aspose.psd.cloud.sdk.model.StorageFile;
import com.aspose.psd.cloud.sdk.model.requests.*;
import com.aspose.psd.cloud.test.base.ApiTester;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@RunWith(Parameterized.class)
public class ResizeApiTests extends ApiTester {

    private ResizeImageRequest resizeImageRequest;
    private CreateResizedImageRequest createResizedImageRequest;

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{ {true, new String[] {null}}, {false, new String[] {null}} });
    }

    private Boolean saveResultToStorage;
    String[] additionalExportFormats;

    public ResizeApiTests(Boolean saveResult, String[] additionalFormats)
    {
        this.saveResultToStorage = saveResult;
        this.additionalExportFormats = additionalFormats;
    }
    
    /**
     * Test operation: Resize an existing image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resizeImageTest() throws Exception {

        if (saveResultToStorage) {
            return;
        }

        Integer newWidth = 100;
        Integer newHeight = 150;
        String folder = getTempFolder();
        String storage = TestStorage;

        ArrayList<String> formatsToExport = new ArrayList<String>();
        Collections.addAll(formatsToExport, this.BasicExportFormats);
        for (String additionalExportFormat : additionalExportFormats) {
            if (additionalExportFormat == null || (!additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))) {
                formatsToExport.add(additionalExportFormat);
            }
        }

        for (StorageFile inputFile : InputTestFiles) {
            for (String format : formatsToExport) {
                resizeImageRequest = new ResizeImageRequest(inputFile.getName(), newWidth, newHeight, format, folder, storage);

                Method propertiesTester = ResizeApiTests.class.getDeclaredMethod("resizeImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = ResizeApiTests.class.getDeclaredMethod("resizeImageGetRequestInvoker", String.class);
                requestInvoker.setAccessible(true);
                this.testGetRequest(
                        "resizeImageTest; save result to storage: " + saveResultToStorage,
                        String.format("Input image: %s; Output format: %s; New width: %s; New height: %s",
                                inputFile.getName(), format, newWidth, newHeight),
                        inputFile.getName(),
                        requestInvoker,
                        propertiesTester,
                        folder,
                        storage);
            }
        }
    }
    
    /**
     * Test operation: Resize an image. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createResizedImageTest() throws Exception {
        byte[] imageData = null;
        Integer newWidth = 100;
        Integer newHeight = 150;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = null;

        ArrayList<String> formatsToExport = new ArrayList<String>();
        Collections.addAll(formatsToExport, this.BasicExportFormats);
        for (String additionalExportFormat : additionalExportFormats) {
            if (additionalExportFormat == null || (!additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))) {
                formatsToExport.add(additionalExportFormat);
            }
        }

        for (StorageFile inputFile : InputTestFiles) {
            for (String format : formatsToExport) {
                createResizedImageRequest = new CreateResizedImageRequest(imageData, newWidth, newHeight, format, outPath, storage);
                outName = inputFile.getName() + "_resize." + format;

                Method propertiesTester = ResizeApiTests.class.getDeclaredMethod("createResizedImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = ResizeApiTests.class.getDeclaredMethod("createResizedImagePostRequestInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);
                this.testPostRequest(
                        "createResizedImageTest; save result to storage: " + saveResultToStorage,
                        saveResultToStorage,
                        String.format("Input image: %s; Output format: %s; New width: %s; New height: %s",
                                inputFile.getName(), format, newWidth, newHeight),
                        inputFile.getName(),
                        outName,
                        requestInvoker,
                        propertiesTester,
                        folder,
                        storage);
            }
        }
    }
    
    /**
     * Invokes GET request for resizeImage operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] resizeImageGetRequestInvoker(String name) throws Exception
    {
        resizeImageRequest.name = name;
        return PsdApi.resizeImage(resizeImageRequest);
    }
    
    /**
     * Invokes POST request for createResizedImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createResizedImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createResizedImageRequest.imageData = imageData;
        createResizedImageRequest.outPath = outPath;
        return PsdApi.createResizedImage(createResizedImageRequest);
    }
    
    /**
     * Tests properties for resizeImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void resizeImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(resizeImageRequest.newWidth, resultProperties.getWidth());
        Assert.assertEquals(resizeImageRequest.newHeight, resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createResizedImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createResizedImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(createResizedImageRequest.newWidth, resultProperties.getWidth());
        Assert.assertEquals(createResizedImageRequest.newHeight, resultProperties.getHeight());
    }
}