package com.miwi.carrental.control.service.generic;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGenericService<T> {

  List<T> findAll();

  @Transactional
  T save(T entity);

  @Transactional
  T findById(Long id);

  @Transactional
  void delete(T entity);

  @Transactional
  void deleteById(Long id);

  Page<T> findAll(Pageable pageable);

  // <T> Page<T> checkFound(final Page<T> resources);
}