public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;

    public void next(){
        if(currentRadiostation!=9){
            currentRadiostation++;
        }else {
            currentRadiostation = 0;
        }
    }

    public int getCurrentRadiostation(){
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if(currentRadiostation<0){
            return;
        }
        if(currentRadiostation>9){
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume<0){
            return;
        }
        if(currentVolume>100){
            return;
        }
        this.currentVolume = currentVolume;
    }

}
