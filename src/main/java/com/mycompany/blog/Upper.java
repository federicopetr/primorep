/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blog;

/**
 *
 * @author Francesco
 */
public class Upper {
    public static String capitalizefirst(String string){
        String[] parts = string.split(" ");
        String ret="";
        for (int i=0;i<parts.length;i++){
            String letter=String.valueOf(parts[i].charAt(0));
            parts[i]=parts[i].replaceFirst(letter,letter.toUpperCase());
            if (i<=parts.length-1){
                ret=ret.concat(parts[i]+" ");
            }
        }
        return ret;
        
    }

    
}
