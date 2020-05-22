package com.wangyanlong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangyanlong.beans.Info;
import com.wangyanlong.service.InfoService;

public class Infotest {
	//添加
	@Test
	public void test01(){
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InfoService bean = (InfoService) app.getBean("InfoServiceImpl.class");
		Info info=new Info();
		info.setI_name("131");
		info.setT_id(1);
		int addInfo = bean.addInfo(info);
		if(addInfo>0){
			System.out.println("添加成功！");
		}else{
			System.out.println("添加失败！");
		}
	}
	//晾被信息查看
	@Test
	public void test02(){
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InfoService bean = (InfoService) app.getBean("InfoServiceImpl.class");
		Info info=new Info();
		info.setI_id(1);
		Info addInfo = bean.queryInfoById(info.getI_id());
		System.out.println(addInfo);
	}
	//收被功能
	@Test
	public void test03(){
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InfoService bean = (InfoService) app.getBean("InfoServiceImpl.class");
		Info info=new Info();
		info.setI_id(1);
		int changeInfo = bean.changeInfo(info.getI_id());
		if(changeInfo>0){
			System.out.println("收被成功！");
		}else{
			System.out.println("收被失败！");
		}
	}
}
