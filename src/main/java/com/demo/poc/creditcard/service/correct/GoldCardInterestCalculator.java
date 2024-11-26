package com.demo.poc.creditcard.service.correct;

import com.demo.poc.creditcard.dto.CreditCardDTO;

public class GoldCardInterestCalculator implements InterestCalculator {

  private static final String CARD_TYPE = "gold";

  @Override
  public double calculate(CreditCardDTO creditCard) {
    return creditCard.getBalance() * 0.015;
  }

  @Override
  public boolean supports(String cardType) {
    return CARD_TYPE.equalsIgnoreCase(cardType);
  }
}
