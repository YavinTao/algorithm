
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();

    }
}
