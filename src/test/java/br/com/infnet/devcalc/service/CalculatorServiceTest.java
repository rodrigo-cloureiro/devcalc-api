package br.com.infnet.devcalc.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        this.calculatorService = new CalculatorService();
    }

    @AfterEach
    public void tearDown() {
        if (this.calculatorService != null) {
            this.calculatorService = null;
        }
    }

    // TODO - implementar testes em situações "sem sucesso" para os testes abaixo
    @ParameterizedTest
    @DisplayName("Deve realizar operação de adição com sucesso")
    @CsvSource({
            "3, 2, 5",
            "10, 2, 12",
            "1, 2, 3",
            "10, 10, 20",
            "10, -5, 5"
    })
    public void addSuccess(BigDecimal a, BigDecimal b, BigDecimal expected) {
        BigDecimal result = this.calculatorService.add(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Deve realizar operação de subtração com sucesso")
    @CsvSource({
            "3, 2, 1",
            "10, 2, 8",
            "1, 2, -1",
            "10, 10, 0",
            "10, -5, 15"
    })
    public void subtractSuccess(BigDecimal a, BigDecimal b, BigDecimal expected) {
        BigDecimal result = this.calculatorService.subtract(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Deve realizar operação de multiplicação com sucesso")
    @CsvSource({
            "3, 2, 6",
            "10, 2, 20",
            "1, 2, 2",
            "10, 10, 100",
            "10, -5, -50"
    })
    public void multiplySuccess(BigDecimal a, BigDecimal b, BigDecimal expected) {
        BigDecimal result = this.calculatorService.multiply(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Deve realizar operação de divisão com sucesso")
    @CsvSource({
            "3, 2, 1.50",
            "10, 2, 5.00",
            "1, 2, 0.50",
            "10, 10, 1.00",
            "10, -5, -2.00"
    })
    public void divideSuccess(BigDecimal a, BigDecimal b, BigDecimal expected) {
        BigDecimal result = this.calculatorService.divide(a, b);
        assertEquals(expected, result);
    }
}
