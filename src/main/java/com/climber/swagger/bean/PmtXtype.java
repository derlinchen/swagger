package com.climber.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="PmtXtype", description="下拉框类")
public class PmtXtype {
	
	@ApiModelProperty(value="类型编号")
	private String xtype;
	
	@ApiModelProperty(value="类型名称")
	private String xtypename;

	public String getXtype() {
		return xtype;
	}

	public void setXtype(String xtype) {
		this.xtype = xtype;
	}

	public String getXtypename() {
		return xtypename;
	}

	public void setXtypename(String xtypename) {
		this.xtypename = xtypename;
	}
	
}
