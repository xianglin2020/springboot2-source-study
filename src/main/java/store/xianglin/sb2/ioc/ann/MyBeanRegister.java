package store.xianglin.sb2.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import store.xianglin.sb2.ioc.Monkey;

@Component
public class MyBeanRegister implements BeanDefinitionRegistryPostProcessor, InstantiationAwareBeanPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 注入 BeanDefinition
        var definition = new RootBeanDefinition();
        definition.setBeanClass(Monkey.class);
        registry.registerBeanDefinition("monkey", definition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 为 BeanDefinition 注入属性
        var monkey = beanFactory.getBeanDefinition("monkey");
        monkey.getPropertyValues().addPropertyValue("property", "value from postProcessBeanFactory");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        // 自定义创建 Bean，不会执行后续的 doCreateBean 方法以及属性注入等
//        if (beanClass.equals(Monkey.class)) {
//            return new Monkey();
//        }
        return null;
    }
}
