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
    public void shouldSetIDecreaseVolume(){
        Radio radio = new Radio();
        radio.setDecreaseVolume(5);
        assertEquals(4, radio.getDecreaseVolume());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setNextStation(9);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setPrevStation(6);
        assertEquals(5, radio.getPrevStation());
    }


}