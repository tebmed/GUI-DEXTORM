package fr.pantheonsorbonne.cri.entities;


import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="report")
public class Report implements Serializable{

    //Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int report_id;
    private Exigence req;
    private DefectType dt;


    //Contructors

    public Report() {
    }

    public Report(int report_id, Exigence req, DefectType dt) {
        this.report_id = report_id;
        this.req = req;
        this.dt = dt;
    }

    //Getters & setters
    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public Exigence getReq() {
        return req;
    }

    public void setReq(Exigence req) {
        this.req = req;
    }

    public DefectType getDt() {
        return dt;
    }

    public void setDt(DefectType dt) {
        this.dt = dt;
    }

}
