package model;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import model.pageParts.GoodShortCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public List<GoodShortCard> leaderCards;

    public MainPage(){


        /*leaderCard = new GoodShortCard(
                $(nameLinkXPath),
                $(imageXPath),
                $(addToBasketButtonXPath)*/
        leaderCards = new ArrayList<>();

        By nameLinkXPath = By.xpath(".//div/div[1]/a[1]");
        By imageXPath = By.xpath(".//div/div[2]/div[1]/a/img");
        By addToBasketButtonXPath = By.linkText("купить");
        ElementsCollection leaderGoods = $$(By.xpath("//article/div[1]/div[3]/ul/li"));

        System.out.println(leaderGoods.toString());

        for(int i = 0; i < leaderGoods.size(); i++){
            SelenideElement nameLink = leaderGoods.get(i).find(nameLinkXPath);
            SelenideElement image = leaderGoods.get(i).find(imageXPath);
            SelenideElement addToBasketButton = leaderGoods.get(i).find(addToBasketButtonXPath);

            leaderCards.add(new GoodShortCard(nameLink,image, addToBasketButton));
        }
    }
}