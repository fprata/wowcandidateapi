package io.swagger.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PicklistItem  {
  
  @ApiModelProperty(value = "")
  private String label = null;
  @ApiModelProperty(value = "")
  private String picklistId = null;
  @ApiModelProperty(value = "")
  private String picklistOptionId = null;
  @ApiModelProperty(value = "")
  private String externalCode = null;
  @ApiModelProperty(value = "")
  private String locale = null;

 /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PicklistItem label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get picklistId
   * @return picklistId
  **/
  public String getPicklistId() {
    return picklistId;
  }

  public void setPicklistId(String picklistId) {
    this.picklistId = picklistId;
  }

  public PicklistItem picklistId(String picklistId) {
    this.picklistId = picklistId;
    return this;
  }

 /**
   * Get picklistOptionId
   * @return picklistOptionId
  **/
  public String getPicklistOptionId() {
    return picklistOptionId;
  }

  public void setPicklistOptionId(String picklistOptionId) {
    this.picklistOptionId = picklistOptionId;
  }

  public PicklistItem picklistOptionId(String picklistOptionId) {
    this.picklistOptionId = picklistOptionId;
    return this;
  }

 /**
   * Get externalCode
   * @return externalCode
  **/
  public String getExternalCode() {
    return externalCode;
  }

  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }

  public PicklistItem externalCode(String externalCode) {
    this.externalCode = externalCode;
    return this;
  }

 /**
   * Get locale
   * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PicklistItem locale(String locale) {
    this.locale = locale;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PicklistItem {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    picklistId: ").append(toIndentedString(picklistId)).append("\n");
    sb.append("    picklistOptionId: ").append(toIndentedString(picklistOptionId)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

