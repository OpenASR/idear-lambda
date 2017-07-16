package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.elicitSlot
import org.openasr.idear.lex.action.fulfilled

fun openView(intentName: String, slots: Map<String, String>?): LexFulfillmentResponse {
    val view = slots?.get("View")
    return when (view) {
        "settings" -> _openView(view, "ShowSettings")
        "recent", "recent files" -> _openView(view, "RecentFiles")
        "terminal" -> _openView(view, "ActivateTerminalToolWindow")
        else -> elicitSlot(intentName,
                "View",
                "I know how to open \"settings\", \"recent files\" and the \"terminal\"")
    }
}

private fun _openView(view: String, action: String): LexFulfillmentResponse {
    return fulfilled("opening" + view, mapOf("invokeAction" to action))
}
