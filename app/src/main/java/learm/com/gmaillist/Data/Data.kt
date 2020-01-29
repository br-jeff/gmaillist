package learm.com.gmaillist.Data

data class email {
    val user: String,
    val subject : String,
    val preview: String,
    val date : String,
    val starread : Boolean,
    val unread: Boolean,
    val selected : Boolean = false

}

class EmailBuilder {

    var user: String = ""
    var subject : String= ""
    var preview: String= ""
    var date : String= ""
    var starread : Boolean= false
    var unread: Boolean=  false
    var selected : Boolean = false

}