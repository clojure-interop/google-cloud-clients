(ns com.google.cloud.compute.v1.UrlMapValidationResult
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapValidationResult]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMapValidationResult`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^com.google.cloud.compute.v1.UrlMapValidationResult prototype]
    (UrlMapValidationResult/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder []
    (UrlMapValidationResult/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult []
    (UrlMapValidationResult/getDefaultInstance )))

(defn get-test-failures-list
  "returns: `java.util.List<com.google.cloud.compute.v1.TestFailure>`"
  (^java.util.List [^UrlMapValidationResult this]
    (-> this (.getTestFailuresList))))

(defn get-load-errors-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapValidationResult this]
    (-> this (.getLoadErrorsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapValidationResult this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapValidationResult this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMapValidationResult this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-test-passed?
  "If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's
   indicate the reason of failure.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^UrlMapValidationResult this]
    (-> this (.getTestPassed))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMapValidationResult this]
    (-> this (.getApiMessageRequestBody))))

(defn get-load-succeeded?
  "Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   reasons.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^UrlMapValidationResult this]
    (-> this (.getLoadSucceeded))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMapValidationResult this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMapValidationResult this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult this]
    (-> this (.toBuilder))))

