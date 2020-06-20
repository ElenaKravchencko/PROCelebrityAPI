/**
 * null
 */
package com.mobimore;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.mobimore.model.*;

/**
 * Interface for accessing CelebritiesUrl.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface CelebritiesUrl {

    /**
     * @param getCelebrityRecentPhotosRequest
     * @return Result of the GetCelebrityRecentPhotos operation returned by the service.
     * @throws NotFoundException
     * @sample CelebritiesUrl.GetCelebrityRecentPhotos
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/GetCelebrityRecentPhotos"
     *      target="_top">AWS API Documentation</a>
     */
    GetCelebrityRecentPhotosResult getCelebrityRecentPhotos(GetCelebrityRecentPhotosRequest getCelebrityRecentPhotosRequest);

    /**
     * @param postCelebrityUrlsRequest
     * @return Result of the PostCelebrityUrls operation returned by the service.
     * @throws NotFoundException
     * @sample CelebritiesUrl.PostCelebrityUrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/PostCelebrityUrls"
     *      target="_top">AWS API Documentation</a>
     */
    PostCelebrityUrlsResult postCelebrityUrls(PostCelebrityUrlsRequest postCelebrityUrlsRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static CelebritiesUrlClientBuilder builder() {
        return new CelebritiesUrlClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
