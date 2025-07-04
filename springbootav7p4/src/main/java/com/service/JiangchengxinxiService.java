package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangchengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangchengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangchengxinxiView;


/**
 * 奖惩信息
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public interface JiangchengxinxiService extends IService<JiangchengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangchengxinxiVO> selectListVO(Wrapper<JiangchengxinxiEntity> wrapper);
   	
   	JiangchengxinxiVO selectVO(@Param("ew") Wrapper<JiangchengxinxiEntity> wrapper);
   	
   	List<JiangchengxinxiView> selectListView(Wrapper<JiangchengxinxiEntity> wrapper);
   	
   	JiangchengxinxiView selectView(@Param("ew") Wrapper<JiangchengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangchengxinxiEntity> wrapper);
   	

}

