(ns com.google.cloud.compute.v1.NamedPort
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NamedPort]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^com.google.cloud.compute.v1.NamedPort prototype]
    (NamedPort/newBuilder prototype))
  (^com.google.cloud.compute.v1.NamedPort$Builder []
    (NamedPort/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NamedPort`"
  (^com.google.cloud.compute.v1.NamedPort []
    (NamedPort/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NamedPort this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NamedPort this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NamedPort this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NamedPort this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NamedPort this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "The port number, which can be a value between 1 and 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NamedPort this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NamedPort this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NamedPort this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^NamedPort this]
    (-> this (.toBuilder))))

