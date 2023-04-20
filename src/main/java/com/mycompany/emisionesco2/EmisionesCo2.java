/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.emisionesco2;

import conexionUrl.ConexionHTTP;
import java.io.IOException;
import modelo.HuellaCarbono;
import serviciojson.JsonService;

/**
 *
 * @author pablo
 */
public class EmisionesCo2 {

    public static void main(String[] args) throws IOException {

        String urlBase = "https://api.websitecarbon.com/site?url=https://maralboran.eu/";

        String fichero = ConexionHTTP.peticionHttpGet(urlBase);

        HuellaCarbono modelo = (HuellaCarbono) JsonService.stringToPojo(fichero, HuellaCarbono.class);
        System.out.println(modelo);
        System.out.println("-------------");

    }
}
