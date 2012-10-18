import geb.Page

class ListPage extends Page {
    static url = "person/list"

    static at = {
        title ==~ /Person List/
    }

    static content = {
        peopleTable { $("div.content table", 0) }
        personRows(required: false) { peopleTable.find("tbody").find("tr") }
    }
}
