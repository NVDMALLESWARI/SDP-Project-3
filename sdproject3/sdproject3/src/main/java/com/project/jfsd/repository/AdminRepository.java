package com.project.jfsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.jfsd.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String>
{
@Query("select a from Admin a where username=?1 and password=?2")
public Admin checkadminlogin(String uname,String pwd);
}