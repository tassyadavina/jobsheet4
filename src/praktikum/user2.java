/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class user2 extends Manusia {
    @Override
    void settinggi()
    {
        double user2 = 150.0;
        System.out.println("Tinggi Badan      : "+user2+"cm");
    }
    
    
    @Override
    void setjenis()
    {
        String jenis = "p";
        System.out.println("Jenis Kelamin     : "+jenis);
        
    }
    
   
    @Override
    void setberat()
    {
        double berat = 40;
        System.out.println("Berat badan ideal : "+berat+"kg");
    }
}
