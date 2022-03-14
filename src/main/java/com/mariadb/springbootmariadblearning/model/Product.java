package com.mariadb.springbootmariadblearning.model;

import com.mariadb.springbootmariadblearning.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "product_mariadb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String firstName;

    String lastName;

    @Enumerated(EnumType.STRING)
     Gender gender;

    @Column(length = 11)
    long identity;

}
