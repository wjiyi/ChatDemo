package com.example.administrator.chatdemo;

import android.app.PendingIntent;

import java.security.PrivateKey;

/**
 * 消息的实体类
 * Created by Administrator on 2018/4/25 0025.
 */

public class Msg {

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;

    public Msg(String content,int type)
    {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
