(ns com.google.cloud.compute.v1.NetworksRemovePeeringRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworksRemovePeeringRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworksRemovePeeringRequest`

  returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder [^com.google.cloud.compute.v1.NetworksRemovePeeringRequest prototype]
    (NetworksRemovePeeringRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder []
    (NetworksRemovePeeringRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest []
    (NetworksRemovePeeringRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworksRemovePeeringRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworksRemovePeeringRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworksRemovePeeringRequest this]
    (-> this (.getFieldMask))))

(defn get-name
  "Name of the peering, which should conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksRemovePeeringRequest this]
    (-> this (.getName))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksRemovePeeringRequest$Builder [^NetworksRemovePeeringRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworksRemovePeeringRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworksRemovePeeringRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworksRemovePeeringRequest this]
    (-> this (.hashCode))))

