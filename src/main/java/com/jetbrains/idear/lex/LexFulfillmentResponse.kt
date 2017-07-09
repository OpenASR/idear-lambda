package com.jetbrains.idear.lex

import com.jetbrains.idear.lex.action.DialogAction

class LexFulfillmentResponse(val dialogAction: DialogAction) {
    var sessionAttributes: Map<String, String>? = null
}