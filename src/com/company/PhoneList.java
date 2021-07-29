package com.company;

public class PhoneList {
    private String[] phone = null;

    public PhoneList() {
        phone = new String[0];
    }

    public void clear() {
        phone = new String[0];
    }

    public String getByIndex(int index) throws Exception {
        if (index < 0 || index > phone.length - 1) {
            throw new Exception("Выход за границы списка телефонов");
        }

        return phone[index];
    }

    public void setByIndex(int index, String value) throws Exception {
        if (index < 0 || index > phone.length - 1) {
            throw new Exception("Выход за границы списка фраз");
        }

        phone[index] = value;
    }

    public int getLength() {
        return phone.length;
    }

    public void addToEnd(String value) {
        String[] tempPhone = new String[phone.length + 1];

        for (int i = 0; i < phone.length; i++) {
            tempPhone[i] = phone[i];
        }

        tempPhone[tempPhone.length - 1] = value;

        phone = tempPhone;
    }

    public void deleteByIndex(int index) throws Exception {
        if (index < 0 || index > phone.length - 1) {
            throw new Exception("Выход за границы списка фраз");
        }

        String[] tempPhone = new String[phone.length - 1];

        for (int i = 0; i < index; i++) {
            tempPhone[i] = phone[i];
        }

        for (int i = index + 1; i < phone.length; i++) {
            tempPhone[i - 1] = phone[i];
        }

        phone = tempPhone;
    }

    public void addRange(String[] phone) {
        for (int i = 0; i < phone.length; i++) {
            addToEnd(phone[i]);
        }
    }
}