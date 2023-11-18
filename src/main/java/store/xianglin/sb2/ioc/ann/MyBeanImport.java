package store.xianglin.sb2.ioc.ann;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import store.xianglin.sb2.ioc.Bird;

public class MyBeanImport implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        var definition = new RootBeanDefinition();
        definition.setBeanClass(Bird.class);
        registry.registerBeanDefinition("bird", definition);
    }
}
