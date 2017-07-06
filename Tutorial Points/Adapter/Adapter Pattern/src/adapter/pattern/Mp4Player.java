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
public class Mp4Player implements AdvanceMedia{

    @Override
    public void playVlc(String FileName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMp4(String FieldName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Playing MP4 File.Name : "+FieldName);
    }
    
}
