import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NewsService {

  constructor(private httpClient:HttpClient) { }

  getNewsItems(country:string, newsType:string) {
    return this.httpClient.get<any>(`https://newsapi.org/v2/top-headlines?country=${country}&category=${newsType}&apiKey=cfaf5fcdebfb4d7293720a9aa6ffc113`);
  }
}
