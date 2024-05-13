package com.practice.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;
    @Id
    @Column(name="account_number")
    private Long accountNumber;
    private String accountType;
    private String branchAddress;

}
