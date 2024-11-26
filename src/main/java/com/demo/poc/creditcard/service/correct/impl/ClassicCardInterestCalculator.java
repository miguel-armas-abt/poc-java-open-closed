package com.demo.poc.creditcard.service.correct.impl;

import com.demo.poc.creditcard.dto.CreditCardDTO;
import com.demo.poc.creditcard.service.correct.InterestCalculator;

public class ClassicCardInterestCalculator implements InterestCalculator {

  private static final String CARD_TYPE = "classic";

  @Override
  public double calculate(CreditCardDTO creditCard) {
    return creditCard.getBalance() * 0.02;
  }

  @Override
  public boolean supports(String cardType) {
    return CARD_TYPE.equalsIgnoreCase(cardType);
  }

}
