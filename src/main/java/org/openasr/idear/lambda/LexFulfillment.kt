package org.openasr.idear.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.openasr.idear.intents.HiIdea
import org.openasr.idear.intents.Navigate
import org.openasr.idear.intents.NoMatch
import org.openasr.idear.lex.*


class LexFulfillment : RequestHandler<LexFulfillmentRequest, LexFulfillmentResponse> {

    override fun handleRequest(request: LexFulfillmentRequest, context: Context): LexFulfillmentResponse {
        context.logger.log(request.toString())

        val intent = when (request.currentIntent?.name) {
            "HiIdea" -> HiIdea(request.sessionAttributes)
            "Navigate" -> Navigate()
            else -> NoMatch()
        }

        return intent.handleRequest()
    }
}
