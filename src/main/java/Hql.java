import entity.Laptop;
import entity.Lecture;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.List;

public class Hql {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //---HQL---USE--//

      /*  String hql="FROM Laptop ";
        Query query = session.createQuery(hql);
        List<Laptop>lplist=query.list();

        for (Laptop l1:lplist
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());
            System.out.println(l1);

        }*/
        //select sepecfied coloumn

       /* String hql="SELECT name FROM Laptop";
        Query query = session.createQuery(hql);
        List <String> namelist = query.list();

        for (String name:namelist
             ) {
            System.out.println(name);

        }*/
        //WHERE CLAUSE
       // String hql="FROM Laptop WHERE name LIKE 'D%'";

      //  Query query = session.createQuery(hql);
       // List<Laptop> list = query.list();
      /*  List<Laptop> list = session.createQuery(hql).list();
        for (Laptop l1: list
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());


        }*/
        //ORDER BY Cluase

        String hql="FROM Laptop l ORDER BY l.lId desc ";
        List<Laptop> list = session.createQuery(hql).list();
        for (Laptop l1: list
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());

        }


        transaction.commit();
        session.close();
    }
}
