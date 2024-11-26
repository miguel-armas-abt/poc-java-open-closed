package com.demo.poc.creditcard.service.correct;

import com.demo.poc.creditcard.dto.CreditCardDTO;

/**
 * Añadir un nuevo tipo de tarjeta solo requiere crear una nueva clase que implemente esta interface.
 */
public interface InterestCalculator {

  double calculate(CreditCardDTO creditCard);

  boolean supports(String cardType);
}
