package com.fpiceno.portal.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fpiceno.portal.dao.PedidosDao;
import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.entity.Pedidos;
import com.fpiceno.portal.entity.Producto;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})
public class PedidosDaoTestSql {
	
	@Autowired
	PedidosDao dao;
	@Autowired
	ProductoDao daoProducto;

	@Test
	public void testAgrega() {
		Pedidos pedidos=new Pedidos();
		
		pedidos.setActivo(0);
		pedidos.setFechaAlta(new Date());
		pedidos.setFechaModificacion(new Date());
//		pedidos.setNumPedido(4);
		List<Producto> productos= new ArrayList<Producto>();
		productos=daoProducto.obtenTodos();
		Set <Producto>setProduct= new HashSet<Producto>(productos);
//		Producto producto=new Producto();
//		producto.setFechaAlta(new Date());
//		producto.setNombre("test nuevo producto");
//		producto.setObservaciones("nueva observacion");
//		setProduct.add(producto);
		
		pedidos.setProductos(setProduct);
		Integer id=dao.Agrega(pedidos);
		System.out.println("pedido generado con el siguiente id: "+id);
	
	}

	@Test
	public void testActualiza() {
		Pedidos pedidos=new Pedidos();
		pedidos.setActivo(1);
		pedidos.setFechaAlta(new Date());
		pedidos.setFechaModificacion(new Date());
		pedidos.setNumPedido(7);
		Producto producto=new Producto();
		producto.setId(4);
		List<Producto>productos=new ArrayList<Producto>();
		productos.add(producto);
		Set <Producto>setProduct= new HashSet<Producto>(productos);
		pedidos.setProductos(setProduct);
		dao.Actualiza(pedidos);
	}

	@Test
	public void testElimina() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenTodos() {
		Pedidos pedidos=new Pedidos();
//		pedidos.setNumPedido(1);
		for( Pedidos p:dao.obtenTodos())
		{
			System.out.println(p);
		}
	
	}

	@Test
	public void testObtenById() {
		Pedidos pedidos=new Pedidos();
//		pedidos.setNumPedido(1);
	
		System.out.println(dao.obtenById(5));
	
	}

	@Test
	public void testObtenByName() {
		fail("Not yet implemented");
	}

}
