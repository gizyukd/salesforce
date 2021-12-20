package models;

public class Account {
    String phone;
    String accountName;
    String parentAccount;
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

    public Account(String phone, String accountName, String webSite, String type, String employees, String industry, String description, String billingStreet, String shippingStreet, String billingCity, String billingState, String shippingCity, String shippingState, String billingZip, String billingCountry, String shippingZip, String shippingCountry) {
        this.phone = phone;
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.employees = employees;
        this.industry = industry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.shippingZip = shippingZip;
        this.shippingCountry = shippingCountry;
    }

    public Account(String accountName, String webSite, String type) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getType() {
        return type;
    }
}
