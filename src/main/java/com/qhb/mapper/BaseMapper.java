package com.qhb.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * Created by qianying on 2018/7/16.
 */
public class BaseMapper<T> {

    private Class<T> clazz;

    @Resource(name = "applicationContext")
    ApplicationContext applicationContext;

    @Resource
    SqlSessionFactory sqlSessionFactory;

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public BaseMapper(){
        ParameterizedType type=(ParameterizedType)this.getClass().getGenericSuperclass();
        clazz=(Class<T>) type.getActualTypeArguments()[0];
    }

    public void test(){

        SqlSession session = sqlSessionFactory.openSession();


        applicationContext.getBean("");

        sqlSessionFactory.openSession(true);

        sqlSessionTemplate.insert("UserMapper.insert");
        Class clazs=UserMapper.class;
        Method[] methods=clazs.getDeclaredMethods();
        for (Method method:methods){
            if (method.getName().startsWith("insert")){

            }
        }

    }

}
