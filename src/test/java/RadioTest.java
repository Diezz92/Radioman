import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void NextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void NextRadioStationMiddle() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void PrevRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevRadioStationMiddle() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PlusVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        volume.plus();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PlusVolumeMiddle() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.plus();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MinusVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.minus();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MinusVolumeMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        volume.minus();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MinusVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        volume.minus();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MinusVolumeMiddle() {
        Radio volume = new Radio();

        volume.setCurrentVolume(6);
        volume.minus();

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
