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
        assertEquals(24, radio.getRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio(49);
        radio.setRadioStation(49);
        assertEquals(48, radio.getRadioStation());
    }

    @Test
    public void shouldSetFirstRadioStation() {
        Radio radio = new Radio(49);
        radio.setRadioStation(1);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(20);
        radio.setRadioStation(20);
        assertEquals(19, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio radio = new Radio(20);
        radio.setRadioStation(1);
        assertEquals(0, radio.getRadioStation());
    }

    //    Я делал что при установке нулевой станции она с номером 1,
//    а при установке максимальной станции она с в ячейке меньшей на еденицу,
//    т.о. что в ячейке [0] станция с номером 1, а допустим в ячейке [19] станция с номером 20.
//    поэтому станция и устанавливается 20, но она в ячейке [19].
//    Поэтому и ожидаемый результат номер ячейки, а устанавливаем мы станцию.
//    Обычно же не бывает станции ноль, а начинаем считать с 1, или я может что-то от себя лишнего добавил?
//    Я думал мне это и надо было сделать.

    @Test
    public void shouldSetRadioStation2() {
        Radio radio = new Radio();
        radio.setAmountRadioStation(20);
        radio.setRadioStation(20);
        assertEquals(19, radio.getRadioStation());
    }

    @Test
    public void shouldSetRadioStation3() {
        Radio radio = new Radio();
        radio.setAmountRadioStation(20);
        radio.setRadioStation(2);
        assertEquals(1, radio.getRadioStation());
    }

}