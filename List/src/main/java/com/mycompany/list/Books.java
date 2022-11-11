/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.list;

import java.util.Arrays;

/**
 *
 * @author Jane
 */
public class Books {
    private String name;
    private Publishing publishing;
    private int year;
    private String autors[];

    public String getName() {
        return name;
    }

    public Publishing getPublishing() {
        return publishing;
    }

    public int getYear() {
        return year;
    }

    public String[] getAutors() {
        return autors;
    }

   public int getAutorsAmount() {
       return autors.length;
   }
   
   public String getAutor(int i) {
       if (i>autors.length) throw new IllegalArgumentException("Получено некорректное значение индекса");
       return autors[i];
   }

    public void setName(String name) {
        if(name.isEmpty()) throw new NullPointerException("Название книги не должно быть пустой строкой");
        this.name = name;
    }

    public void setPublishing(Publishing publishing) {
        if(publishing.toString().isEmpty()) throw new NullPointerException("Отсутствует информация об издательстве");
        this.publishing = publishing;
    }

    public void setYear(int year) {
        if(year<0 && year==0) throw new IllegalArgumentException("Год издания должен быть больше 0");
        this.year = year;
    }

    public void setAutors(String[] autors) {
        int i;
        for (i=0 ; i<autors.length ; i++) {
            if (autors[i]==null) throw new NullPointerException("Массив не должен сожержать пустых строк");
        }
        this.autors = autors;
    }

    public Books(String name, Publishing publishing, int year) {
        this.name = name;
        this.publishing = publishing;
        this.year = year;
    }

    public Books(String name, Publishing publishing, int year, String[] autors) {
        this(name, publishing, year);
        this.autors = autors;
    }
    
    public void print(){
        if (autors==null) System.out.println(name + publishing.name + publishing.city + year);
        else System.out.println(name + publishing.name + publishing.city + year + Arrays.toString(autors));
    }
    
    public static void printAll(Books[] booksArray){
        for(int i=0 ; i<booksArray.length ; i++){
            booksArray[i].print();
        }
    }
    
    public static void main(String[] args){
        
        Publishing[] publishingArray = new Publishing[4];
        publishingArray[0] = new Publishing(" Проспект", " Москва ");
        publishingArray[1] = new Publishing(" Питер", " Санкт-Петербург ");
        publishingArray[2] = new Publishing(" БХВ", " Санкт-Петебург ");
        publishingArray[3] = new Publishing(" Диалектика", " Киев "); 
        
        String[] autorsArray0 = new String[]{"Седжвик Роберт", "Уэйн Кевин"};
        String[] autorsArray1 = new String[]{"Вигес Карл"};
        String[] autorsArray2 = new String[]{"Шилд Герберт"};
        String[] autorsArray3 = new String[]{"Полубенцева М.И."};
        
        Books[] booksArray = new Books[5];
        booksArray[0] = new Books("Computer Science: основы программирования на Java,ООП, алгоритмы и структуры данных.", publishingArray[1], 2018, autorsArray0);
        booksArray[1] = new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное.", publishingArray[2], 2019, autorsArray1);
        booksArray[2] = new Books("Java. Полное руководство, 10-е издание.", publishingArray[3], 2018, autorsArray2);
        booksArray[3] = new Books("C/C++. Процедурное программирование.", publishingArray[2], 2017, autorsArray3);
        booksArray[4] = new Books("Конституция РФ.", publishingArray[0], 2020);
        
        for(int i=0 ; i<booksArray.length ; i++){
            booksArray[i].print();
        }
        
        publishingArray[2].city = " Санкт-Петербург ";
        //Вывод изменился для книг издательства БХВ в связи с опечаткой в наименовании города
        System.out.println("Вывод изменился для книг издательства БХВ в связи с опечаткой в наименовании города:");
        for(int i=0 ; i<booksArray.length ; i++){
            booksArray[i].print();
            
        }
    }
}
