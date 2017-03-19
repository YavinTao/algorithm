/*
 * Copyright (c) 2017, TP-Link Co.,Ltd.
 * Author:  taoyang <taoyang@tp-link.com.cn>
 * Created: 2017-03-19
 */
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
