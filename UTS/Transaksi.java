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
public class Transaksi {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tglTransaksi;
    String Type;
    
    Transaksi (double a, double b, double c, String d, String e){
        this.saldo = a;
        this.saldoAkhir = b;
        this.saldoAkhir = c;
        this.tglTransaksi = d;
        this.Type = e;        
    }
    
}