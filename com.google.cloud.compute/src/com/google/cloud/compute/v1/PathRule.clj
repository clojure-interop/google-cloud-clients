(ns com.google.cloud.compute.v1.PathRule
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PathRule]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.PathRule`

  returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^com.google.cloud.compute.v1.PathRule prototype]
    (PathRule/newBuilder prototype))
  (^com.google.cloud.compute.v1.PathRule$Builder []
    (PathRule/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.PathRule`"
  (^com.google.cloud.compute.v1.PathRule []
    (PathRule/getDefaultInstance )))

(defn get-paths-list
  "The list of path patterns to match. Each must start with / and the only place a * is
   allowed is at the end following a /. The string fed to the path matcher does not include any
   text after the first ? or #, and those chars are not allowed here.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PathRule this]
    (-> this (.getPathsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PathRule this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PathRule this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^PathRule this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-service
  "The full or partial URL of the backend service resource to which traffic is directed if this
   rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   Rewrites, etc. take effect prior to sending the request to the backend. However, if service is
   specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction
   specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect,
   service or routeAction.weightedBackendService must be set.

  returns: `java.lang.String`"
  (^java.lang.String [^PathRule this]
    (-> this (.getService))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^PathRule this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PathRule this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PathRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule this]
    (-> this (.toBuilder))))

