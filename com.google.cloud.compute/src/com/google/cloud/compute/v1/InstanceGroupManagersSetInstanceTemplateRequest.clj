(ns com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersSetInstanceTemplateRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest prototype]
    (InstanceGroupManagersSetInstanceTemplateRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder []
    (InstanceGroupManagersSetInstanceTemplateRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest []
    (InstanceGroupManagersSetInstanceTemplateRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersSetInstanceTemplateRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.getFieldMask))))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.getInstanceTemplate))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersSetInstanceTemplateRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersSetInstanceTemplateRequest this]
    (-> this (.hashCode))))

