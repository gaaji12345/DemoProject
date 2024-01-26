import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Get {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.setId("C001");
     //   c1.setName("gaaji");
        c1.setAddress("gaale");
        c1.setTel(712304934);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
     Customer c=  session.get(Customer.class,"C001");//get C001 Ob
        //System.out.println(c); get All info

        //* get one by one
        System.out.println(c.getAddress());
        System.out.println(c.getId());
        System.out.println(c.getTel());


        transaction.commit();
        session.close();
    }
}
