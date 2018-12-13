package com.wmli.system.api.adapter;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 19:32 2018/12/13
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if ("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new VlcPlayer();
        }else if ("mp4".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        }else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
