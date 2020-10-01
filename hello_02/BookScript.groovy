class Book {
    private String title
    Book(String t) {
        title = t
    }
    String getTitle() {
        return title
    }
}

Book gina = new Book('Groovy')
assert gina.getTitle() == 'Groovy'
assert getTitleBackwards(gina) == 'yvoorG'

String getTitleBackwards(book) {
    title = book.getTitle()
    return title.reverse()
}