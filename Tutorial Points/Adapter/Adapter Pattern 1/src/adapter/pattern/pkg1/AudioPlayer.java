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
public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    @Override
    public void play(String audio, String filename) {
        if (audio.equalsIgnoreCase("mp3")) {
            System.out.println("Playing Mp3 with File.Name : " + filename);
        } else if (audio.equalsIgnoreCase("vlc") || audio.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(audio);
            adapter.play(audio, filename);
        } else {
            System.err.println("Invalid File Format found..!!");
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
