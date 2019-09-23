package com.example.demo.model;

import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name="ITEM")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="INTERNAL_ITEM_NUM")
    private long internalItemNum;

    @Column(name="LOCATING_RULE")
    private String locatingRule;

    @Column(name="ALLOCATION_RULE")
    private String allocationRule;

    @Column(name="ITEM")
    @NaturalId
    private String item;

//    @Column(name="COMPANY")
//    @NaturalId
//    private String company;

    @Column(name = "COMPANY")
    private String company;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="ITEM_TEMPLATE")
    private String itemTemplate;

    @Column(name="TEMPLATE_FIELD1")
    private String templateField1;

    @Column(name="TEMPLATE_FIELD2")
    private String templateField2;

    @Column(name="TEMPLATE_FIELD3")
    private String templateField3;

    @Column(name="TEMPLATE_FIELD4")
    private String templateField4;

    @Column(name="TEMPLATE_FIELD5")
    private String templateField5;

    @Column(name="DIVISION")
    private String division;

    @Column(name="DEPARTMENT")
    private String department;

    @Column(name="COST")
    private BigDecimal cost;

    @Column(name="ITEM_SIZE")
    private String itemSize;

    @Column(name="ITEM_COLOR")
    private String itemColor;

    @Column(name="ITEM_STYLE")
    private String itemStyle;

    @Column(name="NMFC_CODE")
    private String nmfcCode;

    @Column(name="LOT_CONTROLLED")
    private String lotControlled;

    @Column(name="CATCH_WEIGHT_REQD")
    private String catchWeightReqd;

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

    @Column(name="LIST_PRICE")
    private BigDecimal listPrice;

    @Column(name="NET_PRICE")
    private BigDecimal netPrice;

    @Column(name="STORAGE_TEMPLATE")
    private String storageTemplate;

    @Column(name="INVENTORY_TRACKING")
    private String inventoryTracking;

    @Column(name="ITEM_CLASS")
    private String itemClass;

    @Column(name="HARMONIZED_CODE")
    private String harmonizedCode;

    @Column(name="PREFERENCE_CRIT")
    private String preferenceCrit;

    @Column(name="PRODUCER")
    private String producer;

    @Column(name="NET_COST")
    private String netCost;

    @Column(name="COUNTRY_OF_ORIGIN")
    private String countryOfOrigin;

    @Column(name="PACKING_CLASS")
    private String packingClass;

    @Column(name="ITEM_CATEGORY1")
    private String itemCategory1;

    @Column(name="ITEM_CATEGORY2")
    private String itemCategory2;

    @Column(name="ITEM_CATEGORY3")
    private String itemCategory3;

    @Column(name="ITEM_CATEGORY4")
    private String itemCategory4;

    @Column(name="ITEM_CATEGORY5")
    private String itemCategory5;

    @Column(name="ITEM_CATEGORY6")
    private String itemCategory6;

    @Column(name="ITEM_CATEGORY7")
    private String itemCategory7;

    @Column(name="ITEM_CATEGORY8")
    private String itemCategory8;

    @Column(name="ITEM_CATEGORY9")
    private String itemCategory9;

    @Column(name="ITEM_CATEGORY10")
    private String itemCategory10;

    @Column(name="ALTERNATE_ITEM")
    private String alternateItem;

    @Column(name="WEB_THUMBNAIL_IMG")
    private String webThumbnailImg;

    @Column(name="WEB_IMG")
    private String webImg;

    @Column(name="AVAILABLE_ON_WEB")
    private String availableOnWeb;

    @Column(name="IMMEDIATE_NEEDS_LOC_RULE")
    private String immediateNeedsLocRule;

    @Column(name="IMMEDIATE_NEEDS_ELIGIBLE")
    private String immediateNeedsEligible;

    @Column(name="INBOUND_QC_ELIGIBLE")
    private String inboundQcEligible;

    @Column(name="INBOUND_QC_LOC_RULE")
    private String inboundQcLocRule;

    @Column(name="INBOUND_QC_AMOUNT")
    private BigDecimal inboundQcAmount;

    @Column(name="INBOUND_QC_AMOUNT_TYPE")
    private String inboundQcAmountType;

    @Column(name="INBOUND_QC_UM")
    private String inboundQcUm;

    @Column(name="BOM_ACTION")
    private String bomAction;

    @Column(name="LONG_DESCRIPTION")
    private String longDescription;

    @Column(name="ACTIVE")
    private String active;

    @Column(name="EPC_COMPANY_PREFIX")
    private String epcCompanyPrefix;

    @Column(name="EPC_ITEM_REFERENCE")
    private String epcItemReference;

    @Column(name="SERIAL_NUM_TEMPLATE")
    private String serialNumTemplate;

    @Column(name="SERIAL_NUM_TRACKING")
    private BigDecimal serialNumTracking;

    @Column(name="FEDEX_XTN")
    private String fedexXtn;

    @Column(name="FEDEX_ITN")
    private String fedexItn;

    @Column(name="EPC_CAGE_CODE")
    private String epcCageCode;

    @Column(name="LOT_TEMPLATE")
    private String lotTemplate;

    @Column(name="DAYS_TO_EXPIRE")
    private BigDecimal daysToExpire;

    @Column(name="GTIN_ENABLED")
    private String gtinEnable;

    @Column(name="APP_IDENTIFIER")
    private String appIdentifier;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getInternalItemNum() {
        return internalItemNum;
    }

    public void setInternalItemNum(long internalItemNum) {
        this.internalItemNum = internalItemNum;
    }

    public String getLocatingRule() {
        return locatingRule;
    }

    public void setLocatingRule(String locatingRule) {
        this.locatingRule = locatingRule;
    }

    public String getAllocationRule() {
        return allocationRule;
    }

    public void setAllocationRule(String allocationRule) {
        this.allocationRule = allocationRule;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemTemplate() {
        return itemTemplate;
    }

    public void setItemTemplate(String itemTemplate) {
        this.itemTemplate = itemTemplate;
    }

    public String getTemplateField1() {
        return templateField1;
    }

    public void setTemplateField1(String templateField1) {
        this.templateField1 = templateField1;
    }

    public String getTemplateField2() {
        return templateField2;
    }

    public void setTemplateField2(String templateField2) {
        this.templateField2 = templateField2;
    }

    public String getTemplateField3() {
        return templateField3;
    }

    public void setTemplateField3(String templateField3) {
        this.templateField3 = templateField3;
    }

    public String getTemplateField4() {
        return templateField4;
    }

    public void setTemplateField4(String templateField4) {
        this.templateField4 = templateField4;
    }

    public String getTemplateField5() {
        return templateField5;
    }

    public void setTemplateField5(String templateField5) {
        this.templateField5 = templateField5;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public String getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle;
    }

    public String getNmfcCode() {
        return nmfcCode;
    }

    public void setNmfcCode(String nmfcCode) {
        this.nmfcCode = nmfcCode;
    }

    public String getLotControlled() {
        return lotControlled;
    }

    public void setLotControlled(String lotControlled) {
        this.lotControlled = lotControlled;
    }

    public String getCatchWeightReqd() {
        return catchWeightReqd;
    }

    public void setCatchWeightReqd(String catchWeightReqd) {
        this.catchWeightReqd = catchWeightReqd;
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

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public String getStorageTemplate() {
        return storageTemplate;
    }

    public void setStorageTemplate(String storageTemplate) {
        this.storageTemplate = storageTemplate;
    }

    public String getInventoryTracking() {
        return inventoryTracking;
    }

    public void setInventoryTracking(String inventoryTracking) {
        this.inventoryTracking = inventoryTracking;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }

    public String getPreferenceCrit() {
        return preferenceCrit;
    }

    public void setPreferenceCrit(String preferenceCrit) {
        this.preferenceCrit = preferenceCrit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNetCost() {
        return netCost;
    }

    public void setNetCost(String netCost) {
        this.netCost = netCost;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPackingClass() {
        return packingClass;
    }

    public void setPackingClass(String packingClass) {
        this.packingClass = packingClass;
    }

    public String getItemCategory1() {
        return itemCategory1;
    }

    public void setItemCategory1(String itemCategory1) {
        this.itemCategory1 = itemCategory1;
    }

    public String getItemCategory2() {
        return itemCategory2;
    }

    public void setItemCategory2(String itemCategory2) {
        this.itemCategory2 = itemCategory2;
    }

    public String getItemCategory3() {
        return itemCategory3;
    }

    public void setItemCategory3(String itemCategory3) {
        this.itemCategory3 = itemCategory3;
    }

    public String getItemCategory4() {
        return itemCategory4;
    }

    public void setItemCategory4(String itemCategory4) {
        this.itemCategory4 = itemCategory4;
    }

    public String getItemCategory5() {
        return itemCategory5;
    }

    public void setItemCategory5(String itemCategory5) {
        this.itemCategory5 = itemCategory5;
    }

    public String getItemCategory6() {
        return itemCategory6;
    }

    public void setItemCategory6(String itemCategory6) {
        this.itemCategory6 = itemCategory6;
    }

    public String getItemCategory7() {
        return itemCategory7;
    }

    public void setItemCategory7(String itemCategory7) {
        this.itemCategory7 = itemCategory7;
    }

    public String getItemCategory8() {
        return itemCategory8;
    }

    public void setItemCategory8(String itemCategory8) {
        this.itemCategory8 = itemCategory8;
    }

    public String getItemCategory9() {
        return itemCategory9;
    }

    public void setItemCategory9(String itemCategory9) {
        this.itemCategory9 = itemCategory9;
    }

    public String getItemCategory10() {
        return itemCategory10;
    }

    public void setItemCategory10(String itemCategory10) {
        this.itemCategory10 = itemCategory10;
    }

    public String getAlternateItem() {
        return alternateItem;
    }

    public void setAlternateItem(String alternateItem) {
        this.alternateItem = alternateItem;
    }

    public String getWebThumbnailImg() {
        return webThumbnailImg;
    }

    public void setWebThumbnailImg(String webThumbnailImg) {
        this.webThumbnailImg = webThumbnailImg;
    }

    public String getWebImg() {
        return webImg;
    }

    public void setWebImg(String webImg) {
        this.webImg = webImg;
    }

    public String getAvailableOnWeb() {
        return availableOnWeb;
    }

    public void setAvailableOnWeb(String availableOnWeb) {
        this.availableOnWeb = availableOnWeb;
    }

    public String getImmediateNeedsLocRule() {
        return immediateNeedsLocRule;
    }

    public void setImmediateNeedsLocRule(String immediateNeedsLocRule) {
        this.immediateNeedsLocRule = immediateNeedsLocRule;
    }

    public String getImmediateNeedsEligible() {
        return immediateNeedsEligible;
    }

    public void setImmediateNeedsEligible(String immediateNeedsEligible) {
        this.immediateNeedsEligible = immediateNeedsEligible;
    }

    public String getInboundQcEligible() {
        return inboundQcEligible;
    }

    public void setInboundQcEligible(String inboundQcEligible) {
        this.inboundQcEligible = inboundQcEligible;
    }

    public String getInboundQcLocRule() {
        return inboundQcLocRule;
    }

    public void setInboundQcLocRule(String inboundQcLocRule) {
        this.inboundQcLocRule = inboundQcLocRule;
    }

    public BigDecimal getInboundQcAmount() {
        return inboundQcAmount;
    }

    public void setInboundQcAmount(BigDecimal inboundQcAmount) {
        this.inboundQcAmount = inboundQcAmount;
    }

    public String getInboundQcAmountType() {
        return inboundQcAmountType;
    }

    public void setInboundQcAmountType(String inboundQcAmountType) {
        this.inboundQcAmountType = inboundQcAmountType;
    }

    public String getInboundQcUm() {
        return inboundQcUm;
    }

    public void setInboundQcUm(String inboundQcUm) {
        this.inboundQcUm = inboundQcUm;
    }

    public String getBomAction() {
        return bomAction;
    }

    public void setBomAction(String bomAction) {
        this.bomAction = bomAction;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getEpcCompanyPrefix() {
        return epcCompanyPrefix;
    }

    public void setEpcCompanyPrefix(String epcCompanyPrefix) {
        this.epcCompanyPrefix = epcCompanyPrefix;
    }

    public String getEpcItemReference() {
        return epcItemReference;
    }

    public void setEpcItemReference(String epcItemReference) {
        this.epcItemReference = epcItemReference;
    }

    public String getSerialNumTemplate() {
        return serialNumTemplate;
    }

    public void setSerialNumTemplate(String serialNumTemplate) {
        this.serialNumTemplate = serialNumTemplate;
    }

    public BigDecimal getSerialNumTracking() {
        return serialNumTracking;
    }

    public void setSerialNumTracking(BigDecimal serialNumTracking) {
        this.serialNumTracking = serialNumTracking;
    }

    public String getFedexXtn() {
        return fedexXtn;
    }

    public void setFedexXtn(String fedexXtn) {
        this.fedexXtn = fedexXtn;
    }

    public String getFedexItn() {
        return fedexItn;
    }

    public void setFedexItn(String fedexItn) {
        this.fedexItn = fedexItn;
    }

    public String getEpcCageCode() {
        return epcCageCode;
    }

    public void setEpcCageCode(String epcCageCode) {
        this.epcCageCode = epcCageCode;
    }

    public String getLotTemplate() {
        return lotTemplate;
    }

    public void setLotTemplate(String lotTemplate) {
        this.lotTemplate = lotTemplate;
    }

    public BigDecimal getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(BigDecimal daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    public String getGtinEnable() {
        return gtinEnable;
    }

    public void setGtinEnable(String gtinEnable) {
        this.gtinEnable = gtinEnable;
    }

    public String getAppIdentifier() {
        return appIdentifier;
    }

    public void setAppIdentifier(String appIdentifier) {
        this.appIdentifier = appIdentifier;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
