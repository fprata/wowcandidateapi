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

public class User  {
  
  @ApiModelProperty(value = "")
  private String id = null;
  @ApiModelProperty(value = "")
  private String username = null;
  @ApiModelProperty(value = "")
  private String firstName = null;
  @ApiModelProperty(value = "")
  private String lastName = null;
  @ApiModelProperty(value = "")
  private String email = null;
  @ApiModelProperty(value = "")
  private String phone = null;
  @ApiModelProperty(value = "")
  private String mailingstreet = null;
  @ApiModelProperty(value = "")
  private String mailingcity = null;
  @ApiModelProperty(value = "")
  private String mailingstate = null;
  @ApiModelProperty(value = "")
  private String mailingcountry = null;
  @ApiModelProperty(value = "")
  private Boolean admin = null;
  @ApiModelProperty(value = "")
  private String managerId = null;
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

  public User id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get mailingstreet
   * @return mailingstreet
  **/
  public String getMailingstreet() {
    return mailingstreet;
  }

  public void setMailingstreet(String mailingstreet) {
    this.mailingstreet = mailingstreet;
  }

  public User mailingstreet(String mailingstreet) {
    this.mailingstreet = mailingstreet;
    return this;
  }

 /**
   * Get mailingcity
   * @return mailingcity
  **/
  public String getMailingcity() {
    return mailingcity;
  }

  public void setMailingcity(String mailingcity) {
    this.mailingcity = mailingcity;
  }

  public User mailingcity(String mailingcity) {
    this.mailingcity = mailingcity;
    return this;
  }

 /**
   * Get mailingstate
   * @return mailingstate
  **/
  public String getMailingstate() {
    return mailingstate;
  }

  public void setMailingstate(String mailingstate) {
    this.mailingstate = mailingstate;
  }

  public User mailingstate(String mailingstate) {
    this.mailingstate = mailingstate;
    return this;
  }

 /**
   * Get mailingcountry
   * @return mailingcountry
  **/
  public String getMailingcountry() {
    return mailingcountry;
  }

  public void setMailingcountry(String mailingcountry) {
    this.mailingcountry = mailingcountry;
  }

  public User mailingcountry(String mailingcountry) {
    this.mailingcountry = mailingcountry;
    return this;
  }

 /**
   * Get admin
   * @return admin
  **/
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public User admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

 /**
   * Get managerId
   * @return managerId
  **/
  public String getManagerId() {
    return managerId;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  public User managerId(String managerId) {
    this.managerId = managerId;
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

  public User status(Integer status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mailingstreet: ").append(toIndentedString(mailingstreet)).append("\n");
    sb.append("    mailingcity: ").append(toIndentedString(mailingcity)).append("\n");
    sb.append("    mailingstate: ").append(toIndentedString(mailingstate)).append("\n");
    sb.append("    mailingcountry: ").append(toIndentedString(mailingcountry)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
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

