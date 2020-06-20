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
 * ActorStatistics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActorStatisticsJsonUnmarshaller implements Unmarshaller<ActorStatistics, JsonUnmarshallerContext> {

    public ActorStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActorStatistics actorStatistics = new ActorStatistics();

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
                if (context.testExpression("imageBase64", targetDepth)) {
                    context.nextToken();
                    actorStatistics.setImageBase64(new ListUnmarshaller<ImageBase64>(ImageBase64JsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("searchCount", targetDepth)) {
                    context.nextToken();
                    actorStatistics.setSearchCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actorStatistics;
    }

    private static ActorStatisticsJsonUnmarshaller instance;

    public static ActorStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActorStatisticsJsonUnmarshaller();
        return instance;
    }
}
