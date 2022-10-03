package model;

import model.pageParts.GoodShortCard;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public GoodShortCard leaderCard;

    public MainPage(){
        By nameLinkXPath = By.xpath("//ul[1]/li[1]/div/div[1]/a[1]");
        By imageXPath = By.xpath("//ul/li[1]/div/div[2]/div[1]/a/img");
        By addToBasketButtonXPath = By.xpath("//*[@id=\"hit_29354\"]");

        leaderCard = new GoodShortCard(
                $(nameLinkXPath),
                $(imageXPath),
                $(addToBasketButtonXPath)
        );
    }
}