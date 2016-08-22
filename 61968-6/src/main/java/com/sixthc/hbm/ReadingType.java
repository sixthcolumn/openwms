package com.sixthc.hbm;
// Generated Aug 6, 2016 3:05:23 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ReadingType generated by hbm2java
 */
@Entity
@Table(name="reading_type"
)
public class ReadingType  implements java.io.Serializable {


     private int id;
     private Maintorder maintorder;
     private String mrid;
     private String accumulation;
     private String aggregate;
     private String commodity;
     private Double consumptionTier;
     private Double cpp;
     private String currency;
     private String flowDirection;
     private String macroPeriod;
     private String measurementKind;
     private String multiplier;
     private String phases;
     private Double tou;
     private String unit;
     private Double argumentDenom;
     private Double argumentNumer;
     private Double interHDenom;
     private Double interHNumer;
     private Set<ReadingTypeNames> readingTypeNameses = new HashSet<ReadingTypeNames>(0);

    public ReadingType() {
    }

	
    public ReadingType(int id) {
        this.id = id;
    }
    public ReadingType(int id, Maintorder maintorder, String mrid, String accumulation, String aggregate, String commodity, Double consumptionTier, Double cpp, String currency, String flowDirection, String macroPeriod, String measurementKind, String multiplier, String phases, Double tou, String unit, Double argumentDenom, Double argumentNumer, Double interHDenom, Double interHNumer, Set<ReadingTypeNames> readingTypeNameses) {
       this.id = id;
       this.maintorder = maintorder;
       this.mrid = mrid;
       this.accumulation = accumulation;
       this.aggregate = aggregate;
       this.commodity = commodity;
       this.consumptionTier = consumptionTier;
       this.cpp = cpp;
       this.currency = currency;
       this.flowDirection = flowDirection;
       this.macroPeriod = macroPeriod;
       this.measurementKind = measurementKind;
       this.multiplier = multiplier;
       this.phases = phases;
       this.tou = tou;
       this.unit = unit;
       this.argumentDenom = argumentDenom;
       this.argumentNumer = argumentNumer;
       this.interHDenom = interHDenom;
       this.interHNumer = interHNumer;
       this.readingTypeNameses = readingTypeNameses;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="maint_order_id")
    public Maintorder getMaintorder() {
        return this.maintorder;
    }
    
    public void setMaintorder(Maintorder maintorder) {
        this.maintorder = maintorder;
    }
    
    @Column(name="mrid")
    public String getMrid() {
        return this.mrid;
    }
    
    public void setMrid(String mrid) {
        this.mrid = mrid;
    }
    
    @Column(name="accumulation")
    public String getAccumulation() {
        return this.accumulation;
    }
    
    public void setAccumulation(String accumulation) {
        this.accumulation = accumulation;
    }
    
    @Column(name="aggregate")
    public String getAggregate() {
        return this.aggregate;
    }
    
    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }
    
    @Column(name="commodity")
    public String getCommodity() {
        return this.commodity;
    }
    
    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }
    
    @Column(name="consumption_tier", precision=22, scale=0)
    public Double getConsumptionTier() {
        return this.consumptionTier;
    }
    
    public void setConsumptionTier(Double consumptionTier) {
        this.consumptionTier = consumptionTier;
    }
    
    @Column(name="cpp", precision=22, scale=0)
    public Double getCpp() {
        return this.cpp;
    }
    
    public void setCpp(Double cpp) {
        this.cpp = cpp;
    }
    
    @Column(name="currency")
    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    @Column(name="flow_direction")
    public String getFlowDirection() {
        return this.flowDirection;
    }
    
    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }
    
    @Column(name="macro_period")
    public String getMacroPeriod() {
        return this.macroPeriod;
    }
    
    public void setMacroPeriod(String macroPeriod) {
        this.macroPeriod = macroPeriod;
    }
    
    @Column(name="measurement_kind")
    public String getMeasurementKind() {
        return this.measurementKind;
    }
    
    public void setMeasurementKind(String measurementKind) {
        this.measurementKind = measurementKind;
    }
    
    @Column(name="multiplier", length=100)
    public String getMultiplier() {
        return this.multiplier;
    }
    
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }
    
    @Column(name="phases", length=10)
    public String getPhases() {
        return this.phases;
    }
    
    public void setPhases(String phases) {
        this.phases = phases;
    }
    
    @Column(name="tou", precision=22, scale=0)
    public Double getTou() {
        return this.tou;
    }
    
    public void setTou(Double tou) {
        this.tou = tou;
    }
    
    @Column(name="unit")
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Column(name="argument_denom", precision=22, scale=0)
    public Double getArgumentDenom() {
        return this.argumentDenom;
    }
    
    public void setArgumentDenom(Double argumentDenom) {
        this.argumentDenom = argumentDenom;
    }
    
    @Column(name="argument_numer", precision=22, scale=0)
    public Double getArgumentNumer() {
        return this.argumentNumer;
    }
    
    public void setArgumentNumer(Double argumentNumer) {
        this.argumentNumer = argumentNumer;
    }
    
    @Column(name="inter_h_denom", precision=22, scale=0)
    public Double getInterHDenom() {
        return this.interHDenom;
    }
    
    public void setInterHDenom(Double interHDenom) {
        this.interHDenom = interHDenom;
    }
    
    @Column(name="inter_h_numer", precision=22, scale=0)
    public Double getInterHNumer() {
        return this.interHNumer;
    }
    
    public void setInterHNumer(Double interHNumer) {
        this.interHNumer = interHNumer;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="readingType")
    public Set<ReadingTypeNames> getReadingTypeNameses() {
        return this.readingTypeNameses;
    }
    
    public void setReadingTypeNameses(Set<ReadingTypeNames> readingTypeNameses) {
        this.readingTypeNameses = readingTypeNameses;
    }




}

