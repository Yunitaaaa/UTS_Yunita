/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.Pelanggan.Repository;

import com.Yunita.Pelanggan.service.service.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {

    public Pelanggan findByPelangganId(Long pelangganId);

    public com.Yunita.Pelanggan.service.service.Pelanggan save(com.Yunita.Pelanggan.service.service.Pelanggan pelanggan);

}
