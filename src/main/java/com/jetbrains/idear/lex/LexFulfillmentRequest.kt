package com.jetbrains.idear.lex

/** @sse http://docs.aws.amazon.com/lex/latest/dg/lambda-input-response-format.html#using-lambda-input-event-format */
data class LexFulfillmentRequest(
    val currentIntent: Intent? = null,
    val bot: Bot? = null,
    val userId: String? = null,
    val inputTranscript: String? = null,
    val invocationSource: String? = null,
    val outputDialogMode: String? = null,
    val messageVersion: String? = null,
    val sessionAttributes: Map<String, String>? = null)
