(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersSetTemplateRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest prototype]
    (RegionInstanceGroupManagersSetTemplateRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder []
    (RegionInstanceGroupManagersSetTemplateRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest []
    (RegionInstanceGroupManagersSetTemplateRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersSetTemplateRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.getFieldMask))))

(defn get-instance-template
  "URL of the InstanceTemplate resource from which all new instances will be created.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.getInstanceTemplate))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersSetTemplateRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersSetTemplateRequest this]
    (-> this (.hashCode))))

