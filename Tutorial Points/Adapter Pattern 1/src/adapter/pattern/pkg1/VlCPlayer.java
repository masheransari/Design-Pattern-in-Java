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
public class VlCPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String filename) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Playing in VLC With File.Name : "+filename);
    }

    @Override
    public void playMp4(String filename) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
