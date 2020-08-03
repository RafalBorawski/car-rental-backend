package com.miwi.carrental.service;

import com.miwi.carrental.domain.entity.Brand;
import com.miwi.carrental.exception.MyResourceNotFoundException;
import com.miwi.carrental.exception.RestPreconditions;
import com.miwi.carrental.repository.BrandDao;
import com.miwi.carrental.service.generic.GenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BrandService extends GenericService<Brand> {
  private Logger logger = LoggerFactory.getLogger(getClass().getName());

  private final BrandDao brandDao;

  public BrandService(final BrandDao brandDao) {
    this.brandDao = brandDao;
  }


  @Override
  public Brand findById(Long id) {
    try {
      return checkFound(brandDao.findById(id));
    } catch (MyResourceNotFoundException ex) {
      logger.warn("The brand with id: {} was not found ", id);
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
          "The brand with id: " + id + " was not found",
          ex);
    }
  }
}
