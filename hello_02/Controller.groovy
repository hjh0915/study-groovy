if (null) {
    assert false
} else {
    assert true
    println "null"
}

def x = 1 
if (x == 1) {
    assert true
    println "${x}"
} else {
    assert false
}

def i = 0
while (i < 10) {
    i++
}
assert i == 10

def clinks = 0
for (y in 0..9) {
    clinks += y
}
assert clinks == (10*(10-1))/2

def list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
for (j in list) {
    assert j == list[j]
}

list.each() { it ->
    assert it == list[it]
}

list.each() {
    assert it == list[it]
}

langs = ['C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy']
langs.each { language, author ->
    println "Language $language was authored by $author"
}

switch(3) {
    case 1: assert false; break
    case 3: assert true; break
    default: assert false
}