package com.cg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalServiceTest {

    private CalculatorService service;

    @BeforeEach
    public void init(){
        ICalculator cal = Mockito.mock(ICalculator.class);
        service = new CalculatorService(cal);
        when(cal.calculate(20, 5)).thenReturn(25);
        // when(cal.calculate(20, 10)).thenReturn(30);
        when(cal.calculate(20, 10)).thenReturn(40);
    }

    @Test
    public void addServiceTest(){
        // assertEquals(25, service.addService(20, 5));
        // assertEquals(15, service.addService(20, 5));
        assertEquals(30, service.addService(20, 10));
    }
}
