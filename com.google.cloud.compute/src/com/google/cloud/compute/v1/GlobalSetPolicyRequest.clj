(ns com.google.cloud.compute.v1.GlobalSetPolicyRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalSetPolicyRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GlobalSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.GlobalSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest$Builder [^com.google.cloud.compute.v1.GlobalSetPolicyRequest prototype]
    (GlobalSetPolicyRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest$Builder []
    (GlobalSetPolicyRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GlobalSetPolicyRequest`"
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest []
    (GlobalSetPolicyRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GlobalSetPolicyRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GlobalSetPolicyRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GlobalSetPolicyRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-etag
  "Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   the etag.

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalSetPolicyRequest this]
    (-> this (.getEtag))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GlobalSetPolicyRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-policy
  "REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   (like Projects) might reject them.

  returns: `com.google.cloud.compute.v1.Policy`"
  (^com.google.cloud.compute.v1.Policy [^GlobalSetPolicyRequest this]
    (-> this (.getPolicy))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GlobalSetPolicyRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GlobalSetPolicyRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GlobalSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest$Builder [^GlobalSetPolicyRequest this]
    (-> this (.toBuilder))))

(defn get-bindings-list
  "Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   bindings.

  returns: `java.util.List<com.google.cloud.compute.v1.Binding>`"
  (^java.util.List [^GlobalSetPolicyRequest this]
    (-> this (.getBindingsList))))

