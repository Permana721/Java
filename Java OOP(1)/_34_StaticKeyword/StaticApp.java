package _34_StaticKeyword;

import static _34_StaticKeyword.Application.PROCESSORS;
import static _34_StaticKeyword.Constant.*; // Static import, bisa langsung akses tanpa class name

public class StaticApp {
    static void main(String[] args) {
        // Memanggil Static Members
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Cirebon");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
