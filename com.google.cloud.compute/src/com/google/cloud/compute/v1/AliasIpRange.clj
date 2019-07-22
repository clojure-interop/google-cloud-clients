(ns com.google.cloud.compute.v1.AliasIpRange
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AliasIpRange]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AliasIpRange`

  returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^com.google.cloud.compute.v1.AliasIpRange prototype]
    (AliasIpRange/newBuilder prototype))
  (^com.google.cloud.compute.v1.AliasIpRange$Builder []
    (AliasIpRange/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AliasIpRange`"
  (^com.google.cloud.compute.v1.AliasIpRange []
    (AliasIpRange/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AliasIpRange this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AliasIpRange this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AliasIpRange this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-subnetwork-range-name
  "Optional subnetwork secondary range name specifying the secondary range from which to allocate
   the IP CIDR range for this alias IP range. If left unspecified, the primary range of the
   subnetwork will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^AliasIpRange this]
    (-> this (.getSubnetworkRangeName))))

(defn get-ip-cidr-range
  "The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   specified subnetwork and cannot contain IP addresses reserved by system or used by other
   network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24)
   or a CIDR format string (e.g. 10.1.2.0/24).

  returns: `java.lang.String`"
  (^java.lang.String [^AliasIpRange this]
    (-> this (.getIpCidrRange))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AliasIpRange this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AliasIpRange this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AliasIpRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^AliasIpRange this]
    (-> this (.toBuilder))))

