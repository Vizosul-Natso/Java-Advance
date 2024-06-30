package com.natso.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.natso.config.Configuration;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // Return null if there's no root application context (e.g., no parent context)
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Specify the configuration class
        return new Class[] { Configuration.class };
    }

    @Override
    protected String[] getServletMappings() {
        // Map the dispatcher servlet to "/"
        return new String[] { "/" };
    }
}
