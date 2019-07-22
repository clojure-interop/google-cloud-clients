(ns com.google.cloud.compute.v1.HostRule
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HostRule]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HostRule`

  returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^com.google.cloud.compute.v1.HostRule prototype]
    (HostRule/newBuilder prototype))
  (^com.google.cloud.compute.v1.HostRule$Builder []
    (HostRule/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HostRule`"
  (^com.google.cloud.compute.v1.HostRule []
    (HostRule/getDefaultInstance )))

(defn get-hosts-list
  "The list of host patterns to match. They must be valid hostnames, except * will match any
   string of ([a-z0-9-.]*). In that case, * must be the first character and must be
   followed in the pattern by either - or ..

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HostRule this]
    (-> this (.getHostsList))))

(defn get-path-matcher
  "The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches
   the URL's host portion.

  returns: `java.lang.String`"
  (^java.lang.String [^HostRule this]
    (-> this (.getPathMatcher))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HostRule this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HostRule this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HostRule this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HostRule this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HostRule this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HostRule this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HostRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HostRule$Builder`"
  (^com.google.cloud.compute.v1.HostRule$Builder [^HostRule this]
    (-> this (.toBuilder))))

