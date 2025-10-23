package br.com.infnet.devcalc.model;

import lombok.*;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
@Setter
public class OperationResult {
    private final BigDecimal result;
    private final String operation;
}
