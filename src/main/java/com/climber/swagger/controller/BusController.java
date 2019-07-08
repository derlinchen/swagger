package com.climber.swagger.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.climber.swagger.bean.PmtXtype;
import com.climber.swagger.service.BusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "测试操作")
@RestController
@RequestMapping(value="/bus")
public class BusController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BusController.class);

	@Autowired
	private BusService busservice;
 
    @ApiOperation(value="获取数据列表", notes="获取数据列表")
    @GetMapping(value="/printXtype")
    public List<PmtXtype> getUserList() {
    	PmtXtype item = new PmtXtype();
    	List<PmtXtype> rtv = busservice.getXtype(item);
    	LOGGER.info("hello");
        return rtv;
    }
    
    @ApiOperation(value="获取列信息", notes="获取列信息")
    @GetMapping("/getPmtXtype")
    @ResponseBody
	public PmtXtype getPmtXtype(@ApiParam(required=true, name="item",value="获取列信息") @RequestBody PmtXtype item) {
    	PmtXtype rtv = new PmtXtype();
    	return rtv;
	}

}
