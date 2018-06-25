package com.zc.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zc.springboottest.entity.BlogEntity;

public interface BlogRepository extends JpaRepository<BlogEntity, Long>{

}
