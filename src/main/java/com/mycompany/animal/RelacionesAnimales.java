/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

public class RelacionesAnimales {
    public static void main(String[] args) {
        Mamifero tigre = new Mamifero("tigre", 5, "rayado");
        tigre.comer();
        tigre.amamantarCrias();

        Ave aguila = new Ave("aguila", 3, 2.5);
        aguila.comer();
        aguila.volar();

        Reptil cobra = new Reptil("Cobra", 2, "lisas");
        cobra.comer();
        cobra.arrastrarse();
    }
}
