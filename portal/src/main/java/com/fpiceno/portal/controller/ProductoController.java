package com.fpiceno.portal.controller;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.service.ProductoService;
import com.fpiceno.portal.dao.ProductoDao;

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
 		return "productoAdmin/adminProductos";
 	}
	
	@RequestMapping(value="/agregar")
	public String agregaProducto(ModelMap model, @RequestParam(value="nombre",required = false) String nombre,
			   @RequestParam(value="modificacion",required = false) String modificaion,
			   @RequestParam(value="observacion",required = false) String observaciones,
			   @RequestParam(value="precio",required = false) Double precio) 
			  
	{
		System.out.println("parametros recibidos  modificacion"+ modificaion+" observacin: "+ observaciones+" precio: "+precio);
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre(nombre);
		producto.setObservaciones(observaciones);
		producto.setPrecio(precio);
//		producto.setTipoCalidad(tipoCalidad);
//		producto.setUnidad(unidad);
		model.addAttribute("id", servicio.agregarProducto(producto));
//		System.out.println("id agregado "+model.);
		
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		return "adminProductos";
	}
//	@RequestMapping(value="/error")
//	public String error() {
// 		return "access-denied";
// 	}

}
