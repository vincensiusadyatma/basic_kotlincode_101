package kuliah.tugas1

/*mendefinisikan variabel bernama teks yang bertipe data String yang diisi dengan nilai string
"ini kelas pemrograman mobile" */
var teks: String = "ini kelas pemrograman mobile"


/*mendefinisikan sebuah fungsi bernama stringToElemen yang mempunyai satu parameter bertipe data string bernama
teks kemudian memiliki tipe nilai yang akan dikembalikan yaitu bertipe data sebuah List yang bersifat mutable atau dapat berubah yang memiliki tipe
generic bertipe data String . */
fun stringToElemen(teks: String, delimiter: Char): MutableList<String>{
    //membuat sebuah list kosong baru yang memiliki tipe generic String yang disimpan dalam variabel listElement
    var listElement = mutableListOf<String>()
    //membuat sebuah variabel string kosong bernama kata
    var kata = ""
    //melakukan perulangan pada setiap karakter pada sebuah teks bertipe string
    for (karakter in teks){
        //jika karakter tersebut merupakan ppemisah seperti spasi atau karakter lainya, maka tambahkan isi varaibel kata kedalam sebuah list
        //kemudian isi variabel kata dikosongkan kembali
        if(karakter == delimiter){
            listElement.add(kata)
            kata = ""
            //jika karakter tersebut bukan delimiter atau pemisah, maka tambahkan karakter tersebut ke sebuah string pada variabel kata
        }else{
            kata += karakter
        }
    }
    //jika perulangan sudah selesai, maka kembalikan nilai list yang sudah berisi elemen elemen kata string
    return listElement
}


fun main(){
    for (kata in stringToElemen(teks,' ')){
        println(kata)
    }


}