(ns com.google.cloud.compute.v1.RouteList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouteList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouteList`

  returns: `com.google.cloud.compute.v1.RouteList$Builder`"
  (^com.google.cloud.compute.v1.RouteList$Builder [^com.google.cloud.compute.v1.RouteList prototype]
    (RouteList/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouteList$Builder []
    (RouteList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouteList`"
  (^com.google.cloud.compute.v1.RouteList []
    (RouteList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^RouteList this]
    (-> this (.getWarning))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouteList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouteList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouteList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouteList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^RouteList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^RouteList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouteList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouteList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouteList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of Route resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouteList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouteList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouteList$Builder`"
  (^com.google.cloud.compute.v1.RouteList$Builder [^RouteList this]
    (-> this (.toBuilder))))

