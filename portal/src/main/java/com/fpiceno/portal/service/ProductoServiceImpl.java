//package com.fpiceno.portal.service;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.fpiceno.portal.bl.PropiedadesPortal;
//import com.fpiceno.portal.dao.ProductosDaoDataJpa;
//import com.fpiceno.portal.entity.Producto;
//@Service
//@Transactional
//public class ProductoServiceImpl  {
//	
//	private static final int PAGE_SIZE=PropiedadesPortal.LIMITE;
//	@Inject
//	private ProductosDaoDataJpa productoDao;
//	
//	public Page<Producto> getDeploymentLog(Integer pageNumber) {
//	        PageRequest request =  new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "startTime");
//	        return productoDao.findAll(request);
//	    }
//	
//	
//	
//
//}
