package com.fpiceno.portal.test;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.entity.UserInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})

public class UserDaoSqlTest {
	@Autowired
	UserDaoCRUD dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgrega() {
		
		UserInfo user = new UserInfo();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		user.setUsername("Rock");
		user.setCountry("EUA");
		user.setEnabled((short)1);
		user.setFullName("Fabian Piceno");
		user.setPassword(encoder.encode("rock"));
		user.setRole("ROLE_USER");
		
		System.out.println(user);
		
		dao.Agrega(user);
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
		UserInfo user= new UserInfo();
		user.setUsername("Adan");
		
//		ProductoDao dao=new ProductoDaoSql();
		dao.Elimina(user);
		System.out.println(user);
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


}
