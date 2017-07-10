package org.openasr.idear.lex

class Message(val content: String) {
    lateinit var contentType: String

    init {
        if (content.startsWith("<speak>")) {
            contentType = "SSML"
        } else {
            contentType = "PlainText"
        }
    }
}
