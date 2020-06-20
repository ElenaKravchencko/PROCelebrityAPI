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
public class GetCelebrityRecentPhotosResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private ActorStatistics actorStatistics;

    /**
     * @param actorStatistics
     */

    public void setActorStatistics(ActorStatistics actorStatistics) {
        this.actorStatistics = actorStatistics;
    }

    /**
     * @return
     */

    public ActorStatistics getActorStatistics() {
        return this.actorStatistics;
    }

    /**
     * @param actorStatistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecentPhotosResult actorStatistics(ActorStatistics actorStatistics) {
        setActorStatistics(actorStatistics);
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
        if (getActorStatistics() != null)
            sb.append("ActorStatistics: ").append(getActorStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityRecentPhotosResult == false)
            return false;
        GetCelebrityRecentPhotosResult other = (GetCelebrityRecentPhotosResult) obj;
        if (other.getActorStatistics() == null ^ this.getActorStatistics() == null)
            return false;
        if (other.getActorStatistics() != null && other.getActorStatistics().equals(this.getActorStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActorStatistics() == null) ? 0 : getActorStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetCelebrityRecentPhotosResult clone() {
        try {
            return (GetCelebrityRecentPhotosResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
