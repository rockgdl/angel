package com.fpiceno.portal.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.MunicipioDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.dao.mysql.MunicipioDaoSql;
import com.fpiceno.portal.entity.Estatus;
import com.fpiceno.portal.entity.Municipio;



public class MunicipioDaoSqlTest {
	@Autowired
	MunicipioDao dao;
	@Test
	public void testAgrega() {
		Municipio municipio1=new Municipio();
		municipio1.setCodigo("443");
		municipio1.setEstatus(Estatus.NODEFINIDO);
		municipio1.setMunicipio("GDL");
		Municipio municipio=new Municipio();
		municipio.setCodigo("432");
		municipio.setEstatus(Estatus.ACTIVO);
		municipio.setMunicipio("Tlaquepaque");
		
		Integer id=dao.Agrega(municipio);
		System.out.println(id);
		Integer id1=dao.Agrega(municipio1);
		System.out.println(id1);
	}

	@Test
	public void testActualiza() {

		Municipio municipio=new Municipio();
		municipio.setCodigo("999");
		municipio.setIdMunicipio(1);
		municipio.setMunicipio("Zamora");
		municipio.setEstatus(Estatus.ACTIVO);
		
		dao.Actualiza(municipio);
	}
	
	@Test
	public void testElimina() {

		Municipio municipio=new Municipio();
		municipio.setIdMunicipio(1);
		
		dao.Elimina(municipio);
	}
	
	@Test
	public void testObtener() {

		Municipio municipio=new Municipio();
		List<Municipio>municipios = new ArrayList<Municipio>();
		municipios=dao.obtener();
		System.out.println(municipios);
		
	}

	@Test
	public void testObtenerById() {
		Municipio municipio=new Municipio();
		
		municipio=dao.obtenerById(2);
		System.out.println(municipio);
	
	}


}
