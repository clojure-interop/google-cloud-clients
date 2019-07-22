(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersRecreateRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest prototype]
    (RegionInstanceGroupManagersRecreateRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder []
    (RegionInstanceGroupManagersRecreateRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest []
    (RegionInstanceGroupManagersRecreateRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersRecreateRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersRecreateRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersRecreateRequest this]
    (-> this (.hashCode))))

