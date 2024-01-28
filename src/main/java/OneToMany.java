import entity.Owner;
import entity.Pet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class OneToMany {
    public static void main(String[] args) {

        Owner o1=new Owner();
        o1.setOId("OOO1");
        o1.setName("Maaji");

        Pet p1=new Pet();
        p1.setPId("P001");
        p1.setName("Fisha");

        Pet p2=new Pet();
        p2.setPId("P002");
        p2.setName("Misha");

        p1.setOwner(o1);
        p2.setOwner(o1);

        //1st methology
        ArrayList<Pet> petArrayList=new ArrayList<>();
        petArrayList.add(p1);
        petArrayList.add(p2);

        o1.setPets(petArrayList);






        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

          session.save(o1);
          session.save(p1);
          session.save(p2);

        transaction.commit();
        session.close();
    }
}
