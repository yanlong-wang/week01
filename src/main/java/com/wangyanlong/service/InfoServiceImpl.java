package com.wangyanlong.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyanlong.beans.Info;
import com.wangyanlong.beans.Teacher;
import com.wangyanlong.mapper.InfoMapper;

@Service
public class InfoServiceImpl implements InfoService {

	@Resource
	private InfoMapper infoMapper;
	
	@Override
	public List<Info> queryInfoByItem(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return infoMapper.queryInfoByItem(map);
	}

	@Override
	public List<Teacher> queryAllTeacher() {
		// TODO Auto-generated method stub
		return infoMapper.queryAllTeacher();
	}

	@Override
	public int addInfo(Info info) {
		// TODO Auto-generated method stub
		return infoMapper.addInfo(info);
	}

	@Override
	public Info queryInfoById(Integer i_id) {
		// TODO Auto-generated method stub
		return infoMapper.queryInfoById(i_id);
	}

	@Override
	public int changeInfo(Integer i_id) {
		// TODO Auto-generated method stub
		return infoMapper.changeInfo(i_id);
	}

}
