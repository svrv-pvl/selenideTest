package org.example;

import com.codeborne.selenide.ElementsCollection;
import model.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start");



        MainPage mainPage = open("http://drtechno.ru/", MainPage.class);
        System.out.println(mainPage.leaderCard.getName());

        System.out.println("Program finish");
    }
}