package com.alex.utils;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @ClassName:
 * @Description:
 * @author: Ouzl
 * @create: 2019-08-28 00:23
 */
@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper pageHelper(){

        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }


}
