/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="Hello my name is oğulcan";
        //string=dizi= katar
        System.out.println("dizinin 10. indeksindeki karakteri: "+s.charAt(10));
        s=s.toUpperCase();
        System.out.println("dizinin tamamı büyük hali: "+s);
        s=s.toLowerCase();
        System.out.println("dizinin tamamı kücük hali: "+s);
        int ilkboslukbulma=s.indexOf(" ");
        int sonBoslukbulma=s.lastIndexOf(" ");
        System.out.println("dizinin ilk boşluk karakterinin geçtiği indeks:"+ilkboslukbulma+" son bosluk karakterinin geçtiği yer: "+sonBoslukbulma);
        int karakterbul=s.indexOf("o");
        System.out.println("o harfinin geçtiği ilk index: "+karakterbul);
        String ilkKelime=s.substring(0,ilkboslukbulma);
        System.out.println("stringin ilk kelimesi: "+ilkKelime);
        String sonkelime=s.substring(sonBoslukbulma);
        System.out.println("dizinin son kelimesi: "+sonkelime);
        int result = s.codePointAt(0);
         System.out.println("belirtilen indeksin yani 0. indeksin ascii değeri: "+result);
         String myStr1 = "ali";
        String myStr2 = "zeki";
        System.out.println("sayıların sözlük sırası arası karşılaştırma yaplıyo eğer 1. string teki daha önceyse negatif değilse pozitif eşitse 0 değeri dönüyor:"+myStr1.compareTo(myStr2));
        myStr1=myStr1.concat(" "+myStr2);
        System.out.println("birnici strinfgin sonuna ikinci sitringi ekleme: "+myStr1);
        System.out.println("s stringini içinde oğulcan kelimesi geçiyo mu: "+s.contains("oğulcan"));
        System.out.println("s stringini içinde  r karakteri geçiyo mu: "+s.contains("r"));
        int uzunluk=s.length();
        System.out.println("s stringinin uzunluğu "+uzunluk);
    }
    
}
