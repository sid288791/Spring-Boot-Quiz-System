package com.quiz.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author siddharth pandey
 *
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter
{	
    /* (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
     */
    @Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		registry.viewResolver(resolver);
	}
}
