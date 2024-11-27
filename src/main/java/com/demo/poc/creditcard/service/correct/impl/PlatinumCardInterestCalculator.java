package com.demo.poc.creditcard.service.correct.impl;

import com.demo.poc.creditcard.dto.CreditCardDTO;
import com.demo.poc.creditcard.service.correct.InterestCalculator;

public class PlatinumCardInterestCalculator implements InterestCalculator {

  private static final String CARD_TYPE = "platinum";

  @Override
  public double calculateInterest(CreditCardDTO creditCard) {
    return creditCard.getBalance() * 0.01;
  }

  @Override
  public boolean supports(String cardType) {
    return CARD_TYPE.equalsIgnoreCase(cardType);
  }
}
