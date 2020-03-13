package id.co.dhuki.corporate.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // it will look to all @configuration annotation
    // to do configuration
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebConfig.class, KafkaConsumerConfig.class };
    }

    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    // it will mapping url controller from context path
    // if it's not define it will return 404 (not Found)
    // for all url path under context path
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
