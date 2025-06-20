package com.entity.view;

import com.entity.JinshengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 晋升信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
@TableName("jinshengxinxi")
public class JinshengxinxiView  extends JinshengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinshengxinxiView(){
	}
 
 	public JinshengxinxiView(JinshengxinxiEntity jinshengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jinshengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
