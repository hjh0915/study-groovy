class Hello {
    static sum(a, b) {
        return a+b
    }
    
    static void main(args) {
        def x = sum(2, 3)
        println "Sum: ${x}"
    }
}