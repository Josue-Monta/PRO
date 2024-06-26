package com.example.clase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal mychicken = new chicken();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        mychicken.animalSound();

        System.out.println(" ");

        myAnimal.animalborn();
        myPig.animalborn();
        myDog.animalborn();
        mychicken.animalborn();

    }
}