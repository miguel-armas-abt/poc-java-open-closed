package com.demo.poc.creditcard.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardDTO {

  private String type;
  private double balance;
}