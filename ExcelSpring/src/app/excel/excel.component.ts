import { Component, OnInit } from '@angular/core';
import { httpService, StateSheet } from '../service/http-client.service';
import { Observable, Subscription } from 'rxjs';
import * as XLSX from 'xlsx'; 
import { FormControl } from '@angular/forms';
import { HttpResponse, HttpEventType } from '@angular/common/http';
type AOA = any[][];

@Component({
  selector: 'app-excel',
  templateUrl: './excel.component.html',
  styleUrls: ['./excel.component.css']
})

export class ExcelComponent implements OnInit {
  Sheet: Observable<StateSheet[]>;
  stateSheets: StateSheet = new StateSheet();
  submitted:false;
  dataFound: boolean = false;
  
selectedFiles: FileList;
currentFileUpload: File;
progress: { percentage: number } = { percentage: 0 };
selectedFile = null;


  fileName= 'ExcelSheet.xlsx'; 
  data: AOA = [[1, 2], [3, 4]];
  wopts: XLSX.WritingOptions = { bookType: 'xlsx', type: 'array' };

months=['1','2','3','4','5','6','7','8','9','10','11','12'];
years=['2015','2016','2017','2018','2019','2020','2021']


  constructor(private httpClientService:httpService) { }

  ngOnInit() {
  }

  loadData() {
    this.httpClientService.getMonthList(this.stateSheets.month,this.stateSheets.year).subscribe((data) => {
        console.log(data);
        this.stateSheets=data;
      //this.dataFound = true;
    })
     console.log(this.stateSheets);
  }

  // loadData(){
  //   this.httpClientService.getMonthList(this.option1,this.option2).subscribe((data) => {
  //           console.log(data);
  //           //this.stateSheets=data;
  //         this.dataFound = true;
  //         alert("syccess");
  //       })
  //        console.log(this.stateSheets);
  //   }
 

  
//import
// selectFile(evt: any) {
//     /* wire up file reader */
//     const target: DataTransfer = <DataTransfer>(evt.target);
//     if (target.files.length !== 1) throw new Error('Cannot use multiple files');
//     const reader: FileReader = new FileReader();
//     reader.onload = (e: any) => {
//       /* read workbook */
//       const bstr: string = e.target.result;
//       const wb: XLSX.WorkBook = XLSX.read(bstr, { type: 'binary' });


//       /* grab first sheet */
//       const wsname: string = wb.SheetNames[0];
//       const ws: XLSX.WorkSheet = wb.Sheets[wsname];

//       /* save data */
//       this.data = <AOA>(XLSX.utils.sheet_to_json(ws, { header: 1 }));
//       console.log(this.data);
//     };
//     reader.readAsBinaryString(target.files[0]);
//   }


// selectFile(event) {
//   this.selectedFiles = event.target.files;
//   }

    // upload() {
    // this.progress.percentage = 0;
    // this.currentFileUpload = this.selectedFiles.item(0);
    // this.httpClientService.pushFileToStorage(this.currentFileUpload).subscribe(event => {
    // if (event.type === HttpEventType.UploadProgress) {
    // this.progress.percentage = Math.round(100 * event.loaded / event.total);
    // } else if (event instanceof HttpResponse) {
    // alert('File Successfully Imported');
    // }
    // this.selectedFiles = undefined;
    // }
    // );
    // }

//export
  exportexcel(): void 
    {
       let element = document.getElementById('excel-table'); 
       const ws: XLSX.WorkSheet =XLSX.utils.table_to_sheet(element);

       
       const wb: XLSX.WorkBook = XLSX.utils.book_new();
       XLSX.utils.book_append_sheet(wb, ws, 'Sheet1');

      
       XLSX.writeFile(wb, this.fileName);
			
    }

}