import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { NewsItem } from '../models/newsitem.model';
import { NewsService } from '../service/news.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent {

  newsItems: NewsItem[] = [];
  constructor(private newService: NewsService) { }
  country:string="us";
  newsType:string="sports";
  ngOnInit(): void {
     this.getNewsItems();   
  }
  getNewsItems() {
    this.newService.getNewsItems(this.country, this.newsType)
        .subscribe(data=>{
          this.newsItems = [];
          let articles = data['articles']
          for(let i=0; i<articles.length; i++){
              this.newsItems.push({"title": articles[i].title, 
              "description": articles[i].description, 
              "imgUrl": articles[i].urlToImage});
          }
        });
  }
  latestNewItems(){
    this.getNewsItems();
  }
}
