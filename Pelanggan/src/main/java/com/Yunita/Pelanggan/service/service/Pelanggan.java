/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.Pelanggan.service.service;

import com.Yunita.Pelanggan.Repository.PelangganRepository;
import com.Yunita.Pelanggan.service.VO.Anggota;
import com.Yunita.Pelanggan.service.VO.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Service
public class Pelanggan{
    @Autowired
    private PelangganRepository pelangganRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public ResponseTemplateVo getPelanggan(Long pelangganId){
        ResponseTemplateVo ResponseTemplateVo = new ResponseTemplateVo();
                pelangganRepository.findByPelangganId(pelangganId);
        Pelanggan pelanggan = null;
        Anggota anggota = 
        restTemplate.getForObject("http://localhost:9004/anggota/"
                + pelanggan.getAnggotaId(), Anggota.class);
ResponseTemplateVo.setPelanggan(pelanggan);
  ResponseTemplateVo.setAnggota(anggota); 
        ResponseTemplateVo Vo = null;
        return Vo;
    }

    private String getAnggotaId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
