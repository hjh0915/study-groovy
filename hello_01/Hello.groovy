def sum(a, b) {
    return a + b
}

def x = sum(2, 3)
println "Sum-01: ${x}"

//可以简写省去括号
x = sum 5, 7 
//println也可以省去括号
println "Sum-02: ${x}"