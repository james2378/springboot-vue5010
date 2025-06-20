package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinshengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinshengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinshengxinxiView;


/**
 * 晋升信息
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public interface JinshengxinxiService extends IService<JinshengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinshengxinxiVO> selectListVO(Wrapper<JinshengxinxiEntity> wrapper);
   	
   	JinshengxinxiVO selectVO(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
   	
   	List<JinshengxinxiView> selectListView(Wrapper<JinshengxinxiEntity> wrapper);
   	
   	JinshengxinxiView selectView(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinshengxinxiEntity> wrapper);
   	

}

