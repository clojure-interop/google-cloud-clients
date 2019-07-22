(ns com.google.cloud.compute.deprecated.SubnetworkInfo
  "A Google Compute Engine subnetwork. Compute Engine subnetworks allow you to segment your Compute
  Engine network IP space into subnetworks. Subnetworks for a Compute Engine network can be
  automatically allocated, or you can create a custom topology."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SubnetworkInfo]))

(defn *new-builder
  "Returns a builder for a SubnetworkInfo object given the identity of the subnetwork, the
   identity of the network this subnetwork belongs to and the range of IPv4 addresses owned by
   this subnetwork. ipRange must be a CIDR specification, for example: 192.168.0.0/16.

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`
  network - `com.google.cloud.compute.deprecated.NetworkId`
  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id ^com.google.cloud.compute.deprecated.NetworkId network ^java.lang.String ip-range]
    (SubnetworkInfo/newBuilder subnetwork-id network ip-range)))

(defn *of
  "Returns a SubnetworkInfo object given the identity of the subnetwork, the identity of
   the network this subnetwork belongs to and the range of IPv4 addresses owned by this
   subnetwork. ipRange must be a CIDR specification, for example: 192.168.0.0/16.

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`
  network - `com.google.cloud.compute.deprecated.NetworkId`
  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo [^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id ^com.google.cloud.compute.deprecated.NetworkId network ^java.lang.String ip-range]
    (SubnetworkInfo/of subnetwork-id network ip-range)))

(defn get-gateway-address
  "Returns the gateway IPv4 address for this subnetwork, selected by the service.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkInfo this]
    (-> this (.getGatewayAddress))))

(defn get-ip-range
  "Returns the range of internal IPv4 addresses that are owned by this subnetwork. This range is a
   CIDR specification, for example: 192.168.0.0/16. Ranges must be unique and
   non-overlapping within a network.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkInfo this]
    (-> this (.getIpRange))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkInfo this]
    (-> this (.toString))))

(defn get-description
  "Returns a textual description of the subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkInfo this]
    (-> this (.getDescription))))

(defn get-network
  "Returns the identity of the network to which this subnetwork belongs. Only networks that are in
   subnet mode can have subnetworks.

  returns: `com.google.cloud.compute.deprecated.NetworkId`"
  (^com.google.cloud.compute.deprecated.NetworkId [^SubnetworkInfo this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworkInfo this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^SubnetworkInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworkInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-subnetwork-id
  "Returns the subnetwork identity.

  returns: `com.google.cloud.compute.deprecated.SubnetworkId`"
  (^com.google.cloud.compute.deprecated.SubnetworkId [^SubnetworkInfo this]
    (-> this (.getSubnetworkId))))

(defn to-builder
  "Returns a builder for the current subnetwork.

  returns: `com.google.cloud.compute.deprecated.SubnetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SubnetworkInfo$Builder [^SubnetworkInfo this]
    (-> this (.toBuilder))))

