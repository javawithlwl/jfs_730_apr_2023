import { Component } from '@angular/core';
import { contacts,Contact } from '../contacts';
@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent {

    contacts = [...contacts];
    contact:any=null;

    showMoreDetails(contact:Contact){
       this.contact = contact;
    }

}
