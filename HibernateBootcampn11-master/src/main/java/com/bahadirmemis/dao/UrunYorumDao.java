package com.bahadirmemis.dao;

import com.bahadirmemis.base.BaseDao;
import com.bahadirmemis.dto.UrunYorumDto;
import com.bahadirmemis.dto.UrunYorumSayiDto;
import com.bahadirmemis.entity.UrunYorum;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrunYorumDao extends BaseDao{
    public List<UrunYorumDto> findYorumByUrun(Long urunId){
        String sql = "select " +
                "new com.bahadirmemis.dto.UrunYorumDto(urun.adi,  kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, urunYorum.yorum, urunYorum.yorumTarihi) " +
                "from UrunYorum urunYorum " +
                "left join Kullanici kullanici on urunYorum.kullanici.id = kullanici.id " +
                "left join Urun urun on urunYorum.urun.id = urun.id " +
                "left join Kategori kategori on urun.kategori.id = kategori.id " +
                "where urun.id = :urunId ";

        //"select urunYorum from UrunYorum urunYorum where urunYorum.urun.id = :id"
        Query query = getCurrentSession().createQuery(sql).setParameter("urunId", urunId);

        return query.list();
    }

}
