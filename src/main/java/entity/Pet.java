package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "pet")
public class Pet {
    @Id
    private String pId;
    private String name;
    @ManyToOne// pet kiyana eke wenama coloumn ekak hadenwa
    private Owner owner;

}
