package com.aktas.selcuk.customer.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;






@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name="ADI", length = 100)
    @NotNull(message = "Must be not null")
    @Size(min=3)
    private String name;

    @NotBlank(message = "Must be not blank")
    @Column(name="SOYADI", length = 100)
    private String surname;


}
