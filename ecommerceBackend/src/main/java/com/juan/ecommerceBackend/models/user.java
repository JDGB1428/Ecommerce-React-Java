package com.juan.ecommerceBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class user extends BaseEntity{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="role_id")
    private role role;

    @Column(name="nickname")
    private String nickname;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonIgnore
    @Column(name="password")
    @Getter @Setter
    private String password;
    @Column(name="correo")
    @Getter @Setter
    private String correo;
}
