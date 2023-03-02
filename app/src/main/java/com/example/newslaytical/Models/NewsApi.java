package com.example.newslaytical.Models;

import java.util.ArrayList;
import java.util.List;

public class NewsApi {
 String  status="";
 int totalResults;
ArrayList<newsHeadlines> articles;
 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 public int getTotalResults() {
  return totalResults;
 }

 public void setTotalResults(int totalResults) {
  this.totalResults = totalResults;
 }

 public List<newsHeadlines> getArticles() {
  return articles;
 }

 public void setArticles(ArrayList<newsHeadlines> articles) {
  this.articles = articles;
 }
}
