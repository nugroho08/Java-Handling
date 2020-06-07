/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class tugas {
}
    class exc1 {
        public static void main(String[] args) {
            int n = 0;
            try {
                n = System.in.read();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("Hasil : " + (char) n);
        }
    }
class exc2 {
    public static void main(String[] args){
        byte[] b = new byte[5];
        try {
            System.out.println("masukkan kata : ");
            System.in.read(b);
        } catch (java.io.IOException e) {
             System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
    }
}
}
class exc3{
public static void main(String[] args){
    byte[] b = new byte[5];
    System.out.println("input bilangan bulat : ");
    try {
        
            System.in.read(b);
    } catch (java.io.IOException e){
        System.err.println(e);
    }
    String c = new String(b).trim();
        int N = Integer.valueOf(c);
        System.out.println("Hasil : "+ (N+2));
}
}



