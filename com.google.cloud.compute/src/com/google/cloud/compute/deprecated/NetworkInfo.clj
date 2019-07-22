(ns com.google.cloud.compute.deprecated.NetworkInfo
  "A Google Compute Engine Network. Every virtual machine instance is created as a member of a
  network. Networks connect instances to each other and to the Internet. You can segment your
  networks, use firewall rules to restrict access to instances, and create static routes to forward
  traffic to specific destinations.

  A network lives in a project and is isolated from other networks in the project. A project can
  have up to five different networks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInfo]))

(defn *new-builder
  "Returns a builder for a NetworkInfo object given the network identity and its
   configuration. Use StandardNetworkConfiguration to create a standard network with
   associated address range. Use SubnetNetworkConfiguration to create a network that
   supports subnetworks, up to one per region, each with its own address range.

  network-id - `com.google.cloud.compute.deprecated.NetworkId`
  configuration - `com.google.cloud.compute.deprecated.NetworkConfiguration`

  returns: `com.google.cloud.compute.deprecated.NetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInfo$Builder [^com.google.cloud.compute.deprecated.NetworkId network-id ^com.google.cloud.compute.deprecated.NetworkConfiguration configuration]
    (NetworkInfo/newBuilder network-id configuration)))

(defn *of
  "Returns a NetworkInfo object given the network identity. Use StandardNetworkConfiguration to create a standard network with associated address range. Use
   SubnetNetworkConfiguration to create a network that supports subnetworks, up to one per
   region, each with its own address range.

  network-id - `com.google.cloud.compute.deprecated.NetworkId`
  configuration - `com.google.cloud.compute.deprecated.NetworkConfiguration`

  returns: `com.google.cloud.compute.deprecated.NetworkInfo`"
  (^com.google.cloud.compute.deprecated.NetworkInfo [^com.google.cloud.compute.deprecated.NetworkId network-id ^com.google.cloud.compute.deprecated.NetworkConfiguration configuration]
    (NetworkInfo/of network-id configuration)))

(defn get-network-id
  "Returns the network identity.

  returns: `com.google.cloud.compute.deprecated.NetworkId`"
  (^com.google.cloud.compute.deprecated.NetworkId [^NetworkInfo this]
    (-> this (.getNetworkId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkInfo this]
    (-> this (.toString))))

(defn get-description
  "Returns a textual description of the network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInfo this]
    (-> this (.getDescription))))

(defn get-configuration
  "Returns the network configuration. Returns a StandardNetworkConfiguration for standard
   networks with associated IPv4 range. Returns SubnetNetworkConfiguration for networks
   that could be divided into subnetworks, up to one per region, each with its own address range.

  returns: `<T extends com.google.cloud.compute.deprecated.NetworkConfiguration> T`"
  ([^NetworkInfo this]
    (-> this (.getConfiguration))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkInfo this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^NetworkInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the current network.

  returns: `com.google.cloud.compute.deprecated.NetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInfo$Builder [^NetworkInfo this]
    (-> this (.toBuilder))))

