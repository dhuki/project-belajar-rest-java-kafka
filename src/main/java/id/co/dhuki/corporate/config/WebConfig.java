package id.co.dhuki.corporate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
// This will set up the basic support we need for an MVC project,
// such as registering controllers and mappings, type converters, validation support,
// message converters and exception handling.

// The @EnableWebMvc annotation provides the Spring Web MVC configuration
// such as setting up the dispatcher servlet, enabling the @Controller and the @RequestMapping annotations
// and setting up other defaults.
@ComponentScan(basePackages = "id.co.dhuki.corporate")
// @ComponentScan to specify packages to scan for components.
//@ComponentScan configures the component scanning directive, specifying the packages to scan.
public class WebConfig implements WebMvcConfigurer {
//    If we want to customize this configuration, we need to implement the WebMvcConfigurer interface:

//    In this example, we've registered a ViewResolver bean that will return .jsp views from the /WEB-INF/view directory. (we dont need this)
//
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("index");
    }


    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();

        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/view/");
        bean.setSuffix(".jsp");

        return bean;
    }*/
}
