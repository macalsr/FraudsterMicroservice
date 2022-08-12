package org.project.builder;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface Converter<T,Z> {
    T converter(Z clss);
}
