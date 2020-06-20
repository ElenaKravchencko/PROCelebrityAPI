/**
 * null
 */
package com.mobimore;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.mobimore.CelebritiesUrl}.
 * 
 * @see com.mobimore.CelebritiesUrl#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class CelebritiesUrlClientBuilder extends SdkSyncClientBuilder<CelebritiesUrlClientBuilder, CelebritiesUrl> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("r0s1ru7oo9.execute-api.us-east-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-1";

    /**
     * Package private constructor - builder should be created via {@link CelebritiesUrl#builder()}
     */
    CelebritiesUrlClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of CelebritiesUrl using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of CelebritiesUrl.
     */
    @Override
    protected CelebritiesUrl build(AwsSyncClientParams params) {
        return new CelebritiesUrlClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
