package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongjixiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongjixiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongjixiaoView;


/**
 * 员工绩效
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
public interface YuangongjixiaoService extends IService<YuangongjixiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongjixiaoVO> selectListVO(Wrapper<YuangongjixiaoEntity> wrapper);
   	
   	YuangongjixiaoVO selectVO(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
   	
   	List<YuangongjixiaoView> selectListView(Wrapper<YuangongjixiaoEntity> wrapper);
   	
   	YuangongjixiaoView selectView(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongjixiaoEntity> wrapper);
   	

}

