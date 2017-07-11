/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern_example;

/**
 *
 * @author asher.ansari
 */
public class AudioAdapter implements MediaPlayer{

//    String type = null;
    AdvanceMediaPlayer advanceMediaPlayer;
    public AudioAdapter(String type){
        if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
        else if(type.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayer();
        }
    }
    
    @Override
    public void play(String audio, String filename) {
        
        if (audio.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        }
        else if(audio.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(filename);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
