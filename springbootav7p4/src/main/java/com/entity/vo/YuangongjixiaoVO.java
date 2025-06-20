package com.entity.vo;

import com.entity.YuangongjixiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工绩效
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
public class YuangongjixiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
