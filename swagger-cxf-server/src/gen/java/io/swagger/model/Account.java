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

public class Account  {
  
  @ApiModelProperty(value = "")
  private String id = null;
  @ApiModelProperty(value = "")
  private String salesOrg = null;
  @ApiModelProperty(value = "")
  private String distChannel = null;
  @ApiModelProperty(value = "")
  private String division = null;
  @ApiModelProperty(value = "")
  private String accountNum = null;
  @ApiModelProperty(value = "")
  private String accountType = null;
  @ApiModelProperty(value = "")
  private Boolean masterAccount = null;
  @ApiModelProperty(value = "")
  private String billingStreet = null;
  @ApiModelProperty(value = "")
  private String billingCity = null;
  @ApiModelProperty(value = "")
  private String billingState = null;
  @ApiModelProperty(value = "")
  private String billingPostalCode = null;
  @ApiModelProperty(value = "")
  private String billingCountry = null;
  @ApiModelProperty(value = "")
  private String shippingStreet = null;
  @ApiModelProperty(value = "")
  private String shippingCity = null;
  @ApiModelProperty(value = "")
  private String shippingState = null;
  @ApiModelProperty(value = "")
  private String shippingPostalCode = null;
  @ApiModelProperty(value = "")
  private String shippingCountry = null;
  @ApiModelProperty(value = "")
  private Integer status = null;

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get salesOrg
   * @return salesOrg
  **/
  public String getSalesOrg() {
    return salesOrg;
  }

  public void setSalesOrg(String salesOrg) {
    this.salesOrg = salesOrg;
  }

  public Account salesOrg(String salesOrg) {
    this.salesOrg = salesOrg;
    return this;
  }

 /**
   * Get distChannel
   * @return distChannel
  **/
  public String getDistChannel() {
    return distChannel;
  }

  public void setDistChannel(String distChannel) {
    this.distChannel = distChannel;
  }

  public Account distChannel(String distChannel) {
    this.distChannel = distChannel;
    return this;
  }

 /**
   * Get division
   * @return division
  **/
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public Account division(String division) {
    this.division = division;
    return this;
  }

 /**
   * Get accountNum
   * @return accountNum
  **/
  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public Account accountNum(String accountNum) {
    this.accountNum = accountNum;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get masterAccount
   * @return masterAccount
  **/
  public Boolean getMasterAccount() {
    return masterAccount;
  }

  public void setMasterAccount(Boolean masterAccount) {
    this.masterAccount = masterAccount;
  }

  public Account masterAccount(Boolean masterAccount) {
    this.masterAccount = masterAccount;
    return this;
  }

 /**
   * Get billingStreet
   * @return billingStreet
  **/
  public String getBillingStreet() {
    return billingStreet;
  }

  public void setBillingStreet(String billingStreet) {
    this.billingStreet = billingStreet;
  }

  public Account billingStreet(String billingStreet) {
    this.billingStreet = billingStreet;
    return this;
  }

 /**
   * Get billingCity
   * @return billingCity
  **/
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public Account billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

 /**
   * Get billingState
   * @return billingState
  **/
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public Account billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

 /**
   * Get billingPostalCode
   * @return billingPostalCode
  **/
  public String getBillingPostalCode() {
    return billingPostalCode;
  }

  public void setBillingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
  }

  public Account billingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
    return this;
  }

 /**
   * Get billingCountry
   * @return billingCountry
  **/
  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }

  public Account billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

 /**
   * Get shippingStreet
   * @return shippingStreet
  **/
  public String getShippingStreet() {
    return shippingStreet;
  }

  public void setShippingStreet(String shippingStreet) {
    this.shippingStreet = shippingStreet;
  }

  public Account shippingStreet(String shippingStreet) {
    this.shippingStreet = shippingStreet;
    return this;
  }

 /**
   * Get shippingCity
   * @return shippingCity
  **/
  public String getShippingCity() {
    return shippingCity;
  }

  public void setShippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
  }

  public Account shippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
    return this;
  }

 /**
   * Get shippingState
   * @return shippingState
  **/
  public String getShippingState() {
    return shippingState;
  }

  public void setShippingState(String shippingState) {
    this.shippingState = shippingState;
  }

  public Account shippingState(String shippingState) {
    this.shippingState = shippingState;
    return this;
  }

 /**
   * Get shippingPostalCode
   * @return shippingPostalCode
  **/
  public String getShippingPostalCode() {
    return shippingPostalCode;
  }

  public void setShippingPostalCode(String shippingPostalCode) {
    this.shippingPostalCode = shippingPostalCode;
  }

  public Account shippingPostalCode(String shippingPostalCode) {
    this.shippingPostalCode = shippingPostalCode;
    return this;
  }

 /**
   * Get shippingCountry
   * @return shippingCountry
  **/
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }

  public Account shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Account status(Integer status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salesOrg: ").append(toIndentedString(salesOrg)).append("\n");
    sb.append("    distChannel: ").append(toIndentedString(distChannel)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    masterAccount: ").append(toIndentedString(masterAccount)).append("\n");
    sb.append("    billingStreet: ").append(toIndentedString(billingStreet)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingPostalCode: ").append(toIndentedString(billingPostalCode)).append("\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    shippingStreet: ").append(toIndentedString(shippingStreet)).append("\n");
    sb.append("    shippingCity: ").append(toIndentedString(shippingCity)).append("\n");
    sb.append("    shippingState: ").append(toIndentedString(shippingState)).append("\n");
    sb.append("    shippingPostalCode: ").append(toIndentedString(shippingPostalCode)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

