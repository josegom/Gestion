package gestion.gastos.presentacion;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GastosController {

	@RequestMapping({"/gastos.do"})
	  public String mostrarPaginaGastos(Map<String,Object> model,HttpServletRequest request){
			System.out.println("Entro en el controlador");
			
			return "tiles/gastos";
		}
}
