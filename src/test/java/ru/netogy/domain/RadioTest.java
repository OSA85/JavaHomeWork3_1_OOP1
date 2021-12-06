package ru.netogy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());

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
        radio.setCurrentVolume(70);
        radio.decreaseVolume();
        assertEquals(69, radio.getCurrentVolume());

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
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseCurrentVolumeInRangeBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldNextStationInRangeStandard() {
        Radio radio = new Radio();
        radio.setRadioStation(2);
        radio.numberNextStation();
        assertEquals(2, radio.getRadioStation());

    }

    @Test
    public void shouldNextStationInRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.numberNextStation();
        assertEquals(1, radio.getRadioStation());

    }

    @Test
    public void shouldNextStationInStandardRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.numberNextStation();
        assertEquals(1, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInRangeStandard() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prevStation();
        assertEquals(3, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInStandardRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.prevStation();
        assertEquals(9, radio.getRadioStation());

    }

    @Test
    public void shouldPrevStationInStandardRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.prevStation();
        assertEquals(7, radio.getRadioStation());

    }

    @Test
    public void shouldSetRadioStationInStandardRange() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        assertEquals(4, radio.getRadioStation());
    }

    @Test
    public void shouldPrevStationOutStandardRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        radio.prevStation();
        assertEquals(9, radio.getRadioStation());

    }

    @Test
    public void shouldSetRadioStationInStandardRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationInStandardRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        assertEquals(8, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationOutStandardRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationOutStandardRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void shouldSetRadioStationInRange() {
        Radio radio = new Radio(49);
        radio.setRadioStation(25);
        assertEquals ( 24, radio.getRadioStation());
    }
    @Test
    public void shouldSetMaxRadioStation() {
    Radio radio = new Radio(49);
    radio.setRadioStation(49);
    assertEquals ( 48, radio.getRadioStation());
}
    @Test
    public void shouldSetFirstRadioStation() {
        Radio radio = new Radio(49);
        radio.setRadioStation(1);
        assertEquals ( 0, radio.getRadioStation());
    }
}