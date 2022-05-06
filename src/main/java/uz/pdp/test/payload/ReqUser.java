package uz.pdp.test.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqUser {
    private  String firstName;
    private  String lastName;
    private String fullName;
    private String password;

}
