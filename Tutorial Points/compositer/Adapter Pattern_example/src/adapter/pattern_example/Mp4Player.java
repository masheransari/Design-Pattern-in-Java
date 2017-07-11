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
public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String filename) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMp4(String Filename) {
        System.out.println("Playing in MP4 player and File.Name : "+Filename);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
