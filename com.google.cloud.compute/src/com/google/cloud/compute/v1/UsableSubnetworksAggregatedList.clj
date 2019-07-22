(ns com.google.cloud.compute.v1.UsableSubnetworksAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsableSubnetworksAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList prototype]
    (UsableSubnetworksAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder []
    (UsableSubnetworksAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList []
    (UsableSubnetworksAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^UsableSubnetworksAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated
   lists of usable subnetworks.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UsableSubnetworksAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UsableSubnetworksAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UsableSubnetworksAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UsableSubnetworksAggregatedList this]
    (-> this (.hashCode))))

(defn get-items-list
  "[Output] A list of usable subnetwork URLs.

  returns: `java.util.List<com.google.cloud.compute.v1.UsableSubnetwork>`"
  (^java.util.List [^UsableSubnetworksAggregatedList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UsableSubnetworksAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList this]
    (-> this (.toBuilder))))

