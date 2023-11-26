package store.xianglin.sb2.config;

import org.springframework.context.annotation.*;
import store.xianglin.sb2.config.scan1.ComponentClass1;
import store.xianglin.sb2.config.scan2.ComponentClass2;
import store.xianglin.sb2.config.selector.MyDeferredImportSelector;
import store.xianglin.sb2.config.selector.MyImportSelector;

/**
 * 配置类
 *
 * @author xianglin
 */
@Configuration
@PropertySource({"classpath:demo.properties"})
@ImportResource(locations = "classpath:config/config.xml")
@Import(value = {MyImportSelector.class, MyDeferredImportSelector.class})
@ComponentScan(basePackages = "store.xianglin.sb2.config.scan1", basePackageClasses = ComponentClass2.class)
public class MyConfiguration extends SuperConfiguration implements InterfaceConfiguration {
    @Bean
    public ComponentClass1 componentMyConfiguration() {
        return new ComponentClass1();
    }

    @Configuration
    static class ConfigurationA {
        @Bean
        public ComponentClass1 componentConfigurationA() {
            return new ComponentClass1();
        }
    }

    static class LiteConfiguration {
        @Bean
        public ComponentClass1 componentLiteConfiguration() {
            return new ComponentClass1();
        }
    }
}
