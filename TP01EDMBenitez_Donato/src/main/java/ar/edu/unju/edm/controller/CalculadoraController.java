package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {
	@Autowired
	Calculadora unaCalculadora;
	@GetMapping("/calculadora")
	public String getMenuCalculadora() {
	return("calculadora");
	}
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		double resultadoFinal = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoFinal", resultadoFinal);
		
		return modelView;
	}
	
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		double resultadoFinal = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoFinal", resultadoFinal);
		
		return modelView;
	}
	
	@GetMapping("/calculoMultiplicacion")
	public ModelAndView getCalculoMultiplicacion(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		double resultadoFinal = unaCalculadora.multiplicar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoFinal", resultadoFinal);
		
		return modelView;
	}
	@GetMapping("/calculoDivision")
	public ModelAndView getCalculoDivision(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		double resultadoFinal = unaCalculadora.dividir();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoFinal", resultadoFinal);
		
		return modelView;
	}
}