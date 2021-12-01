package ru.netogy.domain;

public class Radio {


    private int radioStation;
    private int currentVolume;



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
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
        if (currentVolume <= 10) {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }



    public void nextStation() {
//        if (radioStation < 10) {
                radioStation = radioStation + 1;
//        }
        if (radioStation == 10) {
            radioStation = 0;
        }

    }

    public void prevStation() {
//        if (radioStation < 10) {
                radioStation = radioStation - 1;
//        }
        if (radioStation < 0) {
            radioStation = 9;
        }
    }

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


}


