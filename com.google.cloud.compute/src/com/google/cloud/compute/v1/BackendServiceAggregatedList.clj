(ns com.google.cloud.compute.v1.BackendServiceAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceAggregatedList`

  returns: `com.google.cloud.compute.v1.BackendServiceAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceAggregatedList$Builder [^com.google.cloud.compute.v1.BackendServiceAggregatedList prototype]
    (BackendServiceAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceAggregatedList$Builder []
    (BackendServiceAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceAggregatedList`"
  (^com.google.cloud.compute.v1.BackendServiceAggregatedList []
    (BackendServiceAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^BackendServiceAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of BackendServicesScopedList resources. The key for the map is: Name of the scope
   containing this set of BackendServices.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.BackendServicesScopedList>`"
  (^java.util.Map [^BackendServiceAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceAggregatedList$Builder [^BackendServiceAggregatedList this]
    (-> this (.toBuilder))))

