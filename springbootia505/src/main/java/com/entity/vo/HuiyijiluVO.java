package com.entity.vo;

import com.entity.HuiyijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会议记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 22:58:21
 */
public class HuiyijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议名称
	 */
	
	private String huiyimingcheng;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 会议主题
	 */
	
	private String huiyizhuti;
		
	/**
	 * 参会人员
	 */
	
	private String canhuirenyuan;
		
	/**
	 * 内容记录
	 */
	
	private String neirongjilu;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
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
	 * 设置：会议名称
	 */
	 
	public void setHuiyimingcheng(String huiyimingcheng) {
		this.huiyimingcheng = huiyimingcheng;
	}
	
	/**
	 * 获取：会议名称
	 */
	public String getHuiyimingcheng() {
		return huiyimingcheng;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：会议主题
	 */
	 
	public void setHuiyizhuti(String huiyizhuti) {
		this.huiyizhuti = huiyizhuti;
	}
	
	/**
	 * 获取：会议主题
	 */
	public String getHuiyizhuti() {
		return huiyizhuti;
	}
				
	
	/**
	 * 设置：参会人员
	 */
	 
	public void setCanhuirenyuan(String canhuirenyuan) {
		this.canhuirenyuan = canhuirenyuan;
	}
	
	/**
	 * 获取：参会人员
	 */
	public String getCanhuirenyuan() {
		return canhuirenyuan;
	}
				
	
	/**
	 * 设置：内容记录
	 */
	 
	public void setNeirongjilu(String neirongjilu) {
		this.neirongjilu = neirongjilu;
	}
	
	/**
	 * 获取：内容记录
	 */
	public String getNeirongjilu() {
		return neirongjilu;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
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
