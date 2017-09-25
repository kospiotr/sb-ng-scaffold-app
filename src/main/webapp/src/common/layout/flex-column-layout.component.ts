import {Component, OnInit, EventEmitter} from "@angular/core";

@Component({
  selector: 'flex-column-layout',
  templateUrl: './flex-column-layout.component.html',
  styleUrls: ['./flex-column-layout.component.scss']
})
export class FlexColumnLayoutComponent implements OnInit {

  toggleEvent: EventEmitter<string> = new EventEmitter();
  westActive: boolean = false;
  eastActive: boolean = false;

  constructor() {
  }

  ngOnInit() {
  }

  toggleWest() {
    this.westActive = !this.westActive;
  }

  toggleEast() {
    this.eastActive = !this.eastActive;
  }


}
