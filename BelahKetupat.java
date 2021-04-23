/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soal1;

/**
 *
 * @author USER
 */
/**
*Nama  = NUR JAZILAH
*NIM   = 200441100019
*Kelas = PBO 2D
*/
import java.util.Scanner;
/** * * @author USER */
public class BelahKetupat {
  /** * @param args the command line arguments */
  public static void main(String[] args) {
    Scanner ketupat = new Scanner(System. in );
    System.out.print("\n...:: Mencari Luas Belah Ketupat::...\n");
    System.out.print("masukan nilai diagonal1: ");
    double d1 = ketupat.nextDouble();
    System.out.print("masukan nilai diagonal2: ");
    double d2 = ketupat.nextDouble();
    double lu = d1 * d2 * 0.5;
    System.out.print("maka luas belah ketupat adalah:" + lu);
    System.out.println("");
  }
}