package com.wmli.system.api.adapter;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 19:28 2018/12/13
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
