package com.zengyong.tomatoclock.bean;

import com.zengyong.tomatoclock.utils.DateConverter;

import java.util.Date;

import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * @author : Zeyo
 * e-mail : zengyongsun@163.com
 * date   : 2019/4/16 13:19
 * desc   :
 * version: 1.0
 */
@Entity
public class ToDoBean {

    @Id(assignable = true)
    public long id;

    public String content;

    public String timeRemind;

    /**
     * 待办类型
     * {@link com.zengyong.tomatoclock.Constant#TO_DO_TYPE_LIST}
     * {@link com.zengyong.tomatoclock.Constant#TO_DO_TYPE_TODAY}
     */
    public int type;

    @Convert(converter = DateConverter.class, dbType = Long.class)
    public Date createDate;

    @Convert(converter = DateConverter.class, dbType = Long.class)
    public Date updateDate;

    /**
     * 是否完成 默认 false
     */
    public boolean isComplete;

    /**
     * 是否删除 默认 false
     */
    public boolean isDelect;

}
