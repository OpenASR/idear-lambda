package com.jetbrains.idear.lex.action

import com.jetbrains.idear.lex.Message
import com.jetbrains.idear.lex.ResponseCard

abstract class DialogActionWithResponse(type: String, val message: Message) : DialogAction(type) {
    var responseCard: ResponseCard? = null
}