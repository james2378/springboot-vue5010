package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiangchengxinxiEntity;
import com.entity.view.JiangchengxinxiView;

import com.service.JiangchengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 奖惩信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 19:50:16
 */
@RestController
@RequestMapping("/jiangchengxinxi")
public class JiangchengxinxiController {
    @Autowired
    private JiangchengxinxiService jiangchengxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiangchengxinxiEntity jiangchengxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			jiangchengxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiangchengxinxiEntity> ew = new EntityWrapper<JiangchengxinxiEntity>();

		PageUtils page = jiangchengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiangchengxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiangchengxinxiEntity jiangchengxinxi, 
		HttpServletRequest request){
        EntityWrapper<JiangchengxinxiEntity> ew = new EntityWrapper<JiangchengxinxiEntity>();

		PageUtils page = jiangchengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiangchengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiangchengxinxiEntity jiangchengxinxi){
       	EntityWrapper<JiangchengxinxiEntity> ew = new EntityWrapper<JiangchengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiangchengxinxi, "jiangchengxinxi")); 
        return R.ok().put("data", jiangchengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiangchengxinxiEntity jiangchengxinxi){
        EntityWrapper< JiangchengxinxiEntity> ew = new EntityWrapper< JiangchengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiangchengxinxi, "jiangchengxinxi")); 
		JiangchengxinxiView jiangchengxinxiView =  jiangchengxinxiService.selectView(ew);
		return R.ok("查询奖惩信息成功").put("data", jiangchengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiangchengxinxiEntity jiangchengxinxi = jiangchengxinxiService.selectById(id);
        return R.ok().put("data", jiangchengxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiangchengxinxiEntity jiangchengxinxi = jiangchengxinxiService.selectById(id);
        return R.ok().put("data", jiangchengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiangchengxinxiEntity jiangchengxinxi, HttpServletRequest request){
    	jiangchengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiangchengxinxi);
        jiangchengxinxiService.insert(jiangchengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiangchengxinxiEntity jiangchengxinxi, HttpServletRequest request){
    	jiangchengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiangchengxinxi);
        jiangchengxinxiService.insert(jiangchengxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiangchengxinxiEntity jiangchengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiangchengxinxi);
        jiangchengxinxiService.updateById(jiangchengxinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiangchengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiangchengxinxiEntity> wrapper = new EntityWrapper<JiangchengxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiangchengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
