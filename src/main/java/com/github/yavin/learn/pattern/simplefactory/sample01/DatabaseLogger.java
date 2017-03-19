/*
 * Copyright (c) 2017, TP-Link Co.,Ltd.
 * Author:  taoyang <taoyang@tp-link.com.cn>
 * Created: 2017-03-19
 */
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class DatabaseLogger implements Logger {


    public void write() {
        System.out.println("数据库日志记录");
    }
}
