package com.entity.vo;

import com.entity.JiangchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 奖惩信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public class JiangchengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 奖惩项目
	 */
	
	private String jiangchengxiangmu;
		
	/**
	 * 奖惩金额
	 */
	
	private Float jiangchengjine;
		
	/**
	 * 奖惩时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiangchengshijian;
		
	/**
	 * 奖惩原因
	 */
	
	private String jiangchengyuanyin;
				
	
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
	 * 设置：奖惩项目
	 */
	 
	public void setJiangchengxiangmu(String jiangchengxiangmu) {
		this.jiangchengxiangmu = jiangchengxiangmu;
	}
	
	/**
	 * 获取：奖惩项目
	 */
	public String getJiangchengxiangmu() {
		return jiangchengxiangmu;
	}
				
	
	/**
	 * 设置：奖惩金额
	 */
	 
	public void setJiangchengjine(Float jiangchengjine) {
		this.jiangchengjine = jiangchengjine;
	}
	
	/**
	 * 获取：奖惩金额
	 */
	public Float getJiangchengjine() {
		return jiangchengjine;
	}
				
	
	/**
	 * 设置：奖惩时间
	 */
	 
	public void setJiangchengshijian(Date jiangchengshijian) {
		this.jiangchengshijian = jiangchengshijian;
	}
	
	/**
	 * 获取：奖惩时间
	 */
	public Date getJiangchengshijian() {
		return jiangchengshijian;
	}
				
	
	/**
	 * 设置：奖惩原因
	 */
	 
	public void setJiangchengyuanyin(String jiangchengyuanyin) {
		this.jiangchengyuanyin = jiangchengyuanyin;
	}
	
	/**
	 * 获取：奖惩原因
	 */
	public String getJiangchengyuanyin() {
		return jiangchengyuanyin;
	}
			
}
