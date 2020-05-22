package com.wangyanlong.mapper;

import java.util.List;
import java.util.Map;

import com.wangyanlong.beans.Info;
import com.wangyanlong.beans.Teacher;

public interface InfoMapper {
	
	//查询晒被信息表  根据宿舍编号  晒被状态  负责老师进行查询
	List<Info> queryInfoByItem(Map<String, Object> map);
	//查询所有老师
	List<Teacher> queryAllTeacher();
	//添加晒被信息
	int addInfo(Info info);
	//根据id查询晒被表
	Info queryInfoById(Integer i_id);
	//收被
	int changeInfo(Integer i_id);

}
