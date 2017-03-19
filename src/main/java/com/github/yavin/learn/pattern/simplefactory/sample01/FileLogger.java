
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class FileLogger implements Logger {
    @Override
    public void write() {
        System.out.println("文件日志记录");
    }
}
