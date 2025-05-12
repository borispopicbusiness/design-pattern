package org.borispopic.example;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import org.borispopic.principle.Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Builder
@Data
@Getter
public class Device implements Observer<String> {
    private static final Logger logger = LoggerFactory.getLogger(Device.class);

    @NonNull
    private String deviceName;

    @Override
    public void onUpdate(String update) {
        //System.out.println("DeviceObserverImpl: " + update);
        logger.info("{} - onupdate({})", deviceName, update);
        refreshScreen(update);
    }

    private void refreshScreen(String update) {
        logger.info("Refreshing screen for {} {}", deviceName, update);
    }
}
