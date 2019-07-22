(ns com.google.cloud.compute.v1.FirewallLogConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FirewallLogConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.FirewallLogConfig`

  returns: `com.google.cloud.compute.v1.FirewallLogConfig$Builder`"
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder [^com.google.cloud.compute.v1.FirewallLogConfig prototype]
    (FirewallLogConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder []
    (FirewallLogConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.FirewallLogConfig`"
  (^com.google.cloud.compute.v1.FirewallLogConfig []
    (FirewallLogConfig/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^FirewallLogConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^FirewallLogConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FirewallLogConfig this]
    (-> this (.getFieldMask))))

(defn get-enable?
  "This field denotes whether to enable logging for a particular firewall rule.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^FirewallLogConfig this]
    (-> this (.getEnable))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.FirewallLogConfig$Builder`"
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder [^FirewallLogConfig this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FirewallLogConfig this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FirewallLogConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FirewallLogConfig this]
    (-> this (.hashCode))))

