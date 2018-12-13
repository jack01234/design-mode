package com.wmli.system.api.adapter;


/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 19:39 2018/12/13
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","c://sss");
        audioPlayer.play("mp4","c://sss");
        audioPlayer.play("vlc","c://sss");
    }
}
