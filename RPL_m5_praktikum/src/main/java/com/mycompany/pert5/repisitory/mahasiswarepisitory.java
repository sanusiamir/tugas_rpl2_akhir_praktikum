/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pert5.repisitory;

import com.mycompany.pert5.model.modelmahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Abay
 */
@Repository
public interface mahasiswarepisitory extends JpaRepository<modelmahasiswa, Long>{
    
}
