(ns com.google.cloud.compute.deprecated.SubnetworkInfo$Builder
  "A builder for SubnetworkInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SubnetworkInfo$Builder]))

(defn ->builder
  "Constructor."
  (^SubnetworkInfo$Builder []
    (new SubnetworkInfo$Builder )))

(defn set-subnetwork-id
  "Sets the identity of the subnework.

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^SubnetworkInfo$Builder this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id]
    (-> this (.setSubnetworkId subnetwork-id))))

(defn set-description
  "Sets an optional textual description of the subnetwork.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^SubnetworkInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-network
  "Sets the identity of the network to which this subnetwork belongs. Only networks that are in
   subnet mode can have subnetworks.

  network - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^SubnetworkInfo$Builder this ^com.google.cloud.compute.deprecated.NetworkId network]
    (-> this (.setNetwork network))))

(defn set-ip-range
  "Sets the range of internal IPv4 addresses that are owned by this subnetwork. This range must
   be a CIDR specification, for example: 192.168.0.0/16. Ranges must be unique and
   non-overlapping within a network.

  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^SubnetworkInfo$Builder this ^java.lang.String ip-range]
    (-> this (.setIpRange ip-range))))

(defn build
  "Creates a SubnetworkInfo object.

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo [^SubnetworkInfo$Builder this]
    (-> this (.build))))

