package com.fpiceno.portal.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.metadata.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	 
//	@RequestMapping(value="/principal")
//	public String home(ModelMap model) {
////		authentication.getPrincipal();
//		
//		model.addAttribute("productos", servicio.getProducts());
//		model.addAttribute("fecha", new Date());
//		model.addAttribute("calidades", TipoCalidad.values());
//		model.addAttribute("medidas", UnidadMedida.values());
//		model.addAttribute("tipos", TipoProducto.values());
// 		return "adminProductos";
// 	}
	
//	@RequestMapping(value = "/pages/{pageNumber}", method = RequestMethod.GET)
//	public String getRunbookPage(@PathVariable Integer pageNumber, Model model) {
//	    Page<Producto> page = servicioJpa.getDeploymentLog(pageNumber);
//
//	    int current = page.getNumber() + 1;
//	    int begin = Math.max(1, current - 5);
//	    int end = Math.min(begin + 10, page.getTotalPages());
//
//	    model.addAttribute("deploymentLog", page);
//	    model.addAttribute("beginIndex", begin);
//	    model.addAttribute("endIndex", end);
//	    model.addAttribute("currentIndex", current);
//
//	    return "productos";
//	}
	
	
	@RequestMapping(value="/principal/{page}" ,method=RequestMethod.GET)
	public String getProducts(ModelMap model,HttpServletRequest request, @PathVariable(name="page",required = false) String page) {

		System.out.println("entrando al page "+page);
		Producto producto=new Producto();
		Long records ;
		records=servicio.getCountProductos();
		
		PagedListHolder <Producto> productos =  new PagedListHolder<Producto>();
		if(page==null)
		{
			Integer limite=PropiedadesPortal.LIMITE;
			
			int total = (int) (records / limite);
			if (records > (total * limite)) {
				total = total + 1;
			}
			
		
			page="1";
			final int elementoInicial = (Integer.parseInt(page) * limite) - limite;

			System.out.println("numero de paginas que debe haber "+total+" numero de registros en la base de datos "+records);

			System.out.println("pagina en null");
		
			 List<Producto> usersList = servicio.getProductsPaginados(producto,elementoInicial,limite);
	            // Setting the source for PagedListHolder
	            productos.setSource(usersList);
	            productos.setPageSize(PropiedadesPortal.LIMITE);
	    	
	            // Setting PagedListHolder instance to session
//	            request.getSession().setAttribute("productos", productos);
	        	model.addAttribute("productos", productos);
//	        	model.
	        }else if(page.equals("prev")) {
	        	System.out.println("prev");
	            // get the user list from session
	            productos = (PagedListHolder<Producto>)request.getSession().getAttribute("productos");
	            // switch to previous page
	            productos.previousPage();
	        }else if(page.equals("next")) {
	        	System.out.println("next ");
	            productos = (PagedListHolder<Producto>)request.getSession().getAttribute("productos");
	            // switch to next page
	            productos.nextPage();
	        }else {
	        	System.out.println("pagina "+page);
	            int pageNum = Integer.parseInt(page);
	        	final int elementoInicial = (Integer.parseInt(page) * PropiedadesPortal.LIMITE) - PropiedadesPortal.LIMITE;
	        	System.out.println("elemento inicial de la consulta");
	       	 	List<Producto> usersList = servicio.getProductsPaginados(producto,elementoInicial,PropiedadesPortal.LIMITE);
	       	 	productos.setSource(usersList);
	            productos.setPageSize(PropiedadesPortal.LIMITE);

//	        	productos = (PagedListHolder<Producto>)request.getSession().getAttribute("productos");
	            // set the current page number
	            // page number starts from zero in PagedListHolder that's why subtracting 1
	            productos.setPage(pageNum - 1);
	            model.addAttribute("productos", productos);
	        }
	        
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
	public String agregaProducto(ModelMap model, @RequestParam(value="nombre",required = true) String nombre, @RequestParam(value="modificacion",required = false) String modificaion,
			   @RequestParam(value="observacion",required = false) String observaciones,@RequestParam(value="precio",required = true) Double precio,
			   @RequestParam(value="tipoCalidad",required = true) TipoCalidad calidad, @RequestParam(value="unidad",required = true) UnidadMedida unidad,
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
	
	@RequestMapping(value="/tema")
	public String tema() {
		return "../PlantillasMenu/Menu";
	}

}
