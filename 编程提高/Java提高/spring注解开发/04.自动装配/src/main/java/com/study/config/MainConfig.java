package com.study.config;

import org.springframework.context.annotation.*;

import com.study.bean.Person;

//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
//@ComponentScan(value="com.study", excludeFilters = {
//        @Filter(type=FilterType.ANNOTATION,classes={Controller.class, Service.class})
//})

//@ComponentScan(value="com.study", includeFilters = {
//        @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class, Service.class})
//},useDefaultFilters = false)

//@ComponentScans(
//        value = {
//                @ComponentScan(value="com.study",includeFilters = {
//					@ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//                     @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class})
//                },useDefaultFilters = false)
//        }
//)

@ComponentScans(
        value = {
                @ComponentScan(value= "com.study",includeFilters = {
                        @ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
                },useDefaultFilters = false)
        }
)
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01(){
        return new Person("lisi", 20);
    }
}
