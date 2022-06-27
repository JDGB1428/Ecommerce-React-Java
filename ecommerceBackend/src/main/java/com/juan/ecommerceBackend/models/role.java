package com.juan.ecommerceBackend.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="role")
public class role extends BaseEntity{
    @Column(name="nickname")
    @Getter @Setter
    private String nickname;

    @OneToMany(cascade = CascadeType.ALL
            , fetch = FetchType.EAGER, mappedBy = "role")

    @Getter @Setter
    private Set<permiso> permisos;
}
