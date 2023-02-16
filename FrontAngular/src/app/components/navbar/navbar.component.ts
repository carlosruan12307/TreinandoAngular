import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
    ngOnInit(): void {

    }
    activeNav(event:any){

      document.querySelectorAll("a").forEach((e) => {
          e.classList.remove("active-teste")
      })
      event.target.classList.add("active-teste")
    }

}
