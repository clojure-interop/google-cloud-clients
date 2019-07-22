(ns com.google.cloud.compute.v1.TestFailure
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestFailure]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TestFailure`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^com.google.cloud.compute.v1.TestFailure prototype]
    (TestFailure/newBuilder prototype))
  (^com.google.cloud.compute.v1.TestFailure$Builder []
    (TestFailure/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TestFailure`"
  (^com.google.cloud.compute.v1.TestFailure []
    (TestFailure/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestFailure this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TestFailure this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure this]
    (-> this (.getPath))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TestFailure this]
    (-> this (.getApiMessageRequestBody))))

(defn get-expected-service
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure this]
    (-> this (.getExpectedService))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TestFailure this]
    (-> this (.hashCode))))

(defn get-host
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure this]
    (-> this (.getHost))))

(defn get-actual-service
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure this]
    (-> this (.getActualService))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TestFailure this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure this]
    (-> this (.toBuilder))))

