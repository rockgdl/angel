package com.fpiceno.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.service.ProductoService;

public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoDao userDAO;
	
	
	@Override
	public List<Producto> getProducts() {
		return userDAO.obtenTodos();
	}

}
