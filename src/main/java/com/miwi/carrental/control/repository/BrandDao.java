package com.miwi.carrental.control.repository;

import com.miwi.carrental.models.entity.Brand;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandDao extends GenericDao<Brand> {
/*
  @Procedure(procedureName = "get_brand_name", outputParameterName = "brd_name")
  String getBrandNameById(@Param("in_id") Long id);*/
}