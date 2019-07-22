(ns com.google.cloud.compute.v1.BackendServiceList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceList`

  returns: `com.google.cloud.compute.v1.BackendServiceList$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceList$Builder [^com.google.cloud.compute.v1.BackendServiceList prototype]
    (BackendServiceList/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceList$Builder []
    (BackendServiceList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceList`"
  (^com.google.cloud.compute.v1.BackendServiceList []
    (BackendServiceList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^BackendServiceList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#backendServiceList for lists of backend
   services.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of BackendService resources.

  returns: `java.util.List<com.google.cloud.compute.v1.BackendService>`"
  (^java.util.List [^BackendServiceList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceList$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceList$Builder [^BackendServiceList this]
    (-> this (.toBuilder))))

