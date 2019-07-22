(ns com.google.cloud.compute.v1.RegionSetPolicyRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionSetPolicyRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.RegionSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionSetPolicyRequest$Builder [^com.google.cloud.compute.v1.RegionSetPolicyRequest prototype]
    (RegionSetPolicyRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionSetPolicyRequest$Builder []
    (RegionSetPolicyRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionSetPolicyRequest`"
  (^com.google.cloud.compute.v1.RegionSetPolicyRequest []
    (RegionSetPolicyRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionSetPolicyRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionSetPolicyRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionSetPolicyRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-etag
  "Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   the etag.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionSetPolicyRequest this]
    (-> this (.getEtag))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionSetPolicyRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-policy
  "REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   (like Projects) might reject them.

  returns: `com.google.cloud.compute.v1.Policy`"
  (^com.google.cloud.compute.v1.Policy [^RegionSetPolicyRequest this]
    (-> this (.getPolicy))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionSetPolicyRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionSetPolicyRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionSetPolicyRequest$Builder [^RegionSetPolicyRequest this]
    (-> this (.toBuilder))))

(defn get-bindings-list
  "Flatten Policy to create a backwacd compatible wire-format. Deprecated. Use 'policy' to specify
   bindings.

  returns: `java.util.List<com.google.cloud.compute.v1.Binding>`"
  (^java.util.List [^RegionSetPolicyRequest this]
    (-> this (.getBindingsList))))

