package gestion.gastos.presentacion.acceso;

import gestion.gastos.dominio.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/inicio.do")
public class Acceso {
	@RequestMapping(method=RequestMethod.GET) 
	public String mostrarPaginaGastos(Model modelo){
		System.out.println("Ejecutando Acceso");
		
		modelo.addAttribute(new Usuario());
		return "tiles/aceso";
	}
	@RequestMapping(value="/inicio.do/{usuario}", method=RequestMethod.POST)
	public String recuperar(Usuario usuario){
		System.out.println("recuperando usuario");
		System.out.println("nombre: "+usuario.getNombre());
		System.out.println("clave "+usuario.getClave());
		return "tiles/aceso";
		
	}
}
