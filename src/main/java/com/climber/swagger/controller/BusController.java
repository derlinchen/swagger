package com.climber.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.climber.swagger.bean.PmtXtype;
import com.climber.swagger.service.BusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "测试操作")
@RestController
@RequestMapping(value="/bus")
public class BusController {
	
	@Autowired
	private BusService busservice;
 
    @ApiOperation(value="获取数据列表", notes="")
    @RequestMapping(value="/printXtype", method=RequestMethod.GET)
    public List<PmtXtype> getUserList() {
    	PmtXtype item = new PmtXtype();
    	List<PmtXtype> rtv = busservice.getXtype(item);
        return rtv;
    }

}
