package com.sixthc.hbm;
// Generated May 31, 2015 2:36:12 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContactpersonOtherContactinfos generated by hbm2java
 */
@Entity
@Table(name="contactperson_other_contactinfos"
    ,catalog="wms"
)
public class ContactpersonOtherContactinfos  implements java.io.Serializable {


     private Integer id;
     private OtherContactinfo otherContactinfo;
     private Contactperson contactperson;

    public ContactpersonOtherContactinfos() {
    }

    public ContactpersonOtherContactinfos(OtherContactinfo otherContactinfo, Contactperson contactperson) {
       this.otherContactinfo = otherContactinfo;
       this.contactperson = contactperson;
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
    @JoinColumn(name="other_contactinfo_id", nullable=false)
    public OtherContactinfo getOtherContactinfo() {
        return this.otherContactinfo;
    }
    
    public void setOtherContactinfo(OtherContactinfo otherContactinfo) {
        this.otherContactinfo = otherContactinfo;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contactperson_id", nullable=false)
    public Contactperson getContactperson() {
        return this.contactperson;
    }
    
    public void setContactperson(Contactperson contactperson) {
        this.contactperson = contactperson;
    }




}


