/**
 * null
 */
package com.mobimore.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.mobimore.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActorStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActorStatisticsMarshaller {

    private static final MarshallingInfo<List> IMAGEBASE64_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageBase64").build();
    private static final MarshallingInfo<Integer> SEARCHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("searchCount").build();

    private static final ActorStatisticsMarshaller instance = new ActorStatisticsMarshaller();

    public static ActorStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActorStatistics actorStatistics, ProtocolMarshaller protocolMarshaller) {

        if (actorStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actorStatistics.getImageBase64(), IMAGEBASE64_BINDING);
            protocolMarshaller.marshall(actorStatistics.getSearchCount(), SEARCHCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
