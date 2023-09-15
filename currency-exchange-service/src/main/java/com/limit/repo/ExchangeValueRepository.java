package com.limit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.limit.bean.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	@Query("SELECT f FROM ExchangeValue f WHERE LOWER(f.from) = LOWER(:from) AND LOWER(f.to) = LOWER(:to)")
		ExchangeValue findByFromAndTo(String from, String to);
		ExchangeValue findByFrom(String from);
	

}
