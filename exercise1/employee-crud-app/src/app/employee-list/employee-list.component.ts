import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
  imports: [CommonModule, RouterModule],
})
export class EmployeeListComponent {
  employees = [
    { id: 1, name: 'Ram', salary: 50000 },
    { id: 2, name: 'Priya', salary: 60000 }
  ];

  constructor(private router: Router) {}

  editEmployee(id: number) {
    this.router.navigate(['/edit', id]);
  }
}
