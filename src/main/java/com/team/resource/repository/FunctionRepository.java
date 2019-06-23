package com.team.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.resource.domain.Function;

public interface FunctionRepository extends JpaRepository<Function, Long> {

}
