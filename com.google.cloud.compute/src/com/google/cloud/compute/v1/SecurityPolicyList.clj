(ns com.google.cloud.compute.v1.SecurityPolicyList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SecurityPolicyList`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^com.google.cloud.compute.v1.SecurityPolicyList prototype]
    (SecurityPolicyList/newBuilder prototype))
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder []
    (SecurityPolicyList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SecurityPolicyList`"
  (^com.google.cloud.compute.v1.SecurityPolicyList []
    (SecurityPolicyList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SecurityPolicyList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#securityPolicyList for listsof securityPolicies

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SecurityPolicyList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SecurityPolicyList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SecurityPolicyList this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of SecurityPolicy resources.

  returns: `java.util.List<com.google.cloud.compute.v1.SecurityPolicy>`"
  (^java.util.List [^SecurityPolicyList this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SecurityPolicyList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList this]
    (-> this (.toBuilder))))

