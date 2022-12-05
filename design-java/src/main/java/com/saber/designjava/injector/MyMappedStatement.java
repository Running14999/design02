package com.saber.designjava.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

public class MyMappedStatement extends AbstractMethod {
    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        // 接口中的方法名
        String method = "deleteAll";
        // 该方法执行语句
        String sql = "delete from " + tableInfo.getTableName();
        // 创建SqlSource
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        // 构造一个删除的MappedStatement并返回
        return this.addDeleteMappedStatement(mapperClass, method, sqlSource);
    }

}
