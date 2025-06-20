package com.dao;

import com.entity.YuangongjixiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongjixiaoVO;
import com.entity.view.YuangongjixiaoView;


/**
 * 员工绩效
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:50:17
 */
public interface YuangongjixiaoDao extends BaseMapper<YuangongjixiaoEntity> {
	
	List<YuangongjixiaoVO> selectListVO(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
	
	YuangongjixiaoVO selectVO(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
	
	List<YuangongjixiaoView> selectListView(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);

	List<YuangongjixiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
	
	YuangongjixiaoView selectView(@Param("ew") Wrapper<YuangongjixiaoEntity> wrapper);
	

}
