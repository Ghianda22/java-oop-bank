package com.bank.java;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome per aprire un conto");
        String username = in.nextLine();
        Conto userCount = new Conto(username);
        String choice = "";

        do {
            System.out.println("Cosa vuoi fare con il tuo nuovo conto?\n" +
                    "Digita: prelievo, versamento o fine");
            choice = in.nextLine().toLowerCase();
            if(!choice.equals("fine")) {
                if (choice.equals("prelievo") || choice.equals("versamento")) {
                    System.out.println("Quanti soldi vuoi spostare");
                    float amount = in.nextFloat();
                    if (choice.equals("prelievo")) {
                        if (userCount.withdrawal(amount)) {
                            System.out.println("Il tuo saldo corrente è " + userCount);
                        } else {
                            System.out.println("Non è stato possibile completare l'operazione. \nIl tuo conto andrebbe in negativo");
                        }
                    } else {
                        userCount.deposit(amount);
                        System.out.println("Il tuo saldo corrente è " + userCount);
                    }
                } else System.out.println("Hai inserito un comando non corretto");
            }

        } while (!choice.equals("fine"));

    }
}
