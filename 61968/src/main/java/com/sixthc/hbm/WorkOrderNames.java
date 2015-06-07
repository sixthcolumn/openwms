package com.sixthc.hbm;
// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * WorkOrderNames generated by hbm2java
 */
@Entity
@Table(name="work_order_names"
    ,catalog="wms"
)
public class WorkOrderNames  implements java.io.Serializable {
	private static Constraint con = new Constraint(WorkOrderNames.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrderNames.class);

     private Integer id;
     private Nametype nametype;
     private WorkOrder workOrder;
     private String name;

    public WorkOrderNames() {
    }

	
    public WorkOrderNames(WorkOrder workOrder, String name) {
        this.workOrder = workOrder;
        this.name = name;
    }
    public WorkOrderNames(Nametype nametype, WorkOrder workOrder, String name) {
       this.nametype = nametype;
       this.workOrder = workOrder;
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="name_type_id")
    public Nametype getNametype() {
        return this.nametype;
    }
    
    public void setNametype(Nametype nametype) {
        this.nametype = nametype;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="work_order_id", nullable=false)
    public WorkOrder getWorkOrder() {
        return this.workOrder;
    }
    
    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }
    
    @Column(name="name", nullable=false, length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
    	con.check("setName", name, false, 20);
        this.name = name;
    }




}

