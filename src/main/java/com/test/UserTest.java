package com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {
    @Test
    public void getConnTest(){
        SqlSession sqlSession=MybatisUtil.createSqlSession();
        if(sqlSession!=null){
            System.out.println("θΏζ₯ζε");
        }
        MybatisUtil.closeSqlSession(sqlSession); }
}