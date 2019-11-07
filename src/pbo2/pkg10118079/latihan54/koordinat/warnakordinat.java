/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan54.koordinat;

/**
 *
 * @author User
 */
public class warnakordinat extends Koordinat{
    public  String namawarna;

    public warnakordinat(String namawarna, int x, int y) {
        super(x, y);
        this.namawarna = namawarna;
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
    
    
    
}
