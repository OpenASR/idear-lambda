package org.openasr.idear.intents

/**
 * Users should be able to select the verbosity level of Idear - how much they want to hear from it.
 */
val Verbosity = "Verbosity"

///** Only hear from Idear when something bad happens */
//val ERROR = "ERROR"
/** Idear will ask further questions to elicit slot/intent at this level */
val INFO = "INFO"
/** Chatty, probably appropriate for the visually impaired */
val DEBUG = "DEBUG"
/** Hear a verbal acknowledgment of all commands */
val ALL = "ALL"

// Convenience functions
val promptForInfo = mapOf<String, String>(Verbosity to INFO)
val chatty = mapOf<String, String>(Verbosity to DEBUG)
val veryChatty = mapOf<String, String>(Verbosity to ALL)
