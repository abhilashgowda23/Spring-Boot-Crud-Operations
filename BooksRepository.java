package com.crudoperation.repository;

import com.crudoperation.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface BooksRepository extends CrudRepository<Books,Integer> {

}
