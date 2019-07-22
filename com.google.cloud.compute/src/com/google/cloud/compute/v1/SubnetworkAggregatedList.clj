(ns com.google.cloud.compute.v1.SubnetworkAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworkAggregatedList`

  returns: `com.google.cloud.compute.v1.SubnetworkAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkAggregatedList$Builder [^com.google.cloud.compute.v1.SubnetworkAggregatedList prototype]
    (SubnetworkAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworkAggregatedList$Builder []
    (SubnetworkAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworkAggregatedList`"
  (^com.google.cloud.compute.v1.SubnetworkAggregatedList []
    (SubnetworkAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SubnetworkAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#subnetworkAggregatedList for aggregated lists of
   subnetworks.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworkAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworkAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of SubnetworksScopedList resources. The key for the map is: Name of the scope containing
   this set of Subnetworks.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.SubnetworksScopedList>`"
  (^java.util.Map [^SubnetworkAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworkAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworkAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworkAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworkAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkAggregatedList$Builder [^SubnetworkAggregatedList this]
    (-> this (.toBuilder))))

