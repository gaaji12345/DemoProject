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
@Entity(name = "lecture")
public class Lecture {
    @Id
    private String LecId;
    private String name;
    @ManyToMany//1.sub_lec table ekaka hdnwa
    private List<Subject>subjectList=new ArrayList<>();
}
