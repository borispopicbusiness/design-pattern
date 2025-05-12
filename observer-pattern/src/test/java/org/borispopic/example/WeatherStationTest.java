package org.borispopic.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class WeatherStationTest {
    @Test
    void registerObserver() {
        WeatherStation weatherStation = new WeatherStation();
        Device testDeviceOne = Device.builder().deviceName("Test Device One").build();
        Device testDeviceTwo = Device.builder().deviceName("Test Device Two").build();

        weatherStation.registerObserver(testDeviceOne);
        weatherStation.registerObserver(testDeviceTwo);

        assertThat(weatherStation.getObservers()).hasSize(2);
        assertThat(weatherStation.getObservers()).contains(testDeviceOne);
        assertThat(weatherStation.getObservers()).contains(testDeviceTwo);
    }

    @Test
    void removeObserver() {
        WeatherStation weatherStation = new WeatherStation();
        Device testDeviceOne = Device.builder().deviceName("Test Device One").build();
        Device testDeviceTwo = Device.builder().deviceName("Test Device Two").build();

        weatherStation.registerObserver(testDeviceOne);
        weatherStation.registerObserver(testDeviceTwo);

        assertThat(weatherStation.getObservers()).hasSize(2);
        assertThat(weatherStation.getObservers()).contains(testDeviceOne);
        assertThat(weatherStation.getObservers()).contains(testDeviceTwo);

        weatherStation.removeObserver(testDeviceOne);
        assertThat(weatherStation.getObservers()).hasSize(1);
        assertThat(weatherStation.getObservers()).doesNotContain(testDeviceOne);
        assertThat(weatherStation.getObservers()).contains(testDeviceTwo);

        weatherStation.removeObserver(testDeviceTwo);
        assertThat(weatherStation.getObservers()).hasSize(0);
        assertThat(weatherStation.getObservers()).doesNotContain(testDeviceTwo);
    }

    @Test
    void notifyObservers() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        WeatherStation weatherStation = new WeatherStation();
        Device testDeviceOne = Device.builder().deviceName("Device 1").build();
        Device testDeviceTwo = Device.builder().deviceName("Device 2").build();

        weatherStation.registerObserver(testDeviceOne);
        weatherStation.registerObserver(testDeviceTwo);

        weatherStation.notifyObservers();

        String capturedOutput = outputStreamCaptor.toString();
        assertThat(capturedOutput).contains("Message 0 from WeatherStation");

        weatherStation.removeObserver(testDeviceOne);
        weatherStation.removeObserver(testDeviceTwo);
        System.setOut(System.out);
    }
}