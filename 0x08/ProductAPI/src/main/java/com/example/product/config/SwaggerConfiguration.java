package com.example.product.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.VendorExtension;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.product.controller"))
                .paths(regex("/api-product.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Product API REST",
                "API REST - exemplos",
                "1.0",
                "Terms of Service",
                new Contact("TechCamps", "https://github.com/gabivenerando",
                        "gabrielliv@ciandt.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}

