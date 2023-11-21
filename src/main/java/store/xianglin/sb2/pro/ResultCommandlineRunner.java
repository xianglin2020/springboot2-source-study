package store.xianglin.sb2.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandlineRunner implements CommandLineRunner, EnvironmentAware, MyAware {
    private Environment environment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(environment.getProperty("property"));
        System.out.println(flag.isCanOperate());
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    private Flag flag;

    @Override
    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}
