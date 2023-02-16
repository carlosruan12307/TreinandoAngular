import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-compartilhar',
  templateUrl: './compartilhar.component.html',
  styleUrls: ['./compartilhar.component.css']
})
export class CompartilharComponent implements OnInit {

  formGroup!: FormGroup

  ngOnInit(): void {
    this.formGroup = new FormGroup({
      titulo: new FormControl('', Validators.required),
      descricao: new FormControl('', Validators.required),
      file: new FormControl('',Validators.required)
    })
  }

  get titulo(){
    return this.formGroup.get('titulo');
  }
  get descricao(){
    return this.formGroup.get('descricao')
  }

  get file(){
    return this.formGroup.get('file')
  }
}
