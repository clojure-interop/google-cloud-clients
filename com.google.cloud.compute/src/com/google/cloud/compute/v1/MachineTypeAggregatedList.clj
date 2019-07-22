(ns com.google.cloud.compute.v1.MachineTypeAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypeAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.MachineTypeAggregatedList`

  returns: `com.google.cloud.compute.v1.MachineTypeAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypeAggregatedList$Builder [^com.google.cloud.compute.v1.MachineTypeAggregatedList prototype]
    (MachineTypeAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.MachineTypeAggregatedList$Builder []
    (MachineTypeAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.MachineTypeAggregatedList`"
  (^com.google.cloud.compute.v1.MachineTypeAggregatedList []
    (MachineTypeAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^MachineTypeAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#machineTypeAggregatedList for aggregated lists
   of machine types.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MachineTypeAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^MachineTypeAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of MachineTypesScopedList resources. The key for the map is: [Output Only] Name of the
   scope containing this set of machine types.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.MachineTypesScopedList>`"
  (^java.util.Map [^MachineTypeAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^MachineTypeAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MachineTypeAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MachineTypeAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.MachineTypeAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypeAggregatedList$Builder [^MachineTypeAggregatedList this]
    (-> this (.toBuilder))))

