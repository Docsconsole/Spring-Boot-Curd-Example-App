package com.docsconsole.tutorials.repository;

import java.util.Optional;

import com.docsconsole.tutorials.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByProductName(String productName);

}
