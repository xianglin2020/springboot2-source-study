package store.xianglin.sb2.event;

import org.springframework.stereotype.Component;

@Component
public class SnowListener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
