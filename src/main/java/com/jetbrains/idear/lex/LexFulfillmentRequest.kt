package com.jetbrains.idear.lex

/** @sse http://docs.aws.amazon.com/lex/latest/dg/lambda-input-response-format.html#using-lambda-input-event-format */
data class LexFulfillmentRequest(
    var currentIntent: Intent? = null,
    var bot: Bot? = null,
    var userId: String? = null,
    var inputTranscript: String? = null,
    var invocationSource: String? = null,
    var outputDialogMode: String? = null,
    var messageVersion: String? = null,
    var sessionAttributes: Map<String, String>? = null)
