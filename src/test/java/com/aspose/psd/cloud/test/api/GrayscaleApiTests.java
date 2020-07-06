/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GrayscaleApiTests.java">
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

import com.aspose.psd.cloud.sdk.model.StorageFile;
import com.aspose.psd.cloud.sdk.model.requests.CreateGrayscaledImageRequest;
import com.aspose.psd.cloud.sdk.model.requests.GrayscaleImageRequest;
import com.aspose.psd.cloud.sdk.model.ImagingResponse;
import com.aspose.psd.cloud.test.base.ApiTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.runners.Parameterized.Parameters;

/**
 * Class for testing Grayscale-related API calls
 */
@RunWith(Parameterized.class)
public class GrayscaleApiTests extends ApiTester {

    private GrayscaleImageRequest grayscaleImageRequest;
    private CreateGrayscaledImageRequest createGrayscaledImageRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[]{
                true, false}
        );
    }

    private Boolean saveResultToStorage;

    public GrayscaleApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }

    /**
     * Test operation: Grayscale an existing image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void grayscalemageTest() throws Exception {

        if (saveResultToStorage) {
            return;
        }

        String folder = getTempFolder();
        String storage = TestStorage;

        for (StorageFile inputFile : InputTestFiles) {
            grayscaleImageRequest = new GrayscaleImageRequest(inputFile.getName(), folder, storage);

            Method propertiesTester = GrayscaleApiTests.class.getDeclaredMethod("grayscaleImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = GrayscaleApiTests.class.getDeclaredMethod("grayscaleImageGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testGetRequest(
                    "grayscaleImageTest",
                    String.format("Input image: %s;",
                            inputFile.getName()),
                    inputFile.getName(),
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }

    /**
     * Test operation: Grayscale an image. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createGrayscaledImageTest() throws Exception {
        byte[] imageData = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = null;

        for (StorageFile inputFile : InputTestFiles) {
            createGrayscaledImageRequest = new CreateGrayscaledImageRequest(imageData, outPath, storage);
            outName = inputFile.getName() + "_grayscale.psd";

            Method propertiesTester = GrayscaleApiTests.class.getDeclaredMethod("createGrayscaledImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = GrayscaleApiTests.class.getDeclaredMethod("createGrayscaledImagePostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPostRequest(
                    "createGrayscaledImageTest; save result to storage: " + saveResultToStorage,
                    saveResultToStorage,
                    String.format("Input image: %s;",
                            inputFile.getName()),
                    inputFile.getName(),
                    outName,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }

    /**
     * Invokes GET request for GrayscaleImage operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception
     */
    private byte[] grayscaleImageGetRequestInvoker(String name) throws Exception
    {
        grayscaleImageRequest.name = name;
        return PsdApi.grayscaleImage(grayscaleImageRequest);
    }

    /**
     * Invokes POST request for createGrayscaledImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception
     */
    private byte[] createGrayscaledImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createGrayscaledImageRequest.imageData = imageData;
        createGrayscaledImageRequest.outPath = outPath;
        return PsdApi.createGrayscaledImage(createGrayscaledImageRequest);
    }

    /**
     * Tests properties for grayscaleImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void grayscaleImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultData);
        Assert.assertTrue(resultData.length > 0);
    }

    /**
     * Tests properties for createGrayscaledImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createGrayscaledImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(originalProperties.getBitsPerPixel(), resultProperties.getBitsPerPixel());
    }
}