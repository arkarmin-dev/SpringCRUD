package com.myCompany.MyWebApp.persistance.entity;

import com.myCompany.MyWebApp.web.form.UserForm;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(length = 15, nullable = false)
    private String password;

    @Column(length = 45, nullable = false, name = "first_name")
    private String firstName;

    @Column(length = 45, nullable = false, name = "last_name")
    private String lastName;

    public User(UserForm userForm) {
        this.id = userForm.getId();
        this.email = userForm.getEmail();
        this.password = userForm.getPassword();
        this.firstName = userForm.getFirstName();
        this.lastName = userForm.getLastName();
    }
}
