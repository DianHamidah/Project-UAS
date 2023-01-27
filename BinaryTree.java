/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack1;

/**
 *
 * @author dian nurdiani
 */
public class BinaryTree {
    
}
 public class BinaryTree {
    static Scanner in=new Scanner(System.in); 
    public void insert(node a, int b){
        if(b<a.value){
            if(a.left!=null) insert(a.left,b);
            else{
                a.left=new node();
                a.left.input(b);
                System.out.println(b+" di kiri  "+a.value);
            }
        }
        else if(b>a.value){
            if(a.right!=null) insert(a.right,b);
            else{
                a.right=new node();
                a.right.input(b);
                System.out.println(b+" di kanan "+a.value);
            }
        }
    }
    public void view(node a){
        System.out.print("Pre Order  : ");
        preOrder(a);
        System.out.println(" ");
    }  
public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value+" ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
}
 
class node{
    node left,right;
    int value;
    public void input(int a){
        value=a;
    }
    public static void main(String[] args){
        tree tr=new tree();
        node root=new node();
        int menu=1;
        int r=1;
        int a;
        while(menu!=3){
            System.out.print("1.input\n2.view\n3.exit\n : ");
            menu=tr.in.nextInt();
            switch (menu) {
                case 0x1 -> {
                    System.out.print("Masukkan Angka : ");
                    a=tr.in.nextInt();
                    if(r==1){
                        root.input(a);
                        r--;
                    }
                    else tr.insert(root,a);
                }
                case 2 -> tr.view(root);
                case 3 -> System.out.println("Keluar");
                default -> System.out.println("Salah");
            }
            System.out.println(" ");
        }
    }
}