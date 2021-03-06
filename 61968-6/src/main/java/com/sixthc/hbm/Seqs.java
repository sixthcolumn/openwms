package com.sixthc.hbm;
// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Seqs generated by hbm2java
 */
@Entity
@Table(name="seqs"
    
)
public class Seqs  implements java.io.Serializable {


     private SeqsId id;

    public Seqs() {
    }

    public Seqs(SeqsId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="seqName", column=@Column(name="seq_name", length=30) ), 
        @AttributeOverride(name="start", column=@Column(name="start") ), 
        @AttributeOverride(name="increment", column=@Column(name="increment") ), 
        @AttributeOverride(name="curval", column=@Column(name="curval") ), 
        @AttributeOverride(name="flag", column=@Column(name="flag", length=1) ) } )
    public SeqsId getId() {
        return this.id;
    }
    
    public void setId(SeqsId id) {
        this.id = id;
    }




}


