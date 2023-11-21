package store.xianglin.sb2.pro;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyAwareProcessor implements BeanPostProcessor {
    private final ConfigurableApplicationContext context;

    public MyAwareProcessor(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Aware) {
            if (bean instanceof MyAware) {
                ((MyAware) bean).setFlag(context.getBean("flag", Flag.class));
            }
        }
        return bean;
    }
}
