package com.fpiceno.portal.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.dao.UserDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.entity.UserInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})
public class UsuarioEntitySqlTest {
	@Autowired
	UserDaoCRUD dao;
	@Test
	public void testAgrega() {
		UserInfo usuario= new UserInfo();
		
		usuario.setCountry("mexico");
		short s = 1;
		usuario.setEnabled(s);
		usuario.setFullName("fabian piceno");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode("fa7730"));
		usuario.setRole("ROLE_ADMIN");
		usuario.setUsername("fpiceno");
		
//		Integer id;
//	
//		assertNotNull(id=dao.Agrega(usuario));
//		System.out.println("identificador ********************-----------***********" +id);
		dao.Agrega(usuario);
	}

	@Test
	public void testActualiza() {
		fail("Not yet implemented");
	}

	@Test
	public void testElimina() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenTodos() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenById() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenByName() {
		fail("Not yet implemented");
	}

}
