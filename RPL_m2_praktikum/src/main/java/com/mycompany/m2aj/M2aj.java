/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m2aj;

/**
 *
 * @author Abay
 */
public class M2aj {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Seller seller = new Seller();
        seller.addProduct("nasi goreng");
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
                
    }
}
