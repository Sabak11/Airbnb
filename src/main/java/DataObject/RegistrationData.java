package DataObject;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public interface RegistrationData {

    Faker faker = new Faker();

    String
            Username = faker.name().firstName(),
            Lastname = faker.name().lastName(),
            BirthDate = "12/12/1996",
            Password = faker.internet().password(8, 20, true, true, true),
            EmailData = faker.internet().emailAddress(),
            ValidEmail = "beau.casper@gmail.com",
            ValidPass = "@fttB53@gv3cot",
            Addresscities = faker.address().streetAddress();




}








