package com.demo.poc.creditcard.service.correct;

import com.demo.poc.creditcard.dto.CreditCardDTO;
import java.util.ArrayList;
import java.util.List;

public class InterestCalculatorStrategy {

  private final List<InterestCalculator> interestCalculators;

  public InterestCalculatorStrategy() {
    interestCalculators = new ArrayList<>();
    interestCalculators.add(new ClassicCardInterestCalculator());
    interestCalculators.add(new GoldCardInterestCalculator());
    interestCalculators.add(new PlatinumCardInterestCalculator());
  }

  public double calculate(CreditCardDTO creditCard) {
    return selectCalculator(creditCard.getType()).calculate(creditCard);
  }

  private InterestCalculator selectCalculator(String cardType) {
    for (InterestCalculator calculator: interestCalculators) {
      if(calculator.supports(cardType))
        return calculator;
    }
    throw new IllegalArgumentException("No such interest calculator strategy");
  }
}
