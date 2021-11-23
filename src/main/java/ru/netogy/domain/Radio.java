package ru.netogy.domain;

public class Radio {

    private int radioStation;
    private int nextStation;
    private int prevStation;
    private int increaseVolume;
    private int decreaseVolume;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {

        if (increaseVolume >= 10) {
            increaseVolume = 10;
        }
        if (increaseVolume < 0) {
            return;
        }
        if (increaseVolume < 10) {
            increaseVolume = increaseVolume + 1;
        }

        this.increaseVolume = increaseVolume;
    }

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setDecreaseVolume(int decreaseVolume) {
        if (decreaseVolume <= 0) {
            decreaseVolume = 0;
        }
        if (decreaseVolume > 10) {
            return;
        }
        if (decreaseVolume > 0) {
            decreaseVolume = decreaseVolume - 1;
        }
        this.decreaseVolume = decreaseVolume;
    }

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        if (nextStation < 0) {
            return;
        }
        if (nextStation > 9) {
            return;
        }
        if (nextStation == 9) {
            nextStation = -1;
        }
        if (nextStation < 9) {
            nextStation++;
        }

        this.nextStation = nextStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (prevStation < 0) {
            return;
        }
        if (prevStation > 9) {
            return;
        }
        if (prevStation == 0) {
            prevStation = 10;
        }
        if (prevStation > 0) {
            prevStation--;
        }
        this.prevStation = prevStation;
    }


}

