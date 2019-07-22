(ns com.google.cloud.compute.v1.UsableSubnetwork
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsableSubnetwork]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UsableSubnetwork`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^com.google.cloud.compute.v1.UsableSubnetwork prototype]
    (UsableSubnetwork/newBuilder prototype))
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder []
    (UsableSubnetwork/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UsableSubnetwork`"
  (^com.google.cloud.compute.v1.UsableSubnetwork []
    (UsableSubnetwork/getDefaultInstance )))

(defn get-subnetwork
  "Subnetwork URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork this]
    (-> this (.getSubnetwork))))

(defn get-secondary-ip-ranges-list
  "Secondary IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange>`"
  (^java.util.List [^UsableSubnetwork this]
    (-> this (.getSecondaryIpRangesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UsableSubnetwork this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UsableSubnetwork this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork this]
    (-> this (.getIpCidrRange))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UsableSubnetwork this]
    (-> this (.getApiMessageRequestBody))))

(defn get-network
  "Network URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UsableSubnetwork this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UsableSubnetwork this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork this]
    (-> this (.toBuilder))))

