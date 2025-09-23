package kuliah.tugas2

fun wordCount(text:String):Int {
    // Variabel untuk menyimpan jumlah kata
    var count = 0

    // Variabel sementara untuk menampung huruf dari kata yang terbentuk yang sedang dibaca
    var currentWord = ""

    // Loop untuk membaca setiap karakter di dalam string
    for (karakter in text) {
        // Jika karakter bukan spasi
        if (karakter != ' ') {
            // tambahkan ke variabel currentWord
            currentWord += karakter
        // Jika karakter adalah spasi
        } else {
            // Jika currentWord tidak kosong, berarti satu kata selesai
            if (currentWord.isNotEmpty()) {
                count++          // Hitung kata dengan menambah jumlah 1 setiap kata terbentuk
                currentWord = "" // Reset untuk kata berikutnya dengan menjadikan nilainya string kosong
            }
        }
    }

    // Jika kata terakhir tidak diakhiri spasi, maka hitung juga
    if (currentWord.isNotEmpty()) {
        count++
    }

    //mengembalikan jumlah kata
    return count
}



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

fun main(args: Array<String>) {
    // 1. Membuat teks awal yang berisi kalimat dan tanda baca
    val myText = "this is my first kotlin program. It was a simplified java language"

    // 2. Memanggil fungsi eraseReadingSign untuk menghapus tanda baca dari teks
    var newText = eraseReadingSign(myText)

    // 3. Menampilkan teks yang sudah bersih dari tanda baca
    println(newText)

    // 4. Menghitung jumlah kata dari teks yang sudah dibersihkan
    val numberOfWords = wordCount(newText)

    // 5. Menampilkan jumlah kata ke layar
    println(numberOfWords)

    // 6. Mengecek apakah kata tertentu ada dalam teks
    println(isWordExist(newText, "java"))
}