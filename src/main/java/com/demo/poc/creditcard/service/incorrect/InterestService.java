package com.demo.poc.creditcard.service.incorrect;

import com.demo.poc.creditcard.dto.CreditCardDTO;

/**
 * Cada vez que se añade un nuevo tipo de tarjeta, es necesario modificar el método calculateInterest,
 * lo que viola el principio de abierto/cerrado (OCP)
 */
public class InterestService {

  public double calculateInterest(CreditCardDTO creditCard) {
    if ("classic".equalsIgnoreCase(creditCard.getType()))
      return creditCard.getBalance() * 0.02;

    if ("gold".equalsIgnoreCase(creditCard.getType()))
      return creditCard.getBalance() * 0.015;

    if ("platinum".equalsIgnoreCase(creditCard.getType()))
      return creditCard.getBalance() * 0.01;

    throw new IllegalArgumentException("Unknown credit card type: " + creditCard.getType());
  }
}