package com.example.restservice1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice1.entity.ProductCategory;

@Repository
@Qualifier(value="productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	
	List<ProductCategory> findByBestCategory(boolean best);

}
