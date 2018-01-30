package com.company;
// 1.13.​ Parašykite programą kuri paprašytų vartotojo įvesti skaičių kvadrato skaičiavimui.
// Skaičiavimams sukurkite naują klasę. Skaičiavimas turi būti atliekas kitame metode ir
// grąžintu rezultatą. Jį spausdinti ekrane. Naudokite formulę rezultatas = a^2 bei MATH
// BIBLIOTEKA return Math.pow(a, 2);
public class Skaiciavimas {
    public static void skaiciuokKvadrata(double a) {
        double rezultatas = a*a;
        System.out.println("Skaiciaus kvadratas lygus= " + rezultatas);
    }
}
