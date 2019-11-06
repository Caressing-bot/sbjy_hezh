package com.Test.dao;


import com.Test.bean.User;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) {
//        List<User> result = findAll("陈");
////        for (User u:result) {
////            System.out.println(u);
////        }
//        result.forEach(n -> System.out.println(n));
        User user = new User();
        user.setName("老汪");
        user.setAge(26);
        user.setSex("f");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        user.setCreateTime(dateStr);
        add(user);
    }

    private static List<User> findAll(String conName) {
        List<User> result = new ArrayList<>();
        String sql = "select * from member where name like ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection conn = null;
        try {
            Class.forName(driver);
            /**
             * 获取连接
             */
            conn = DriverManager.getConnection(url, username, password);
            /**
             * 执行sql语句
             */
            ps = conn.prepareStatement(sql);
            ps.setObject(1, "%" + conName + "%");
            /**
             * 结果集合rs
             */
            rs = ps.executeQuery();
            /**
             * 创建空集合user储存数据
             */
            User user = null;
            while (rs.next()) {
                /**
                 * 把结果集中的数据都放入list集合里面
                 */
                user = new User();
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String sex = rs.getString("sex");
                String createtime = rs.getString("create_time");
                String delflag = rs.getString("del_flag");
                user.setAge(age);
                user.setId(id);
                user.setCreateTime(createtime);
                user.setSex(sex);
                user.setName(name);
                user.setDelFlag(delflag);
                result.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    private static void add(User user) {
        String sql = "insert into member(name,age,sex,create_time) values(?,?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        int count;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
            ps.setObject(1, user.getName());
            ps.setObject(2, user.getAge());
            ps.setObject(3, user.getSex());
            ps.setObject(4, user.getCreateTime());
            count = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

