package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
// Задача 1 SQL:

    String SQL = new String(
            "SELECT surname " +
            "FROM users  " +       // в условии нет названия таблицы
            "ORDER BY experience DESC" +
            "LIMIT 1 OFFSET 1;" );

//  Задача 2 замена значений переменных без использования третьей

    public void swap (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }


// Задача 3.1 инверсия односвязного списка
    public void inversion () {

        Node n4 = new Node("4",null);
        Node n3 = new Node("3",n4);
        Node n2 = new Node("2",n3);
        Node n1 = new Node("1",n2);

        Node head = n1;
        Node previous = null;
        Node next = head.next;

        while(next != null) {
            head.next = previous;
            previous = head;
            head = next;
            next = next.next;
        }
        head.next = previous;
    }

// Задача 3.2 проверка полиндрома

    public boolean isPalindrom (String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String reverse = builder.toString();
        if(string.equals(reverse)){
           return true;
        }else{
            return false;
        }
    }

}