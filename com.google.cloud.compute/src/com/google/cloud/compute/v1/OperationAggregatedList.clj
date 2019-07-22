(ns com.google.cloud.compute.v1.OperationAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 OperationAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.OperationAggregatedList`

  returns: `com.google.cloud.compute.v1.OperationAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.OperationAggregatedList$Builder [^com.google.cloud.compute.v1.OperationAggregatedList prototype]
    (OperationAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.OperationAggregatedList$Builder []
    (OperationAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.OperationAggregatedList`"
  (^com.google.cloud.compute.v1.OperationAggregatedList []
    (OperationAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^OperationAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#operationAggregatedList for aggregated lists of
   operations.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OperationAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OperationAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^OperationAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "[Output Only] A map of scoped operation lists. The key for the map is: [Output Only] Name of
   the scope containing this set of operations.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.OperationsScopedList>`"
  (^java.util.Map [^OperationAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^OperationAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OperationAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OperationAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.OperationAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.OperationAggregatedList$Builder [^OperationAggregatedList this]
    (-> this (.toBuilder))))

