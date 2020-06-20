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
 * ActorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActorMarshaller {

    private static final MarshallingInfo<StructuredPojo> IMAGEBASE64_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageBase64").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final ActorMarshaller instance = new ActorMarshaller();

    public static ActorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Actor actor, ProtocolMarshaller protocolMarshaller) {

        if (actor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actor.getImageBase64(), IMAGEBASE64_BINDING);
            protocolMarshaller.marshall(actor.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
