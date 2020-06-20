/**
 * null
 */
package com.mobimore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/r0s1ru7oo9-2020-06-20T19:14:59Z/PostCelebrityUrls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCelebrityUrlsResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<ActorInfo> actorsInfo;

    /**
     * @return
     */

    public java.util.List<ActorInfo> getActorsInfo() {
        return actorsInfo;
    }

    /**
     * @param actorsInfo
     */

    public void setActorsInfo(java.util.Collection<ActorInfo> actorsInfo) {
        if (actorsInfo == null) {
            this.actorsInfo = null;
            return;
        }

        this.actorsInfo = new java.util.ArrayList<ActorInfo>(actorsInfo);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActorsInfo(java.util.Collection)} or {@link #withActorsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actorsInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCelebrityUrlsResult actorsInfo(ActorInfo... actorsInfo) {
        if (this.actorsInfo == null) {
            setActorsInfo(new java.util.ArrayList<ActorInfo>(actorsInfo.length));
        }
        for (ActorInfo ele : actorsInfo) {
            this.actorsInfo.add(ele);
        }
        return this;
    }

    /**
     * @param actorsInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCelebrityUrlsResult actorsInfo(java.util.Collection<ActorInfo> actorsInfo) {
        setActorsInfo(actorsInfo);
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
        if (getActorsInfo() != null)
            sb.append("ActorsInfo: ").append(getActorsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCelebrityUrlsResult == false)
            return false;
        PostCelebrityUrlsResult other = (PostCelebrityUrlsResult) obj;
        if (other.getActorsInfo() == null ^ this.getActorsInfo() == null)
            return false;
        if (other.getActorsInfo() != null && other.getActorsInfo().equals(this.getActorsInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActorsInfo() == null) ? 0 : getActorsInfo().hashCode());
        return hashCode;
    }

    @Override
    public PostCelebrityUrlsResult clone() {
        try {
            return (PostCelebrityUrlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
