package com.example.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String sayHello(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        try {
            return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
        } catch (IllegalArgumentException e){
            return "Неверный запрос";
        }
    }
    @GetMapping(path = "/minus")
    public String difference(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        try {
            return num1 + " - " + num2 + " = " + calculatorService.difference(num1, num2);
        } catch (IllegalArgumentException e){
            return "Неверный запрос";
        }
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        try{
            return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        } catch (IllegalArgumentException e){
            return "Неверный запрос";
        }
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        try{
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        } catch (IllegalArgumentException e){
            return "Неверный запрос";
        }
    }
}

