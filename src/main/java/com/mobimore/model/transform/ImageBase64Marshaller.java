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
 * ImageBase64Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImageBase64Marshaller {

    private static final MarshallingInfo<String> DATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("data").build();

    private static final ImageBase64Marshaller instance = new ImageBase64Marshaller();

    public static ImageBase64Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImageBase64 imageBase64, ProtocolMarshaller protocolMarshaller) {

        if (imageBase64 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(imageBase64.getData(), DATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
