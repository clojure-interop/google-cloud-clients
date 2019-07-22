(ns com.google.cloud.compute.v1.NodeTypeList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTypeList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeTypeList`

  returns: `com.google.cloud.compute.v1.NodeTypeList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypeList$Builder [^com.google.cloud.compute.v1.NodeTypeList prototype]
    (NodeTypeList/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeTypeList$Builder []
    (NodeTypeList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeTypeList`"
  (^com.google.cloud.compute.v1.NodeTypeList []
    (NodeTypeList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTypeList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource.Always compute#nodeTypeList for lists of node types.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTypeList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeTypeList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTypeList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeTypeList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTypeList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTypeList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeTypeList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTypeList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeTypeList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of NodeType resources.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeType>`"
  (^java.util.List [^NodeTypeList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeTypeList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeTypeList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypeList$Builder [^NodeTypeList this]
    (-> this (.toBuilder))))

