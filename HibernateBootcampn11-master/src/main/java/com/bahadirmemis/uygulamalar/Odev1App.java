package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.dto.KullaniciYorumDto;
import com.bahadirmemis.dto.UrunDetayDto;
import com.bahadirmemis.dto.UrunYorumDto;
import com.bahadirmemis.entityservice.UrunEntityService;
import com.bahadirmemis.entityservice.UrunYorumEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class Odev1App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();

        UrunYorumEntityService service = applicationContext.getBean(UrunYorumEntityService.class);

        List<UrunYorumDto> urunYorumByUrun = service.findUrunYorumByUrun(1L);
        List<KullaniciYorumDto> urunYorumByKullanici = service.findUrunYorumByKullanici(1L);

        urunYorumByUrun.forEach(System.out::println);
        System.out.println(" ");
        urunYorumByKullanici.forEach(System.out::println);
    }
}
