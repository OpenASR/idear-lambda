package org.openasr.idear.lex.action

import org.openasr.idear.lex.Message
import org.openasr.idear.lex.ResponseCard

abstract class DialogActionWithResponse(type: String, val message: Message) : DialogAction(type) {
    var responseCard: ResponseCard? = null
}