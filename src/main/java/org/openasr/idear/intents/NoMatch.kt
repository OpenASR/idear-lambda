package org.openasr.idear.intents

import org.openasr.idear.lex.action.failed

class NoMatch : Intent {
    override fun handleRequest() = failed("Sorry, I did not understand that")
}
