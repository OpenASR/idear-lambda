package org.openasr.idear.lex.action

import org.openasr.idear.lex.Message

class ConfirmIntent(message: Message, val intentName: String, val slots: Map<String, String>) :
        DialogActionWithResponse("ConfirmIntent", message)