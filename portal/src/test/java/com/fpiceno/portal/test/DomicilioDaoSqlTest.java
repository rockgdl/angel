package com.fpiceno.portal.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.DomicilioDao;
import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.dao.mysql.DomicilioDaoSql;
import com.fpiceno.portal.entity.Colonia;
import com.fpiceno.portal.entity.Domicilio;
import com.fpiceno.portal.entity.Estado;
import com.fpiceno.portal.entity.Estatus;
import com.fpiceno.portal.entity.Municipio;
import com.fpiceno.portal.entity.Pais;



public class DomicilioDaoSqlTest {

	@Autowired
	DomicilioDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgrega() {
		Domicilio domicilio=new Domicilio();
		
		Colonia colonia=new Colonia();
//		colonia.setCodigo("9987");
//		colonia.setColonia("Villafdas Vicente Guerrero");
//		colonia.setEstatus(Estatus.ACTIVO);
		colonia.setIdColonia(2);
		domicilio.setColonia(colonia);
		
		Estado estado=new Estado();
//		estado.setCodigo("123");
//		estado.setEstado("Jalifsdafdsco");
//		estado.setEstatus(Estatus.ACTIVO);
		estado.setIdEstado(2);
		domicilio.setEstado(estado);

		Municipio municipio=new Municipio();
//		municipio.setCodigo("443");
//		municipio.setEstatus(Estatus.NODEFINIDO);
//		municipio.setMunicipio("GDL");
		municipio.setIdMunicipio(2);
		domicilio.setMunicipio(municipio);
		
		Pais pais=new Pais();
//		pais.setCodigo("342");
//		pais.setEstatus(Estatus.ACTIVO);
//		pais.setPais("Mexico");
		pais.setIdPais(2);
		domicilio.setPais(pais);
		
		domicilio.setCalle("isla cancun");
		domicilio.setRefenciaCalles("oxxo");
		domicilio.setEstatus(Estatus.BORRADO);
		domicilio.setLocalidad("Guadalajara");
		domicilio.setNumeroExterior("2663");
		domicilio.setNumeroInterior("num322");
		
		
		Integer id=dao.Agrega(domicilio);
		System.out.println(id);
	
	}

	@Test
	public void testActualiza() {
		
		Domicilio domicilio=new Domicilio();
		domicilio.setIdDomicilio(2);
		domicilio.setCalle("isla cancun");
		
		Colonia colonia=new Colonia();
//		colonia.setCodigo("94850");
//		colonia.setColonia("el sauz");
//		colonia.setEstatus(Estatus.NODEFINIDO);
		colonia.setIdColonia(1);
		domicilio.setColonia(colonia);
		
		Estado estado=new Estado();
//		estado.setCodigo("123");
//		estado.setEstado("");
//		estado.setEstatus(Estatus.ACTIVO);
		estado.setIdEstado(2);
		domicilio.setEstado(estado);
		
		domicilio.setEstatus(Estatus.BORRADO);
		domicilio.setLocalidad("Zapopan");
		
		Municipio municipio=new Municipio();
		municipio.setCodigo("345");
		municipio.setEstatus(Estatus.NODEFINIDO);
		municipio.setMunicipio("Tlaquepaque");
		domicilio.setMunicipio(municipio);
		
		domicilio.setNumeroExterior("2450");
		domicilio.setNumeroInterior("");
		
		Pais pais=new Pais();
		pais.setIdPais(1);
//		pais.setCodigo("342");
//		pais.setEstatus(Estatus.ACTIVO);
//		pais.setPais("Mexico");
		domicilio.setPais(pais);
		
		domicilio.setRefenciaCalles("entre isla kodiak e isla belcher ");
		
		
		dao.Agrega(domicilio);
	}

	@Test
	public void testElimina() {
		Domicilio domicilio =new Domicilio();
		domicilio=dao.obtenerById(3);
		domicilio.setCalle("actualizar otra cosa");
		Pais pais=new Pais();
		pais.setIdPais(2);
//		pais.setCodigo("4534534");
//		pais.setEstatus(Estatus.ACTIVO);
//		pais.setPais("Canada");
		domicilio.setPais(pais);
		Estado estado=new Estado();
		estado.setIdEstado(1);
		domicilio.setEstado(estado);
		
		dao.Actualiza(domicilio);
	}

	@Test
	public void testObtener() {
		List<Domicilio> domicilios=new ArrayList<Domicilio>();
		
		domicilios=dao.obtener();
		
		System.out.println(domicilios);
	
	}

	@Test
	public void testObtenerById() {

	Domicilio domicilio=new Domicilio();
	domicilio=dao.obtenerById(1);
	
	System.out.println(domicilio);
	}

}
