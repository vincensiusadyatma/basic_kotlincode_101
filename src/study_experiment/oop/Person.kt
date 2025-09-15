package study_experiment.oop

class Person(firstName: String?) {
    constructor(umur: Int) : this(null){
        this.umur = umur
    }

    var firstname: String? = firstName
    var lastname: String? = null
    var umur : Int? = null



}