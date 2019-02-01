package com.fpiceno.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpiceno.portal.entity.Producto;

public interface ProductosDaoDataJpa extends JpaRepository<Producto, Long>{

}
