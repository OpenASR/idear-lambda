package org.openasr.idear.lex

import org.openasr.idear.lex.action.DialogAction

data class LexFulfillmentResponse(val dialogAction: DialogAction, var sessionAttributes: Map<String, String>? = null)
