package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
   public void stationTest() {
      Radio radio = new Radio(10) ;
      radio.setCurrentStation(4);
      int expected = 4;
      int actual = radio.getCurrentStation();
      Assertions.assertEquals(expected, actual);
   }

   @Test
   public void maxStationTest() {
       Radio radio = new Radio(10) ;
       radio.setCurrentStation(9);
       int expected = 9;
       int actual = radio.getCurrentStation();
       Assertions.assertEquals(expected, actual);
   }

   @Test
    public void aboveMaxStationTest() {
       Radio radio = new Radio(10);
       radio.setMaxStation(20);
       int expected = 9;
       int actual = radio.getMaxStation();
       Assertions.assertEquals(expected, actual);
   }

    @Test
    public void maxMaxStationTest() {
        Radio radio = new Radio(10);
        radio.setMaxStation(10);
        int expected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underMaxStationTest() {
        Radio radio = new Radio(10);
        radio.setMaxStation(-1);
        int expected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
   public void shouldCurrentStationAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.nextVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationAboveMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(49);
        radio.prevVolume();
        int expected = 48;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevVolumeAboveMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
