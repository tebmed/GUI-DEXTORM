package fr.pantheonsorbonne.cri.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="report")
@EntityListeners(AuditingEntityListener.class)
public class Feature implements Serializable{
	
	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String fc;
	private boolean fv;
	private Report report;
	
	
	//Contructor
	public Feature() {
		
	}
	   
	
	//Getters and Setters   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public boolean isFv() {
		return fv;
	}
	public void setFv(boolean fv) {
		this.fv = fv;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	
}
