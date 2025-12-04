/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert5;
import com.mycompany.pert5.controller.mahasiswacontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * @author Abay
 */
@SpringBootApplication
public class Pert5  implements CommandLineRunner{

    @Autowired
    private mahasiswacontroller mhsController;
    public static void main(String[] args) {
        SpringApplication.run( Pert5.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        mhsController.tampilkanMenu();
    }  


}
