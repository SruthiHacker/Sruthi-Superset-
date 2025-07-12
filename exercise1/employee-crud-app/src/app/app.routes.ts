import { Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';

export const routes: Routes = [
  { path: '', component: EmployeeListComponent },
  { path: 'edit/:id', component: EditEmployeeComponent },
];
