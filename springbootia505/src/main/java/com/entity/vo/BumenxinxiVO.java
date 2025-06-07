package com.entity.vo;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 22:58:21
 */
public class BumenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 部门主管
	 */
	
	private String bumenzhuguan;
		
	/**
	 * 部门人数
	 */
	
	private Integer bumenrenshu;
		
	/**
	 * 部门电话
	 */
	
	private String bumendianhua;
		
	/**
	 * 部门介绍
	 */
	
	private String bumenjieshao;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：部门名称
	 */
	 
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
	}
				
	
	/**
	 * 设置：部门主管
	 */
	 
	public void setBumenzhuguan(String bumenzhuguan) {
		this.bumenzhuguan = bumenzhuguan;
	}
	
	/**
	 * 获取：部门主管
	 */
	public String getBumenzhuguan() {
		return bumenzhuguan;
	}
				
	
	/**
	 * 设置：部门人数
	 */
	 
	public void setBumenrenshu(Integer bumenrenshu) {
		this.bumenrenshu = bumenrenshu;
	}
	
	/**
	 * 获取：部门人数
	 */
	public Integer getBumenrenshu() {
		return bumenrenshu;
	}
				
	
	/**
	 * 设置：部门电话
	 */
	 
	public void setBumendianhua(String bumendianhua) {
		this.bumendianhua = bumendianhua;
	}
	
	/**
	 * 获取：部门电话
	 */
	public String getBumendianhua() {
		return bumendianhua;
	}
				
	
	/**
	 * 设置：部门介绍
	 */
	 
	public void setBumenjieshao(String bumenjieshao) {
		this.bumenjieshao = bumenjieshao;
	}
	
	/**
	 * 获取：部门介绍
	 */
	public String getBumenjieshao() {
		return bumenjieshao;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
