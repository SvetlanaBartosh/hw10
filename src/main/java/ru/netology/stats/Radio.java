package ru.netology.stats;

public class Radio {

    private int minStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int maxStation;

    public Radio(){
        this.maxStation = 9;
    }

    public Radio(int stationsCount){
        this.maxStation = stationsCount - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        if (maxStation > 9){
            return;
        }
        if (maxStation < minStation){
            return;
        }
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }
}