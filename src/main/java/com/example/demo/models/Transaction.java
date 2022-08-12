package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table (name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String concept;
    private float amount;
    private long id_employee;
    private long id_enterprice;
    private String createat;
    private String updateat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public long getId_employee() {
        return id_employee;
    }

    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }

    public long getId_enterprice() {
        return id_enterprice;
    }

    public void setId_enterprice(long id_enterprice) {
        this.id_enterprice = id_enterprice;
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public String getUpdateat() {
        return updateat;
    }

    public void setUpdateat(String updateat) {
        this.updateat = updateat;
    }
}
