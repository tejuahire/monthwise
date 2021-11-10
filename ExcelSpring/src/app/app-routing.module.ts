import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExcelComponent } from './excel/excel.component';


const routes: Routes = [
  {path:'',component:ExcelComponent},
  { path: 'excel', component: ExcelComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{onSameUrlNavigation:`reload`})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
