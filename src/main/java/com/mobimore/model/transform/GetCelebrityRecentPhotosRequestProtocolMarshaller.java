/**
 * null
 */
package com.mobimore.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.mobimore.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetCelebrityRecentPhotosRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetCelebrityRecentPhotosRequestProtocolMarshaller implements Marshaller<Request<GetCelebrityRecentPhotosRequest>, GetCelebrityRecentPhotosRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/Movie/celebrity-recent-photos").httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(true).hasPayloadMembers(true)
            .serviceName("CelebritiesUrl").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public GetCelebrityRecentPhotosRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetCelebrityRecentPhotosRequest> marshall(GetCelebrityRecentPhotosRequest getCelebrityRecentPhotosRequest) {

        if (getCelebrityRecentPhotosRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<GetCelebrityRecentPhotosRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, getCelebrityRecentPhotosRequest);

            protocolMarshaller.startMarshalling();
            GetCelebrityRecentPhotosRequestMarshaller.getInstance().marshall(getCelebrityRecentPhotosRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
