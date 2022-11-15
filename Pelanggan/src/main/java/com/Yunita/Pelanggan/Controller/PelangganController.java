/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.Pelanggan.Controller;

import com.Yunita.Pelanggan.service.VO.ResponseTemplateVo;
import com.Yunita.Pelanggan.service.service.Pelanggan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/pelanggan")
public class PelangganController {
    @Autowired
    private Pelanggan pelanggan;
    
    @PostMapping("/")
    public Pelanggan savePelanggan(@RequestBody Pelanggan pelanggan){
        return pelanggan.savePelanggan(pelanggan);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVo getPelanggan(@PathVariable("id") Long pelangganId){
        return pelanggan.getPelanggan(pelangganId);
    }
}
