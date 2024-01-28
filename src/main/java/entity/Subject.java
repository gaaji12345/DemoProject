package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "subject")
public class Subject {
    @Id
    private String subId;
    private String  sname;
    @ManyToMany(mappedBy = "subjectList")//1 lec_sub table ekak hdnwa
    private List<Lecture>lectureList=new ArrayList<>();

}
