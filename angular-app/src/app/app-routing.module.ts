import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactListComponent } from './contact-list/contact-list.component';
import { ContactDetailsComponent } from './contact-details/contact-details.component';
import { NewsComponent } from './news/news.component';

const routes: Routes = [
  {
    path:'',
    component: ContactListComponent,
    pathMatch: 'full'

  },
  {
    path:'contact/:contactId',
    component: ContactDetailsComponent
  },
  {
    path: 'news',
    component: NewsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
