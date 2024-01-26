import embered.Name;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Frist {
    public static void main(String[] args) {

        Name name=new Name();
        name.setFname("y");
        name.setSName("gaaji");
        name.setLName("bro");

        Customer c1=new Customer();
        c1.setId("C001");
        c1.setName(name);
        c1.setAddress("gaale");
        c1.setTel(712304934);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
           session.save(c1);
        transaction.commit();
        session.close();
    }
}
