package org.openasr.idear.lex

data class Intent(var name: String? = null,
             var slots: Map<String, String>? = null,
             var confirmationStatus: String? = null)