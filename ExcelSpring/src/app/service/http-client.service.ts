import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs'
  
export class StateSheet {
   id: number;
   State: string;
   month: number;
   year: number;
   first: number;
   second: number;
  third: number;
   fourth :number;
   fifth :number;
   six :number;
   seven :number;
 eight :number;
 nine:number;
 ten:number;
  eleven:number;
 twelve:number;
 thirteen:number;
 fourteen:number;
 fiftheen:number;
 sixtenn:number;
 seventeen:number;
 eighteen:number;
 nineteen:number;
 twenty:number;
twentyone:number;
 twentytwo:number;
 twentythree:number;
 twentyfifve:number;
 twentysix:number;
 twentyseven:number;
 twentyeight:number;
 twentynine:number;
thirty:number;
 thirtyone:number;
 Total:number;
  }
  @Injectable({
    providedIn: 'root'
  })

  export class httpService {
    
    
    private baseUrl = 'http://localhost:8081/months';
  
    constructor(private http: HttpClient) { }

    getMonthList(month:number,year:number): Observable<any> {
      return this.http.get(`${this.baseUrl}/get?month=${month}&year=${year}`);
    }



    // pushFileToStorage(file: File): Observable<HttpEvent<{}>> {
    //   const data: FormData = new FormData();
    //   data.append('file', file);
    //   const newRequest = new HttpRequest('POST', 'http://localhost:8081/months/savefile', data, {
    //   reportProgress: true,
    //   responseType: 'text'
    //   });
    //   return this.http.request(newRequest);
    //   }
    }
  