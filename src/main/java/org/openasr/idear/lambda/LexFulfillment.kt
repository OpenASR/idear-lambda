package org.openasr.idear.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.openasr.idear.lex.*
import org.openasr.idear.lex.action.Close
import org.openasr.idear.lex.action.close
import org.openasr.idear.lex.action.fulfilled


class LexFulfillment : RequestHandler<LexFulfillmentRequest, LexFulfillmentResponse> {

    override fun handleRequest(request: LexFulfillmentRequest, context: Context): LexFulfillmentResponse {
        context.logger.log(request.toString())

//        val attachment = GenericAttachment("asdf")

//        val action = Close(FulfillmentState.Fulfilled, Message("testing 123"))
//        val action = close(FulfillmentState.Fulfilled, "testing 123")
        val action = fulfilled("testing 123")
        action.responseCard = ResponseCard("Testing Testing")

        val result = LexFulfillmentResponse(action)

        return result
    }
}
