package com.company;

import java.util.Random;

public class PhoneStringGenerator {
    private Random random = null;

    private PhoneList phoneDirectoryCallToAction = null;
    private PhoneList phonePrice = null;
    private PhoneList phoneDiagonal = null;
    private PhoneList numberOfPhonesInStock = null;
    private PhoneList phoneColor = null;

    public PhoneStringGenerator(PhoneList phoneDirectoryCallToAction, PhoneList phonePrice, PhoneList phoneDiagonal, PhoneList numberOfPhonesInStock, PhoneList phoneColor) {
        random = new Random();

        this.phoneDirectoryCallToAction = phoneDirectoryCallToAction;
        this.phonePrice = phonePrice;
        this.phoneDiagonal = phoneDiagonal;
        this.numberOfPhonesInStock = numberOfPhonesInStock;
        this.phoneColor = phoneColor;
    }

    public String getRandomPhone() throws Exception{
        int phoneDirectoryCallToActionIndex = random.nextInt(phoneDirectoryCallToAction.getLength());
        String DirectoryCallToAction = phoneDirectoryCallToAction.getByIndex(phoneDirectoryCallToActionIndex);

        int phonePriceIndex = random.nextInt(phonePrice.getLength());
        String price = phonePrice.getByIndex(phonePriceIndex);

        int phoneDiagonalIndex = random.nextInt(phoneDiagonal.getLength());
        String diagonal = phoneDiagonal.getByIndex(phoneDiagonalIndex);

        int numberOfPhonesInStockIndex = random.nextInt(numberOfPhonesInStock.getLength());
        String number = numberOfPhonesInStock.getByIndex(numberOfPhonesInStockIndex);

        int phoneColorIndex = random.nextInt(phoneColor.getLength());
        String color = phoneColor.getByIndex(phoneColorIndex);

        return String.format("%s %s %s %s %s", DirectoryCallToAction, price, diagonal, number, color);
    }

    public PhoneList getPhoneDirectoryCallToAction() {
        return phoneDirectoryCallToAction;
    }

    public PhoneList getPhonePrice() {
        return phonePrice;
    }

    //todo add other getters
}