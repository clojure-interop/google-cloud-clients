(ns com.google.cloud.compute.deprecated.SubnetNetworkConfiguration
  "A Google Compute Engine configuration for networks that support subnetworks, up to one per
  region, each with its own address range. Subnetworks can be either automatically or manually
  created, depending on the value of autoCreateSubnetworks()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SubnetNetworkConfiguration]))

(defn *of
  "Returns a SubnetNetworkConfiguration object. The autoCreateSubnetworks
   parameter sets whether subnetworks should be automatically created. When set to true,
   the network is created in \"auto subnet mode\". When set to false, the network is in
   \"custom subnet mode\". In \"auto subnet mode\", a subnetwork per region is automatically created.
   In \"custom subnet mode\", a custom topology of subnetworks can be created by the user.

  auto-create-subnetworks - `boolean`

  returns: `com.google.cloud.compute.deprecated.SubnetNetworkConfiguration`"
  (^com.google.cloud.compute.deprecated.SubnetNetworkConfiguration [^Boolean auto-create-subnetworks]
    (SubnetNetworkConfiguration/of auto-create-subnetworks)))

(defn auto-create-subnetworks
  "Returns whether the subnetworks should be automatically created. When set to true, the
   network is created in \"auto subnet mode\". When set to false, the network is in \"custom
   subnet mode\". In \"auto subnet mode\", a subnetwork per region is automatically created. In
   \"custom subnet mode\", a custom topology of subnetworks can be created by the user.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SubnetNetworkConfiguration this]
    (-> this (.autoCreateSubnetworks))))

(defn get-subnetworks
  "Returns the identities of all networks in this network.

  returns: `java.util.List<com.google.cloud.compute.deprecated.SubnetworkId>`"
  (^java.util.List [^SubnetNetworkConfiguration this]
    (-> this (.getSubnetworks))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetNetworkConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetNetworkConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

