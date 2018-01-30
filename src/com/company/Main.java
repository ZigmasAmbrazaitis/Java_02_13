package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.13.​ Parašykite programą kuri paprašytų vartotojo įvesti skaičių kvadrato skaičiavimui.
        // Skaičiavimams sukurkite naują klasę. Skaičiavimas turi būti atliekas kitame metode ir
        // grąžintu rezultatą. Jį spausdinti ekrane. Naudokite formulę rezultatas = a^2 bei MATH
        // BIBLIOTEKA return Math.pow(a, 2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu kvadrato kelimui: ");
        double a = sc.nextDouble();
        Skaiciavimas.skaiciuokKvadrata(a);

    }
}
