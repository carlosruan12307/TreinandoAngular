import { SobreComponent } from './components/pages/sobre/sobre.component';
import { CompartilharComponent } from './components/pages/compartilhar/compartilhar.component';
import { momentsComponent } from './components/pages/moments/moments.component';
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
