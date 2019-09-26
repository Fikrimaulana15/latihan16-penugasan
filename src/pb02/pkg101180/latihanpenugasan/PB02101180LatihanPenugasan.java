/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg101180.latihanpenugasan;

/**
 *
 * @author 
 * NAMA : FikriMaulana
 * KELAS : IF-2
 * NIM : 10118074
 */
public class PB02101180LatihanPenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("NIlai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b " + c);
        c += a;
        System.out.println("c += a = " + c );
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= = " + c);
        a = 10;
        b = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2 = " + c);
        c |= a;
        
        System.out.println("c |= a = " + c);
        
                
    }
    
}
