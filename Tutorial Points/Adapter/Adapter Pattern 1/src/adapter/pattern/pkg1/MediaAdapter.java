/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String media) {
        if (media.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlCPlayer();
        } else if (media.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audio, String filename) {
        if (audio.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        } else if (audio.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(filename);
        }
    }

}
