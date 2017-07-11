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
public class AudioPlayer implements MediaPlayer{

    AudioAdapter adapter;
    
    @Override
    public void play(String audio, String filename) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (audio.equalsIgnoreCase("mp3")) {
            System.out.println("Mp3 is playing with file.Name: "+filename);
        }
        else if(audio.equalsIgnoreCase("Vlc") || audio.equalsIgnoreCase("mp4")){
            adapter =new AudioAdapter(audio);
            adapter.play(audio, filename);
        }
        else{
            System.out.println("Unknow Audio format..!!");
        }
    }
    
}
