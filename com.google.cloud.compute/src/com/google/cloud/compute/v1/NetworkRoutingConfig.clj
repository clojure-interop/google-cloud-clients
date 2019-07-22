(ns com.google.cloud.compute.v1.NetworkRoutingConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkRoutingConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkRoutingConfig`

  returns: `com.google.cloud.compute.v1.NetworkRoutingConfig$Builder`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder [^com.google.cloud.compute.v1.NetworkRoutingConfig prototype]
    (NetworkRoutingConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder []
    (NetworkRoutingConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkRoutingConfig`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig []
    (NetworkRoutingConfig/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkRoutingConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkRoutingConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkRoutingConfig this]
    (-> this (.getFieldMask))))

(defn get-routing-mode
  "The network-wide routing mode to use. If set to REGIONAL, this network's cloud routers will
   only advertise routes with subnets of this network in the same region as the router. If set to
   GLOBAL, this network's cloud routers will advertise routes with all subnets of this network,
   across regions.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkRoutingConfig this]
    (-> this (.getRoutingMode))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkRoutingConfig$Builder`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder [^NetworkRoutingConfig this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkRoutingConfig this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkRoutingConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkRoutingConfig this]
    (-> this (.hashCode))))

