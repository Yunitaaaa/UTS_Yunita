/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.Pelanggan.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pelangganId;
    private Long anggotaId;
    private Long kodebarang;
    private int harga;
    private int jumlah;
    private int total;
    private int diskon;

    public String getAnggotaId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
    