package com.climber.swagger.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.climber.swagger.bean.PmtXtype;

@Mapper
public interface BusMapper {
	public List<PmtXtype> getXtype(PmtXtype item);
}
