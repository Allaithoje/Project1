/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

public class Serviceprovider {

    private int p_id;// provider id
    private String p_name;//provider name
    private double vcc;//voice call cost
    private double mc;//messaging cost
    private double ic;//internet cost
    private int dr;// discount ratio
    private int[] sublist;
    
    public Serviceprovider(int id, String name, double voicecallcost, double mcost, double icost, int discountrate){
        this.p_id = id;
        this.p_name = name;
        this.vcc = voicecallcost;
        this.ic = icost;
        this.mc = mcost;
        this.dr = discountrate;
    }
    public double calculatevcc(int minute, Subscriber caller){//calculate voice call cost
        
        return;
    }

}
