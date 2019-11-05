package com.springboot.webservice.domain;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostsRepository extends JpaRepository<Posts, Long>{
	@Query("select sysdate from dual")
	Stream<Posts> findAllDesc();
}
