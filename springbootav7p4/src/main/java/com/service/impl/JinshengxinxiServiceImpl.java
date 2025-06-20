package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JinshengxinxiDao;
import com.entity.JinshengxinxiEntity;
import com.service.JinshengxinxiService;
import com.entity.vo.JinshengxinxiVO;
import com.entity.view.JinshengxinxiView;

@Service("jinshengxinxiService")
public class JinshengxinxiServiceImpl extends ServiceImpl<JinshengxinxiDao, JinshengxinxiEntity> implements JinshengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinshengxinxiEntity> page = this.selectPage(
                new Query<JinshengxinxiEntity>(params).getPage(),
                new EntityWrapper<JinshengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinshengxinxiEntity> wrapper) {
		  Page<JinshengxinxiView> page =new Query<JinshengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinshengxinxiVO> selectListVO(Wrapper<JinshengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinshengxinxiVO selectVO(Wrapper<JinshengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinshengxinxiView> selectListView(Wrapper<JinshengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinshengxinxiView selectView(Wrapper<JinshengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
