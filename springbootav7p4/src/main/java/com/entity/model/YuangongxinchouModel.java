package com.entity.model;

import com.entity.YuangongxinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工薪酬
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public class YuangongxinchouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 工资月份
	 */
	
	private String gongziyuefen;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 绩效奖励
	 */
	
	private Integer jixiaojiangli;
		
	/**
	 * 加班补助
	 */
	
	private Integer jiabanbuzhu;
		
	/**
	 * 五险一金
	 */
	
	private Integer wuxianyijin;
		
	/**
	 * 扣款金额
	 */
	
	private Integer koukuanjine;
		
	/**
	 * 实发工资
	 */
	
	private Float shifagongzi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：工资月份
	 */
	 
	public void setGongziyuefen(String gongziyuefen) {
		this.gongziyuefen = gongziyuefen;
	}
	
	/**
	 * 获取：工资月份
	 */
	public String getGongziyuefen() {
		return gongziyuefen;
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
	 * 设置：绩效奖励
	 */
	 
	public void setJixiaojiangli(Integer jixiaojiangli) {
		this.jixiaojiangli = jixiaojiangli;
	}
	
	/**
	 * 获取：绩效奖励
	 */
	public Integer getJixiaojiangli() {
		return jixiaojiangli;
	}
				
	
	/**
	 * 设置：加班补助
	 */
	 
	public void setJiabanbuzhu(Integer jiabanbuzhu) {
		this.jiabanbuzhu = jiabanbuzhu;
	}
	
	/**
	 * 获取：加班补助
	 */
	public Integer getJiabanbuzhu() {
		return jiabanbuzhu;
	}
				
	
	/**
	 * 设置：五险一金
	 */
	 
	public void setWuxianyijin(Integer wuxianyijin) {
		this.wuxianyijin = wuxianyijin;
	}
	
	/**
	 * 获取：五险一金
	 */
	public Integer getWuxianyijin() {
		return wuxianyijin;
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
	 
	public void setShifagongzi(Float shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Float getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
