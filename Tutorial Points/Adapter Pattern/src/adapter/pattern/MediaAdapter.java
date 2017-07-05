/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern;

/**
 *
 * @author asher.ansari
 */
public class MediaAdapter implements MediaPlayer{

    AdvanceMedia advanceMedia;

    public MediaAdapter(String player) {
        if (player.equalsIgnoreCase("vlc")) {
            advanceMedia = new VlcPlayer();
        }
        else if(player.equalsIgnoreCase("mp4"))
        {
            advanceMedia = new Mp4Player();
        }
        
    }
    
    @Override
    public void play(String audio, String player) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(audio.equalsIgnoreCase("vlc")){
            advanceMedia.playVlc(player);
        }
        else if(audio.equalsIgnoreCase("mp4"))
        {
            advanceMedia.playMp4(player);
        }
    }
    
    
}
