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

        //1st methology from for fecthing data from table
//      Man man=session.get(Man.class,"M001"); //query has exectued
//       System.out.println(man.getMId());

        //2nd methology from for fecthing data from table

        Man man1=session.load(Man.class,"M002");//query not exectued
        System.out.println(man1.getMId());



        transaction.commit();
        session.close();

    }
}
