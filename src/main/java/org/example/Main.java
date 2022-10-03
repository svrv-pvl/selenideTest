package org.example;

import com.codeborne.selenide.ElementsCollection;
import model.MainPage;
import model.pageParts.GoodShortCard;

import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start");

        MainPage mainPage = open("http://drtechno.ru/", MainPage.class);
        System.out.println("--------------------Try to show from page object-------------");
        for (GoodShortCard good:mainPage.leaderCards){
            System.out.println(good.getName());
        }
        System.out.println("Program finish");
    }
}