package com.qhb.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by qianying on 2018/7/16.
 */
@Mapper
public interface SqlTemplate<T> {

    @Insert({})
    int insert(T entity);

    @Insert({})
    int inserts(List<T> entities);

    @Update({})
    int updateById(Long id);

    @Update({})
    int updateByParams(Object... params);

    @Delete({})
    int deleteById(Long id);

    @Delete({})
    int deleteByParams(Object... params);

    @Select({})
    T selectOneById(Long id);

    @Select({})
    T selectOneByParams(Object... params);

    @Select({})
    List<T> selectListByParams(Object... params);


}
