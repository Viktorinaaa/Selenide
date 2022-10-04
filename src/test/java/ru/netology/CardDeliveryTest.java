package ru.netology;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;



public class CardDeliveryTest {

    public String generateDate(int days){
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
    String planningDate = generateDate(7);


    @Test
    void shouldCardDelivery1() {
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Горно-Алтайск");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(planningDate);
        $x("//input[@name='name']").setValue("Тестовый-Тест");
        $("[data-test-id=phone] input").setValue("+78881112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $(By.className("button__text")).click();
       $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        planningDate));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery2() {
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Калининград");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(planningDate);
        $x("//input[@name='name']").setValue("Тестовый Тест");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $(By.className("button__text")).click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        planningDate));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery3() {
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(planningDate);
        $x("//input[@name='name']").setValue("тестовый");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $(By.className("button__text")).click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        planningDate));
        $$(".icon-button__content").get(1).click();
    }

    @Test
    void shouldCardDelivery4() {
        Configuration.holdBrowserOpen = true;
        open("http://0.0.0.0:9999/");
        $x("//input[@placeholder='Город']").setValue("Нижний Новгород");
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(planningDate);
        $x("//input[@name='name']").setValue(" ежик ");
        $("[data-test-id=phone] input").setValue("+71181112233");
        $x("//*[contains(@class,'checkbox__box')]").click();
        $(By.className("button__text")).click();
        $x("//*[contains(@data-test-id,'notification')]").should(appear, Duration.ofSeconds(15));
        $(".notification__title").shouldHave(exactText("Успешно!"));
        $(".notification__content").
                should(exactText("Встреча успешно забронирована на " +
                        planningDate));
        $$(".icon-button__content").get(1).click();
    }




}
