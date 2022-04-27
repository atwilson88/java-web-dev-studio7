package org.launchcode.studio7;

public abstract class BaseDisc {


    private int runtime;
    private String genre;
    private static final int STORAGELIMIT;
    private String title;
    private double storageAmountUsed;


    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStorageAmountUsed() {
        return storageAmountUsed;
    }

    public void setStorageAmountUsed(double storageAmountUsed) {
        this.storageAmountUsed = storageAmountUsed;
    }

    public BaseDisc(int runtime, String genre, String title, double storageAmountUsed) {
        this.runtime = runtime;
        this.genre = genre;
        this.title = title;
        this.storageAmountUsed = storageAmountUsed;
    }
    public boolean checkCompatibility(String deviceType){
    if(deviceType.matches("Computer")) {
      return true;
    }else if(deviceType.matches("CD Player")) {
        return true;
    }else if(deviceType.matches("DVD Player")){
        return true;
    }else{
        return false;
        }
    }

    public void skipTrack() {

    }
}
