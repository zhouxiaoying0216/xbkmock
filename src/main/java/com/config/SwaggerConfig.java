package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author zxy
 * @create 2019/10/31 18:07
 * <p>
 * * @Configuration // SpringBoot 专门用于加载“配置类”的标签
 * * @EnableSwagger2 // 开启 swagger-ui
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {  // 方法名随意
        return new Docket(DocumentationType.SWAGGER_2)
                // public Docket apiInfo(ApiInfo apiInfo) 需要我们编写 apiInfo() 方法，并返回 ApiInfo 类型的对象作为参数。
                .apiInfo(apiInfo())
                // swagger-ui 访问路径，如：http://ip:port/swagger-ui.html
                .pathMapping("/")
                .select()
                // PathSelectors 为选择器，在选择器中添加正则表达式，通过正则表达式，定位到哪些类的方法，需要生成接口文档
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    // private ApiInfo apiInfo() 需要我们编写 apiInfo() 方法，并返回 ApiInfo 类型的对象作为参数。
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("My api doc")
                .contact(new Contact("zy", "", "oeardi@qianbao.com"))
                .description("这是我的 swagger-ui 生成的接口文档")
                .version("1.0.0")
                .build();
    }

}
