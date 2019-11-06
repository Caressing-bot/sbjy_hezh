package com.Test.jdbctemplate;

import com.Test.bean.User;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class TestDao {
    private JdbcTemplate template = new JdbcTemplate(JdbctemplateUtil.getDataSource());
    public static void main(String[] args) {
//        /**
//         * 模糊查询
//         */
//        new TestDao().listUser("小",18).stream().forEach(n->{
//            System.out.println(n);
//        });
//        /**
//         * 查询全部数据
//         */
//        new TestDao().list().stream().forEach(n->{
//            System.out.println(n);
//        });
        /**
         * 添加
         */
        TestDao Dao = new TestDao();
//        User user = new User();
//        user.setName("汪峰");
//        user.setSex("f");
//        user.setAge(30);
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String datastr = sdf.format(date);
//        user.setCreateTime(datastr);
//        Dao.addUser(user);
        /**
         * 删除
         */
//        Dao.delcectUserById(10);
        /**
         * 通过ID查询
         */
        User user = Dao.selecByIDid(4);
        System.out.println(user);
    }

    /**
     * 查询全部
     * @return
     */
    public List<User> list(){
        String sql = "select * from member";
        /**
         * 返回值需要和之前的一样User。class和List的泛型
         */
        return template.query(sql,new BeanPropertyRowMapper<>(User.class));
    }

    /**
     * 模糊查询
     * @param name
     * @return
     */
    public List<User> listUser(String name,Integer age){
        String sql = "select * from member where name like ? and age >?";
        return template.query(sql,new BeanPropertyRowMapper<>(User.class),"%"+name+"%",age);
    }

    /**
     * 添加
     * @param user
     */
    public void addUser(User user){
        String sql = "insert into member(name,age,sex,create_time) values(?,?,?,?)";
        template.update(sql,user.getName(),user.getAge(),user.getSex(),user.getCreateTime());
    }
    /**
     * 删除
     */
    public void delcectUserById(Integer id){
        String sql = "delete from member where id = ?";
        template.update(sql,id);
    }
    /**
     * 通过ID查询对象
     */
    public User selecByIDid(Integer id){
        String sql = "select *  from member where id = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
    }
}
