package entity;

import lombok.*;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Man {
    private  String mId;
    private String name;
    @OneToMany(mappedBy = "man")
    private List<Women>womenList=new ArrayList<>();



}
