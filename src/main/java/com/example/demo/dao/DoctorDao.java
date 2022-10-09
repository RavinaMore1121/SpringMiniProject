package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Doctor;
public interface DoctorDao extends JpaRepository<Doctor, Integer>
{

}