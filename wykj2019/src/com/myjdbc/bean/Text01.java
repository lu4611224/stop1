package com.myjdbc.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.myjdbc.dao.UserDao;
import com.myjdbc.daoimp.UserDaiImp;

public class Text01 {

	public static void main(String[] args) {
		UserDao dao = new UserDaiImp();
		User user = new User();
//		for (int i = 0; i < 100; i++) {
//			user.setDianming("边炉请"+i);
//			user.setName("毛毛"+i);
//			user.setTelephone("1737757426"+i);
//			user.setAddress("赏月底"+i);
//			
//			
//			String str = "yyy-MM-dd HH:mm:ss";
//	        SimpleDateFormat sdf = new SimpleDateFormat(str);
//	        Date date = new Date();
//	        String dateString = sdf.format(date);
//	        user.setData(dateString);
//	        
//	        dao.addUser(user);
//		}
		
		
		
		List<User> list = new ArrayList<User>();
		list = dao.getAll();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (User user2 : list) {
			System.out.println(user2.getId());
			System.out.println(user2.getName());
			System.out.println(user2.getTelephone());
			try {
				System.out.println(format.format(format.parse(user2.getData())));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("-----------------------------------------");
		}
		
		
//		Set<User> set = new HashSet<User>();
//		set = dao.getAll();
//		
//		
//		
//		Iterator<User> it = set.iterator();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		
//		while (it.hasNext()) {
//			User u1 = (User)it.next();
//			System.out.println(u1.getId());
//			System.out.println(u1.getName());
//			System.out.println(u1.getTelephone());
//			try {
//				System.out.println(format.format(format.parse(u1.getData())));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("-----------------------------------------");
		}

	}


