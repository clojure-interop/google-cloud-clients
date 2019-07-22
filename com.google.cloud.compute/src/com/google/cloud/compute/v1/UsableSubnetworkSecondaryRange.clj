(ns com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsableSubnetworkSecondaryRange]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange`

  returns: `com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange$Builder [^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange prototype]
    (UsableSubnetworkSecondaryRange/newBuilder prototype))
  (^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange$Builder []
    (UsableSubnetworkSecondaryRange/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange`"
  (^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange []
    (UsableSubnetworkSecondaryRange/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UsableSubnetworkSecondaryRange this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworkSecondaryRange this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UsableSubnetworkSecondaryRange this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-ip-cidr-range
  "The range of IP addresses belonging to this subnetwork secondary range.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworkSecondaryRange this]
    (-> this (.getIpCidrRange))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UsableSubnetworkSecondaryRange this]
    (-> this (.getApiMessageRequestBody))))

(defn get-range-name
  "The name associated with this subnetwork secondary range, used when adding an alias IP range to
   a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be
   unique within the subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworkSecondaryRange this]
    (-> this (.getRangeName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UsableSubnetworkSecondaryRange this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UsableSubnetworkSecondaryRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange$Builder [^UsableSubnetworkSecondaryRange this]
    (-> this (.toBuilder))))

