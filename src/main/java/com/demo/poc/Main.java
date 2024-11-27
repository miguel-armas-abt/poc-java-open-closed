package com.demo.poc;

import com.demo.poc.creditcard.dto.CreditCardDTO;
import com.demo.poc.creditcard.service.correct.InterestCalculatorStrategy;
import com.demo.poc.creditcard.service.incorrect.InterestService;

public class Main {

  public static void main(String[] args) {
    CreditCardDTO creditCard = CreditCardDTO.builder()
        .balance(2500.00)
        .type("gold")
        .build();

    /**
     * Servicio con lógica centralizada
     */
    InterestService interestService = new InterestService();
    interestService.calculateInterest(creditCard);

    /**
     * Selector de estrategias desacopladas
     */
    InterestCalculatorStrategy strategy = new InterestCalculatorStrategy();
    strategy.calculateInterest(creditCard);
  }
}