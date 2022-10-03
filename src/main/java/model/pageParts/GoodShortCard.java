package model.pageParts;

import com.codeborne.selenide.SelenideElement;

public class GoodShortCard {
    private SelenideElement goodLink;
    private SelenideElement goodPicture;
    private SelenideElement addToBasketButton;

    public GoodShortCard(SelenideElement goodLink, SelenideElement goodPicture, SelenideElement addToBasketButton){
        this.goodLink = goodLink;
        this.goodPicture = goodPicture;
        this.addToBasketButton = addToBasketButton;
    }

    public String getName(){
        return goodLink.text();
    }
}
