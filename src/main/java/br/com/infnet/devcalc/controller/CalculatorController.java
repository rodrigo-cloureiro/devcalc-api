package br.com.infnet.devcalc.controller;

import br.com.infnet.devcalc.model.dto.OperationRequest;
import br.com.infnet.devcalc.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/add")
    public void add(OperationRequest request) {
        System.out.println(this.calculatorService.add(request.getA(), request.getB()));
    }

    @GetMapping("/subtract")
    public void subtract(OperationRequest request) {
        System.out.println(this.calculatorService.subtract(request.getA(), request.getB()));
    }

    @GetMapping("/multiply")
    public void multiply(OperationRequest request) {
        System.out.println(this.calculatorService.multiply(request.getA(), request.getB()));
    }

    @GetMapping("/divide")
    public void divide(OperationRequest request) {
        System.out.println(this.calculatorService.divide(request.getA(), request.getB()));
    }
}
