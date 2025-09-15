package kuliah.tugas2

fun wordCount(text:String):Int{
    // fungsi hitung jumlah kata dari text
    var count: Int = 0
    for(karakter in text){
        if(!karakter.equals(' ')){
            count+=1
        }
    }
    return count
}

fun isWordExist(text:String,word:String):Boolean{
    if(text.contains(word)){
        return true
    }else{
        return false
    }
}

fun eraseReadingSign(text:String):String{
    var newText:String = ""
    for(karakter in text){
        if(!(karakter.equals('!') || karakter.equals('.') || karakter.equals('?')|| karakter.equals(','))){
            newText+=karakter
        }
    }
    return newText

}
fun main(args:Array<String>){
    val myText = "this is my first kotlin program. It was a simplified java language"
    var newText = eraseReadingSign(myText)
    println(newText)

    val numberOfWords = wordCount(newText)
    println(numberOfWords)

    println(isWordExist(newText,"java"))

}