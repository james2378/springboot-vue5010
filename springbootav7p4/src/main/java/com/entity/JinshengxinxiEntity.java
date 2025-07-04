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
 * 晋升信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
@TableName("jinshengxinxi")
public class JinshengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JinshengxinxiEntity() {
		
	}
	
	public JinshengxinxiEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 晋升职位
	 */
					
	private String jinshengzhiwei;
	
	/**
	 * 晋升时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jinshengshijian;
	
	/**
	 * 晋升原因
	 */
					
	private String jinshengyuanyin;
	
	
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
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
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
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：晋升职位
	 */
	public void setJinshengzhiwei(String jinshengzhiwei) {
		this.jinshengzhiwei = jinshengzhiwei;
	}
	/**
	 * 获取：晋升职位
	 */
	public String getJinshengzhiwei() {
		return jinshengzhiwei;
	}
	/**
	 * 设置：晋升时间
	 */
	public void setJinshengshijian(Date jinshengshijian) {
		this.jinshengshijian = jinshengshijian;
	}
	/**
	 * 获取：晋升时间
	 */
	public Date getJinshengshijian() {
		return jinshengshijian;
	}
	/**
	 * 设置：晋升原因
	 */
	public void setJinshengyuanyin(String jinshengyuanyin) {
		this.jinshengyuanyin = jinshengyuanyin;
	}
	/**
	 * 获取：晋升原因
	 */
	public String getJinshengyuanyin() {
		return jinshengyuanyin;
	}

}
