package org.project.customer.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface Converter<T,Z> {
    T converter(Z clss);
}
