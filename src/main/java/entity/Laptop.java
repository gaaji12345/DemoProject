package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Laptop {
    @Id
    private String lId;
    private String name;
    @OneToOne// put the relation
    private Student student;


}
