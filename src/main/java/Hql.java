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

       /* String hql="FROM Laptop l ORDER BY l.lId desc ";
        List<Laptop> list = session.createQuery(hql).list();
        for (Laptop l1: list
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());

        }*/

        //----Using name Parametter--//

       /* String name="Appple";
        String hql="FROM Laptop where name= :lp_name";
        Query query = session.createQuery(hql);
        query.setParameter("lp_name",name);
        List<Laptop> list = query.list();

        for (Laptop l1: list
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());

        }*/
        //UPDATE CLUASE->
          /*  String id="l003";
            String name="Apple";
            String hql="UPDATE Laptop  SET name= :l_name where lId = :lap_id";
        Query query = session.createQuery(hql);
        query.setParameter("l_name",name);
        query.setParameter("lap_id",id);

        int  raw = query.executeUpdate();
        System.out.println(raw >0 ?"HUREEE":"OOPS NO");*/

      /*  String id="l003";
        String hql="DELETE FROM Laptop WHERE lId= :lap_id";

        Query query = session.createQuery(hql);
        query.setParameter("lap_id",id);
        System.out.println(query.executeUpdate() >0 ?"DELLETED" :"OOPS NO");*/

        //--INER JOIN--//

        String hql="SELECT o.oId,o.name,p.pId,p.name FROM Owner o INNER JOIN Pet p ON  o.oId=p.owner";
        List <Object[]> list = session.createQuery(hql).list();
        for (Object[] obj: list
             ) {
            System.out.println(obj[0]+" "+obj[1]+""+obj[2]);


        }


        transaction.commit();
        session.close();
    }
}
