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
 * 工资信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 22:58:21
 */
@TableName("gongzixinxi")
public class GongzixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzixinxiEntity() {
		
	}
	
	public GongzixinxiEntity(T t) {
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
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 基本工资
	 */
					
	private Integer jibengongzi;
	
	/**
	 * 加班工资
	 */
					
	private Integer jiabangongzi;
	
	/**
	 * 绩效奖金
	 */
					
	private Integer jixiaojiangjin;
	
	/**
	 * 其他补助
	 */
					
	private Integer qitabuzhu;
	
	/**
	 * 扣款金额
	 */
					
	private Integer koukuanjine;
	
	/**
	 * 实发工资
	 */
					
	private Integer shifagongzi;
	
	/**
	 * 扣款原因
	 */
					
	private String koukuanyuanyin;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：月份
	 */
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：基本工资
	 */
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
	/**
	 * 设置：加班工资
	 */
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
	/**
	 * 设置：绩效奖金
	 */
	public void setJixiaojiangjin(Integer jixiaojiangjin) {
		this.jixiaojiangjin = jixiaojiangjin;
	}
	/**
	 * 获取：绩效奖金
	 */
	public Integer getJixiaojiangjin() {
		return jixiaojiangjin;
	}
	/**
	 * 设置：其他补助
	 */
	public void setQitabuzhu(Integer qitabuzhu) {
		this.qitabuzhu = qitabuzhu;
	}
	/**
	 * 获取：其他补助
	 */
	public Integer getQitabuzhu() {
		return qitabuzhu;
	}
	/**
	 * 设置：扣款金额
	 */
	public void setKoukuanjine(Integer koukuanjine) {
		this.koukuanjine = koukuanjine;
	}
	/**
	 * 获取：扣款金额
	 */
	public Integer getKoukuanjine() {
		return koukuanjine;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：扣款原因
	 */
	public void setKoukuanyuanyin(String koukuanyuanyin) {
		this.koukuanyuanyin = koukuanyuanyin;
	}
	/**
	 * 获取：扣款原因
	 */
	public String getKoukuanyuanyin() {
		return koukuanyuanyin;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
