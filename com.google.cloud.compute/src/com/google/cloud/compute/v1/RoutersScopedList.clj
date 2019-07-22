(ns com.google.cloud.compute.v1.RoutersScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RoutersScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RoutersScopedList`

  returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^com.google.cloud.compute.v1.RoutersScopedList prototype]
    (RoutersScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder []
    (RoutersScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RoutersScopedList`"
  (^com.google.cloud.compute.v1.RoutersScopedList []
    (RoutersScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of routers when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^RoutersScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RoutersScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutersScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RoutersScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-routers-list
  "A list of routers contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Router>`"
  (^java.util.List [^RoutersScopedList this]
    (-> this (.getRoutersList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RoutersScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RoutersScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RoutersScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList this]
    (-> this (.toBuilder))))

