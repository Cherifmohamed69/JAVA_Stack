import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { SitterService } from '../../services/sittersservice';
import { NgForm } from '@angular/forms'; // Import NgForm for the onSubmit method
import { AlertModalComponent } from 'src/app/components/alert-modal/alert-modal.component';
import { Sitter } from 'src/app/models/sitter.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-sitter',
  templateUrl: './create-sitter.component.html',
  styleUrls: ['./create-sitter.component.css']
})
export class CreateSitterComponent {
  sitter: Sitter = new Sitter();

  activities: string[] = [
    'Sports',
    'Music',
    'Painting',
    'Dancing',
    'Camping',
    'Cooking',
    'Gardening',
    'Chatting'
  ];
  selectedActivities: { [key: string]: boolean } = {};

  form: FormGroup;
  currentStep: number = 1;

  constructor(
    private fb: FormBuilder,
    private sitterService: SitterService,
    private modalService: NgbModal,
    private router: Router
  ) {
    this.form = this.fb.group({
      step1: this.fb.group({
        firstName: ['', Validators.required],
        lastName: ['', Validators.required],
        address: ['', Validators.required],
      }),
      step2: this.fb.group({
        age: ['', Validators.required],
        email: ['', [Validators.required, Validators.email]],
        password: ['', Validators.required],
      }),
      step3: this.fb.group({
        description: ['', Validators.required],
        education: ['', Validators.required],
        pricePerHour: ['', Validators.required],
        image: [''],
        cv: [''],
      }),
    });
  }

  nextStep() {
    this.currentStep++;
  }

  prevStep() {
    this.currentStep--;
  }

  onSubmit() {
    const selectedActivityNames = Object.keys(this.selectedActivities)
      .filter((activityName) => this.selectedActivities[activityName]);
    this.sitter.activities = [...selectedActivityNames];
    alert('Thank you for join us we will call you in 24h maximum');

    console.log(this.sitter);

    this.sitterService.registerSitter(this.sitter).subscribe(
      (response) => {
        console.log('Registration successful:', response);
        sessionStorage.setItem('sitterId', response.id);

        this.router.navigate(['careGiverProfil']);
      },
      (error) => {
        console.error('Registration failed:', error);
      }
    );
  }

    
 

  showModal() {
    const modalRef = this.modalService.open(AlertModalComponent);
    modalRef.result.then((result: any) => {
      if (result === 'save') {
        // Handle the logic when the modal is closed with the 'save' action
        // You can add your save functionality here
      }
    }).catch((error: any) => {
      // Handle any errors or dismissals here
    });
  }
}
