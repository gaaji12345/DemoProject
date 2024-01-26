package embered;

import lombok.*;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Embeddable
public class Name {
   private String fname;
   private String sName;
   private String lName;

}
