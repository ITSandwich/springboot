package com.sandwich.first.hello;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.crypto.Data;
import java.util.Date;

public class Greeting {

    private final long id;
    private final String content;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private final Date createTime;

    public Date getCreateTime() {
        return createTime;
    }


    public Greeting(long id, String content, Date date) {
        this.id = id;
        this.content = content;
        this.createTime = date;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
