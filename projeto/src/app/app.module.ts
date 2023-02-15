import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import {  momentsComponent } from './components/moments/moments.component';
import { CompartilharComponent } from './components/compartilhar/compartilhar.component';
import { SobreComponent } from './components/sobre/sobre.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    momentsComponent,
    CompartilharComponent,
    SobreComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
