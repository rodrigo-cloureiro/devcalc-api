package br.com.infnet.devcalc.controller;

import br.com.infnet.devcalc.model.OperationResult;
import br.com.infnet.devcalc.model.dto.OperationRequest;
import br.com.infnet.devcalc.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    // TODO - implementar try-catch nos endpoints abaixo para não estourar exceção por valores inválidos para A e B
    @GetMapping("/add")
    public ResponseEntity<OperationResult> add(OperationRequest request) {
        BigDecimal result = this.calculatorService.add(request.getA(), request.getB());
        return ResponseEntity.status(HttpStatus.OK).body(new OperationResult(result, "Adição"));
    }

    @GetMapping("/subtract")
    public ResponseEntity<OperationResult> subtract(OperationRequest request) {
        BigDecimal result = this.calculatorService.subtract(request.getA(), request.getB());
        return ResponseEntity.status(HttpStatus.OK).body(new OperationResult(result, "Subtração"));
    }

    @GetMapping("/multiply")
    public ResponseEntity<OperationResult> multiply(OperationRequest request) {
        BigDecimal result = this.calculatorService.multiply(request.getA(), request.getB());
        return ResponseEntity.status(HttpStatus.OK).body(new OperationResult(result, "Multiplicação"));
    }

    @GetMapping("/divide")
    // TODO - implementar try-catch para não estourar exceção com divisão por zero
    public ResponseEntity<OperationResult> divide(OperationRequest request) {
        BigDecimal result = this.calculatorService.divide(request.getA(), request.getB());
        return ResponseEntity.status(HttpStatus.OK).body(new OperationResult(result, "Divisão"));
    }
}
