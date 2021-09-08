package test;


import com.one.mapper.UserMybatisMapper;
import com.one.model.UserMybatis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() {
        InputStream inputStream = null;
        try {
            String resource = "Mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test01() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMybatis userMybatis = (UserMybatis)session.selectOne("UserMybatis.selectUserById","1");
        List<UserMybatis> list =  session.selectList("UserMybatis.selectUserS");
        System.out.println(userMybatis);
        System.out.println(list.toString());

    }

    @Test
    public void test02() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMybatisMapper userMyBatisMapper = session.getMapper(UserMybatisMapper.class);
        UserMybatis userMybatis = userMyBatisMapper.selectUserById("1");
        List<UserMybatis> list = userMyBatisMapper.selectUserS();

        System.out.println(userMybatis);
        System.out.println(list.toString());

    }
}
