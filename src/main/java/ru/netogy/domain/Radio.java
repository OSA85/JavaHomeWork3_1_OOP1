package ru.netogy.domain;

public class Radio {


    private int amountRadioStation = 9;
    private int radioStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        if (currentVolume < 100) {
            if (currentVolume >= 0) {
                currentVolume = currentVolume + 1;
            }
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume <= 100) {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
    }


    public void nextStation() {
//        if (radioStation < 10) {
        radioStation = radioStation + 1;
//        }
        if (radioStation == amountRadioStation + 1) {
            radioStation = 0;
        }

    }

    public void prevStation() {
//        if (radioStation < 10) {
        radioStation = radioStation - 1;
//        }
        if (radioStation < 0) {
            radioStation = amountRadioStation;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > amountRadioStation) {
            return;
        }
        this.radioStation = radioStation;

    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setAmountRadioStation(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }


}


