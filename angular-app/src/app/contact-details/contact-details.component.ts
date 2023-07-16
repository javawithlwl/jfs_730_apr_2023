import { Component } from '@angular/core';
import { Contact, contacts } from '../contacts';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contact-details',
  templateUrl: './contact-details.component.html',
  styleUrls: ['./contact-details.component.css']
})
export class ContactDetailsComponent {

      contact:Contact | undefined;

      constructor(private route:ActivatedRoute) { }

      ngOnInit(){
        const routeParams = this.route.snapshot.paramMap;
        const contactIdFromRoute = Number(routeParams.get('contactId'));
        this.contact = contacts.find(contact => contact.id === contactIdFromRoute);
      }
}
