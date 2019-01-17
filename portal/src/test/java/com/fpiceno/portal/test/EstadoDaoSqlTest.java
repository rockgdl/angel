package com.fpiceno.portal.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fpiceno.portal.dao.EstadoDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.dao.mysql.EstadoDaoSql;
import com.fpiceno.portal.entity.Estado;
import com.fpiceno.portal.entity.Estatus;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})
public class EstadoDaoSqlTest {
	@Autowired
	EstadoDao dao;
	@Test
	public void testAgrega() {
		Estado estado1=new Estado();
		estado1.setCodigo("2244");
		estado1.setEstado("Jalisco");
		estado1.setEstatus(Estatus.ACTIVO);
		Estado estado=new Estado();
		estado.setCodigo("134");
		estado.setEstado("Nayarit");
		estado.setEstatus(Estatus.ACTIVO);
		
		Integer id=dao.Agrega(estado);
		System.out.println(id);
		Integer id1=dao.Agrega(estado1);
		System.out.println(id1);
	}

	@Test
	public void testActualiza() {

		Estado estado=new Estado();
		estado.setCodigo("65");
		estado.setIdEstado(1);
		estado.setEstado("Colima");
		estado.setEstatus(Estatus.CANCELADO);
		
		dao.Actualiza(estado);
	}
	
	@Test
	public void testElimina() {

		Estado estado=new Estado();
		estado.setIdEstado(1);
		
		dao.Elimina(estado);
	}
	
	@Test
	public void testObtener() {

		Estado estado=new Estado();
		List<Estado>estados = new ArrayList<Estado>();
		estados=dao.obtener();
		System.out.println(estados);
		
	}

	@Test
	public void testObtenerById() {
		Estado estado=new Estado();
		
		estado=dao.obtenerById(2);
		System.out.println(estado);
	
	}


}
