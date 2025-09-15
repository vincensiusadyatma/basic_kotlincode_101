package kuliah.tugas2

fun wordCount(text:String):Int {
    // Variabel untuk menyimpan jumlah kata
    var count = 0

    // Variabel sementara untuk menampung huruf dari kata yang sedang dibaca
    var currentWord = ""

    // Loop untuk membaca setiap karakter di dalam string
    for (karakter in text) {
        if (karakter != ' ') {
            // Jika karakter bukan spasi, tambahkan ke currentWord
            currentWord += karakter
        } else {
            // Jika karakter adalah spasi
            if (currentWord.isNotEmpty()) {
                // Jika currentWord tidak kosong, berarti satu kata selesai
                count++          // Hitung kata dengan menambah jumlah 1 setiap kata terbentuk
                currentWord = "" // Reset untuk kata berikutnya
            }
        }
    }

    // Jika kata terakhir tidak diakhiri spasi, hitung juga
    if (currentWord.isNotEmpty()) {
        count++
    }

    //mengembalikan jumlah kata
    return count
}


// Fungsi untuk mengecek apakah sebuah kata ada di dalam teks
fun isWordExist(text: String, word: String): Boolean {
    // Mengecek apakah string `text` mengandung kata `word`
    // `contains()` akan menghasilkan true jika `word` ditemukan di dalam `text`
    if (text.contains(word)) {
        return true    // Jika kata ditemukan, kembalikan nilai true
    } else {
        return false   // Jika kata tidak ditemukan, kembalikan nilai false
    }
}


fun eraseReadingSign(text: String): String {
    // Variabel untuk menampung hasil teks setelah tanda baca dihapus
    var newText: String = ""

    // Loop setiap karakter di dalam string 'text'
    for (karakter in text) {
        // Mengecek apakah karakter BUKAN tanda baca (!, ., ?, ,)
        if (!(karakter.equals('!') || karakter.equals('.') || karakter.equals('?') || karakter.equals(','))) {
            // Jika bukan tanda baca, tambahkan karakter ke 'newText'
            newText += karakter
        }
        // Jika karakter adalah tanda baca, karakter tersebut dilewati (tidak dimasukkan)
    }

    // Mengembalikan teks baru yang sudah bersih dari tanda baca
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