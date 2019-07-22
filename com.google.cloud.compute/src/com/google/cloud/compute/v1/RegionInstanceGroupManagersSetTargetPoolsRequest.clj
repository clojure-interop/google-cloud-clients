(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersSetTargetPoolsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest prototype]
    (RegionInstanceGroupManagersSetTargetPoolsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder []
    (RegionInstanceGroupManagersSetTargetPoolsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest []
    (RegionInstanceGroupManagersSetTargetPoolsRequest/getDefaultInstance )))

(defn get-fingerprint
  "Fingerprint of the target pools information, which is a hash of the contents. This field is
   used for optimistic locking when you update the target pool entries. This field is optional.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersSetTargetPoolsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.hashCode))))

(defn get-target-pools-list
  "The URL of all TargetPool resources to which instances in the instanceGroup field are added.
   The target pools automatically apply to all of the instances in the managed instance group.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getTargetPoolsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersSetTargetPoolsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.toBuilder))))

