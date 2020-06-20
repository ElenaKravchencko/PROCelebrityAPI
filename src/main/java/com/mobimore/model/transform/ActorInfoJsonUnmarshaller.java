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
 * ActorInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActorInfoJsonUnmarshaller implements Unmarshaller<ActorInfo, JsonUnmarshallerContext> {

    public ActorInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActorInfo actorInfo = new ActorInfo();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    actorInfo.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    actorInfo.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("urls", targetDepth)) {
                    context.nextToken();
                    actorInfo.setUrls(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actorInfo;
    }

    private static ActorInfoJsonUnmarshaller instance;

    public static ActorInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActorInfoJsonUnmarshaller();
        return instance;
    }
}
