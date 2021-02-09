/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sneha
 */
public class Account {
    private String bankname;
    private String bankroutingno;
    private String bankaccno;
    private String accbalance;
    private String acctype;

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankroutingno() {
        return bankroutingno;
    }

    public void setBankroutingno(String bankroutingno) {
        this.bankroutingno = bankroutingno;
    }

    public String getBankaccno() {
        return bankaccno;
    }

    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }

    public String getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(String accbalance) {
        this.accbalance = accbalance;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
    
}
