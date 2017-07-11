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
public class VlcPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing in VLC and File.Name : "+filename);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMp4(String Filename) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
