(ns com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsDisableXpnResourceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder [^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest prototype]
    (ProjectsDisableXpnResourceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder []
    (ProjectsDisableXpnResourceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest []
    (ProjectsDisableXpnResourceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ProjectsDisableXpnResourceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ProjectsDisableXpnResourceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ProjectsDisableXpnResourceRequest this]
    (-> this (.getFieldMask))))

(defn get-xpn-resource
  "Service resource (a.k.a service project) ID.

  returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId [^ProjectsDisableXpnResourceRequest this]
    (-> this (.getXpnResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder [^ProjectsDisableXpnResourceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectsDisableXpnResourceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectsDisableXpnResourceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectsDisableXpnResourceRequest this]
    (-> this (.hashCode))))

