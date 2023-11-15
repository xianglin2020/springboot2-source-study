package store.xianglin.sb2.event;

public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);
    void addListener(WeatherListener weatherListener);
    void removeListener(WeatherListener weatherListener);
}
