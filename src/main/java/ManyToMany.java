import entity.Lecture;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class ManyToMany {
    public static void main(String[] args) {

        Lecture l1=new Lecture();
        l1.setLecId("L001");
        l1.setName("Maaji");

        Lecture l2=new Lecture();
        l2.setLecId("L002");
        l2.setName("Saaji");

        Subject s1=new Subject();
        s1.setSubId("S001");
        s1.setSname("PRF");

        Subject s2=new Subject();
        s2.setSubId("S002");
        s2.setSname("ORM");

        //1st methology
      /*  ArrayList<Subject>subjectArrayList=new ArrayList<>();
        subjectArrayList.add(s1);
        subjectArrayList.add(s2);

        ArrayList<Lecture>lectureArrayList=new ArrayList<>();
        lectureArrayList.add(l1);
        lectureArrayList.add(l2);

        l1.setSubjectList(subjectArrayList);
        l2.setSubjectList(subjectArrayList);

        s1.setLectureList(lectureArrayList);
        s2.setLectureList(lectureArrayList);*/


        //2nd way
        l1.getSubjectList().add(s1);
        l1.getSubjectList().add(s2);

        s1.getLectureList().add(l1);
        s2.getLectureList().add(l1);






        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);


        transaction.commit();
        session.close();
    }
}
