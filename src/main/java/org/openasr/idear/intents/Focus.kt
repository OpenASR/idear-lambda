package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.elicitSlot
import org.openasr.idear.lex.action.fulfilled

fun focus(intentName: String, slots: Map<String, String>?): LexFulfillmentResponse {
    val target = slots?.get("Target")
    return when (target) {
        "editor" -> fulfilled("focus on editor" + target, mapOf("pressKeystroke" to "27", Verbosity to DEBUG))
        "project" -> fulfilled("focus on project" + target, mapOf("invokeAction" to "ActivateProjectToolWindow", Verbosity to DEBUG))
        "symbol", "symbols" -> {
            val symbol = slots?.get("Marker") ?:
                    return elicitSlot(intentName,"Marker",
                            slots!!,
                            "which a marker?",
                            mapOf("invokeAction" to "AceAction", Verbosity to INFO))

            return fulfilled("focus on " + symbol, mapOf("type" to symbol, Verbosity to DEBUG))
        }
        else -> elicitSlot(intentName,
                "Target",
                "I know how to focus the \"editor\", \"project\" and \"symbols\"",
                promptForInfo)
    }
}
