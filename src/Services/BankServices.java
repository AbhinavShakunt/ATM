/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Bank_Details;
import Models.ParentInterface;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author abhi-linux
 */

public class BankServices implements ParentInterface{
    
    public void setBankMap() {
        ses.beginTransaction();
        Query query = ses.createQuery("from Bank_Details where status=1");
        List<Bank_Details> bankList = query.list();
        for (Bank_Details bank : bankList) {
            bankMap.put(bank.getId(), bank);
        }
        ses.getTransaction().commit();
    }
    
}
