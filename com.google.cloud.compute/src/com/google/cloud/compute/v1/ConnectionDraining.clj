(ns com.google.cloud.compute.v1.ConnectionDraining
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ConnectionDraining]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ConnectionDraining`

  returns: `com.google.cloud.compute.v1.ConnectionDraining$Builder`"
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder [^com.google.cloud.compute.v1.ConnectionDraining prototype]
    (ConnectionDraining/newBuilder prototype))
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder []
    (ConnectionDraining/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ConnectionDraining`"
  (^com.google.cloud.compute.v1.ConnectionDraining []
    (ConnectionDraining/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ConnectionDraining this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ConnectionDraining this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ConnectionDraining this]
    (-> this (.getFieldMask))))

(defn get-draining-timeout-sec
  "Time for which instance will be drained (not accept new connections, but still work to finish
   started).

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ConnectionDraining this]
    (-> this (.getDrainingTimeoutSec))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ConnectionDraining$Builder`"
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder [^ConnectionDraining this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConnectionDraining this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConnectionDraining this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ConnectionDraining this]
    (-> this (.hashCode))))

