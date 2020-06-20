/**
 * null
 */
package com.mobimore.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.mobimore.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetCelebrityRecentPhotosRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetCelebrityRecentPhotosRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final GetCelebrityRecentPhotosRequestMarshaller instance = new GetCelebrityRecentPhotosRequestMarshaller();

    public static GetCelebrityRecentPhotosRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetCelebrityRecentPhotosRequest getCelebrityRecentPhotosRequest, ProtocolMarshaller protocolMarshaller) {

        if (getCelebrityRecentPhotosRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getCelebrityRecentPhotosRequest.getActor(), ACTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
