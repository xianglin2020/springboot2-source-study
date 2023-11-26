package store.xianglin.sb2.config;

import org.springframework.context.annotation.Bean;
import store.xianglin.sb2.config.scan1.ComponentClass1;

/**
 * 配置类（父类）
 *
 * @author xianglin
 */
public abstract class SuperConfiguration {
    @Bean
    public ComponentClass1 componentSuperConfiguration() {
        return new ComponentClass1();
    }
}
