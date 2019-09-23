package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name="ITEM_UNIT_OF_MEASURE")
public class ItemUnitOfMeasure {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="INTERNAL_ITEM_UM")
    private long internalItemUm;

    @Column(name = "ITEM")
    private String item;
/*
    @OneToMany
    private List<Company> company;*/
    @Column(name = "COMPANY")
    private String company;

    @Column(name="CONVERSION_QTY")
    private BigDecimal conversionQty;

    @Column(name="DATE_TIME_STAMP")
    private Timestamp dateTimeStamp;

    @Column(name="DIMENSION_UM")
    private String dimensionUm;

    @Column(name="EPC_PACKAGE_ID")
    private BigDecimal epcPackageId;

    @Column(name="HEIGHT")
    private BigDecimal height;

    @Column(name="ITEM_CLASS")
    private String itemClass;

    @Column(name="[LENGTH]")
    private BigDecimal length;

    @Column(name="MOVEMENT_CLS")
    private String movementCls;

    @Column(name="PROCESS_STAMP")
    private String processStamp;

    @Column(name="QUANTITY_UM")
    private String quantityUm;

    @Column(name="[SEQUENCE]")
    private BigDecimal sequence;

    @Column(name="SLOTTING_ID")
    private String slottingId;

    @Column(name="SLOTTING_PALLET_HI")
    private BigDecimal slottingPalletHi;

    @Column(name="SLOTTING_PALLET_TI")
    private BigDecimal slottingPalletTi;

    @Column(name="TREAT_AS_LOOSE")
    private String treatAsLoose;

    @Column(name="TREAT_FULL_PCT")
    private BigDecimal treatFullPct;

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

    @Column(name="WEIGHT")
    private BigDecimal weight;

    @Column(name="WEIGHT_UM")
    private String weightUm;

    @Column(name="WIDTH")
    private BigDecimal width;


//    @JoinColumns({
//            @JoinColumn(
//                    name = "item",
//                    referencedColumnName = "item"),
//            @JoinColumn(
//                    name = "company",
//                    referencedColumnName = "company")
//    })
//    @JoinColumn(name = "item", referencedColumnName = "item")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Item item;
//
//    @JoinColumn(name = "company", referencedColumnName = "company")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Company company;


//    @Column(name="COMPANY")
//    private String company;


//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }

//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }

    //bi-directional many-to-one association to Item
  /*  @ManyToOne
    @JoinColumn(name="ITEM", referencedColumnName="ITEM")
    private Item itemBean;*/

    public ItemUnitOfMeasure() {
    }

    public long getInternalItemUm() {
        return this.internalItemUm;
    }

    public void setInternalItemUm(long internalItemUm) {
        this.internalItemUm = internalItemUm;
    }

/*    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }*/

    public BigDecimal getConversionQty() {
        return this.conversionQty;
    }

    public void setConversionQty(BigDecimal conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Timestamp getDateTimeStamp() {
        return this.dateTimeStamp;
    }

    public void setDateTimeStamp(Timestamp dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getDimensionUm() {
        return this.dimensionUm;
    }

    public void setDimensionUm(String dimensionUm) {
        this.dimensionUm = dimensionUm;
    }

    public BigDecimal getEpcPackageId() {
        return this.epcPackageId;
    }

    public void setEpcPackageId(BigDecimal epcPackageId) {
        this.epcPackageId = epcPackageId;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getItemClass() {
        return this.itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public BigDecimal getLength() {
        return this.length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Object getMovementCls() {
        return this.movementCls;
    }

    public void setMovementCls(String movementCls) {
        this.movementCls = movementCls;
    }

    public Object getProcessStamp() {
        return this.processStamp;
    }

    public void setProcessStamp(String processStamp) {
        this.processStamp = processStamp;
    }

    public String getQuantityUm() {
        return this.quantityUm;
    }

    public void setQuantityUm(String quantityUm) {
        this.quantityUm = quantityUm;
    }

    public BigDecimal getSequence() {
        return this.sequence;
    }

    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    public String getSlottingId() {
        return this.slottingId;
    }

    public void setSlottingId(String slottingId) {
        this.slottingId = slottingId;
    }

    public BigDecimal getSlottingPalletHi() {
        return this.slottingPalletHi;
    }

    public void setSlottingPalletHi(BigDecimal slottingPalletHi) {
        this.slottingPalletHi = slottingPalletHi;
    }

    public BigDecimal getSlottingPalletTi() {
        return this.slottingPalletTi;
    }

    public void setSlottingPalletTi(BigDecimal slottingPalletTi) {
        this.slottingPalletTi = slottingPalletTi;
    }

    public String getTreatAsLoose() {
        return this.treatAsLoose;
    }

    public void setTreatAsLoose(String treatAsLoose) {
        this.treatAsLoose = treatAsLoose;
    }

    public BigDecimal getTreatFullPct() {
        return this.treatFullPct;
    }

    public void setTreatFullPct(BigDecimal treatFullPct) {
        this.treatFullPct = treatFullPct;
    }

    public String getUserDef1() {
        return this.userDef1;
    }

    public void setUserDef1(String userDef1) {
        this.userDef1 = userDef1;
    }

    public String getUserDef2() {
        return this.userDef2;
    }

    public void setUserDef2(String userDef2) {
        this.userDef2 = userDef2;
    }

    public String getUserDef3() {
        return this.userDef3;
    }

    public void setUserDef3(String userDef3) {
        this.userDef3 = userDef3;
    }

    public String getUserDef4() {
        return this.userDef4;
    }

    public void setUserDef4(String userDef4) {
        this.userDef4 = userDef4;
    }

    public String getUserDef5() {
        return this.userDef5;
    }

    public void setUserDef5(String userDef5) {
        this.userDef5 = userDef5;
    }

    public String getUserDef6() {
        return this.userDef6;
    }

    public void setUserDef6(String userDef6) {
        this.userDef6 = userDef6;
    }

    public BigDecimal getUserDef7() {
        return this.userDef7;
    }

    public void setUserDef7(BigDecimal userDef7) {
        this.userDef7 = userDef7;
    }

    public BigDecimal getUserDef8() {
        return this.userDef8;
    }

    public void setUserDef8(BigDecimal userDef8) {
        this.userDef8 = userDef8;
    }

    public String getUserStamp() {
        return this.userStamp;
    }

    public void setUserStamp(String userStamp) {
        this.userStamp = userStamp;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getWeightUm() {
        return this.weightUm;
    }

    public void setWeightUm(String weightUm) {
        this.weightUm = weightUm;
    }

    public BigDecimal getWidth() {
        return this.width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "{"
                +
                "\"quantityUm\":\"" + quantityUm + '\"' +
                ",\"conversionQty\":" + conversionQty +
                ",\"treatAsLoose\":\"" + treatAsLoose + '\"' +
                ",\"length\":" + length +
                ",\"width\":" + width +
                ",\"height\":" + height +
                ",\"dimensionUm\":\"" + dimensionUm + '\"' +
                ",\"weight\":" + weight +
                ",\"weightUm\":\"" + weightUm + '\"' +
                '}';
    }

    /*    public Item getItemBean() {
        return this.itemBean;
    }

    public void setItemBean(Item itemBean) {
        this.itemBean = itemBean;
    }*/

}
