/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingResponse.java">
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


package com.aspose.psd.cloud.sdk.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.psd.cloud.sdk.stablemodel.*;

/**
 * Represents information about image.
 */
public class ImagingResponse {
  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("bitsPerPixel")
  private Integer bitsPerPixel = null;

  @JsonProperty("psdProperties")
  private PsdProperties psdProperties = null;

  @JsonProperty("horizontalResolution")
  private Double horizontalResolution = null;

  @JsonProperty("verticalResolution")
  private Double verticalResolution = null;

  @JsonProperty("isCached")
  private Boolean isCached = null;

  public ImagingResponse height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Gets or sets the height of image.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }  

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImagingResponse width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Gets or sets the width of image.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }  

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImagingResponse bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

  /**
   * Gets or sets the bits per pixel for image.
   * @return bitsPerPixel
  **/
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }  

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }

  public ImagingResponse psdProperties(PsdProperties psdProperties) {
    this.psdProperties = psdProperties;
    return this;
  }

  /**
   * Gets or sets the PSD properties.
   * @return psdProperties
  **/
  public PsdProperties getPsdProperties() {
    return psdProperties;
  }  

  public void setPsdProperties(PsdProperties psdProperties) {
    this.psdProperties = psdProperties;
  }

  public ImagingResponse horizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

  /**
   * Gets or sets the horizontal resolution of an image.
   * @return horizontalResolution
  **/
  public Double getHorizontalResolution() {
    return horizontalResolution;
  }  

  public void setHorizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public ImagingResponse verticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

  /**
   * Gets or sets the vertical resolution of an image.
   * @return verticalResolution
  **/
  public Double getVerticalResolution() {
    return verticalResolution;
  }  

  public void setVerticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public ImagingResponse isCached(Boolean isCached) {
    this.isCached = isCached;
    return this;
  }

  /**
   * Gets or sets a value indicating whether image is cached.
   * @return isCached
  **/
  public Boolean isIsCached() {
    return isCached;
  }  

  public void setIsCached(Boolean isCached) {
    this.isCached = isCached;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ImagingResponse imagingResponse = (ImagingResponse) o;
    return ObjectUtils.equals(this.height, imagingResponse.height) &&
    ObjectUtils.equals(this.width, imagingResponse.width) &&
    ObjectUtils.equals(this.bitsPerPixel, imagingResponse.bitsPerPixel) &&
    ObjectUtils.equals(this.psdProperties, imagingResponse.psdProperties) &&
    ObjectUtils.equals(this.horizontalResolution, imagingResponse.horizontalResolution) &&
    ObjectUtils.equals(this.verticalResolution, imagingResponse.verticalResolution) &&
    ObjectUtils.equals(this.isCached, imagingResponse.isCached);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(height, width, bitsPerPixel, psdProperties, horizontalResolution, verticalResolution, isCached);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagingResponse {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
    sb.append("    psdProperties: ").append(toIndentedString(psdProperties)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    isCached: ").append(toIndentedString(isCached)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

