(ns com.google.cloud.compute.v1.RouterBgp$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterBgp$Builder]))

(defn get-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT
   or CUSTOM.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgp$Builder this]
    (-> this (.getAdvertiseMode))))

(defn set-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT
   or CUSTOM.

  advertise-mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^java.lang.String advertise-mode]
    (-> this (.setAdvertiseMode advertise-mode))))

(defn get-advertised-ip-ranges-list
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   IP ranges will be advertised in addition to any specified groups. Leave this field blank to
   advertise no custom IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange>`"
  (^java.util.List [^RouterBgp$Builder this]
    (-> this (.getAdvertisedIpRangesList))))

(defn add-all-advertised-groups
  "User-specified list of prefix groups to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   groups will be advertised in addition to any specified prefixes. Leave this field blank to
   advertise no custom groups.

  advertised-groups - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^java.util.List advertised-groups]
    (-> this (.addAllAdvertisedGroups advertised-groups))))

(defn add-all-advertised-ip-ranges
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   IP ranges will be advertised in addition to any specified groups. Leave this field blank to
   advertise no custom IP ranges.

  advertised-ip-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^java.util.List advertised-ip-ranges]
    (-> this (.addAllAdvertisedIpRanges advertised-ip-ranges))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterBgp`"
  (^com.google.cloud.compute.v1.RouterBgp [^RouterBgp$Builder this]
    (-> this (.build))))

(defn add-advertised-groups
  "User-specified list of prefix groups to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   groups will be advertised in addition to any specified prefixes. Leave this field blank to
   advertise no custom groups.

  advertised-groups - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^java.lang.String advertised-groups]
    (-> this (.addAdvertisedGroups advertised-groups))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterBgp`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^com.google.cloud.compute.v1.RouterBgp other]
    (-> this (.mergeFrom other))))

(defn set-asn
  "Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   router will have the same local ASN.

  asn - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^java.lang.Integer asn]
    (-> this (.setAsn asn))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this]
    (-> this (.clone))))

(defn get-asn
  "Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   router will have the same local ASN.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgp$Builder this]
    (-> this (.getAsn))))

(defn add-advertised-ip-ranges
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   IP ranges will be advertised in addition to any specified groups. Leave this field blank to
   advertise no custom IP ranges.

  advertised-ip-ranges - `com.google.cloud.compute.v1.RouterAdvertisedIpRange`

  returns: `com.google.cloud.compute.v1.RouterBgp$Builder`"
  (^com.google.cloud.compute.v1.RouterBgp$Builder [^RouterBgp$Builder this ^com.google.cloud.compute.v1.RouterAdvertisedIpRange advertised-ip-ranges]
    (-> this (.addAdvertisedIpRanges advertised-ip-ranges))))

(defn get-advertised-groups-list
  "User-specified list of prefix groups to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   groups will be advertised in addition to any specified prefixes. Leave this field blank to
   advertise no custom groups.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgp$Builder this]
    (-> this (.getAdvertisedGroupsList))))

