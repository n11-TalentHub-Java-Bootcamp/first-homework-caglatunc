package com.bahadirmemis.dao;

import com.bahadirmemis.base.BaseDao;
import com.bahadirmemis.dto.KullaniciYorumDto;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KullaniciYorumDao extends BaseDao {
    public List<KullaniciYorumDto> findYorumByKullanici(Long kullaniciId){
        String sql = "select " +
                "new com.bahadirmemis.dto.KullaniciYorumDto(kullanici.id, kullanici.adi, urun.adi, urunYorum.yorum, urunYorum.yorumTarihi) " +
                "from UrunYorum urunYorum " +
                "left join Kullanici kullanici on urunYorum.kullanici.id = kullanici.id " +
                "left join Urun urun on urunYorum.urun.id = urun.id " +
                "where kullanici.id = :kullaniciId";

        Query query = getCurrentSession().createQuery(sql).setParameter("kullaniciId", kullaniciId);

        return query.list();
    }
}
