package com.fpiceno.portal.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fpiceno.portal.dao.PaisDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.dao.mysql.PaisDaoSql;
import com.fpiceno.portal.entity.Estatus;
import com.fpiceno.portal.entity.Pais;

@ComponentScan(basePackages = "com.fpiceno.portal.dao") 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:db-config.xml",
        "classpath:security-config.xml"})
public class PaisDaoSqlTest {
	
	@Autowired
	PaisDao dao;

	@Test
	public void testAgrega() {
		Pais pais1=new Pais();
		pais1.setCodigo("52");
		pais1.setEstatus(Estatus.ACTIVO);
		pais1.setPais("Mexico");
//		Pais pais=new Pais();
//		pais.setCodigo("342");
//		pais.setEstatus(Estatus.CANCELADO);
//		pais.setPais("Mexico");
		
//		PaisDao dao=new PaisDaoSql();
//		Integer id=dao.Agrega(pais);
//		System.out.println(id);
		Integer id1=dao.Agrega(pais1);
		System.out.println(id1);
	}

	@Test
	public void testActualiza() {

		Pais pais=new Pais();
		pais.setCodigo("999");
		pais.setIdPais(1);
		pais.setPais("EUA");
		pais.setEstatus(Estatus.BORRADO);
		
		dao.Actualiza(pais);
	}
	
	@Test
	public void testElimina() {

		Pais pais=new Pais();
		pais.setIdPais(1);
		
		dao.Elimina(pais);
	}
	
	@Test
	public void testObtener() {

		Pais pais=new Pais();
		List<Pais>paises = new ArrayList<Pais>();
		paises=dao.obtener();
		System.out.println(paises);
		
	}

	@Test
	public void testObtenerById() {
		Pais pais=new Pais();
		
		pais=dao.obtenerById(2);
		System.out.println(pais);
	
	}
	
	
	
}
