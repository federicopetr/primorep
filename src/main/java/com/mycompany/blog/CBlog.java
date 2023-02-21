/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blog;

/**
 *
 * @author Francesco
 */
public class CBlog {
    private Article [] articles;

    public CBlog(Article[] articles) {
        this.articles = articles;
    }

    
    
    
    
    public void addArticle(Article article){
        Article [] array = new Article[this.articles.length+1];
        this.articles=array;
        articles[articles.length]=article;
    }
    
}
