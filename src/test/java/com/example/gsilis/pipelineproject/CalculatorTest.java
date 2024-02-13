package com.example.gsilis.pipelineproject;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Autowired
  private Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    assertEquals(5, calculator.sum(2, 3));
  }
}