package org.jasig.portlet.announcements.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "org.jasig.portlet.announcements.mvc.servlet")
@SuppressWarnings("unused")
public class WebMvcConfig extends WebMvcConfigurerAdapter {


}
