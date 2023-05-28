public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;

    public void next() {
        if (currentRadiostation != 9) {
            currentRadiostation++;
        } else {
            currentRadiostation = 0;
        }
    }

    public void prev() {
        if (currentRadiostation != 0) {
            currentRadiostation--;
        } else {
            currentRadiostation = 9;
        }
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < 0) {
            return;
        }
        if (currentRadiostation > 9) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume =0;
        }

    }
}