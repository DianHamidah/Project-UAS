/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack1;

/**
 *
 * @author dian nurdiani
 */
public class JavaQueue {
    
}
class Antrian{
	private final int ukuran;
	private final long[] antrian;
	private int belakang;
	private int jumItem;
	private final int depan;
	
	public Antrian (int s){
		ukuran = s;
		antrian = new long[ukuran];
		depan = 0;
		belakang = -1;
		jumItem = 0;
	}
	
	public void masuk(long j){
		if (!isFull()){
			antrian[++belakang] = j;
			jumItem++;
		}
	}
	
	public long keluar(){
	long temp = antrian[0];
	if (!isEmpty()){
		for (int i=0; i<jumItem; i++)
			antrian [i] = antrian[i+1];
			jumItem--;
			belakang--;
		}
		return temp;
	}
	
	public long peekDepan(){
		return antrian[depan];
	}
	
	public boolean isEmpty(){
		return (jumItem==0);
	}
	
	public boolean isFull(){
		return (belakang==ukuran-1);
	}
	
	public int ukuran(){
		return jumItem;
	}
	
	public void lihat(){
		for (int i=0; i<jumItem; i++)
		System.out.print(antrian[i]+" ");
		System.out.println("");
	}

}

public class JavaQueue {

    public static void main(String[] args){
		Antrian antrian = new Antrian(10);
		antrian.masuk(13);
		antrian.lihat();
		antrian.masuk(32);
		antrian.lihat();
		antrian.masuk(45);
		antrian.lihat();
		System.out.println("yang diambil dari antrian = " + antrian.keluar());
		antrian.lihat();
		System.out.println("yang diambil dari antrian = " + antrian.keluar());
		antrian.lihat();
	}
}
