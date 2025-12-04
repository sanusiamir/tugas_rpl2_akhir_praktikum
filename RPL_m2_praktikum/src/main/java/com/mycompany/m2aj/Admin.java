/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m2aj;

/**
 *
 * @author Abay
 */
public class Admin extends User{
    
    public void login(){
        System.out.println("admin melakukan login");
    }
    public void logout(){
        System.out.println("admin melakukan logout");
    }   
    public void manageUser(){
        System.out.println("admin mengelola user");
    }
}
