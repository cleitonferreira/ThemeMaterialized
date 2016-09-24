package br.com.materialized.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.materialized.controller.MaterializedController;

/*Ensina o Spring a encontrar os controllers*/

@Configuration
@ComponentScan(basePackageClasses = { MaterializedController.class })
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

}
