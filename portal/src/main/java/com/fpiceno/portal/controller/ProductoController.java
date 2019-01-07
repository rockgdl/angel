package com.fpiceno.portal.controller;


import java.util.Date;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.entity.TipoCalidad;
import com.fpiceno.portal.entity.UnidadMedida;
import com.fpiceno.portal.service.ProductoService;

@Controller
@RequestMapping("/productos")
@Component
public class ProductoController  {
	
	@Autowired
	private  ProductoService servicio;
	@Autowired
	private Producto producto;
	 
	@RequestMapping(value="/principal")
	public String home(ModelMap model, Authentication authentication) {
//		authentication.getPrincipal();
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
 		return "adminProductos";
 	}
	
	@RequestMapping(value="/value")
	public String evaluar(){
		
		
		return "adminProductos";
	}
	
	@RequestMapping(value="/addProducto")
	public String agregaProducto(ModelMap model, @RequestParam(value="nombre",required = true) String nombre,
			   @RequestParam(value="modificacion",required = false) String modificaion,
			   @RequestParam(value="observacion",required = false) String observaciones,
			   @RequestParam(value="precio",required = true) Double precio,
			  // @RequestParam(value="unidad",required = false)String unidad,
			   @RequestParam(value="tipoCalidad",required = true) TipoCalidad calidad,
			   @RequestParam(value="unidad",required = true) UnidadMedida unidad
			) 
			  
	{
		System.out.println("parametros recibidos  modificacion"+ modificaion+" observacion: "+ observaciones+" precio: "+precio);
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre(nombre);
		producto.setObservaciones(observaciones);
		producto.setPrecio(precio);
		producto.setTipoCalidad(calidad);
		producto.setUnidad(unidad);
		Integer id=servicio.agregarProducto(producto);
		model.addAttribute("id", id);
//		System.out.println("id agregado "+model.);
		
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
		return "adminProductos";
	}
//	@RequestMapping(value="/error")
//	public String error() {
// 		return "access-denied";
// 	}

}
