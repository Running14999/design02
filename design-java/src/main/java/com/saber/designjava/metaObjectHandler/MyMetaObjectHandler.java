package com.saber.designjava.metaObjectHandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

//自动填充
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("start insert fill ....");
        this.strictInsertFill(metaObject, "status",String.class,"插入");
        this.strictInsertFill(metaObject, "create_time", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
        this.strictUpdateFill(metaObject, "update_time", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("start update fill ....");
        this.strictUpdateFill(metaObject, "status",String.class,"更新");
        this.strictUpdateFill(metaObject, "update_time", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
    }


}
