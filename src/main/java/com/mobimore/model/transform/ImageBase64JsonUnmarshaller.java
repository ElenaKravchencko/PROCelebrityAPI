/**
 * null
 */
package com.mobimore.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.mobimore.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageBase64 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageBase64JsonUnmarshaller implements Unmarshaller<ImageBase64, JsonUnmarshallerContext> {

    public ImageBase64 unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageBase64 imageBase64 = new ImageBase64();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("data", targetDepth)) {
                    context.nextToken();
                    imageBase64.setData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return imageBase64;
    }

    private static ImageBase64JsonUnmarshaller instance;

    public static ImageBase64JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageBase64JsonUnmarshaller();
        return instance;
    }
}
