package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "owner")
public class Owner {
    @Id
    private String oId;
    private String name;
    @OneToMany(mappedBy = "owner")// 1.metatin tamai owner_pet asscoiate table ekak hadnewa
                                 //mapped by use karama hadene na
    private List<Pet> pets=new ArrayList<>();

}
