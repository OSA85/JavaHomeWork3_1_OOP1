package ru.netogy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());

    }
    @Test
    public void shouldIncreaseCurrentVolumeOutRangeBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseCurrentVolumeOutRangeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeOutRangeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeOutRangeBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeInRangeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeInRangeBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldNextStationInRange() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getRadioStation());

    }

    @Test
    public void shouldNextStationInRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.nextStation();
        assertEquals(1, radio.getRadioStation());

    }

    @Test
    public void shouldNextStationInRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInRange() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prevStation();
        assertEquals(4, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevStation();
        assertEquals(9, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.prevStation();
        assertEquals(8, radio.getRadioStation());

    }

    @Test
    public void shouldSetRadioStationInRange() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        assertEquals(5, radio.getRadioStation());
    }

    @Test
    public void shouldPrevStationOutRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        radio.prevStation();
        assertEquals(9, radio.getRadioStation());

    }

    @Test
    public void shouldSetRadioStationInRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationInRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationOutRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationOutRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetMaxAmountRadioStation() {
    Radio radio = new Radio(50);
    radio.setRadioStation(50);
    assertEquals ( 50, radio.getRadioStation());
}
}