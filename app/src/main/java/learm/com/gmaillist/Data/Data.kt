package learm.com.gmaillist.Data

data class Email {
    val user: String,
    val subject : String,
    val preview: String,
    val date : String,
    val starread : Boolean,
    val unread: Boolean,
    var selected : Boolean = false

}

class EmailBuilder {

    var user: String = ""
    var subject : String= ""
    var preview: String= ""
    var date : String= ""
    var starread : Boolean= false
    var unread: Boolean=  false
    var selected : Boolean = false

    fun build() : Email  = Email(user,subject,preview,date,starread,unread,false)

}

fun email(block : EmailBuilder.() -> Unit) : Email = EmailBuilder().apply(block).build()

fun fakeEmails = listOf (
    email {
    user = "Aline"
    subject = "olha meu app aline"
    preview = "te amo muito"
    date = "12 dez"
    starread = true
    unread = false
    selected = false
    },
        email {
            user = "outro"
            subject = "olha meu app aline"
            preview = "te amo muito"
            date = "12 dez"
            starread = false
            unread = false
            selected = false
        }
    )



