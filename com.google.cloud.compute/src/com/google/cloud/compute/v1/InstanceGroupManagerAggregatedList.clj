(ns com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList prototype]
    (InstanceGroupManagerAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList$Builder []
    (InstanceGroupManagerAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList []
    (InstanceGroupManagerAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupManagerAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceGroupManagerAggregatedList for
   an aggregated list of managed instance groups.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of InstanceGroupManagersScopedList resources. The key for the map is: [Output Only] The
   name of the scope that contains this set of managed instance groups.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.InstanceGroupManagersScopedList>`"
  (^java.util.Map [^InstanceGroupManagerAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList$Builder [^InstanceGroupManagerAggregatedList this]
    (-> this (.toBuilder))))

