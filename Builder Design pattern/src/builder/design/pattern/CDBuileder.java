/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.design.pattern;

/**
 *
 * @author asher.ansari
 */
public class CDBuileder {
    public CDType builderSonyCd(){
        CDType cDType = new CDType();
        cDType.addItem(new Sony());
        return cDType;
    }
    
     public CDType builderSamsungCd(){
        CDType cDType = new CDType();
        cDType.addItem(new Samsung());
        return cDType;
    }
}
