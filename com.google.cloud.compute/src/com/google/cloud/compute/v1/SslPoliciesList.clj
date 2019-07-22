(ns com.google.cloud.compute.v1.SslPoliciesList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPoliciesList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SslPoliciesList`

  returns: `com.google.cloud.compute.v1.SslPoliciesList$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesList$Builder [^com.google.cloud.compute.v1.SslPoliciesList prototype]
    (SslPoliciesList/newBuilder prototype))
  (^com.google.cloud.compute.v1.SslPoliciesList$Builder []
    (SslPoliciesList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SslPoliciesList`"
  (^com.google.cloud.compute.v1.SslPoliciesList []
    (SslPoliciesList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SslPoliciesList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#sslPoliciesList for lists of sslPolicies.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPoliciesList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SslPoliciesList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SslPoliciesList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SslPoliciesList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of SslPolicy resources.

  returns: `java.util.List<com.google.cloud.compute.v1.SslPolicy>`"
  (^java.util.List [^SslPoliciesList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SslPoliciesList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SslPoliciesList$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesList$Builder [^SslPoliciesList this]
    (-> this (.toBuilder))))

