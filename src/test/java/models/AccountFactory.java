package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {

    static Faker faker = new Faker();

    public static Account get(){
        log.debug("Object from class Account is being created");

        return Account.builder()
                .phone(faker.phoneNumber().cellPhone())
                .accountName(faker.twinPeaks().character())
                .webSite("www." + faker.harryPotter().location() + ".com")
                .type("Analyst")
                .employees(faker.superhero().name())
                .industry("Banking")
                .description(faker.demographic().sex())
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .billingCity(faker.address().city())
                .billingState(faker.address().state())
                .shippingCity(faker.address().city())
                .shippingState(faker.address().state())
                .billingZip(faker.number().digits(6))
                .billingCountry(faker.address().country())
                .shippingZip(faker.number().digits(6))
                .shippingCountry(faker.address().country())
                .build();
    }
}
