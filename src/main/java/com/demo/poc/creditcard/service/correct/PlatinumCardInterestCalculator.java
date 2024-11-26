package com.demo.poc.creditcard.service.correct;

import com.demo.poc.creditcard.dto.CreditCardDTO;

public class PlatinumCardInterestCalculator implements InterestCalculator {

  private static final String CARD_TYPE = "platinum";

  @Override
  public double calculate(CreditCardDTO creditCard) {
    return creditCard.getBalance() * 0.01;
  }

  @Override
  public boolean supports(String cardType) {
    return CARD_TYPE.equalsIgnoreCase(cardType);
  }
}
