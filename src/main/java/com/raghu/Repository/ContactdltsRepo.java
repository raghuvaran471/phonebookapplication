package com.raghu.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.raghu.entity.EntityContact;

public interface ContactdltsRepo extends  JpaRepositoryImplementation<EntityContact, Serializable>{

}
