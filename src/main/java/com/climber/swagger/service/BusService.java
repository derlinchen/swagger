package com.climber.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.climber.swagger.bean.PmtXtype;
import com.climber.swagger.dao.BusMapper;

@Service
public class BusService {

	@Autowired
    private BusMapper busmapper;
	
	public List<PmtXtype> getXtype(PmtXtype item) {
		List<PmtXtype> xtypes = busmapper.getXtype(item);
		return xtypes;
	}
	
}
