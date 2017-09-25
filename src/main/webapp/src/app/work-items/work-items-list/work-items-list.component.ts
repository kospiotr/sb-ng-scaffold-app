import {Component, OnInit} from "@angular/core";
import {LazyLoadEvent} from "primeng/components/common/lazyloadevent";
import {WorkItemsResources} from "./work-items.resources";
import {WorkItem} from "./work-item.model";
import {Pageable} from "../../../common/pageable";
import "rxjs/add/operator/toPromise";
import "rxjs/add/operator/delay";

@Component({
  selector: 'app-work-items-list',
  templateUrl: './work-items-list.component.html',
  styleUrls: ['./work-items-list.component.scss']
})
export class WorkItemsListComponent implements OnInit {

  page: Pageable<WorkItem> = new Pageable<WorkItem>();

  constructor(private workItemsResources: WorkItemsResources) {
  }

  ngOnInit() {

  }

  loadRecords(event: LazyLoadEvent) {
    this.workItemsResources.getPage(event.first)
      .delay(1000)
      .toPromise()
      .then(data => this.page = data);
  }

}
