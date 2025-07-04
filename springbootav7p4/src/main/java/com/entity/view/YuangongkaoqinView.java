package com.entity.view;

import com.entity.YuangongkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工考勤
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
@TableName("yuangongkaoqin")
public class YuangongkaoqinView  extends YuangongkaoqinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongkaoqinView(){
	}
 
 	public YuangongkaoqinView(YuangongkaoqinEntity yuangongkaoqinEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongkaoqinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
