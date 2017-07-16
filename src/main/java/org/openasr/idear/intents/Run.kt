package org.openasr.idear.intents

import org.openasr.idear.lex.action.fulfilled

fun run() = fulfilled("fingers crossed...", mapOf("invokeAction" to "Run", Verbosity to DEBUG))
