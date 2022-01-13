package models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Account {
    String phone;
    String accountName;
    String webSite;
    String type;
    String employees;
    String industry;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZip;
    String billingCountry;
    String shippingZip;
    String shippingCountry;
}
