package store.xianglin.sb2.config.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyDeferredImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MyDeferredImportSelector");
        // 返回配置类名称
        return new String[]{"store.xianglin.sb2.config.scan2.ComponentClass2"};
    }
}
