/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeskewImageRequest.java">
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

package com.aspose.psd.cloud.sdk.model.requests;

import com.aspose.psd.cloud.sdk.model.*;

/**
* Class that holds parameters for DeskewImage request invocation.
**/   
public class DeskewImageRequest
{
    /**
    * Initializes a new instance of the DeskewImageRequest class.   
    * @param name Image file name.
    * @param resizeProportionally Resize proportionally
    * @param bkColor Background color
    * @param folder Folder
    * @param storage Storage
    **/
    public DeskewImageRequest(String name, Boolean resizeProportionally, String bkColor, String folder, String storage)             
    {
        this.name = name;
        this.resizeProportionally = resizeProportionally;
        this.bkColor = bkColor;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Image file name.
    **/
    public String name;

    /**
    * Resize proportionally
    **/
    public Boolean resizeProportionally;

    /**
    * Background color
    **/
    public String bkColor;

    /**
    * Folder
    **/
    public String folder;

    /**
    * Storage
    **/
    public String storage;
}
