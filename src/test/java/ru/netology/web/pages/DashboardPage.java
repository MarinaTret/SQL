package ru.netology.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement heading = $("[data-test-id='dashboard']");

    public DashboardPage() {
        heading.shouldHave(Condition.text("Личный кабинет")).shouldBe(Condition.visible);
    }
}
