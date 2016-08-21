package com.sixthc.hbm;
// Generated Aug 7, 2016 8:49:30 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MeterReadingSeq generated by hbm2java
 */
@Entity
@Table(name="meter_reading_seq"
    ,catalog="interop_dev"
)
public class MeterReadingSeq  implements java.io.Serializable {


     private Integer id;
     private Asset asset;
     private Date valueIntervalStart;
     private Date valueIntervalEnd;
     private Set<MeterReading> meterReadings = new HashSet<MeterReading>(0);

    public MeterReadingSeq() {
    }

    public MeterReadingSeq(Asset asset, Date valueIntervalStart, Date valueIntervalEnd, Set<MeterReading> meterReadings) {
       this.asset = asset;
       this.valueIntervalStart = valueIntervalStart;
       this.valueIntervalEnd = valueIntervalEnd;
       this.meterReadings = meterReadings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="asset_id")
    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="value_interval_start", length=19)
    public Date getValueIntervalStart() {
        return this.valueIntervalStart;
    }
    
    public void setValueIntervalStart(Date valueIntervalStart) {
        this.valueIntervalStart = valueIntervalStart;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="value_interval_end", length=19)
    public Date getValueIntervalEnd() {
        return this.valueIntervalEnd;
    }
    
    public void setValueIntervalEnd(Date valueIntervalEnd) {
        this.valueIntervalEnd = valueIntervalEnd;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="meterReadingSeq")
    public Set<MeterReading> getMeterReadings() {
        return this.meterReadings;
    }
    
    public void setMeterReadings(Set<MeterReading> meterReadings) {
        this.meterReadings = meterReadings;
    }




}


