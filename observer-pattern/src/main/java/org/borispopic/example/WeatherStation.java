package org.borispopic.example;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.borispopic.principle.Observer;
import org.borispopic.principle.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@Getter
public class WeatherStation implements Subject<String> {
    private static final Logger logger = LoggerFactory.getLogger(WeatherStation.class);
    private static long counter = 0L;
    private final List<Observer<String>> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer<String> observer) {
        observers.add(observer);
        logger.info("WeatherStation: registered observer: {}", ((Device)observer).getDeviceName());
    }

    @Override
    public void removeObserver(Observer<String> observer) {
        observers.remove(observer);
        logger.info("WeatherStation: removed observer: {}", ((Device)observer).getDeviceName());
    }

    @Override
    public void notifyObservers() {
        for(Observer<String> iterator : observers) {
            iterator.onUpdate("Message " + counter++ + " from WeatherStation");
        }
    }
}
