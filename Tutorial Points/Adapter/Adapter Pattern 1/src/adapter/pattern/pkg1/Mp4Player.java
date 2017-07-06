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
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String filename) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing in Mp4 With FIle.Name : " + filename);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
