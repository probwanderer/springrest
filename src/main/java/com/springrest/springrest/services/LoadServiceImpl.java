package com.springrest.springrest.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;
@Service
public class LoadServiceImpl implements LoadService {
	@Autowired
	private LoadDao loadDao;
	
	
	public LoadServiceImpl() {
		
	}
	@Override
	public List<Load> getLoad() {
		return loadDao.findAll();
	}
	@Override
	public Load getLoad(long loadId) {
	return loadDao.getOne(loadId);
	}
	@Override
	public Load addLoad(Load load) {
		loadDao.save(load);
		return null;
	}
	@Override
	public Load updateLoad(Load load) {
		loadDao.save(load);
		return load;
	}
	public void  deleteLoad(long parseLong) {
		Load entity=loadDao.getOne(parseLong);
		loadDao.delete(entity);
	}
}
