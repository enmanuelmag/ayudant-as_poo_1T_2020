/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newfeactures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Enmanuel
 */
public class OpcionalTest {

    private Object doSomething(Object o) {
        System.out.println("Haciendo cosas...");
        return "";
    }

    private void doPresent() {
        System.out.println("Presente");
    }

    private void doNotPresent() {
        System.out.println("No está presente");
    }

    public void opcionalPart1() {

        // Objeto donde conseguimos los datos
        final Presidente db = new Presidente();

        // Objeto con métodos para leer datos desde el teclado
        final Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre de país: ");
        final var pais = sc.nextLine();

        // Buscamos la informacion
        final Optional<String> planCountry = db.getPlanCountry(pais);

        // Se realiza una accion dependiendo del resultado
        planCountry.ifPresentOrElse(action -> doPresent(), () -> doNotPresent());
        sc.close();
    }

    public void opcionalPart2() {

        Presidente db = new Presidente();

        // Sin nuevas caracteristicas
        Wife wifeOld = db.findWifeOld("M");

        if (wifeOld != null && wifeOld.getName().endsWith("a")) {
            doSomething(wifeOld);
        } else {
            doSomething(null);
        }

        // Con nuevas caracteristicas
        Optional<Wife> wife = db.findWifeNew("M");

        String name = wife.map(w -> w.getName().toUpperCase()).orElse("No existe!");

        System.out.println(name);

        wife.map(w -> doSomething(w)).orElse("No existe!");
    }

    public void opcionalPart3() {

        Presidente db = new Presidente();

        Optional<Wife> wifePreview = db.findWifeNew("s");

        // El orElse siempre pedira como parametris y retornara el mismo tipo de objecto
        // que al que se le esta aplicando el método
        Wife wifeResult = wifePreview.orElse(new Wife(null));
        System.out.println(wifeResult);

        // Por otro lado orElseGet permite llamar una funcion, o usar una expresion
        // lambda
        Wife wifeReuslt2 = wifePreview.orElseGet(() -> db.doWife(null));
        System.out.println(wifeReuslt2);
        // Tambien se puee lanzzr una excpetion
        // Wife excep = wifePreview.orElseThrow();
    }

    public void lambda_2() {

        Predicate<Presidente> hasLeastTow = presidente -> presidente.getWifes().size() >= 2;

        Function<Presidente, String> mapDBToWife = presidente -> presidente.getWifes().get(0).getName();
        proccedData(new ArrayList<Presidente>(), hasLeastTow, mapDBToWife, System.out::println);
    }

    private void proccedData(List<Presidente> presidentes, Predicate<Presidente> predicate,
            Function<Presidente, String> mapper, Consumer<String> consumer) {

        presidentes.stream().filter(presidente -> predicate.test(presidente))
                .forEach(p -> consumer.accept(mapper.apply(p).toString()));

    }

}
