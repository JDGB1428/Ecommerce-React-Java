package com.juan.ecommerceBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    @Column(name="nickname")
    private String nickname;
    @JsonIgnore
    @Column(name="password")
    private String password;
    @Column(name="correo")
    private String correo;
}
