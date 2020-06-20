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
 * PostCelebrityUrlsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCelebrityUrlsResultJsonUnmarshaller implements Unmarshaller<PostCelebrityUrlsResult, JsonUnmarshallerContext> {

    public PostCelebrityUrlsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostCelebrityUrlsResult postCelebrityUrlsResult = new PostCelebrityUrlsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postCelebrityUrlsResult;
        }

        while (true) {
            if (token == null)
                break;

            postCelebrityUrlsResult.setActorsInfo(new ListUnmarshaller<ActorInfo>(ActorInfoJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return postCelebrityUrlsResult;
    }

    private static PostCelebrityUrlsResultJsonUnmarshaller instance;

    public static PostCelebrityUrlsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostCelebrityUrlsResultJsonUnmarshaller();
        return instance;
    }
}
