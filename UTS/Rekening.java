/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perbankan;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    
    Rekening (String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        phone = d;
        email = e;
    }
    
    void Tampil(){
        System.out.println("No Rekening     = " + noRekening);
        System.out.println("Nama            = " + nama);
        System.out.println("Nama Ibu        = " + namaIbu);
        System.out.println("No Hp           = " + phone);
        System.out.println("Email           = " + email);
    }
}

