package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.dao.DoctorDao;
import com.example.demo.entity.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService
{
	@Autowired
	 DoctorDao dao;

	@Override
	public List<Doctor> findAll() {
		
		return dao.findAll();
	}

	@Override
	public Doctor findById( @PathVariable  int Dr_id)
	{
		Optional<Doctor> d= dao.findById(Dr_id);
		Doctor d1=null;
		if(d.isPresent())
		{
			d1=d.get();
		}
		return d1;
	}

	@Override
	public void saveorUpdate(Doctor d) {
		dao.save(d);
		
	}

	@Override
	public void delete(int Dr_id) {
		dao.deleteById(Dr_id);
		
	}

}
