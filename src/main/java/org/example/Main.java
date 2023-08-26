package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node a1 = new Node("a",null);
        Node a2 = new Node("b",null);
        Node a3 = new Node("c",null);
        Node a4 = new Node("d",null);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        Node head = a1;
        Node pre = null;
        Node next = head.next;

    }
// Задача 1 SQL:

 /*   SELECT surname
    FROM users                  // в условии нет названия таблицы
    ORDER BY experience DESC
    LIMIT 1 OFFSET 1;*/

//  Задача 2 замена переменных без использования третьей

    public void swap (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }


// Задача 3.1 инверсия односвязного списка
    public List inversion (List<Integer> list) {

        Node a1 = new Node("a",null);
        Node a2 = new Node("b",null);
        Node a3 = new Node("c",null);
        Node a4 = new Node("d",null);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;


        Node head = a1;
        Node pre = null;
        Node next = head.next;

        while(next != null) {
            head.next = pre;
            pre = head;
            head = next;
            next = next.next;
        }
        head.next = pre;

        //print all
        Node p;
        p = head;
        for(;p != null;p = p.next) {
            System.out.print(p.value + " ");
        }

        return list;
    }

}