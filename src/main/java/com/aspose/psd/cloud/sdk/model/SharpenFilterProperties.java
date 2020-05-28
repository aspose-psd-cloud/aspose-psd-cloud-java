/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SharpenFilterProperties.java">
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
 * The Sharpen filter options             
 */
public class SharpenFilterProperties extends ConvolutionFilterProperties {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sigma")
  private Double sigma = null;

  public SharpenFilterProperties size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Gets or sets the size.             
   * @return size
  **/
  public Integer getSize() {
    return size;
  }  

  public void setSize(Integer size) {
    this.size = size;
  }

  public SharpenFilterProperties sigma(Double sigma) {
    this.sigma = sigma;
    return this;
  }

  /**
   * Gets or sets the sigma.             
   * @return sigma
  **/
  public Double getSigma() {
    return sigma;
  }  

  public void setSigma(Double sigma) {
    this.sigma = sigma;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SharpenFilterProperties sharpenFilterProperties = (SharpenFilterProperties) o;
    return ObjectUtils.equals(this.size, sharpenFilterProperties.size) &&
    ObjectUtils.equals(this.sigma, sharpenFilterProperties.sigma) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(size, sigma, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharpenFilterProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sigma: ").append(toIndentedString(sigma)).append("\n");
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

