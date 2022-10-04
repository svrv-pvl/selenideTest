package model;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import model.pageParts.GoodShortCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public List<GoodShortCard> leaderCards;

    public MainPage(){
        leaderCards = new ArrayList<>();

        ElementsCollection leaderGoods = $$(By.xpath("//article/div[1]/div[3]/ul/li"));

        for(int i = 0; i < leaderGoods.size(); i++){
            leaderCards.add(new GoodShortCard(leaderGoods.get(i)));
        }
    }
}