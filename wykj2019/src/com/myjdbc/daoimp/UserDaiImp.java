package com.myjdbc.daoimp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Jdbc.DBUtil;
import com.myjdbc.bean.Login;
import com.myjdbc.bean.User;
import com.myjdbc.dao.UserDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserDaiImp implements UserDao{

	@Override
	public int addUser(User user) {
		Connection con = null ;  
	    PreparedStatement ps = null ;  
	    int i = 0 ;
	    try {
			con = (Connection) DBUtil.getConnection();
			String sql = "insert into user(dianming,name,telephone,address,data) values(?,?,?,?,?)";
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, user.getDianming());
			ps.setString(2, user.getName());
			ps.setString(3, user.getTelephone());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getData());
			i=ps.executeUpdate();
			System.out.println("新增成功"+i+"条数据");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBUtil.close(con, ps, null);
		}
		return i;
	}

	@Override
	public List<User> getAll() {
		Connection con = null ;  
        PreparedStatement ps = null ;  
        User user = null ;  
        ResultSet rs = null;  
        Set<User> set = null ;
        List<User> list = new ArrayList<User>();
        try {
			con = (Connection) DBUtil.getConnection();
			String sql = "SELECT a.id,a.dianming,a.`name`,a.telephone,a.address,a.`data` FROM user a WHERE 1=1 GROUP BY id asc";
			ps = (PreparedStatement) con.prepareStatement(sql);  
            
            set = new HashSet<User>() ;  
            rs = ps.executeQuery() ;
            while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setDianming(rs.getString(2));
				user.setName(rs.getString(3));
				user.setTelephone(rs.getString(4));
				user.setAddress(rs.getString(5));
				user.setData(rs.getString(6));
				list.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBUtil.close(con, ps,rs);
	}
		return list;
	}

	@Override
	public Login getLogin(String username, String password) {
		Connection con = (Connection) DBUtil.getConnection();
		String sql = "select * from log where username=? and password=?";
		ResultSet rs = null;
		PreparedStatement pst = null;
		Login log = new Login();
		try {
			pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				log.setId(rs.getInt("id"));
				log.setUsername(rs.getString("username"));
				log.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pst, rs);
		}
		return log;
	}

}
