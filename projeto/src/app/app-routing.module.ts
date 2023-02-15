import { SobreComponent } from './components/sobre/sobre.component';
import { CompartilharComponent } from './components/compartilhar/compartilhar.component';
import { momentsComponent } from './components/moments/moments.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
{path:"", component:momentsComponent},
{path:"compartilhar",component:CompartilharComponent},
{path:"sobre", component: SobreComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
