object Q1 extends App {
    def encryptionCaesar(str:String, n:Int) = {
        val shifts = n % 26

        str.map(char =>
            if(char.isLetter) {
                if(char.isUpper) {
                    ((char + shifts - 65) % 26 + 65).toChar
                } 
                else {
                    ((char + shifts - 97) % 26 + 97).toChar
                }
            }
            else char
        
        )
    }

    def decryptionCaesar(str: String, n: Int): String = {
        val shifts = n % 26
  
        str.map { char =>
            if (char.isLetter) {
                val base = if (char.isUpper) 'A' else 'a'
            
                val newChar = ((char - base - shifts + 26) % 26 + base).toChar
                newChar
            } 
            else {
                char 
            }
        }
    }


    println(encryptionCaesar("ABCD123abcdz", 2))
    println(decryptionCaesar("ABCD123abcd", 2))
}
