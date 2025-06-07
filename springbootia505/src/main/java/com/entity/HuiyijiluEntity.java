package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会议记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 22:58:21
 */
@TableName("huiyijilu")
public class HuiyijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyijiluEntity() {
		
	}
	
	public HuiyijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会议编号
	 */
					
	private String huiyibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会议编号
	 */
	public void setHuiyibianhao(String huiyibianhao) {
		this.huiyibianhao = huiyibianhao;
	}
	/**
	 * 获取：会议编号
	 */
	public String getHuiyibianhao() {
		return huiyibianhao;
	}
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
