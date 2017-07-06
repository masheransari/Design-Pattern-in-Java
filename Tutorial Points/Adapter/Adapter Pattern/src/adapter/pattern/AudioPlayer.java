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
public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    @Override
    public void play(String audio, String player) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (audio.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 File.Name : " + player);
        } else if (audio.equalsIgnoreCase("vlc") || audio.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(audio);
            adapter.play(audio, player);
        } else {
            System.out.println("Invalid media." + audio + " Format not supported..!!");
        }
    }
    
    

}
