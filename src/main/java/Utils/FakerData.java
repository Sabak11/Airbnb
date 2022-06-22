package Utils;


import com.github.javafaker.Faker;

import java.util.Date;

public interface FakerData {

    Faker faker = new Faker();
    String FakeName = faker.name().firstName();


    Faker fakeLastName = new Faker();
    String fakelastName = faker.name().lastName();


    Faker fakeEmail = new Faker();
    String FakeEmail = faker.internet().emailAddress();

    Faker fakePass = new Faker();
    String pass = faker.internet().password();

    Faker birth = new Faker();
    Date Birthday = faker.date().birthday();






}
