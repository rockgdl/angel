package com.fpiceno.portal.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.ColoniaDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.dao.mysql.ColoniaDaoSql;
import com.fpiceno.portal.entity.Colonia;
import com.fpiceno.portal.entity.Estatus;



public class ColoniaDaoSqlTest {
	@Autowired
	ColoniaDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgrega() {
		Colonia colonia1=new Colonia();
		colonia1.setCodigo("94987");
		colonia1.setColonia("El sauz");
		colonia1.setEstatus(Estatus.CANCELADO);
		Colonia colonia=new Colonia();
		colonia.setCodigo("9950");
		colonia.setColonia("Villa Guerrero");
		colonia.setEstatus(Estatus.ACTIVO);
		
		Integer id=dao.Agrega(colonia);
		Integer id2=dao.Agrega(colonia1);
		System.out.println(id);
		System.out.println(id2);
		
		
	
	
	}

	@Test
	public void testActualiza() {

	
		Colonia colonia=new Colonia();
		colonia.setCodigo("otro");
		colonia.setIdColonia(1);
		colonia.setColonia("Villa Guerrero");
		colonia.setEstatus(Estatus.BORRADO);
//		colonia.setEstatus(Estatus.BORRADO);
		
		dao.Actualiza(colonia);
	}

	@Test
	public void testElimina() {

	
	Colonia colonia=new Colonia();
	colonia.setIdColonia(2);
	dao.Elimina(colonia);
	
	}

	@Test
	public void testObtener() {

		
		Colonia colonia=new Colonia();
		List<Colonia>colonias=new ArrayList<Colonia>();
		colonias=dao.obtener();
		System.out.println(colonias);
		
		
		
	}

	@Test
	public void testObtenerById() {
		Colonia colonia=new Colonia();
		
		colonia=dao.obtenerById(2);
		System.out.println(colonia);
	
	
	}

}
