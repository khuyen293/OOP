create database quanlynhansu;
drop database quanlynhansu;
use quanlynhansu;

CREATE TABLE NHAN_VIEN(
    ma_nv INT(11),
    ho_ten VARCHAR(50) NOT NULL,
	ngay_sinh DATE NOT NULL,
    que_quan VARCHAR(50),
    gioi_tinh ENUM('Nam', 'Nữ') NOT NULL,
    dan_toc VARCHAR(20),
    dia_chi VARCHAR(100),
    so_dien_thoai VARCHAR(20),
    -- ma_pb INT(11),
--     ma_cv INT(11),
--     ma_tdhv INT(20),
--     bac_luong FLOAT(10,2) NOT NULL,
    PRIMARY KEY (ma_nv)
);
drop table NHAN_VIEN;

CREATE TABLE PHONG_BAN(
    ma_pb INT(11),
    ten_phong_ban VARCHAR(50) NOT NULL,
    dia_chi VARCHAR(100),
    so_dien_thoai VARCHAR(20),
    PRIMARY KEY (ma_pb)

);
drop table PHONG_BAN;

CREATE TABLE CHUC_VU(
     ma_cv INT(11),
     ten_cv VARCHAR(50),
     PRIMARY KEY (ma_cv)
);
drop table CHUC_VU;

CREATE TABLE TRINH_DO_HOC_VAN(
     ma_tdhv INT(20),
     ten_tdhv VARCHAR(50),
     chuyen_nganh VARCHAR(50),
     PRIMARY KEY (ma_tdhv)
);
drop table TRINH_DO_HOC_VAN;

CREATE TABLE LUONG(
     bac_luong DOUBLE(20,2),
     luong_co_ban DOUBLE(20,2),
     he_so_luong INT(10),
     he_so_phu_cap INT(10),
     PRIMARY KEY (bac_luong)
);
drop table LUONG;

CREATE TABLE HOP_DONG_LAO_DONG(
	 ma_hd INT(10),
     ma_nv INT(10),
     loai_hd VARCHAR(50),
     ngay_bat_dau DATE NOT NULL,
     ngay_ket_thuc DATE NOT NULL,
     PRIMARY KEY(ma_hd, ma_nv),
     FOREIGN KEY (ma_nv)  REFERENCES NHAN_VIEN(ma_nv)
);
drop table HOP_DONG_LAO_DONG;

