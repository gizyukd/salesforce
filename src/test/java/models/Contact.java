package models;

public class Contact {
    String salutation;
    String firstName;
    String lastName;
    String suffix;
    String accountName;
    String title;
    String department;
    String email;
    String fax;
    String phone;
    String mobile;
    String searchAddress;
    String mailingStreet;
    String mailingCity;
    String mailingState;
    String mailingZip;

    public Contact(String salutation, String firstName, String lastName, String suffix, String accountName, String title,
                   String department, String email, String fax, String phone, String mobile, String searchAddress,
                   String mailingStreet, String mailingCity, String mailingState, String mailingZip) {

        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.accountName = accountName;
        this.title = title;
        this.department = department;
        this.email = email;
        this.fax = fax;
        this.phone = phone;
        this.mobile = mobile;
        this.searchAddress = searchAddress;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.mailingZip = mailingZip;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSearchAddress() {
        return searchAddress;
    }

    public void setSearchAddress(String searchAddress) {
        this.searchAddress = searchAddress;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }
}
