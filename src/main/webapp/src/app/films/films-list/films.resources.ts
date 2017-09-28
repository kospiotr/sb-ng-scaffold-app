import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {Observable} from "rxjs";
import "rxjs/add/operator/map";
import {Film} from "./film.model";
import {Pageable} from "../../../common/pageable";

@Injectable()
export class FilmsResources {

  constructor(private http: Http) {
  }

  pageSize: number = 100;

  public query(): Observable<Film[]> {
    return this.http.get('api/film?page=3')
      .map(res => <Film[]>res.json());
  }

  public get(id: number): Observable<Film> {
    return this.query()
      .map(res => null);
  }

  public getPage(pageNumber: number): Observable<Pageable<Film>> {
    return this.http.get('api/film?page=' + pageNumber)
      .map(res => <Pageable<Film>>res.json());
  }


}
