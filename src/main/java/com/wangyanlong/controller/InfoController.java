package com.wangyanlong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangyanlong.beans.Info;
import com.wangyanlong.beans.Teacher;
import com.wangyanlong.service.InfoService;

@Controller
public class InfoController {

	@Resource
	private InfoService infoService;
	//列表展示
	@RequestMapping("queryInfoByItem")
	public String queryInfoByItem(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			Integer t_id,String i_name,Integer i_status){
		//初始化分页
		PageHelper.startPage(pageNum, 3);
		//查询
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t_id", t_id);
		map.put("i_status", i_status);
		map.put("i_name", i_name);
//		System.out.println(i_status+i_name+">>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Info> ilist = infoService.queryInfoByItem(map);
		//开始分页
		PageInfo<Info> plist=new PageInfo<>(ilist);
		//存储到作用域中
		model.addAttribute("plist",plist);
		
		model.addAttribute("map",map);
		//查询所有老师
		List<Teacher> tlist=infoService.queryAllTeacher();
		model.addAttribute("tlist",tlist);
		
		return "list";
	}
	
	//查询所有老师
	@RequestMapping("queryAllTeacher")
	@ResponseBody
	public List<Teacher> queryAllTeacher(){
		List<Teacher> tlist=infoService.queryAllTeacher();
		return tlist;
	}
	
	//添加
	@RequestMapping("addInfo")
	@ResponseBody
	public boolean addInfo(Info info){
		
		int x=infoService.addInfo(info);
		if(x>0){
			return true;
		}else{
			return false;
		}
	}
	//根据id查询晒被表
	@RequestMapping("queryInfoById")
	public String queryInfoById(Model model,Integer i_id){
		Info info = infoService.queryInfoById(i_id);
		model.addAttribute("info", info);
		
		//查询所有老师
		List<Teacher> tlist=infoService.queryAllTeacher();
		model.addAttribute("tlist",tlist);
		
		return "show";
	}
	
	@RequestMapping("toShouBei")
	public String toShouBei(Model model,Integer i_id){
		Info info = infoService.queryInfoById(i_id);
		model.addAttribute("info", info);
		
		//查询所有老师
		List<Teacher> tlist=infoService.queryAllTeacher();
		model.addAttribute("tlist",tlist);
		
		return "shoubei";
	}
	
	@RequestMapping("shoubei")
	@ResponseBody
	public boolean shoubei(Integer i_id){
		
		int x=infoService.changeInfo(i_id);
		if(x>0){
			return true;
		}else{
			return false;
		}
	}
	
}
