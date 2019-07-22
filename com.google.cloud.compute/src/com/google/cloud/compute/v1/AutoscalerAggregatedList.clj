(ns com.google.cloud.compute.v1.AutoscalerAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalerAggregatedList`

  returns: `com.google.cloud.compute.v1.AutoscalerAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerAggregatedList$Builder [^com.google.cloud.compute.v1.AutoscalerAggregatedList prototype]
    (AutoscalerAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalerAggregatedList$Builder []
    (AutoscalerAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalerAggregatedList`"
  (^com.google.cloud.compute.v1.AutoscalerAggregatedList []
    (AutoscalerAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AutoscalerAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#autoscalerAggregatedList for aggregated lists of
   autoscalers.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalerAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalerAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of AutoscalersScopedList resources. The key for the map is: [Output Only] Name of the
   scope containing this set of autoscalers.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.AutoscalersScopedList>`"
  (^java.util.Map [^AutoscalerAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalerAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalerAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalerAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalerAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerAggregatedList$Builder [^AutoscalerAggregatedList this]
    (-> this (.toBuilder))))

