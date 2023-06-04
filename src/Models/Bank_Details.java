/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author abhi-linux
 */
@Entity
public class Bank_Details {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String CNIC_number;
    private String cust_name;
    private String initial_deposit;
    
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNIC_number() {
        return CNIC_number;
    }

    public void setCNIC_number(String CNIC_number) {
        this.CNIC_number = CNIC_number;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInitial_deposit() {
        return initial_deposit;
    }

    public void setInitial_deposit(String initial_deposit) {
        this.initial_deposit = initial_deposit;
    }
    
    
    
}
