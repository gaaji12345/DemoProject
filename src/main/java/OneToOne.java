import entity.Customer;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class OneToOne {
    public static void main(String[] args) {

        Student s2=new Student();
        s2.setSId("S002");
        s2.setName("MAAJI");

        Laptop l2=new Laptop();
        l2.setLId("L002");
        l2.setName("DellP");

        l2.setStudent(s2);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
         session.save(s2);
         session.save(l2);

        transaction.commit();
        session.close();
    }
}
