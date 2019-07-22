(ns com.google.cloud.compute.v1.XpnResourceId
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 XpnResourceId]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.XpnResourceId`

  returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^com.google.cloud.compute.v1.XpnResourceId prototype]
    (XpnResourceId/newBuilder prototype))
  (^com.google.cloud.compute.v1.XpnResourceId$Builder []
    (XpnResourceId/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId []
    (XpnResourceId/getDefaultInstance )))

(defn get-type
  "The type of the service resource.

  returns: `java.lang.String`"
  (^java.lang.String [^XpnResourceId this]
    (-> this (.getType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^XpnResourceId this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^XpnResourceId this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^XpnResourceId this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-id
  "The ID of the service resource. In the case of projects, this field supports project id (e.g.,
   my-project-123) and project number (e.g. 12345678).

  returns: `java.lang.String`"
  (^java.lang.String [^XpnResourceId this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^XpnResourceId this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^XpnResourceId this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^XpnResourceId this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^XpnResourceId this]
    (-> this (.toBuilder))))

