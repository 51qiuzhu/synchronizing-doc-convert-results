package com.liumapp.demo.convert.sync.config;

import com.liumapp.convert.doc.Doc2PDF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file ConvertConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/5/18
 */
@Configuration
public class ConvertConfig {

    @Bean
    public Doc2PDF doc2PDF () {
        return new Doc2PDF();
    }

}
