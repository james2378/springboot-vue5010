package com.entity.vo;

import com.entity.JinshengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 晋升信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public class JinshengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
