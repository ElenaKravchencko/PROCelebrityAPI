/**
 * null
 */
package com.mobimore;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.mobimore.model.*;
import com.mobimore.model.transform.*;

/**
 * Client for accessing CelebritiesUrl. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class CelebritiesUrlClient implements CelebritiesUrl {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(com.mobimore.model.NotFoundException.class))
                    .withBaseServiceExceptionClass(com.mobimore.model.CelebritiesUrlException.class));

    /**
     * Constructs a new client to invoke service methods on CelebritiesUrl using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    CelebritiesUrlClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getCelebrityRecentPhotosRequest
     * @return Result of the GetCelebrityRecentPhotos operation returned by the service.
     * @throws NotFoundException
     * @sample CelebritiesUrl.GetCelebrityRecentPhotos
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/GetCelebrityRecentPhotos"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCelebrityRecentPhotosResult getCelebrityRecentPhotos(GetCelebrityRecentPhotosRequest getCelebrityRecentPhotosRequest) {
        HttpResponseHandler<GetCelebrityRecentPhotosResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCelebrityRecentPhotosResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(new JsonErrorShapeMetadata().withModeledClass(
                NotFoundException.class).withHttpStatusCode(404));

        return clientHandler.execute(new ClientExecutionParams<GetCelebrityRecentPhotosRequest, GetCelebrityRecentPhotosResult>()
                .withMarshaller(new GetCelebrityRecentPhotosRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getCelebrityRecentPhotosRequest));
    }

    /**
     * @param postCelebrityUrlsRequest
     * @return Result of the PostCelebrityUrls operation returned by the service.
     * @throws NotFoundException
     * @sample CelebritiesUrl.PostCelebrityUrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/PostCelebrityUrls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostCelebrityUrlsResult postCelebrityUrls(PostCelebrityUrlsRequest postCelebrityUrlsRequest) {
        HttpResponseHandler<PostCelebrityUrlsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostCelebrityUrlsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(new JsonErrorShapeMetadata().withModeledClass(
                NotFoundException.class).withHttpStatusCode(404));

        return clientHandler.execute(new ClientExecutionParams<PostCelebrityUrlsRequest, PostCelebrityUrlsResult>()
                .withMarshaller(new PostCelebrityUrlsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postCelebrityUrlsRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
