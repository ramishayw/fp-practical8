object Q2 extends App {
    val multiple: Int => Unit = (x: Int) => {
        if(x % 3 == 0 && x % 5 == 0) println("Multiple of Three and Five")
        else if(x % 3 == 0) println("Multiple of Three")
        else if(x % 5 == 0) println("Multiple of Five")
        else println("Not Multiple of 3 or 5")
    }

    multiple(15)
}