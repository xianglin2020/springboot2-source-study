package store.xianglin.sb2.event;

import junit.framework.TestCase;

public class EventMulticasterTest extends TestCase {
    public void testEventMulticast() {
        var eventMulticaster = new WeatherEventMulticaster();
        var weatherListener = new RainListener();
        eventMulticaster.addListener(weatherListener);
        eventMulticaster.addListener(new SnowListener());

        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());

        eventMulticaster.removeListener(weatherListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
    }
}