package com.emmanuel.plumas;

import org.springframework.beans.factory.annotation.Qualifier;

//import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("IUserEntityRepository")
public interface IUserEntityRepository extends CrudRepository<UserEntity, Long> {
	//List<UserEntity> findAll(); 
}

