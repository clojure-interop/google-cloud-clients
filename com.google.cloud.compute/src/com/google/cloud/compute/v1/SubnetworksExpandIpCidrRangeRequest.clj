(ns com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksExpandIpCidrRangeRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest`

  returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder [^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest prototype]
    (SubnetworksExpandIpCidrRangeRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder []
    (SubnetworksExpandIpCidrRangeRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest []
    (SubnetworksExpandIpCidrRangeRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworksExpandIpCidrRangeRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.getFieldMask))))

(defn get-ip-cidr-range
  "The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   This range should be disjoint from other subnetworks within this network. This range can only
   be larger than (i.e. a superset of) the range previously defined before the update.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.getIpCidrRange))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworksExpandIpCidrRangeRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworksExpandIpCidrRangeRequest this]
    (-> this (.hashCode))))

