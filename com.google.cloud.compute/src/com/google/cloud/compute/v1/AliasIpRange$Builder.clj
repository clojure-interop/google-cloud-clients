(ns com.google.cloud.compute.v1.AliasIpRange$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AliasIpRange$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AliasIpRange`

  returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^AliasIpRange$Builder this ^com.google.cloud.compute.v1.AliasIpRange other]
    (-> this (.mergeFrom other))))

(defn get-ip-cidr-range
  "The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   specified subnetwork and cannot contain IP addresses reserved by system or used by other
   network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g.
   /24) or a CIDR format string (e.g. 10.1.2.0/24).

  returns: `java.lang.String`"
  (^java.lang.String [^AliasIpRange$Builder this]
    (-> this (.getIpCidrRange))))

(defn set-ip-cidr-range
  "The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   specified subnetwork and cannot contain IP addresses reserved by system or used by other
   network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g.
   /24) or a CIDR format string (e.g. 10.1.2.0/24).

  ip-cidr-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^AliasIpRange$Builder this ^java.lang.String ip-cidr-range]
    (-> this (.setIpCidrRange ip-cidr-range))))

(defn get-subnetwork-range-name
  "Optional subnetwork secondary range name specifying the secondary range from which to
   allocate the IP CIDR range for this alias IP range. If left unspecified, the primary range of
   the subnetwork will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^AliasIpRange$Builder this]
    (-> this (.getSubnetworkRangeName))))

(defn set-subnetwork-range-name
  "Optional subnetwork secondary range name specifying the secondary range from which to
   allocate the IP CIDR range for this alias IP range. If left unspecified, the primary range of
   the subnetwork will be used.

  subnetwork-range-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^AliasIpRange$Builder this ^java.lang.String subnetwork-range-name]
    (-> this (.setSubnetworkRangeName subnetwork-range-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.AliasIpRange`"
  (^com.google.cloud.compute.v1.AliasIpRange [^AliasIpRange$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AliasIpRange$Builder`"
  (^com.google.cloud.compute.v1.AliasIpRange$Builder [^AliasIpRange$Builder this]
    (-> this (.clone))))

