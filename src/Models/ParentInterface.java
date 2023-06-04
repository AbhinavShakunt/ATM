package Models;


import Models.Bank_Details;
import Services.BankServices;
import java.util.LinkedHashMap;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public interface ParentInterface {

    public SessionFactory sf = getSessionFactory();
    public Session ses = sf.openSession();

    public BankServices bankService = new BankServices();

    public LinkedHashMap<Integer, Bank_Details> bankMap = new LinkedHashMap();

//    public PersonFrame personFrame = new PersonFrame();

    public static SessionFactory getSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

}
