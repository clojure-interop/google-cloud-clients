(ns com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsListNetworkEndpoints]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints prototype]
    (NetworkEndpointGroupsListNetworkEndpoints/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints$Builder []
    (NetworkEndpointGroupsListNetworkEndpoints/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints []
    (NetworkEndpointGroupsListNetworkEndpoints/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] The resource type, which is always
   compute#networkEndpointGroupsListNetworkEndpoints for the list of network endpoints in the
   specified network endpoint group.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroupsListNetworkEndpoints this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of NetworkEndpointWithHealthStatus resources.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus>`"
  (^java.util.List [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupsListNetworkEndpoints this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints$Builder [^NetworkEndpointGroupsListNetworkEndpoints this]
    (-> this (.toBuilder))))

