package com.dao;

import com.entity.JinshengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinshengxinxiVO;
import com.entity.view.JinshengxinxiView;


/**
 * 晋升信息
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public interface JinshengxinxiDao extends BaseMapper<JinshengxinxiEntity> {
	
	List<JinshengxinxiVO> selectListVO(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
	
	JinshengxinxiVO selectVO(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
	
	List<JinshengxinxiView> selectListView(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);

	List<JinshengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
	
	JinshengxinxiView selectView(@Param("ew") Wrapper<JinshengxinxiEntity> wrapper);
	

}
