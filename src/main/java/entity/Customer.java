package entity;

import embered.Name;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "customer_detail")//change entity name
public class Customer {
    @Id
    private String id;
    @Column(name = "customer_name")//change coloumn name
    private Name name;
    private   String address;

    private int tel;
}
