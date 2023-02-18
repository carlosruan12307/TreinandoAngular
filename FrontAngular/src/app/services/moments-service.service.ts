import { momentInterface } from './../interfaces/momentInterface';
import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MomentsServiceService {
 private url: string = "http://localhost:8080/momentos"
 private code = window.btoa('user:78d7d263-89c6-418a-a62c-e0bcdb60a429');
  private headers = new HttpHeaders().set('Authorization',`Basic ${this.code}`)
  constructor(private http:HttpClient) {

  }

  getMoments(): Observable<momentInterface[]> {
    return this.http.get<momentInterface[]>(this.url, {headers: this.headers});
  }
}
