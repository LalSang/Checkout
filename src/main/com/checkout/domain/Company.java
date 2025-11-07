package src.main.com.checkout.domain;

import java.io.IOException;
import java.util.Scanner;

//This domain class will be the company informations
//Only admin can alter this class
//If a company wants to be part of our checkout system 
//They will enter their information through admin
public class Company {
    private String companyName;
    private Double taxRate;
    private String companyAddress;
    private String companyContact;
    private String companyID;
    // We do menu this way so that every company gets their own
    // menu
    private final Menu menu = new Menu();

    public Company() {
        this.companyName = "";
        this.taxRate = 0.0;
        this.companyAddress = "";
        this.companyContact = "";
        this.companyID = "";
    }

    public Company(String name, Double taxRate, Menu menu,
            String companyAddress, String companyContact, String companyID) {
        this.companyName = name;
        this.taxRate = taxRate;
        this.companyAddress = companyAddress;
        this.companyContact = companyContact;
        this.companyID = companyID;
    }

    // Other classes can get the company name but
    // not change it
    public String getCompanyName() {
        return this.companyName;
    }

    // protected because I only want companies to change
    // this company names through admin
    protected void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Other classes can get the taxRate but
    // not change it
    public Double getTaxRate() {
        return this.taxRate;
    }

    // protected because I only want companies to change
    // this taxrate through admin
    protected void setTaxRate(Double tRate) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tax rate: ");
        Double rate = scan.nextDouble();

        while (rate < 0) {
            System.out.println("Enter tax rate: ");
            rate = scan.nextDouble();
        }

        if (rate > 0) {
            this.taxRate = tRate;
        }
    }

    // Other classes can get the menu but
    // not change it
    public Menu getMenu() {
        return this.menu;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    protected void setCompanyAddress(String cAdd) {
        this.companyAddress = cAdd;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    protected void setCompanyContact(String cContact) {
        this.companyContact = cContact;
    }

    public String getCompanyID() {
        return this.companyID;
    }

    protected void setCompanyID(String cID) {

        if (cID.length() > 10) {
            throw new IllegalArgumentException("Error should be 10 digits");
        } else {
            this.companyID = cID;
        }
    }

    public ReadOnlyMenu getMenuView() {
        return menu;
    }
}
