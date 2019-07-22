(ns com.google.cloud.compute.v1.RouterStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterStatus`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^com.google.cloud.compute.v1.RouterStatus prototype]
    (RouterStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterStatus$Builder []
    (RouterStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterStatus`"
  (^com.google.cloud.compute.v1.RouterStatus []
    (RouterStatus/getDefaultInstance )))

(defn get-bgp-peer-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.RouterStatusBgpPeerStatus>`"
  (^java.util.List [^RouterStatus this]
    (-> this (.getBgpPeerStatusList))))

(defn get-best-routes-list
  "Best routes for this router's network.

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatus this]
    (-> this (.getBestRoutesList))))

(defn get-nat-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.RouterStatusNatStatus>`"
  (^java.util.List [^RouterStatus this]
    (-> this (.getNatStatusList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn get-best-routes-for-router-list
  "Best routes learned by this router.

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatus this]
    (-> this (.getBestRoutesForRouterList))))

(defn get-network
  "URI of the network to which this router belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatus this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterStatus this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus this]
    (-> this (.toBuilder))))

