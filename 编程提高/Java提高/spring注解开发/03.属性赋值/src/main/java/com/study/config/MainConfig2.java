package com.study.config;

import com.study.bean.Color;
import com.study.bean.ColorFactoryBean;
import com.study.bean.Person;
import com.study.bean.Red;
import com.study.condition.LinuxCondition;
import com.study.condition.MyImportBeanDefinitionRegistrar;
import com.study.condition.MyImportSelector;
import com.study.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@Conditional({WindowsCondition.class})
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

//    @Scope("prototype")
//    @Lazy
    @Bean("person")
    public Person person(){
        return new Person("zhangsan", 26);
    }

    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",62);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person("linus", 48);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
