public class Radiostation {
    private int currentRadiostation;
    private int maxRadiostation = 9;
    private int minRadiostation = 0;
    private  int quantityRadiostation = 10;
    private int currentVolume;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;

    public Radiostation(){
        this.maxRadiostation = 9;


    }
    public Radiostation(int quantityRadiostation){
        this.maxRadiostation = quantityRadiostation - 1;

    }

    public void next() {
        if (currentRadiostation != maxRadiostation) {
            currentRadiostation++;
        } else {
            currentRadiostation = minRadiostation;
        }
    }

    public void prev() {
        if (currentRadiostation != minRadiostation) {
            currentRadiostation--;
        } else {
            currentRadiostation = maxRadiostation;
        }
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }
    public int getMaxRadiostation(){
        return maxRadiostation;
    }
    public int getMinRadiostation(){
        return minRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < minRadiostation) {
            return;
        }
        if (currentRadiostation > maxRadiostation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minCurrentVolume) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume != minCurrentVolume) {
            currentVolume--;
        } else {
            currentVolume = minCurrentVolume;
        }

    }
}