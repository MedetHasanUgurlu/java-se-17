package org.example.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(5);
        System.out.println("");

        final var phone = new Phone(1, "Samsung-13", 1300);
        final var phone2 = new Phone(1, "Samsung-12", 1200);
        final var phone3 = new Phone(1, "Samsung-10", 1000);
        final var phone4 = new Phone(1, "Samsung-13", 1300);
        final var phone5 = new Phone(1, "İphone", 1000);
        final var phone6 = new Phone(1, "İphone", 2000);
        final var phone7 = new Phone(1, "İphone-2", 1500);
        final var phones = new ArrayList<Phone>(List.of(phone, phone2, phone3, phone4, phone5, phone6, phone7));
        final var collect = phones.stream().collect(Collectors.toMap(Phone::id, phone1 -> phone1, (t, t2) -> t.price() > t2.price() ? t : t2));
        collect.values().forEach(System.out::println);
    }
}
