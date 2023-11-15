package store.xianglin.sb2.event;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WeatherRunListener {
    @Resource
    private WeatherEventMulticaster eventMulticaster;

    public void snow(){
        eventMulticaster.multicastEvent(new SnowEvent());
    }

    public void rain(){
        eventMulticaster.multicastEvent(new RainEvent());
    }
}
