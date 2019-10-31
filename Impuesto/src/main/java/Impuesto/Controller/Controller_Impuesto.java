package Impuesto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import Impuesto.CalcularImpuesto;

@Controller
public class Controller_Impuesto {
	
	@GetMapping("/login")
	public String index(Model model) 
	{		
	    return "login";
	}
	
	@PostMapping("/login")
    public ModelAndView greetingSubmit(@ModelAttribute("datoUno_IVA") int datoUno_IVA, @ModelAttribute("datoDos_IVA") int datoDos_IVA, @ModelAttribute("datoUno_Bruto") int datoUno_Bruto, @ModelAttribute("datoDos_Bruto") int datoDos_Bruto) 
	{		
		ModelAndView modelView = new ModelAndView("calcular");	
		
		CalcularImpuesto.CalculoImpuesto(datoUno_IVA, datoDos_IVA, datoUno_Bruto, datoDos_Bruto);
		
		double resultadoBruto = CalcularImpuesto.getResultadoBruto();
		double resultadoIVA = CalcularImpuesto.getResultadoIVA();
		
		modelView.addObject("resultadoBruto", resultadoBruto);
		modelView.addObject("resultadoIVA", resultadoIVA);
		modelView.addObject("datoUno_IVA", datoUno_IVA);
		modelView.addObject("datoDos_IVA", datoDos_IVA);
		modelView.addObject("datoUno_Bruto", datoUno_Bruto);
		modelView.addObject("datoDos_Bruto", datoDos_Bruto);
		
		return modelView;		
    }
	
	@GetMapping("/calcular")
    public ModelAndView greetingCalcular(ModelAndView model) 
	{	
		return model;	
    }
}
