package com.saber.designjava.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 图书
 * </p>
 *
 * @author caochenlei
 * @since 2022-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书名
     */
    private String name;

    /**
     * 状态
     */
    private String status;

    /**
     * 借书人
     */
    private String user;

    private Integer del;


}
