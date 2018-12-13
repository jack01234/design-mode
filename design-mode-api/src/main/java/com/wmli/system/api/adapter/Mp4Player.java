package com.wmli.system.api.adapter;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 19:29 2018/12/13
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
