package org.borispopic;

import org.borispopic.example.Device;
import org.borispopic.example.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = WeatherStation.builder().build();
        Device deviceOne = Device.builder().deviceName("Device One").build();
        Device deviceTwo = Device.builder().deviceName("Device Two").build();

        weatherStation.registerObserver(deviceOne);
        weatherStation.registerObserver(deviceTwo);

        try {
            weatherStation.notifyObservers();
            Thread.sleep(1000);

            weatherStation.removeObserver(deviceOne);
            Thread.sleep(1000);

            weatherStation.notifyObservers();
            Thread.sleep(1000);

            weatherStation.removeObserver(deviceTwo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}