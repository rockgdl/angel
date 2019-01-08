package com.fpiceno.portal.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.dao.mysql.ProductoDaoSql;
import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.entity.TipoCalidad;
import com.fpiceno.portal.entity.UnidadMedida;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})

public class ProductoDaoSqlTest {

	@Autowired
	ProductoDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgrega() {
		
		Producto producto= new Producto();
		producto.setId(12);
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("jicama");
		producto.setObservaciones("test 3");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(12.00);
		
//		ProductoDao dao=new ProductoDaoSql();
		Integer id;
		assertNotNull( id=dao.Agrega(producto));
		System.out.println("identificador ********************-----------***********" +id);
	}

	@Test
	public void testActualiza() {
//		Producto producto= new Producto();
//		producto.setId(1);
//		producto.setFechaAlta(new Date());
//		producto.setFechaModificacion(new Date());
//		producto.setNombre("aguacate1");
//		producto.setObservaciones("observacione1s");
//		producto.setTipoCalidad(TipoCalidad.STANDAR);
//		producto.setUnidad(UnidadMedida.KG);
//		producto.setPrecio(10.22);
//		
//		ProductoDao dao=new ProductoDaoSql();
//		dao.Actualiza(producto);
//		System.out.println(producto);
	}

	@Test
	public void testElimina() {
		Producto producto= new Producto();
		producto.setId(19);
		
//		ProductoDao dao=new ProductoDaoSql();
		dao.Elimina(producto);
		System.out.println(producto);
	}

	@Test
	public void testObtenTodos() {

//		Producto producto= new Producto();
//		List<Producto> productos=new ArrayList<Producto>();
//		
////		ProductoDao dao=new ProductoDaoSql();
//		productos=dao.obtenTodos();
//		
//		for(Producto p:productos)
//		{
//			System.out.println(p);
//		}
	}
//		System.out.println(producto);}

	@Test
	public void testObtenById() {

//		Producto producto= new Producto();
//		producto.setFechaAlta(new Date());
//		producto.setFechaModificacion(new Date());
//		producto.setNombre("aguacate");
//		producto.setObservaciones("observaciones");
//		producto.setTipoCalidad(TipoCalidad.STANDAR);
//		producto.setUnidad(UnidadMedida.KG);
//		producto.setPrecio(10.22);
//		
////		ProductoDao dao=new ProductoDaoSql();
//		Integer id=dao.Agrega(producto);
//		System.out.println(producto);
		
	}

	@Test
	public void testObtenByName() {

//		Producto producto= new Producto();
//		producto.setFechaAlta(new Date());
//		producto.setFechaModificacion(new Date());
//		producto.setNombre("aguacate");
//		producto.setObservaciones("observaciones");
//		producto.setTipoCalidad(TipoCalidad.STANDAR);
//		producto.setUnidad(UnidadMedida.KG);
//		producto.setPrecio(10.22);
//		
////		ProductoDao dao=new ProductoDaoSql();
//		Integer id=dao.Agrega(producto);
//		System.out.println(producto);
		
	}



}
