(ns com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsEnableXpnResourceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder [^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest prototype]
    (ProjectsEnableXpnResourceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder []
    (ProjectsEnableXpnResourceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest []
    (ProjectsEnableXpnResourceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ProjectsEnableXpnResourceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ProjectsEnableXpnResourceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ProjectsEnableXpnResourceRequest this]
    (-> this (.getFieldMask))))

(defn get-xpn-resource
  "Service resource (a.k.a service project) ID.

  returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId [^ProjectsEnableXpnResourceRequest this]
    (-> this (.getXpnResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder [^ProjectsEnableXpnResourceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectsEnableXpnResourceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectsEnableXpnResourceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectsEnableXpnResourceRequest this]
    (-> this (.hashCode))))

