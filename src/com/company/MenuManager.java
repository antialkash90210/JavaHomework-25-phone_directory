package com.company;

public class MenuManager {
    private PhoneStringGenerator phoneStringGenerator = null;

    public MenuManager(PhoneStringGenerator phoneStringGenerator) {
        this.phoneStringGenerator = phoneStringGenerator;
    }

    private void workWithPhrasesPhones(PhoneList phoneList) throws Exception {
        int action = -1;
        boolean isRun = true;

        //меню по работе со списком телефонов
        while (isRun) {
            for (int i = 0; i < phoneList.getLength(); i++) {
                String message = String.format("        %d - %s", i, phoneList.getByIndex(i));
                ConsoleHelper.PrintMessage(message);
            }
            ConsoleHelper.PrintMessage("        =====");

            ConsoleHelper.PrintMessage("        Меню характеристик телефонов:");
            ConsoleHelper.PrintMessage("        1. Добавить характеристику телефона");
            ConsoleHelper.PrintMessage("        2. Удалить характеристику телефона");
            ConsoleHelper.PrintMessage("        0. Выход");
            action = ConsoleHelper.InputInt("        Введите номер пункта меню: ", 0, 2);

            switch (action) {
                case 1: {
                    String word = ConsoleHelper.InputString("        Введите характеристику телефона: ");
                    phoneList.addToEnd(word);
                }
                break;
                case 2: {
                    int index = ConsoleHelper.InputInt("        Введите индекс для удаления: ", 0, phoneList.getLength() - 1);
                    phoneList.deleteByIndex(index);
                }
                break;
                case 0: {
                    isRun = false;
                }
                break;
            }

        }
    }

    //меню по умолчанию
    public void executeOperationsOnThePhoneList() throws Exception {
        int action = -1;
        boolean isRun = true;

        while (isRun) {

            ConsoleHelper.PrintMessage("Меню по умолчанию:");
            ConsoleHelper.PrintMessage("1. Вывести строку с информацией по телефону");
            ConsoleHelper.PrintMessage("2. Работа с характеристиками телефонов");
            ConsoleHelper.PrintMessage("0. Выход");

            action = ConsoleHelper.InputInt("Введите номер пункта меню: ", 0, 2);

            switch (action) {
                case 1: {
                    String phone = phoneStringGenerator.getRandomPhone();
                    ConsoleHelper.PrintMessage(phone);
                }
                break;

                case 2: {
                    int innerAction = -1;
                    ConsoleHelper.PrintMessage("    Меню характеристик]:");
                    ConsoleHelper.PrintMessage("    1. Каталог телефонов");//призыв к действию каталога телефонов
                    ConsoleHelper.PrintMessage("    2. Цены телефонов");//цена телефона
                    //todo add other phrases list
                    ConsoleHelper.PrintMessage("    0. Выход");

                    innerAction = ConsoleHelper.InputInt("    Введите номер пункта меню: ", 0, 2);

                    switch (innerAction) {
                        case 1: {
                            PhoneList phoneDirectoryCallToAction = phoneStringGenerator.getPhoneDirectoryCallToAction();
                            workWithPhrasesPhones(phoneDirectoryCallToAction);
                        }
                        break;

                        case 2: {
                            PhoneList phonePrice = phoneStringGenerator.getPhonePrice();
                            workWithPhrasesPhones(phonePrice);
                        }
                        break;
                    }
                }
                break;
                case 0: {
                    isRun = false;
                }
                break;
            }
        }
    }
}