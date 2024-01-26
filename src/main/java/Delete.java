import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Delete {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.setId("C001");
        //c1.setName("gaaji");
        c1.setAddress("gaale");
        c1.setTel(712304934);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        //1st way
        session.delete(c1);

        //2nd way

     Customer c=session.get(Customer.class,"C002");
        session.delete(c);


        transaction.commit();
        session.close();
    }
}
