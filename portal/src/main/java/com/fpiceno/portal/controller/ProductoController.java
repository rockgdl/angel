package com.fpiceno.portal.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;








import com.fpiceno.portal.bl.PropiedadesPortal;
import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.entity.TipoCalidad;
import com.fpiceno.portal.entity.TipoProducto;
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
	public String home(ModelMap model) {
//		authentication.getPrincipal();
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
		model.addAttribute("tipos", TipoProducto.values());
 		return "adminProductos";
 	}
	@RequestMapping(value="/deleteProducto")
	public String eliminarProducto(ModelMap model, @RequestParam("id") Integer id ) {
		
		System.out.println("metodo de eliminar con el id recibido "+ id);
		producto.setId(id);
		
		servicio.EliminarProducto(producto);
		
		
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
		model.addAttribute("tipos", TipoProducto.values());
		for(Producto p: servicio.getProducts())
		{
			System.out.println(p);
		}
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
			   @RequestParam(value="tipoCalidad",required = true) TipoCalidad calidad,
			   @RequestParam(value="unidad",required = true) UnidadMedida unidad,
			   @RequestParam(value="tipoProducto",required = true) TipoProducto tipoProducto
			   
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
		producto.setTipoProducto(tipoProducto);
		Integer id=servicio.agregarProducto(producto);
		model.addAttribute("id", id);
//		System.out.println("id agregado "+model.);
		
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
		model.addAttribute("tipos", TipoProducto.values());
		return "adminProductos";
	}
	@RequestMapping(value="/editProducto")
	public String editaProducto(ModelMap model, @RequestParam(value="nombreEdit",required = true) String nombre,
			@RequestParam(value="modificacion",required = false) String modificaion,
			@RequestParam(value="observacionEdit",required = false) String observaciones,
			@RequestParam(value="precioEdit",required = false) Double precio,
			@RequestParam(value="tipoCalidadEdit",required = false) TipoCalidad calidad,
			@RequestParam(value="unidadEdit",required = false) UnidadMedida unidad,
			@RequestParam(value="id",required = true) Integer id,
			@RequestParam(value="tipoProductoEdit",required = true) TipoProducto tipo,
			@RequestParam(value="fechaAltaEdit",required = true) String fechaAlta
			
			) 
			
	{
		System.out.println("parametros recibidos  nombre"+ nombre+" observacion: "+ observaciones+" precio: "+precio+" fecha alta:" +fechaAlta);
		producto.setFechaModificacion(new Date());
		producto.setNombre(nombre);
		producto.setObservaciones(observaciones);
		producto.setPrecio(precio);
		producto.setTipoCalidad(calidad);
		producto.setUnidad(unidad);
		producto.setTipoProducto(tipo);
		producto.setFechaModificacion(new Date());
//		FORMATO_FECHA_MYSQL
		SimpleDateFormat sdf= PropiedadesPortal.getFormatoFechaMysql();
		try {
			producto.setFechaAlta(sdf.parse(fechaAlta));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		producto.setFechaAlta(fechaAlta);
		
		producto.setId(id);
		
		servicio.ActualizaProducto(producto);
		model.addAttribute("id", id);
//		System.out.println("id agregado "+model.);
		
		
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
		model.addAttribute("calidades", TipoCalidad.values());
		model.addAttribute("medidas", UnidadMedida.values());
		model.addAttribute("tipos", TipoProducto.values());
		return "adminProductos";
	}
//	@RequestMapping(value="/error")
//	public String error() {
// 		return "access-denied";
// 	}

}
