package com.serverless.springfunction;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class LambdaHandler extends
        SpringBootRequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
}
