package com.qhb.core.mapper_potting;

import org.springframework.context.annotation.Configuration;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by qianying on 2018/7/15.
 */
@Configuration
public class MpConfiguration {

    private void test() {
        Class clazz;
        try {
            clazz = ClassLoader.getSystemClassLoader().loadClass("");
            java.lang.reflect.Constructor[] constructors = clazz.getConstructors();
            for (java.lang.reflect.Constructor constructor : constructors) {
                if (constructor.isAccessible()) {
                    constructor.getParameterTypes();
                    constructor.newInstance("", "");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ie) {
            ie.printStackTrace();
        } catch (InstantiationException iie) {
            iie.printStackTrace();
        } catch (InvocationTargetException ite) {
            ite.printStackTrace();
        }
    }
}
