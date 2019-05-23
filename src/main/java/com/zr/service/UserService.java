package com.zr.service;

import java.util.ArrayList;
import java.util.List;

import com.zr.model.User;

import net.sf.json.JSONObject;

public class UserService {

	
	public  JSONObject  getUserInfos(){
		JSONObject  data = new JSONObject();
		//调数据库层上面的2个操作
		//1.信息的总数  51条数据  dao层   public  int  getXXXCount()
		data.put("total", 51);
		//2.sql  limit a,b   select * from  user limit 0,10
		//  public List<XXX>  getXXXs(int  page,int rows)
		//a起始位置  b参数代表取多少条数据  
		//page=1 rows=10   ====> a=0  b=10
		//page=2 rows=10   ====> a=10 b=10
		//page=3 rows=10   ====> a=20 b=10
		//limit的b=rows   a=(page-1)*rows
		List<User>  users = new ArrayList<User>();
		users.add(new User(1, "a", 10));
		users.add(new User(2, "b", 10));
		users.add(new User(3, "c", 10));
		data.put("rows", users);
		return  data;
	}
}
