package com.entity.vo;

import com.entity.YuangongkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工考勤
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
public class YuangongkaoqinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
