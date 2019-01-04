package com.fpiceno.portal.controller;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.entity.TipoCalidad;
import com.fpiceno.portal.entity.UnidadMedida;
import com.fpiceno.portal.service.ProductoService;
import com.fpiceno.portal.dao.ProductoDao;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private  ProductoService servicio;
	@Autowired
	ProductoDao dao;
	
	@RequestMapping(value="/principal")
	public String home(ModelMap model, Authentication authentication) {
//		authentication.getPrincipal();
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
 		return "productoAdmin/adminProductos";
 	}
	@RequestMapping(value="/error")
	public String error() {
 		return "WEB-INF/secure/access-denied";
 	}
	
	@RequestMapping(value="/addProducto")
	public String addProducto(HttpServletRequest req){
		
		int uni=Integer.parseInt(req.getParameter("unidad"));
		int cal= Integer.parseInt(req.getParameter("calidad"));
		
		Producto producto= new Producto();
		producto.setId(12);
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre(req.getParameter("nombre"));
		producto.setObservaciones(req.getParameter("observacion"));
		producto.setTipoCalidad(TipoCalidad.values()[cal]);
		producto.setUnidad(UnidadMedida.values()[uni]);
		producto.setPrecio(Double.parseDouble(req.getParameter("precio")));
		
		dao.Agrega(producto);
		
		return "productoAdmin/adminProductos";
	}

}
