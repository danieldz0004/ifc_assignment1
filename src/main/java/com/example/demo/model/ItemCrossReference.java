package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ITEM_CROSS_REFERENCE")
public class ItemCrossReference {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="INTERNAL_ITEM_CROSS_NUM")
    private long internalItemCrossNum;

    @Column(name="ITEM")
    private String item;

    @Column(name="X_REF_ITEM")
    private String xRefItem;

    @Column(name="COMPANY")
    private String company;

    @Column(name="USER_DEF1")
    private String userDef1;

    @Column(name="USER_DEF2")
    private String userDef2;

    @Column(name="USER_DEF3")
    private String userDef3;

    @Column(name="USER_DEF4")
    private String userDef4;

    @Column(name="USER_DEF5")
    private String userDef5;

    @Column(name="USER_DEF6")
    private String userDef6;

    @Column(name="USER_DEF7")
    private BigDecimal userDef7;

    @Column(name="USER_DEF8")
    private BigDecimal userDef8;

    @Column(name="USER_STAMP")
    private String userStamp;

    @Column(name="PROCESS_STAMP")
    private String processStamp;

    @Column(name="DATE_TIME_STAMP")
    private Timestamp dateTimeStamp;

    @Column(name="QUANTITY_UM")
    private String quantityUm;

    @Column(name="GTIN_ENABLED")
    private String gtinEnabled;

    @Column(name="APP_IDENTIFIER")
    private String appIdentifier;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getInternalItemCrossNum() {
        return internalItemCrossNum;
    }

    public void setInternalItemCrossNum(long internalItemCrossNum) {
        this.internalItemCrossNum = internalItemCrossNum;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getxRefItem() {
        return xRefItem;
    }

    public void setxRefItem(String xRefItem) {
        this.xRefItem = xRefItem;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getQuantityUm() {
        return quantityUm;
    }

    public void setQuantityUm(String quantityUm) {
        this.quantityUm = quantityUm;
    }

    public String getGtinEnabled() {
        return gtinEnabled;
    }

    public void setGtinEnabled(String gtinEnabled) {
        this.gtinEnabled = gtinEnabled;
    }

    public String getAppIdentifier() {
        return appIdentifier;
    }

    public void setAppIdentifier(String appIdentifier) {
        this.appIdentifier = appIdentifier;
    }
}
