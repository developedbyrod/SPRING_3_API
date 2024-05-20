package com.example.spring_api.controllers;


import com.example.spring_api.services.MathService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{

        if(!MathService.isNumeric(numberOne) || !MathService.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        return MathService.convertToDouble(numberOne) + MathService.convertToDouble(numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!MathService.isNumeric(numberOne) || !MathService.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        return MathService.convertToDouble(numberOne) - MathService.convertToDouble(numberTwo);
    }

    @RequestMapping("/multiply/{numberOne}/{numberTwo}")
    public Double multiply(
            @PathVariable(name = "numberOne") String NumberOne,
            @PathVariable(name = "numberTwo") String NumberTwo
    ) throws Exception{
        if(!MathService.isNumeric(NumberOne) || !MathService.isNumeric(NumberTwo)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        return MathService.convertToDouble(NumberOne) * MathService.convertToDouble(NumberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        if(!MathService.isNumeric(numberOne) || !MathService.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        if(MathService.convertToDouble(numberTwo) == 0){
            throw new UnsupportedOperationException("Division by zero is not allowed.");
        }
        return MathService.convertToDouble(numberOne) / MathService.convertToDouble(numberTwo);
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        if(!MathService.isNumeric(numberOne) || !MathService.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        return (MathService.convertToDouble(numberOne) + MathService.convertToDouble(numberTwo)) / 2;
    }

    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable(name = "number") String number
    )throws  Exception{
        if (!MathService.isNumeric(number)){
            throw new UnsupportedOperationException("Please, use only numeric values.");
        }
        return Math.sqrt(MathService.convertToDouble(number));
    }
}
