/**
 * null
 */
package com.mobimore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/GetCelebrityRecentPhotos"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCelebrityRecentPhotosRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Actor actor;

    /**
     * @param actor
     */

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    /**
     * @return
     */

    public Actor getActor() {
        return this.actor;
    }

    /**
     * @param actor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecentPhotosRequest actor(Actor actor) {
        setActor(actor);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActor() != null)
            sb.append("Actor: ").append(getActor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityRecentPhotosRequest == false)
            return false;
        GetCelebrityRecentPhotosRequest other = (GetCelebrityRecentPhotosRequest) obj;
        if (other.getActor() == null ^ this.getActor() == null)
            return false;
        if (other.getActor() != null && other.getActor().equals(this.getActor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActor() == null) ? 0 : getActor().hashCode());
        return hashCode;
    }

    @Override
    public GetCelebrityRecentPhotosRequest clone() {
        return (GetCelebrityRecentPhotosRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetCelebrityRecentPhotosRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
