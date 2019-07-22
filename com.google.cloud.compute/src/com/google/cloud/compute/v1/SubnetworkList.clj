(ns com.google.cloud.compute.v1.SubnetworkList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworkList`

  returns: `com.google.cloud.compute.v1.SubnetworkList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkList$Builder [^com.google.cloud.compute.v1.SubnetworkList prototype]
    (SubnetworkList/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworkList$Builder []
    (SubnetworkList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworkList`"
  (^com.google.cloud.compute.v1.SubnetworkList []
    (SubnetworkList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SubnetworkList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#subnetworkList for lists of subnetworks.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworkList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworkList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworkList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworkList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of Subnetwork resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Subnetwork>`"
  (^java.util.List [^SubnetworkList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworkList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworkList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkList$Builder [^SubnetworkList this]
    (-> this (.toBuilder))))

