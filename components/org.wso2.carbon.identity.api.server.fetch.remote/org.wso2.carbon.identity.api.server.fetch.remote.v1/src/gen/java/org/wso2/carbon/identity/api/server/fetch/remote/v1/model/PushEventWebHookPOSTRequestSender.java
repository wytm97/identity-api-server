/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.fetch.remote.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class PushEventWebHookPOSTRequestSender  {
  
    private String login;
    private Integer id;
    private String nodeId;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;

    /**
    **/
    public PushEventWebHookPOSTRequestSender login(String login) {

        this.login = login;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("login")
    @Valid
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender id(Integer id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("id")
    @Valid
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender nodeId(String nodeId) {

        this.nodeId = nodeId;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("node_id")
    @Valid
    public String getNodeId() {
        return nodeId;
    }
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender avatarUrl(String avatarUrl) {

        this.avatarUrl = avatarUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("avatar_url")
    @Valid
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender gravatarId(String gravatarId) {

        this.gravatarId = gravatarId;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("gravatar_id")
    @Valid
    public String getGravatarId() {
        return gravatarId;
    }
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender url(String url) {

        this.url = url;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("url")
    @Valid
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender htmlUrl(String htmlUrl) {

        this.htmlUrl = htmlUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("html_url")
    @Valid
    public String getHtmlUrl() {
        return htmlUrl;
    }
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender followersUrl(String followersUrl) {

        this.followersUrl = followersUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("followers_url")
    @Valid
    public String getFollowersUrl() {
        return followersUrl;
    }
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender followingUrl(String followingUrl) {

        this.followingUrl = followingUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("following_url")
    @Valid
    public String getFollowingUrl() {
        return followingUrl;
    }
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender gistsUrl(String gistsUrl) {

        this.gistsUrl = gistsUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("gists_url")
    @Valid
    public String getGistsUrl() {
        return gistsUrl;
    }
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender starredUrl(String starredUrl) {

        this.starredUrl = starredUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("starred_url")
    @Valid
    public String getStarredUrl() {
        return starredUrl;
    }
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender subscriptionsUrl(String subscriptionsUrl) {

        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("subscriptions_url")
    @Valid
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender organizationsUrl(String organizationsUrl) {

        this.organizationsUrl = organizationsUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("organizations_url")
    @Valid
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender reposUrl(String reposUrl) {

        this.reposUrl = reposUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("repos_url")
    @Valid
    public String getReposUrl() {
        return reposUrl;
    }
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender eventsUrl(String eventsUrl) {

        this.eventsUrl = eventsUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("events_url")
    @Valid
    public String getEventsUrl() {
        return eventsUrl;
    }
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender receivedEventsUrl(String receivedEventsUrl) {

        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("received_events_url")
    @Valid
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender type(String type) {

        this.type = type;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("type")
    @Valid
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestSender siteAdmin(Boolean siteAdmin) {

        this.siteAdmin = siteAdmin;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("site_admin")
    @Valid
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushEventWebHookPOSTRequestSender pushEventWebHookPOSTRequestSender = (PushEventWebHookPOSTRequestSender) o;
        return Objects.equals(this.login, pushEventWebHookPOSTRequestSender.login) &&
            Objects.equals(this.id, pushEventWebHookPOSTRequestSender.id) &&
            Objects.equals(this.nodeId, pushEventWebHookPOSTRequestSender.nodeId) &&
            Objects.equals(this.avatarUrl, pushEventWebHookPOSTRequestSender.avatarUrl) &&
            Objects.equals(this.gravatarId, pushEventWebHookPOSTRequestSender.gravatarId) &&
            Objects.equals(this.url, pushEventWebHookPOSTRequestSender.url) &&
            Objects.equals(this.htmlUrl, pushEventWebHookPOSTRequestSender.htmlUrl) &&
            Objects.equals(this.followersUrl, pushEventWebHookPOSTRequestSender.followersUrl) &&
            Objects.equals(this.followingUrl, pushEventWebHookPOSTRequestSender.followingUrl) &&
            Objects.equals(this.gistsUrl, pushEventWebHookPOSTRequestSender.gistsUrl) &&
            Objects.equals(this.starredUrl, pushEventWebHookPOSTRequestSender.starredUrl) &&
            Objects.equals(this.subscriptionsUrl, pushEventWebHookPOSTRequestSender.subscriptionsUrl) &&
            Objects.equals(this.organizationsUrl, pushEventWebHookPOSTRequestSender.organizationsUrl) &&
            Objects.equals(this.reposUrl, pushEventWebHookPOSTRequestSender.reposUrl) &&
            Objects.equals(this.eventsUrl, pushEventWebHookPOSTRequestSender.eventsUrl) &&
            Objects.equals(this.receivedEventsUrl, pushEventWebHookPOSTRequestSender.receivedEventsUrl) &&
            Objects.equals(this.type, pushEventWebHookPOSTRequestSender.type) &&
            Objects.equals(this.siteAdmin, pushEventWebHookPOSTRequestSender.siteAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, id, nodeId, avatarUrl, gravatarId, url, htmlUrl, followersUrl, followingUrl, gistsUrl, starredUrl, subscriptionsUrl, organizationsUrl, reposUrl, eventsUrl, receivedEventsUrl, type, siteAdmin);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class PushEventWebHookPOSTRequestSender {\n");
        
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
        sb.append("    organizationsUrl: ").append(toIndentedString(organizationsUrl)).append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    receivedEventsUrl: ").append(toIndentedString(receivedEventsUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

