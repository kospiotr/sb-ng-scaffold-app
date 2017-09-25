import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {Observable} from "rxjs";
import "rxjs/add/operator/map";
import {WorkItem} from "./work-item.model";
import {Pageable} from "../../../common/pageable";

@Injectable()
export class WorkItemsResources {

  constructor(private http: Http) {
  }

  // public get(id: Number): Observable<WorkItem> {
  //   return this.http.get('/rest/department?id=' + id)
  //     .map(res => <Pageable<WorkItem>>res.json())
  //     .map(page => <WorkItem[]>page.content)
  //     .map(page => <WorkItem>page[0]);
  // }
  //
  // public query() {
  //   return this.http.get('assets/data/EeRXk2DQNyVL')
  //     .map(res =><Pageable<WorkItem>>res.json())
  // }

  pageSize: number = 100;

  public query(): Observable<WorkItem[]> {
    return this.http.get('assets/data/EeRXk2DQNyVL.json')
      .map(res => <WorkItem[]>res.json());
  }

  public get(id: number): Observable<WorkItem> {
    return this.query()
      .map(res => null);
  }

  public getPage(offset: number): Observable<Pageable<WorkItem>> {
    return this.query().map(res => {
      var pageable = new Pageable<WorkItem>();
      var end = offset + this.pageSize;
      pageable.rows = this.pageSize;
      pageable.offset = offset;
      pageable.data = res.slice(offset, end);
      pageable.totalElements = res.length;
      return pageable;
    });
  }


}
