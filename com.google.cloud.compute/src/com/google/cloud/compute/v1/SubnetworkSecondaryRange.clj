(ns com.google.cloud.compute.v1.SubnetworkSecondaryRange
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkSecondaryRange]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworkSecondaryRange`

  returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^com.google.cloud.compute.v1.SubnetworkSecondaryRange prototype]
    (SubnetworkSecondaryRange/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder []
    (SubnetworkSecondaryRange/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange []
    (SubnetworkSecondaryRange/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworkSecondaryRange this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkSecondaryRange this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworkSecondaryRange this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-ip-cidr-range
  "The range of IP addresses belonging to this subnetwork secondary range. Provide this property
   when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and
   secondary IP ranges within a network. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkSecondaryRange this]
    (-> this (.getIpCidrRange))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworkSecondaryRange this]
    (-> this (.getApiMessageRequestBody))))

(defn get-range-name
  "The name associated with this subnetwork secondary range, used when adding an alias IP range to
   a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be
   unique within the subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkSecondaryRange this]
    (-> this (.getRangeName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworkSecondaryRange this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworkSecondaryRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^SubnetworkSecondaryRange this]
    (-> this (.toBuilder))))

