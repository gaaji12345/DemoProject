import entity.Man;
import entity.Owner;
import entity.Women;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class LazyFeching {
    public static void main(String[] args) {
//        Man man=new Man();
//        man.setMId("M001");
//        man.setName("Gaaji");
//
//        Women w1=new Women();
//        w1.setWid("W001");
//        w1.setName("Danu");
//        w1.setMan(man);
//
//        Women w2=new Women();
//        w2.setWid("W002");
//        w2.setName("Nisha");
//        w2.setMan(man);
//
//        man.getWomenList().add(w1);
//        man.getWomenList().add(w2);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

     //Lazy Fetching
        Owner o1=session.get(Owner.class,"0001");
        System.out.println(o1.getOId()+" "+o1.getName());

        System.out.println(o1.getPets());



        transaction.commit();
        session.close();

    }
}
