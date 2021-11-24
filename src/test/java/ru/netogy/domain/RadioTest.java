package ru.netogy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {



    @Test
    public void shouldSetRadioStationInRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation( 9 );
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void shouldSetRadioStationInRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation( 0 );
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationInRangeMiddle() {
        Radio radio = new Radio();
        radio.setRadioStation( 5 );
        assertEquals(5, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStationOutRangeBottom() {
        Radio radio = new Radio();
        radio.setRadioStation( -1 );
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void shouldSetRadioStationOutRangeUp() {
        Radio radio = new Radio();
        radio.setRadioStation( 10 );
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetIncreaseVolume(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(5);
        assertEquals(6, radio.getIncreaseVolume());

    }

    @Test
    public void shouldSetIncreaseVolumeOutRangeUp(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(11);
        assertEquals(10, radio.getIncreaseVolume());

    }

    @Test
    public void shouldSetIncreaseVolumeOutRangeBottom(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(-2);
        assertEquals(0, radio.getIncreaseVolume());

    }

    @Test
    public void shouldSetDecreaseVolumeOutRangeUp(){
        Radio radio = new Radio();
        radio.setDecreaseVolume(11);
        assertEquals(0, radio.getDecreaseVolume());
    }

    @Test
    public void shouldSetDecreaseVolumeOutRangeBottom(){
        Radio radio = new Radio();
        radio.setDecreaseVolume(-2);
        assertEquals(0, radio.getDecreaseVolume());
    }

    @Test
    public void shouldSetDecreaseVolume(){
        Radio radio = new Radio();
        radio.setDecreaseVolume(5);
        assertEquals(4, radio.getDecreaseVolume());
    }

    @Test
    public void shouldSetNextStationUp() {
        Radio radio = new Radio();
        radio.setNextStation(9);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldSetNextStationBottom() {
        Radio radio = new Radio();
        radio.setNextStation(0);
        assertEquals(1, radio.getNextStation());
    }

    @Test
    public void shouldSetNextStationOutRangeUp() {
        Radio radio = new Radio();
        radio.setNextStation(10);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldSetNextStationOutRangeBottom() {
        Radio radio = new Radio();
        radio.setNextStation(-1);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldSetNextStationInRange() {
        Radio radio = new Radio();
        radio.setNextStation(1);
        assertEquals(2, radio.getNextStation());
    }

    @Test
    public void shouldSetPrevStationInRange() {
        Radio radio = new Radio();
        radio.setPrevStation(5);
        assertEquals(4, radio.getPrevStation());
    }

    @Test
    public void shouldSetPrevStationOutRangeBottom() {
        Radio radio = new Radio();
        radio.setPrevStation(-1);
        assertEquals(0, radio.getPrevStation());
    }

    @Test
    public void shouldSetPrevStationOutRangeUp() {
        Radio radio = new Radio();
        radio.setPrevStation(11);
        assertEquals(0, radio.getPrevStation());
    }

    @Test
    public void shouldSetPrevStationOnBorderBottom() {
        Radio radio = new Radio();
        radio.setPrevStation(0);
        assertEquals(9, radio.getPrevStation());
    }
    @Test
    public void shouldSetPrevStationOnBorderUp() {
        Radio radio = new Radio();
        radio.setPrevStation(9);
        assertEquals(8, radio.getPrevStation());
    }

}