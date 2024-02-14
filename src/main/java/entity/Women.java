package entity;

import lombok.*;

import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Women {
    private String Wid;
    private String name;
    @ManyToOne
    private Man man;

}
