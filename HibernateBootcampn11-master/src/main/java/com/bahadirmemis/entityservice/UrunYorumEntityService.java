package com.bahadirmemis.entityservice;

import com.bahadirmemis.dao.KullaniciYorumDao;
import com.bahadirmemis.dao.UrunYorumDao;
import com.bahadirmemis.dto.KullaniciYorumDto;
import com.bahadirmemis.dto.UrunYorumDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunYorumEntityService {
    @Autowired
    private UrunYorumDao urunYorumDao;

    @Autowired
    private KullaniciYorumDao kullaniciYorumDao;

    public UrunYorumEntityService(UrunYorumDao urunYorumDao, KullaniciYorumDao kullaniciYorumDao){
        this.urunYorumDao = urunYorumDao;
        this.kullaniciYorumDao = kullaniciYorumDao;
    }

    public UrunYorumDao getUrunYorumDao() {
        return urunYorumDao;
    }

    public List<UrunYorumDto> findUrunYorumByUrun(Long urunId){
        return urunYorumDao.findYorumByUrun(urunId);
    }

    public List<KullaniciYorumDto> findUrunYorumByKullanici(Long kullaniciId){
        return kullaniciYorumDao.findYorumByKullanici(kullaniciId);
    }
}
