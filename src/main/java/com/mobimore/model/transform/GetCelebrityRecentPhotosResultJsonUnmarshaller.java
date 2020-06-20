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
 * GetCelebrityRecentPhotosResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCelebrityRecentPhotosResultJsonUnmarshaller implements Unmarshaller<GetCelebrityRecentPhotosResult, JsonUnmarshallerContext> {

    public GetCelebrityRecentPhotosResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCelebrityRecentPhotosResult getCelebrityRecentPhotosResult = new GetCelebrityRecentPhotosResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCelebrityRecentPhotosResult;
        }

        while (true) {
            if (token == null)
                break;

            getCelebrityRecentPhotosResult.setActorStatistics(ActorStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getCelebrityRecentPhotosResult;
    }

    private static GetCelebrityRecentPhotosResultJsonUnmarshaller instance;

    public static GetCelebrityRecentPhotosResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCelebrityRecentPhotosResultJsonUnmarshaller();
        return instance;
    }
}
