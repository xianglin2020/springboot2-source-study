package store.xianglin.sb2.config;

import org.springframework.context.annotation.Bean;
import store.xianglin.sb2.config.scan1.ComponentClass1;

/**
 * 默认方法
 *
 * @author xianglin
 */
public interface InterfaceConfiguration {
    @Bean
    default ComponentClass1 componentInterfaceConfiguration() {
        return new ComponentClass1();
    }
}
