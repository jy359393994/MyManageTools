package com.lzw.dao;

import java.util.ArrayList;
import java.util.List;

public class Dao {
	private static final String  USER = "gcl"; 
	private static final String  PASSWORD = "fgc"; 
	
	public static boolean CheckLogin(String user,String password){
		/*boolean result = false;
		
		if(USER.equals(user)&&PASSWORD.equals(password)){
			result = true;
		}
		return result;*/
		return true;
	}
	
	public static List getJsr(){
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("小明");
		return list;
	}
}