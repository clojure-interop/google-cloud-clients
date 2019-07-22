(ns com.google.cloud.compute.v1.HttpHealthCheckList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheckList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HttpHealthCheckList`

  returns: `com.google.cloud.compute.v1.HttpHealthCheckList$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheckList$Builder [^com.google.cloud.compute.v1.HttpHealthCheckList prototype]
    (HttpHealthCheckList/newBuilder prototype))
  (^com.google.cloud.compute.v1.HttpHealthCheckList$Builder []
    (HttpHealthCheckList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HttpHealthCheckList`"
  (^com.google.cloud.compute.v1.HttpHealthCheckList []
    (HttpHealthCheckList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^HttpHealthCheckList this]
    (-> this (.getWarning))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheckList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HttpHealthCheckList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheckList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HttpHealthCheckList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheckList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheckList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HttpHealthCheckList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheckList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HttpHealthCheckList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of HttpHealthCheck resources.

  returns: `java.util.List<com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^java.util.List [^HttpHealthCheckList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HttpHealthCheckList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HttpHealthCheckList$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheckList$Builder [^HttpHealthCheckList this]
    (-> this (.toBuilder))))

