(ns com.google.cloud.compute.v1.InstanceGroupAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupAggregatedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupAggregatedList$Builder [^com.google.cloud.compute.v1.InstanceGroupAggregatedList prototype]
    (InstanceGroupAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupAggregatedList$Builder []
    (InstanceGroupAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupAggregatedList`"
  (^com.google.cloud.compute.v1.InstanceGroupAggregatedList []
    (InstanceGroupAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceGroupAggregatedList for
   aggregated lists of instance groups.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of InstanceGroupsScopedList resources. The key for the map is: The name of the scope
   that contains this set of instance groups.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.InstanceGroupsScopedList>`"
  (^java.util.Map [^InstanceGroupAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupAggregatedList$Builder [^InstanceGroupAggregatedList this]
    (-> this (.toBuilder))))

