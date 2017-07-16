package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.elicitSlot
import org.openasr.idear.lex.action.fulfilled

class OpenView(val slots: Map<String, String>?): Intent {
    override fun handleRequest(): LexFulfillmentResponse {
        val view = slots?.get("View")
        return when (view) {
            "settings" -> openView(view, "ShowSettings")
            "recent", "recent files" -> openView(view, "RecentFiles")
            "terminal" -> openView(view, "ActivateTerminalToolWindow")
            else -> elicitSlot(this.javaClass.simpleName!!,
                    "View",
                    "I know how to open \"settings\", \"recent files\" and the \"terminal\"")
        }
    }

    private fun openView(view: String, action: String): LexFulfillmentResponse {
        return fulfilled("opening" + view, mapOf("invokeAction" to action))
    }
}
