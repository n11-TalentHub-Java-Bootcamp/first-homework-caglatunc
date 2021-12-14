package com.bahadirmemis.dto;

import java.math.BigDecimal;

public class UrunYorumSayiDto {
    private Long urunId;
    private String urunAdi;
    private BigDecimal fiyat;
    private Integer yorumSayisi;

    public UrunYorumSayiDto(){

    }

    public UrunYorumSayiDto(Long urunId, String urunAdi, BigDecimal fiyat, Integer yorumSayisi) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.yorumSayisi = yorumSayisi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Integer yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    @Override
    public String toString() {
        return "UrunYorumSayiDto{" +
                "urunId=" + urunId +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                ", yorumSayisi=" + yorumSayisi +
                '}';
    }
}
