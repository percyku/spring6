package com.percy.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void testUpdate(){
        /*
        // 1.insert
        // create sql
        String sql ="INSERT INTO t_emp VALUES(NULL,?,?,?)";
        //use jdbcTemplate and add into parameters
//        Object[] params ={"percy", 33, "men"};
//        int rows = jdbcTemplate.update(sql, params);
        int rows = jdbcTemplate.update(sql, "percy123", 33, "men");
        System.out.println(rows);

         */


        /*
        //2 update
        // create sql
        String sql ="UPDATE t_emp SET name=? WHERE id=?";
        //use jdbcTemplate and add into parameters
        int rows = jdbcTemplate.update(sql, "percy321",2);
        System.out.println(rows);
        */


        /*
        //3 delete
        // create sql
        String sql ="DELETE FROM t_emp WHERE id=?";
        //use jdbcTemplate and add into parameters
        int rows = jdbcTemplate.update(sql, 1);
        System.out.println(rows);
        */
    }

    @Test
    public void testSelectObject(){

        //寫法一
        /*
        String sql ="SELECT * FROm t_emp WHERE id=?";

        Emp res= jdbcTemplate.queryForObject(sql,(rs,rowNum)->{
            Emp emp=new Emp();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSex(rs.getString("sex"));
            return emp;
        } ,2);

        System.out.println(res);
        */

        //寫法二
        String sql ="SELECT * FROm t_emp WHERE id=?";
        Emp res = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(res);
    }

    @Test
    public void testSelectList(){
        String sql ="SELECT * FROm t_emp WHERE 1=1";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(empList);
    }

    @Test
    public void  testSelectSingleValue(){
        String sql ="SELECT count(*) FROm t_emp WHERE 1=1";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }


}
