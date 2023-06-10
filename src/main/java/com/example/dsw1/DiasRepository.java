package com.example.dsw1;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
    private static final Map<String, Dias> dias = new HashMap<>();

    @PostConstruct
    public void initData() {
        Dias lunes = new Dias();
        lunes.setName("Lunes");
        lunes.setTraduccion("Monday");

        dias.put(lunes.getName(), lunes);

        Dias martes = new Dias();
        martes.setName("Martes");
        martes.setTraduccion("Tuesday");

        dias.put(martes.getName(), martes);

        Dias miercoles = new Dias();
        miercoles.setName("Miercoles");
        miercoles.setTraduccion("Wednesday");

        dias.put(miercoles.getName(), miercoles);

        Dias jueves = new Dias();
        jueves.setName("Jueves");
        jueves.setTraduccion("Thursday");

        dias.put(jueves.getName(), jueves);

        Dias viernes = new Dias();
        viernes.setName("Viernes");
        viernes.setTraduccion("Friday");

        dias.put(viernes.getName(), viernes);

        Dias sabado = new Dias();
        sabado.setName("Sabado");
        sabado.setTraduccion("Saturday");

        dias.put(sabado.getName(), sabado);

        Dias Domingo = new Dias();
        Domingo.setName("Domingo");
        Domingo.setTraduccion("Sundat");

        dias.put(Domingo.getName(), Domingo);

    }

    public Dias findCountry(String name) {
        Assert.notNull(name, "The day name must not be null");
        return dias.get(name);
    }

}
