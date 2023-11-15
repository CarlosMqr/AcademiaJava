package org.cmendoza.ejemplo.tarea;

import org.cmendoza.ejemplo.modelo.Vuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class VuelosMain {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        //Date date = df.parse(dateInString);
        List<Vuelo> vuelo = new ArrayList<>();
        vuelo.add(new Vuelo("AAL 933","New York" ,"Santiago",df.parse("2021-08-29 05:39"),62));
        vuelo.add(new Vuelo("LAT 755	", "Sao Paulo",	"Santiago", df.parse("2021-08-31 04:45"),47));
        vuelo.add(new Vuelo("SKU 621","Rio De Janeiro","Santiago", df.parse("2021-08-30 16:00"),52));
        vuelo.add(new Vuelo("sku 621","Rio de janeiro","Santiago",df.parse("2021-08-31 6:00" ),52));
        vuelo.add(new Vuelo("DAL 147	","Atlanta",	"Santiago",	df.parse("2021-08-29 3:22 ") ,59));
        vuelo.add(new Vuelo("AVA 241",	"Bogota",	"Santiago" ,df.parse("2021-08-31 14:05 "), 25));
        vuelo.add(new Vuelo("AMX 10"	,"Mexico City",	"Santiago", df.parse("2021-08-31 05:20"),29));
        vuelo.add(new Vuelo("IBE 6833","Londres","Santiago",df.parse("2021-08-30 08:45 "),55));
        vuelo.add(new Vuelo("LAT 2479","Frankfurt","Santiago",  df.parse("2021-08-29 07:41"), 51));
        vuelo.add(new Vuelo("SKU 803","Lima","Santiago", df.parse("2021-08-30 10:35 "),48));
        vuelo.add(new Vuelo("LAT 533","Los Ángeles","Santiago", df.parse("2021-08-29 09:14 "),59));
        vuelo.add(new Vuelo("LAT 1447","Guayaquil","Santiago", df.parse("2021-08-31 08:33  "),31));
        vuelo.add(new Vuelo("CMP 111","Panama City","Santiago", df.parse("2021-08-31 15:15"),29));
        vuelo.add(new Vuelo("LAT 705","Madrid","Santiago",df.parse("2021-08-30 08:14"),47));
        vuelo.add(new Vuelo("AAL 957","Miami","Santiago", df.parse("2021-08-29 22:53"),60));
        vuelo.add(new Vuelo("ARG 50912",	"Buenos Aires",	"Santiago", df.parse("2021-08-31 09:57"),32));
        vuelo.add(new Vuelo("LAT 1283","Cancún","Santiago", df.parse("2021-08-31 04:00"),35));
        vuelo.add(new Vuelo("LAT 579","Barcelona","Santiago", df.parse("2021-08-29 07:45"),61));
        vuelo.add(new Vuelo("AAL 945","Dallas-Fort", "Worth",df.parse("2021-08-30 07:12"),58));
        vuelo.add(new Vuelo("LAT 501","París","Santiago", df.parse("2021-08-29 18:29"),49));
        vuelo.add(new Vuelo("LAT 405","Montevideo","Santiago",df.parse("2021-08-30 15:45"),39));

        System.out.println("===========ordenamiento ascendente==============");
        vuelo.sort((v1,v2) -> v2.getFechaLlegada().compareTo(v1.getFechaLlegada()));
       //vuelo.forEach(v -> System.out.println(v));
        vuelo.forEach(System.out::println);


        System.out.println("==================Ultimo vuelo================");
        Vuelo ultimovuelo = vuelo.get(0);
        System.out.println("El ultimo Vuelo es: " + ultimovuelo.getNombre() + " origen " + ultimovuelo.getOrigen() +
                " con hora de llegada de" + ultimovuelo.getFechaLlegada());

        System.out.println("==========Vuelo con menos pasajeros================");
        vuelo.sort((v1,v2)-> v2.getNumeroPasajeros().compareTo(v1.getNumeroPasajeros()));
        System.out.println();
        Vuelo vueloMenorP = new LinkedList<>(vuelo).peekLast();
        System.out.println(vueloMenorP.getNumeroPasajeros());







    }
}
