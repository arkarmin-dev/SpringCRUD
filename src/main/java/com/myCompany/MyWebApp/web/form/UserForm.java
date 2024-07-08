package com.myCompany.MyWebApp.web.form;

import com.myCompany.MyWebApp.persistance.entity.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public UserForm(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }
}
