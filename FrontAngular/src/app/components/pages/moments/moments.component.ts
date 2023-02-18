import { momentInterface } from './../../../interfaces/momentInterface';
import { MomentsServiceService } from './../../../services/moments-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-moments',
  templateUrl: './moments.component.html',
  styleUrls: ['./moments.component.css']
})
export class momentsComponent implements OnInit {
  public moments?: momentInterface[];
  public urlBackEnd: String = 'http://localhost:8080';

  constructor(private momentService:MomentsServiceService){


  }
  ngOnInit(): void {
    this.momentService.getMoments().subscribe({
      next: moment => {
        this.moments = moment
      },
      error: error => {
        console.log(error);
      }
    });
  }
}
