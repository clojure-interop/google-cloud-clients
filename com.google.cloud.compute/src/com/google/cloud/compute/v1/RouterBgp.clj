(ns com.google.cloud.compute.v1.RouterBgp
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterBgp]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterBgp`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^com.google.cloud.compute.v1.RouterBgp prototype]
    (RouterBgp/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterBgp$Builder []
    (RouterBgp/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterBgp`"
  (^com.google.cloud.compute.v1.RouterBgp []
    (RouterBgp/getDefaultInstance )))

(defn get-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or
   CUSTOM.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgp this]
    (-> this (.getAdvertiseMode))))

(defn get-advertised-ip-ranges-list
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP
   ranges will be advertised in addition to any specified groups. Leave this field blank to
   advertise no custom IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange>`"
  (^java.util.List [^RouterBgp this]
    (-> this (.getAdvertisedIpRangesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgp this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterBgp this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterBgp this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterBgp this]
    (-> this (.getApiMessageRequestBody))))

(defn get-asn
  "Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   router will have the same local ASN.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgp this]
    (-> this (.getAsn))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterBgp this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterBgp this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp this]
    (-> this (.toBuilder))))

(defn get-advertised-groups-list
  "User-specified list of prefix groups to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   groups will be advertised in addition to any specified prefixes. Leave this field blank to
   advertise no custom groups.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgp this]
    (-> this (.getAdvertisedGroupsList))))

