package com.jetbrains.idear.lex.action

import com.jetbrains.idear.lex.Message

class ConfirmIntent(message: Message, val intentName: String, val slots: Map<String, String>) :
        DialogActionWithResponse("ConfirmIntent", message)