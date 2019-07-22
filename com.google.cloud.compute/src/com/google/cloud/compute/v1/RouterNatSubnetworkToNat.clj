(ns com.google.cloud.compute.v1.RouterNatSubnetworkToNat
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNatSubnetworkToNat]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterNatSubnetworkToNat`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^com.google.cloud.compute.v1.RouterNatSubnetworkToNat prototype]
    (RouterNatSubnetworkToNat/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder []
    (RouterNatSubnetworkToNat/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat []
    (RouterNatSubnetworkToNat/getDefaultInstance )))

(defn get-source-ip-ranges-to-nat-list
  "Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
   except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
   [\"PRIMARY_IP_RANGE\", \"LIST_OF_SECONDARY_IP_RANGES\"] Default: [ALL_IP_RANGES]

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatSubnetworkToNat this]
    (-> this (.getSourceIpRangesToNatList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatSubnetworkToNat this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterNatSubnetworkToNat this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterNatSubnetworkToNat this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "URL for the subnetwork resource that will use NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNatSubnetworkToNat this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterNatSubnetworkToNat this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterNatSubnetworkToNat this]
    (-> this (.hashCode))))

(defn get-secondary-ip-range-names-list
  "A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
   populated only if \"LIST_OF_SECONDARY_IP_RANGES\" is one of the values in
   source_ip_ranges_to_nat.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatSubnetworkToNat this]
    (-> this (.getSecondaryIpRangeNamesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterNatSubnetworkToNat this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat this]
    (-> this (.toBuilder))))

