package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name="COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "COMPANY")
    private String company;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "ADDRESS3")
    private String address3;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "RETURNS_NAME")
    private String returnsName;

    @Column(name = "RETURNS_ADDRESS1")
    private String returnsAddress1;

    @Column(name = "RETURNS_ADDRESS2")
    private String returnsAddress2;

    @Column(name = "RETURNS_ADDRESS3")
    private String returnsAddress3;

    @Column(name = "RETURNS_CITY")
    private String returnsCity;

    @Column(name = "RETURNS_STATE")
    private String returnsState;

    @Column(name = "RETURNS_COUNTRY")
    private String returnsCountry;

    @Column(name = "RETURNS_POSTAL_CODE")
    private String returnsPostalCode;

    @Column(name = "COMPANY_PREFIX")
    private String companyPrefix;

    @Column(name = "PHONE_NUM")
    private String phoneNum;

    @Column(name = "FAX_NUM")
    private String faxNum;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "HOST_INTERFACE_SOURCE")
    private String hostInterfaceSource;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "USER_DEF1")
    private String userDef1;

    @Column(name = "USER_DEF2")
    private String userDef2;

    @Column(name = "USER_DEF3")
    private String userDef3;

    @Column(name = "USER_DEF4")
    private String userDef4;

    @Column(name = "USER_DEF5")
    private String userDef5;

    @Column(name = "USER_DEF6")
    private String userDef6;

    @Column(name = "USER_DEF7")
    private BigDecimal userDef7;

    @Column(name = "USER_DEF8")
    private BigDecimal userDef8;

    @Column(name = "USER_STAMP")
    private String userStamp;

    @Column(name = "PROCESS_STAMP")
    private String processStamp;

    @Column(name = "DATE_TIME_STAMP")
    private Timestamp dateTimeStamp;

    @Column(name = "ATTENTION_TO")
    private String attentionTo;

    @Column(name = "RETURNS_ATTENTION_TO")
    private String returnsAttentionTo;

    @Column(name = "RETURNS_PHONE_NUM")
    private String returnsPhoneNum;

    @Column(name = "RETURNS_FAX_NUM")
    private String returnsFaxNum;

    @Column(name = "RETURNS_EMAIL_ADDRESS")
    private String returnsEmailAddress;

    @Column(name = "FREIGHT_BILL_TO_NAME")
    private String freightBillToName;

    @Column(name = "FREIGHT_BILL_TO_ADDRESS1")
    private String freightBillToAddress1;

    @Column(name = "FREIGHT_BILL_TO_ADDRESS2")
    private String freightBillToAddress2;

    @Column(name = "FREIGHT_BILL_TO_ADDRESS3")
    private String freightBillToAddress3;

    @Column(name = "FREIGHT_BILL_TO_ATTENTION_TO")
    private String freightBillToAttentionTo;

    @Column(name = "FREIGHT_BILL_TO_CITY")
    private String freightBillToCity;

    @Column(name = "FREIGHT_BILL_TO_STATE")
    private String freightBillToState;

    @Column(name = "FREIGHT_BILL_TO_COUNTRY")
    private String freightBillToCountry;

    @Column(name = "FREIGHT_BILL_TO_POSTAL_CODE")
    private String freightBillToPostalCode;

    @Column(name = "FREIGHT_BILL_TO_PHONE_NUM")
    private String freightBillToPhoneNum;

    @Column(name = "FREIGHT_BILL_TO_FAX_NUM")
    private String freightBillToFaxNum;

    @Column(name = "FREIGHT_BILL_TO_EMAIL_ADDRESS")
    private String freightBillToEmailAddress;

    @Column(name = "ORDER_ID_PREFIX")
    private String orderIdPrefix;

    @Column(name = "FISCAL_CALENDAR_NAME")
    private String fiscalCalendarName;

    @Column(name = "WEB_HEADER_URL_LEFT")
    private String webHeaderUrlLeft;

    @Column(name = "WEB_HEADER_URL_CENTER")
    private String webHeaderUrlCenter;

    @Column(name = "WEB_HEADER_URL_RIGHT")
    private String webHeaderUrlRight;

    @Column(name = "WEB_HEADER_GRAPHIC_LEFT")
    private String webHeaderGraphicLeft;

    @Column(name = "WEB_HEADER_GRAPHIC_CENTER")
    private String webHeaderGraphicCenter;

    @Column(name = "WEB_HEADER_GRAPHIC_RIGHT")
    private String webHeaderGraphicRight;

    @Column(name = "RECEIPT_ID_PREFIX")
    private String receiptIdPrefix;

    @Column(name = "AVAILABILITY_CHECKING")
    private String availabilityChecking;

    @Column(name = "PURCHASE_ORDER_ID_PREFIX")
    private String purchaseOrderIdPrefix;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getReturnsName() {
        return returnsName;
    }

    public void setReturnsName(String returnsName) {
        this.returnsName = returnsName;
    }

    public String getReturnsAddress1() {
        return returnsAddress1;
    }

    public void setReturnsAddress1(String returnsAddress1) {
        this.returnsAddress1 = returnsAddress1;
    }

    public String getReturnsAddress2() {
        return returnsAddress2;
    }

    public void setReturnsAddress2(String returnsAddress2) {
        this.returnsAddress2 = returnsAddress2;
    }

    public String getReturnsAddress3() {
        return returnsAddress3;
    }

    public void setReturnsAddress3(String returnsAddress3) {
        this.returnsAddress3 = returnsAddress3;
    }

    public String getReturnsCity() {
        return returnsCity;
    }

    public void setReturnsCity(String returnsCity) {
        this.returnsCity = returnsCity;
    }

    public String getReturnsState() {
        return returnsState;
    }

    public void setReturnsState(String returnsState) {
        this.returnsState = returnsState;
    }

    public String getReturnsCountry() {
        return returnsCountry;
    }

    public void setReturnsCountry(String returnsCountry) {
        this.returnsCountry = returnsCountry;
    }

    public String getReturnsPostalCode() {
        return returnsPostalCode;
    }

    public void setReturnsPostalCode(String returnsPostalCode) {
        this.returnsPostalCode = returnsPostalCode;
    }

    public String getCompanyPrefix() {
        return companyPrefix;
    }

    public void setCompanyPrefix(String companyPrefix) {
        this.companyPrefix = companyPrefix;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(String faxNum) {
        this.faxNum = faxNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHostInterfaceSource() {
        return hostInterfaceSource;
    }

    public void setHostInterfaceSource(String hostInterfaceSource) {
        this.hostInterfaceSource = hostInterfaceSource;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUserDef1() {
        return userDef1;
    }

    public void setUserDef1(String userDef1) {
        this.userDef1 = userDef1;
    }

    public String getUserDef2() {
        return userDef2;
    }

    public void setUserDef2(String userDef2) {
        this.userDef2 = userDef2;
    }

    public String getUserDef3() {
        return userDef3;
    }

    public void setUserDef3(String userDef3) {
        this.userDef3 = userDef3;
    }

    public String getUserDef4() {
        return userDef4;
    }

    public void setUserDef4(String userDef4) {
        this.userDef4 = userDef4;
    }

    public String getUserDef5() {
        return userDef5;
    }

    public void setUserDef5(String userDef5) {
        this.userDef5 = userDef5;
    }

    public String getUserDef6() {
        return userDef6;
    }

    public void setUserDef6(String userDef6) {
        this.userDef6 = userDef6;
    }

    public BigDecimal getUserDef7() {
        return userDef7;
    }

    public void setUserDef7(BigDecimal userDef7) {
        this.userDef7 = userDef7;
    }

    public BigDecimal getUserDef8() {
        return userDef8;
    }

    public void setUserDef8(BigDecimal userDef8) {
        this.userDef8 = userDef8;
    }

    public String getUserStamp() {
        return userStamp;
    }

    public void setUserStamp(String userStamp) {
        this.userStamp = userStamp;
    }

    public String getProcessStamp() {
        return processStamp;
    }

    public void setProcessStamp(String processStamp) {
        this.processStamp = processStamp;
    }

    public Timestamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(Timestamp dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getAttentionTo() {
        return attentionTo;
    }

    public void setAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
    }

    public String getReturnsAttentionTo() {
        return returnsAttentionTo;
    }

    public void setReturnsAttentionTo(String returnsAttentionTo) {
        this.returnsAttentionTo = returnsAttentionTo;
    }

    public String getReturnsPhoneNum() {
        return returnsPhoneNum;
    }

    public void setReturnsPhoneNum(String returnsPhoneNum) {
        this.returnsPhoneNum = returnsPhoneNum;
    }

    public String getReturnsFaxNum() {
        return returnsFaxNum;
    }

    public void setReturnsFaxNum(String returnsFaxNum) {
        this.returnsFaxNum = returnsFaxNum;
    }

    public String getReturnsEmailAddress() {
        return returnsEmailAddress;
    }

    public void setReturnsEmailAddress(String returnsEmailAddress) {
        this.returnsEmailAddress = returnsEmailAddress;
    }

    public String getFreightBillToName() {
        return freightBillToName;
    }

    public void setFreightBillToName(String freightBillToName) {
        this.freightBillToName = freightBillToName;
    }

    public String getFreightBillToAddress1() {
        return freightBillToAddress1;
    }

    public void setFreightBillToAddress1(String freightBillToAddress1) {
        this.freightBillToAddress1 = freightBillToAddress1;
    }

    public String getFreightBillToAddress2() {
        return freightBillToAddress2;
    }

    public void setFreightBillToAddress2(String freightBillToAddress2) {
        this.freightBillToAddress2 = freightBillToAddress2;
    }

    public String getFreightBillToAddress3() {
        return freightBillToAddress3;
    }

    public void setFreightBillToAddress3(String freightBillToAddress3) {
        this.freightBillToAddress3 = freightBillToAddress3;
    }

    public String getFreightBillToAttentionTo() {
        return freightBillToAttentionTo;
    }

    public void setFreightBillToAttentionTo(String freightBillToAttentionTo) {
        this.freightBillToAttentionTo = freightBillToAttentionTo;
    }

    public String getFreightBillToCity() {
        return freightBillToCity;
    }

    public void setFreightBillToCity(String freightBillToCity) {
        this.freightBillToCity = freightBillToCity;
    }

    public String getFreightBillToState() {
        return freightBillToState;
    }

    public void setFreightBillToState(String freightBillToState) {
        this.freightBillToState = freightBillToState;
    }

    public String getFreightBillToCountry() {
        return freightBillToCountry;
    }

    public void setFreightBillToCountry(String freightBillToCountry) {
        this.freightBillToCountry = freightBillToCountry;
    }

    public String getFreightBillToPostalCode() {
        return freightBillToPostalCode;
    }

    public void setFreightBillToPostalCode(String freightBillToPostalCode) {
        this.freightBillToPostalCode = freightBillToPostalCode;
    }

    public String getFreightBillToPhoneNum() {
        return freightBillToPhoneNum;
    }

    public void setFreightBillToPhoneNum(String freightBillToPhoneNum) {
        this.freightBillToPhoneNum = freightBillToPhoneNum;
    }

    public String getFreightBillToFaxNum() {
        return freightBillToFaxNum;
    }

    public void setFreightBillToFaxNum(String freightBillToFaxNum) {
        this.freightBillToFaxNum = freightBillToFaxNum;
    }

    public String getFreightBillToEmailAddress() {
        return freightBillToEmailAddress;
    }

    public void setFreightBillToEmailAddress(String freightBillToEmailAddress) {
        this.freightBillToEmailAddress = freightBillToEmailAddress;
    }

    public String getOrderIdPrefix() {
        return orderIdPrefix;
    }

    public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
    }

    public String getFiscalCalendarName() {
        return fiscalCalendarName;
    }

    public void setFiscalCalendarName(String fiscalCalendarName) {
        this.fiscalCalendarName = fiscalCalendarName;
    }

    public String getWebHeaderUrlLeft() {
        return webHeaderUrlLeft;
    }

    public void setWebHeaderUrlLeft(String webHeaderUrlLeft) {
        this.webHeaderUrlLeft = webHeaderUrlLeft;
    }

    public String getWebHeaderUrlCenter() {
        return webHeaderUrlCenter;
    }

    public void setWebHeaderUrlCenter(String webHeaderUrlCenter) {
        this.webHeaderUrlCenter = webHeaderUrlCenter;
    }

    public String getWebHeaderUrlRight() {
        return webHeaderUrlRight;
    }

    public void setWebHeaderUrlRight(String webHeaderUrlRight) {
        this.webHeaderUrlRight = webHeaderUrlRight;
    }

    public String getWebHeaderGraphicLeft() {
        return webHeaderGraphicLeft;
    }

    public void setWebHeaderGraphicLeft(String webHeaderGraphicLeft) {
        this.webHeaderGraphicLeft = webHeaderGraphicLeft;
    }

    public String getWebHeaderGraphicCenter() {
        return webHeaderGraphicCenter;
    }

    public void setWebHeaderGraphicCenter(String webHeaderGraphicCenter) {
        this.webHeaderGraphicCenter = webHeaderGraphicCenter;
    }

    public String getWebHeaderGraphicRight() {
        return webHeaderGraphicRight;
    }

    public void setWebHeaderGraphicRight(String webHeaderGraphicRight) {
        this.webHeaderGraphicRight = webHeaderGraphicRight;
    }

    public String getReceiptIdPrefix() {
        return receiptIdPrefix;
    }

    public void setReceiptIdPrefix(String receiptIdPrefix) {
        this.receiptIdPrefix = receiptIdPrefix;
    }

    public String getAvailabilityChecking() {
        return availabilityChecking;
    }

    public void setAvailabilityChecking(String availabilityChecking) {
        this.availabilityChecking = availabilityChecking;
    }

    public String getPurchaseOrderIdPrefix() {
        return purchaseOrderIdPrefix;
    }

    public void setPurchaseOrderIdPrefix(String purchaseOrderIdPrefix) {
        this.purchaseOrderIdPrefix = purchaseOrderIdPrefix;
    }
}


