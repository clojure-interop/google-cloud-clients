(ns com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNatSubnetworkToNat$Builder]))

(defn get-source-ip-ranges-to-nat-list
  "Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
   except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
   [\"PRIMARY_IP_RANGE\", \"LIST_OF_SECONDARY_IP_RANGES\"] Default: [ALL_IP_RANGES]

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatSubnetworkToNat$Builder this]
    (-> this (.getSourceIpRangesToNatList))))

(defn set-name
  "URL for the subnetwork resource that will use NAT.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "URL for the subnetwork resource that will use NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNatSubnetworkToNat$Builder this]
    (-> this (.getName))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat [^RouterNatSubnetworkToNat$Builder this]
    (-> this (.build))))

(defn add-source-ip-ranges-to-nat
  "Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
   except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
   [\"PRIMARY_IP_RANGE\", \"LIST_OF_SECONDARY_IP_RANGES\"] Default: [ALL_IP_RANGES]

  source-ip-ranges-to-nat - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^java.lang.String source-ip-ranges-to-nat]
    (-> this (.addSourceIpRangesToNat source-ip-ranges-to-nat))))

(defn add-all-source-ip-ranges-to-nat
  "Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
   except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
   [\"PRIMARY_IP_RANGE\", \"LIST_OF_SECONDARY_IP_RANGES\"] Default: [ALL_IP_RANGES]

  source-ip-ranges-to-nat - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^java.util.List source-ip-ranges-to-nat]
    (-> this (.addAllSourceIpRangesToNat source-ip-ranges-to-nat))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterNatSubnetworkToNat`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^com.google.cloud.compute.v1.RouterNatSubnetworkToNat other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this]
    (-> this (.clone))))

(defn add-secondary-ip-range-names
  "A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
   populated only if \"LIST_OF_SECONDARY_IP_RANGES\" is one of the values in
   source_ip_ranges_to_nat.

  secondary-ip-range-names - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^java.lang.String secondary-ip-range-names]
    (-> this (.addSecondaryIpRangeNames secondary-ip-range-names))))

(defn get-secondary-ip-range-names-list
  "A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
   populated only if \"LIST_OF_SECONDARY_IP_RANGES\" is one of the values in
   source_ip_ranges_to_nat.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatSubnetworkToNat$Builder this]
    (-> this (.getSecondaryIpRangeNamesList))))

(defn add-all-secondary-ip-range-names
  "A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
   populated only if \"LIST_OF_SECONDARY_IP_RANGES\" is one of the values in
   source_ip_ranges_to_nat.

  secondary-ip-range-names - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNatSubnetworkToNat$Builder [^RouterNatSubnetworkToNat$Builder this ^java.util.List secondary-ip-range-names]
    (-> this (.addAllSecondaryIpRangeNames secondary-ip-range-names))))

