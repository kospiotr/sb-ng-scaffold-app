import {Sort} from "./sort";
import {Filter} from "./filter";
export class Pageable<T> {

  public data: T[] = [];
  public rows: number;
  public totalElements: number;
  public pageSize: number;
  public offset: number;
  public sorters: Sort[];
  public filters: Filter[];
}
