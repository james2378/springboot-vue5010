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
 * 员工绩效
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
@TableName("yuangongjixiao")
public class YuangongjixiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongjixiaoEntity() {
		
	}
	
	public YuangongjixiaoEntity(T t) {
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
	 * 员工考勤
	 */
					
	private Integer yuangongkaoqin;
	
	/**
	 * 工作态度
	 */
					
	private Integer gongzuotaidu;
	
	/**
	 * 业务技能
	 */
					
	private Integer yewujineng;
	
	/**
	 * 工作成绩
	 */
					
	private Integer gongzuochengji;
	
	/**
	 * 总得分
	 */
					
	private Integer zongdefen;
	
	/**
	 * 评价等级
	 */
					
	private String pingjiadengji;
	
	/**
	 * 绩效月份
	 */
					
	private String jixiaoyuefen;
	
	
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
	 * 设置：员工考勤
	 */
	public void setYuangongkaoqin(Integer yuangongkaoqin) {
		this.yuangongkaoqin = yuangongkaoqin;
	}
	/**
	 * 获取：员工考勤
	 */
	public Integer getYuangongkaoqin() {
		return yuangongkaoqin;
	}
	/**
	 * 设置：工作态度
	 */
	public void setGongzuotaidu(Integer gongzuotaidu) {
		this.gongzuotaidu = gongzuotaidu;
	}
	/**
	 * 获取：工作态度
	 */
	public Integer getGongzuotaidu() {
		return gongzuotaidu;
	}
	/**
	 * 设置：业务技能
	 */
	public void setYewujineng(Integer yewujineng) {
		this.yewujineng = yewujineng;
	}
	/**
	 * 获取：业务技能
	 */
	public Integer getYewujineng() {
		return yewujineng;
	}
	/**
	 * 设置：工作成绩
	 */
	public void setGongzuochengji(Integer gongzuochengji) {
		this.gongzuochengji = gongzuochengji;
	}
	/**
	 * 获取：工作成绩
	 */
	public Integer getGongzuochengji() {
		return gongzuochengji;
	}
	/**
	 * 设置：总得分
	 */
	public void setZongdefen(Integer zongdefen) {
		this.zongdefen = zongdefen;
	}
	/**
	 * 获取：总得分
	 */
	public Integer getZongdefen() {
		return zongdefen;
	}
	/**
	 * 设置：评价等级
	 */
	public void setPingjiadengji(String pingjiadengji) {
		this.pingjiadengji = pingjiadengji;
	}
	/**
	 * 获取：评价等级
	 */
	public String getPingjiadengji() {
		return pingjiadengji;
	}
	/**
	 * 设置：绩效月份
	 */
	public void setJixiaoyuefen(String jixiaoyuefen) {
		this.jixiaoyuefen = jixiaoyuefen;
	}
	/**
	 * 获取：绩效月份
	 */
	public String getJixiaoyuefen() {
		return jixiaoyuefen;
	}

}
