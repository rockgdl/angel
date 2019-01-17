package com.contpaq.facturacion.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.contpaq.facturacion.dao.EmpresaDao;
import com.contpaq.facturacion.dao.sqlserver.EmpresaDaoSql;
import com.contpaq.facturacion.dto.Colonia;
import com.contpaq.facturacion.dto.Domicilio;
import com.contpaq.facturacion.dto.Empresa;
import com.contpaq.facturacion.dto.Estado;
import com.contpaq.facturacion.dto.Estatus;
import com.contpaq.facturacion.dto.Municipio;
import com.contpaq.facturacion.dto.Pais;

public class EmpresaDaoSqlTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAgrega() {
		Empresa empresa=new Empresa();
		
		//empresa.setDomicilioFiscal();
		empresa.setEmail("skitrock@hotmail.com");
		empresa.setEstatus(Estatus.ACTIVO);
		empresa.setNombre("Contpaq");
		empresa.setRazonSocial("razon social");
		empresa.setRfc("rfcnuevo");
		empresa.setTelefono("3310161902");
		Domicilio domicilioFiscal =new Domicilio();
		domicilioFiscal.setIdDomicilio(2);
		empresa.setDomicilioFiscal(domicilioFiscal );
		
		EmpresaDao dao= new EmpresaDaoSql();
		Integer id=dao.Agrega(empresa);
		System.out.println(id);
		
		
	
	
	}

	@Test
	public void testActualiza() {

	
		Empresa empresa=new Empresa();
		
			Domicilio domicilio=new Domicilio();
			domicilio.setCalle("isla socorro 2663");
			
			Colonia colonia=new Colonia();
			colonia.setCodigo("9987");
			colonia.setColonia("Villa Vicente Guerrero");
			colonia.setEstatus(Estatus.ACTIVO);
			domicilio.setColonia(colonia);
			
			Estado estado=new Estado();
			estado.setCodigo("123");
			estado.setEstado("Jalisco");
			estado.setEstatus(Estatus.ACTIVO);
	//		estado.setId(1);
			domicilio.setEstado(estado);
			
			domicilio.setEstatus(Estatus.ACTIVO);
			domicilio.setLocalidad("Guadalajara");
			
			Municipio municipio=new Municipio();
			municipio.setCodigo("443");
			municipio.setEstatus(Estatus.NODEFINIDO);
			municipio.setMunicipio("GDL");
			domicilio.setMunicipio(municipio);
			
			domicilio.setNumeroExterior("2663");
			domicilio.setNumeroInterior("");
			
			Pais pais=new Pais();
			pais.setCodigo("342");
			pais.setEstatus(Estatus.ACTIVO);
			pais.setPais("Mexico");
	//		pais.setId(1);
			domicilio.setPais(pais);
			
			domicilio.setRefenciaCalles("entre isla kodiak e isla belcher ");

		
		empresa.setDomicilioFiscal(domicilio);
		empresa.setEmail("algo2@gmal.com");
		empresa.setEstatus(Estatus.ACTIVO);
		empresa.setNombre("Contpaq12");
		empresa.setIdEmpresa(1);
		empresa.setRazonSocial("algoAlgo");
		empresa.setRfc("JGD12");
		empresa.setTelefono("22222");
		
		EmpresaDao dao= new EmpresaDaoSql();
		dao.Actualiza(empresa);
	}

	@Test
	public void testElimina() {

	
	Empresa empresa=new Empresa();
	empresa.setIdEmpresa(1);
	EmpresaDao dao= new EmpresaDaoSql();
	dao.Elimina(empresa);
	
	}

	@Test
	public void testObtener() {

		
		Empresa empresa=new Empresa();
		List<Empresa>empresas=new ArrayList<Empresa>();
		EmpresaDao dao=new EmpresaDaoSql();
		empresas=dao.obtener();
		System.out.println(empresas);
		
	}

	@Test
	public void testObtenerById() {
		Empresa empresa=new Empresa();
		
		EmpresaDao dao=new EmpresaDaoSql();
		empresa=dao.obtenerById(1);
		System.out.println(empresa);	
	}


}
