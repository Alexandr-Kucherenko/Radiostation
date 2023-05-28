import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiostationTest {
    @Test
    public void showCurrentRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(5);
        int expected = 5;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showNoCurrentBelowBorderRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showCurrentZeroRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(0);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showCurrentFirstRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(1);
        int expected = 1;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showCurrentEighthRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(8);
        int expected = 8;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showCurrentMaxRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(9);
        int expected = 9;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void showNoCurrentAboveBorderRadiostation(){
        Radiostation radio = new Radiostation();
        radio.setCurrentRadiostation(10);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected,actual);

    }




}
