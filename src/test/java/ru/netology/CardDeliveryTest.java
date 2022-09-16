package ru.netology;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;


public class CardDeliveryTest {

    /////////TEST PASS//////////////
    @Test
    void shouldCardDelivery1() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Горно-Алтайск");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("Тестовый-Тест");
        $("[data-test-id=phone] input").setValue("+78881112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery2() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Калининград");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("Тестовый Тест");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery3() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("тестовый");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery4() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue(" ежик ");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }


    /////////TEST FAIL///////////////////
    @Test
    void shouldCardDelivery5() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("Ёжик");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery6() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("Test");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery7() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Париж");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("тест");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }


    @Test
    void shouldCardDelivery8() {
        CardDelivery cardDelivery = new CardDelivery();
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Москва");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(cardDelivery.date());
        $x("//input[@name='name']").setValue("тест");
        $("[data-test-id=phone] input").setValue("871181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $$(By.className("button__text")).last().click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        cardDelivery.date()));
        $$(".icon-button__content").get(1).click();
    }


}
