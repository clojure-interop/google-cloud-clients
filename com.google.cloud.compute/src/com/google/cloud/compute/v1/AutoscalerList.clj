(ns com.google.cloud.compute.v1.AutoscalerList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalerList`

  returns: `com.google.cloud.compute.v1.AutoscalerList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerList$Builder [^com.google.cloud.compute.v1.AutoscalerList prototype]
    (AutoscalerList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalerList$Builder []
    (AutoscalerList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalerList`"
  (^com.google.cloud.compute.v1.AutoscalerList []
    (AutoscalerList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AutoscalerList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#autoscalerList for lists of autoscalers.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalerList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalerList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalerList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalerList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of Autoscaler resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Autoscaler>`"
  (^java.util.List [^AutoscalerList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalerList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalerList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerList$Builder [^AutoscalerList this]
    (-> this (.toBuilder))))

