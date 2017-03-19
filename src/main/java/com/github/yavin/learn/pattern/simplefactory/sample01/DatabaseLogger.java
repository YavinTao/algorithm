
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class DatabaseLogger implements Logger {


    public void write() {
        System.out.println("数据库日志记录");
    }
}
