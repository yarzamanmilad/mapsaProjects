package com.mapsa.spring_repository.repository.flight;


import com.mapsa.spring_repository.domain.Personn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Personn,Long> {
}
