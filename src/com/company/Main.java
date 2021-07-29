
package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        PhoneList phoneDirectoryCallToAction = new PhoneList();
        PhoneList phonePrice = new PhoneList();
        PhoneList phoneDiagonal = new PhoneList();
        PhoneList numberOfPhonesInStock = new PhoneList();
        PhoneList phoneColor = new PhoneList();

        //призыв к действию каталога телефонов
        phoneDirectoryCallToAction.addRange(new String[]{
                "Samsung",
                "Honor",
                "Apple"
        });

        //цена телефона
        phonePrice.addRange(new String[]{
                "30000",
                "20000",
                "80000"
        });

        //диагональ телефона
        phoneDiagonal.addRange(new String[]{
                "5.0",
                "5.5",
                "6.0"
        });

        //количество телефонов на складе
        numberOfPhonesInStock.addRange(new String[]{
                "200 шт",
                "300 шт",
                "400 шт"
        });

        phoneColor.addRange(new String[]{
                "красный",
                "белый",
                "черный"
        });


        PhoneStringGenerator phoneStringGenerator = new PhoneStringGenerator(phoneDirectoryCallToAction, phonePrice, phoneDiagonal, numberOfPhonesInStock, phoneColor);

        MenuManager menuManager = new MenuManager(phoneStringGenerator);
        menuManager.executeOperationsOnThePhoneList();
    }
}