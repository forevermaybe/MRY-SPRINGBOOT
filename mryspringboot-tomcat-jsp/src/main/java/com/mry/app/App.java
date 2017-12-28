package com.mry.app;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.mry.filter.MryFilter;
import com.mry.web.MryCtrl;

@SpringBootApplication(scanBasePackageClasses = { MryCtrl.class})
public class App extends SpringBootServletInitializer{
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        Filter filter = new MryFilter();
        registration.setFilter(filter);
        registration.addUrlPatterns("/*");
        registration.setName("mryfilter");
        return registration;
    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
