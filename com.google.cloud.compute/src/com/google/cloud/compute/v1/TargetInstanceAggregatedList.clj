(ns com.google.cloud.compute.v1.TargetInstanceAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstanceAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetInstanceAggregatedList`

  returns: `com.google.cloud.compute.v1.TargetInstanceAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstanceAggregatedList$Builder [^com.google.cloud.compute.v1.TargetInstanceAggregatedList prototype]
    (TargetInstanceAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetInstanceAggregatedList$Builder []
    (TargetInstanceAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetInstanceAggregatedList`"
  (^com.google.cloud.compute.v1.TargetInstanceAggregatedList []
    (TargetInstanceAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetInstanceAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstanceAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetInstanceAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetInstanceAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetInstanceAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstanceAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of TargetInstance resources. The key for the map is: Name of the scope containing this
   set of target instances.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.TargetInstancesScopedList>`"
  (^java.util.Map [^TargetInstanceAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstanceAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetInstanceAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstanceAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetInstanceAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetInstanceAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetInstanceAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstanceAggregatedList$Builder [^TargetInstanceAggregatedList this]
    (-> this (.toBuilder))))

