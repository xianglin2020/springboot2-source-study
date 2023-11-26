package store.xianglin.sb2.config.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MyImportSelector");
        // 返回配置类名称
        return new String[]{"store.xianglin.sb2.config.scan1.ComponentClass1"};
    }
}
