/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_8.array;

import java.util.ArrayList;

public class ArrayListPrtmn9 {


    public static void main(String[] args) {
        ArrayList arr = new ArrayList ();
        arr.add("Chise");
        arr.add("Bob");
        arr.add("Teto");
        arr.add(20);
        arr.add(null);
        arr.set(2, "Melisa");
        Object removedValue = arr.remove(2);
        System.out.println("Value yang dihapus: " + removedValue);
        System.out.println(arr);
        
        ArrayList arrl = new ArrayList ();
        arrl.add("Chise");
        arrl.add("Bob");
        arrl.add("Teto");
        System.out.println(arr);
        System.out.println("Element yang terambil: " + arr1.get(2));
        
        arr.addAll(arr);
        System.out.println(arr);
        
    }
    
}
