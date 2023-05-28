import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiostationTest {
    @Test
    public void showCurrentRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(5);
        int expected = 5;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showNoCurrentBelowBorderRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentZeroRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(0);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentFirstRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(1);
        int expected = 1;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentEighthRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(8);
        int expected = 8;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentMaxRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(9);
        int expected = 9;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showNoCurrentAboveBorderRadiostation() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(10);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentNextRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(4);
        radio.next();
        int expected = 5;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentNextZeroRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentNextEightRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showNoCurrentNextAboveBorderRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentPrevRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentPrevZeroRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentPrevFirstRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentPrevMaxRadiostantion() {
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentDecreaseMaxVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentDecreaseVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(80);
        radio.decreaseVolume();
        int expected = 79;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentDecreaseFirstVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentDecreaseZeroVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentIncreaseZeroVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentIncreaseVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(15);
        radio.increaseVolume();
        int expected = 16;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentIncreaseMaxVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentIncreaseAboveBorderVolume() {
        Radiostation radio = new Radiostation();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


}
