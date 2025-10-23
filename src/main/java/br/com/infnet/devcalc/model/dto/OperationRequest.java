package br.com.infnet.devcalc.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
public class OperationRequest {
    private BigDecimal a;
    private BigDecimal b;
}
