import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EscritosService } from './services/escritos/escritos.service';
import { EstadosService } from './services/estados/estados.service';
import { ServiciosService } from './services/servicios/servicios.service';
import { TiposService } from './services/tipos/tipos.service';
import { TribunalesService } from './services/tribunales/tribunales.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  escritosForm: FormGroup = new FormGroup({});

  constructor(
    public fb:FormBuilder,
    public escritosService:EscritosService,
    public estadoService:EstadosService,
    public serviciosService:ServiciosService,
    public tiposService:TiposService,
    public tribunalService:TribunalesService
  ){

  }
  ngOnInit(): void {
    this.escritosForm = this.fb.group({
      id : [''],
      nro_escrito : ['', Validators.required],
      tipos : ['', Validators.required],
      servicios : ['', Validators.required],
      jurisdiccion : ['', Validators.required],
      tribunales : ['', Validators.required],
      asunto : ['', Validators.required],
      fec_ingreso : ['', Validators.required],
      nro_causa : ['', Validators.required],
      observacion : ['', Validators.required],
      estados : ['', Validators.required],
      createdAt : ['', Validators.required],
      updatedAt : [''],
    })
  }

  guardar():void{}

}
