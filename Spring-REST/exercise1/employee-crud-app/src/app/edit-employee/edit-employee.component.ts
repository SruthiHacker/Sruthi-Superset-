import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, FormGroup } from '@angular/forms';
import { RouterModule, ActivatedRoute, Router } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css'],
  imports: [CommonModule, ReactiveFormsModule, RouterModule],
})
export class EditEmployeeComponent {
  employeeForm!: FormGroup;

  constructor(private fb: FormBuilder) {
    this.employeeForm = this.fb.group({
      id: [''],
      name: [''],
      salary: ['']
    });
  }

  onSubmit() {
    console.log(this.employeeForm.value);
  }
}
