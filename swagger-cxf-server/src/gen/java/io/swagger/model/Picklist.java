package io.swagger.model;

import io.swagger.model.PicklistItem;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Picklist  {
  
  @ApiModelProperty(value = "")
  private String name = null;
  @ApiModelProperty(value = "")
  private List<PicklistItem> values = new ArrayList<PicklistItem>();

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Picklist name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  public List<PicklistItem> getValues() {
    return values;
  }

  public void setValues(List<PicklistItem> values) {
    this.values = values;
  }

  public Picklist values(List<PicklistItem> values) {
    this.values = values;
    return this;
  }

  public Picklist addValuesItem(PicklistItem valuesItem) {
    this.values.add(valuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picklist {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

