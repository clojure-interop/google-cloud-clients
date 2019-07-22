(ns com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersSetTargetPoolsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest prototype]
    (InstanceGroupManagersSetTargetPoolsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder []
    (InstanceGroupManagersSetTargetPoolsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest []
    (InstanceGroupManagersSetTargetPoolsRequest/getDefaultInstance )))

(defn get-fingerprint
  "The fingerprint of the target pools information. Use this optional property to prevent
   conflicts when multiple users change the target pools settings concurrently. Obtain the
   fingerprint with the instanceGroupManagers.get method. Then, include the fingerprint in your
   request to ensure that you do not overwrite changes that were applied from another concurrent
   request.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersSetTargetPoolsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.hashCode))))

(defn get-target-pools-list
  "The list of target pool URLs that instances in this managed instance group belong to. The
   managed instance group applies these target pools to all of the instances in the group.
   Existing instances and new instances in the group all receive these target pool settings.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.getTargetPoolsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersSetTargetPoolsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest this]
    (-> this (.toBuilder))))

