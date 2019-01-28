package com.fpiceno.portal.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.ClienteDao;
import com.fpiceno.portal.entity.Cliente;

public class ClienteDaoSqlTest {
	@Autowired
	ClienteDao dao;

	@Test
	public void testAgrega() {
		Cliente cliente=new Cliente();
		cliente.setCorreo("skitrock@hotmail.com");
		cliente.setDomicilio("Isla socorro 663");
		cliente.setNombreComercial("fruteria Panchita");
		cliente.setTelefono("31446792");
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
