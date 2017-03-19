
package com.github.yavin.learn.pattern.simplefactory.sample01;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
