package store.xianglin.sb2.event;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulter implements EventMulticaster {
    @Resource
    private List<WeatherListener> listenerList;

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        this.listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    abstract void doStart();

    abstract void doEnd();

    @Override
    public void addListener(WeatherListener weatherListener) {
        if (this.listenerList == null) {
            this.listenerList = new ArrayList<>();
        }
        this.listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        this.listenerList.remove(weatherListener);
    }
}
