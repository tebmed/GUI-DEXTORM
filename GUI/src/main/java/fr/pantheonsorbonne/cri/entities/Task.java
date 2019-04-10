package fr.pantheonsorbonne.cri.entities;

import java.util.ArrayList;
import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import fr.pantheonsorbonne.cri.entities.Verifier;

@Entity
@Table(name="task")
@EntityListeners(AuditingEntityListener.class)
public class  Task implements Serializable{

     //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private  int task_id;
     private Verifier tester;
     private ArrayList<Report> reports;


    //Contructors
    public Task() {

    }
    public Task(Verifier tester, ArrayList<Report> reports) {
        this.tester = tester;
        this.reports = reports;
    }

    //Getters & setters

    public Verifier getTester() {
        return tester;
    }

    public void setTester(Verifier tester) {
        this.tester = tester;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }
}