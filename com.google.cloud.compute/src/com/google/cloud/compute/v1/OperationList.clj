(ns com.google.cloud.compute.v1.OperationList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 OperationList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.OperationList`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^com.google.cloud.compute.v1.OperationList prototype]
    (OperationList/newBuilder prototype))
  (^com.google.cloud.compute.v1.OperationList$Builder []
    (OperationList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.OperationList`"
  (^com.google.cloud.compute.v1.OperationList []
    (OperationList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^OperationList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#operations for Operations resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OperationList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OperationList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^OperationList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^OperationList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OperationList this]
    (-> this (.hashCode))))

(defn get-items-list
  "[Output Only] A list of Operation resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Operation>`"
  (^java.util.List [^OperationList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OperationList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList this]
    (-> this (.toBuilder))))

