package Codigos_de_Estudo;

import jdk.jfr.Period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataEstudo {

        public static void main(String[] args) {

            LocalDate hoje = LocalDate.now();
            System.out.println(hoje);//Formato ISO (internacional)

            LocalDate ano_novo = LocalDate.of(2021, Month.JANUARY, 1);
            System.out.println(ano_novo); //Formato ISO (internacional)

            int ano = ano_novo.getYear();
            Month mes = ano_novo.getMonth();
            int dia = ano_novo.getDayOfMonth();

            System.out.println("O ano novo será " + dia + " de " + mes + " de " + ano);

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
            System.out.println(hoje.format(formatador));

            LocalDateTime agora = LocalDateTime.now();
            System.out.println(agora); //Formato ISO (internaacional)

            DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");//dd/MM/yyy hh:mm:ss
            System.out.println(agora.format(formatador_horas));

            LocalTime intervalo = LocalTime.of(9, 30);
            System.out.println(intervalo);



        }
    }


