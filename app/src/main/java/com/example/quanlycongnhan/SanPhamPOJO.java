package com.example.quanlycongnhan;

public class SanPhamPOJO {
    public SanPhamPOJO(String tenSP, String donGia, String donViTinh) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.donViTinh = donViTinh;
    }


    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    private String tenSP;
    private String donGia;
    private String donViTinh;
}
