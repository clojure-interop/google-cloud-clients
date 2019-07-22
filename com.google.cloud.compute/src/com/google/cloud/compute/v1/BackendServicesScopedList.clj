(ns com.google.cloud.compute.v1.BackendServicesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServicesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServicesScopedList`

  returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^com.google.cloud.compute.v1.BackendServicesScopedList prototype]
    (BackendServicesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder []
    (BackendServicesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServicesScopedList`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList []
    (BackendServicesScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of backend services when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^BackendServicesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServicesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServicesScopedList this]
    (-> this (.toString))))

(defn get-backend-services-list
  "A list of BackendServices contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.BackendService>`"
  (^java.util.List [^BackendServicesScopedList this]
    (-> this (.getBackendServicesList))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServicesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServicesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServicesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServicesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList this]
    (-> this (.toBuilder))))

