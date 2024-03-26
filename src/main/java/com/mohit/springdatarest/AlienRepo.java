package com.mohit.springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mohit.springdatarest.model.Alien;

@RepositoryRestResource(collectionResourceRel="", path="aliens")
public interface AlienRepo extends JpaRepository<Alien,Integer>{

}
