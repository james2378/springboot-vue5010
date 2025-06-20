package com.dao;

import com.entity.YuangongxinchouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongxinchouVO;
import com.entity.view.YuangongxinchouView;


/**
 * 员工薪酬
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
public interface YuangongxinchouDao extends BaseMapper<YuangongxinchouEntity> {
	
	List<YuangongxinchouVO> selectListVO(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	YuangongxinchouVO selectVO(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	List<YuangongxinchouView> selectListView(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);

	List<YuangongxinchouView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	YuangongxinchouView selectView(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	

}
