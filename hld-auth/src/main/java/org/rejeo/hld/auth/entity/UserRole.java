package org.rejeo.hld.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private Role role = Role.USER;
}