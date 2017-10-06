import {Component, OnInit} from "@angular/core";
import {FilmsResources} from "./films.resources";
import {Film} from "./film.model";
import {Pageable} from "../../../../common/pageable";
import "rxjs/add/operator/toPromise";
import "rxjs/add/operator/delay";
import {GridOptions} from "ag-grid";

@Component({
  selector: 'app-films-list',
  templateUrl: './films-list.component.html',
  styleUrls: ['./films-list.component.scss']
})
export class FilmsListComponent implements OnInit {


  gridOptions: GridOptions;
  page: Pageable<Film> = new Pageable<Film>();

  constructor(private workItemsResources: FilmsResources) {
    this.gridOptions = <GridOptions>{};
    this.gridOptions.columnDefs = [
      {
        headerName: "Title",
        field: "title"
      },
      {
        headerName: "Release Year",
        field: "releaseYear",
        width: 200,
        // suppressSizeToFit: true
      }
    ];
  }

  ngOnInit() {
    this.loadRecords(<FilmRequest>{
      page: 0
    });
    setTimeout(() => this.gridOptions.api.doLayout(), 500);

  }

  gridReady() {
    console.log('ready');
    this.gridOptions.api.sizeColumnsToFit();
  }

  loadRecords(filmRequest: FilmRequest) {
    console.log('loading filmRequest', filmRequest);
    this.workItemsResources.getPage(filmRequest.page)
      .delay(1000)
      .toPromise()
      .then(data => this.page = data);
  }

}

class FilmRequest {
  page: number;
  languageId: number;
}
