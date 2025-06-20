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
 * 员工考勤
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
@TableName("yuangongkaoqin")
public class YuangongkaoqinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongkaoqinEntity() {
		
	}
	
	public YuangongkaoqinEntity(T t) {
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
	 * 考勤月份
	 */
					
	private String kaoqinyuefen;
	
	/**
	 * 上班天数
	 */
					
	private Integer shangbantianshu;
	
	/**
	 * 休假天数
	 */
					
	private Integer xiujiatianshu;
	
	/**
	 * 请假天数
	 */
					
	private Integer qingjiatianshu;
	
	/**
	 * 迟到天数
	 */
					
	private Integer chidaotianshu;
	
	/**
	 * 早退天数
	 */
					
	private Integer zaotuitianshu;
	
	/**
	 * 加班时长
	 */
					
	private Integer jiabanshizhang;
	
	
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
	 * 设置：考勤月份
	 */
	public void setKaoqinyuefen(String kaoqinyuefen) {
		this.kaoqinyuefen = kaoqinyuefen;
	}
	/**
	 * 获取：考勤月份
	 */
	public String getKaoqinyuefen() {
		return kaoqinyuefen;
	}
	/**
	 * 设置：上班天数
	 */
	public void setShangbantianshu(Integer shangbantianshu) {
		this.shangbantianshu = shangbantianshu;
	}
	/**
	 * 获取：上班天数
	 */
	public Integer getShangbantianshu() {
		return shangbantianshu;
	}
	/**
	 * 设置：休假天数
	 */
	public void setXiujiatianshu(Integer xiujiatianshu) {
		this.xiujiatianshu = xiujiatianshu;
	}
	/**
	 * 获取：休假天数
	 */
	public Integer getXiujiatianshu() {
		return xiujiatianshu;
	}
	/**
	 * 设置：请假天数
	 */
	public void setQingjiatianshu(Integer qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	/**
	 * 获取：请假天数
	 */
	public Integer getQingjiatianshu() {
		return qingjiatianshu;
	}
	/**
	 * 设置：迟到天数
	 */
	public void setChidaotianshu(Integer chidaotianshu) {
		this.chidaotianshu = chidaotianshu;
	}
	/**
	 * 获取：迟到天数
	 */
	public Integer getChidaotianshu() {
		return chidaotianshu;
	}
	/**
	 * 设置：早退天数
	 */
	public void setZaotuitianshu(Integer zaotuitianshu) {
		this.zaotuitianshu = zaotuitianshu;
	}
	/**
	 * 获取：早退天数
	 */
	public Integer getZaotuitianshu() {
		return zaotuitianshu;
	}
	/**
	 * 设置：加班时长
	 */
	public void setJiabanshizhang(Integer jiabanshizhang) {
		this.jiabanshizhang = jiabanshizhang;
	}
	/**
	 * 获取：加班时长
	 */
	public Integer getJiabanshizhang() {
		return jiabanshizhang;
	}

}
