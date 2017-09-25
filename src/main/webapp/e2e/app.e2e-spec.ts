import { WorkItemsPage } from './app.po';

describe('work-items App', () => {
  let page: WorkItemsPage;

  beforeEach(() => {
    page = new WorkItemsPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
