/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blog;

/**
 *
 * @author Francesco
 */
public class Blog {

    public static void main(String[] args) {
        
        Article batman=new Article("Batman","io");
        Article superman=new Article("Superman","io");
        Article acquaman=new Article("Acquaman","io");
        Article [] array = {batman,superman,acquaman};
        CBlog blog = new CBlog(array);
    }
}
