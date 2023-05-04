package com.careerit.jfs.cj.day13;

public class Remote{

    private int maxVolume;
    private boolean mute;
    private int currentVolume;
    private int tmpVolume;

    public Remote(){
        this.maxVolume = 50;
        this.currentVolume = 10;
    }

    public void increaseVolume(){
        if(currentVolume <= maxVolume){
            currentVolume++;
        }
    }
    public void decreaseVolume(){
        if(currentVolume >= 0){
            currentVolume--;
        }
    }
    public void mute(){
        mute = !mute;
        if(mute) {
          tmpVolume = currentVolume;
          currentVolume = 0;
       }else{
          currentVolume = tmpVolume;
        }
    }
    public void showInfo(){
        System.out.println("Current volume :"+currentVolume);
        System.out.println("Mute :"+mute);
    }


}