(ns com.google.cloud.compute.v1.InterconnectLocationList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectLocationList`

  returns: `com.google.cloud.compute.v1.InterconnectLocationList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationList$Builder [^com.google.cloud.compute.v1.InterconnectLocationList prototype]
    (InterconnectLocationList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectLocationList$Builder []
    (InterconnectLocationList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectLocationList`"
  (^com.google.cloud.compute.v1.InterconnectLocationList []
    (InterconnectLocationList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InterconnectLocationList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#interconnectLocationList for lists of
   interconnect locations.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectLocationList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectLocationList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectLocationList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectLocationList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of InterconnectLocation resources.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectLocation>`"
  (^java.util.List [^InterconnectLocationList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectLocationList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectLocationList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationList$Builder [^InterconnectLocationList this]
    (-> this (.toBuilder))))

