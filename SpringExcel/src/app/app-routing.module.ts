import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExcelListComponent } from './excel-list/excel-list.component';


const routes: Routes = [{path:'',component:ExcelListComponent},
{ path: 'list', component: ExcelListComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
