(ns com.google.cloud.compute.deprecated.NetworkInterface
  "A network interface for a Google Compute Engine instance. Network interfaces specify how the
  instance is configured to interact with other network services, such as connecting to the
  internet."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInterface]))

(defn *new-builder
  "Returns a builder for a NetworkInterface object given the network's identity.

  network-id - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$Builder [^com.google.cloud.compute.deprecated.NetworkId network-id]
    (NetworkInterface/newBuilder network-id)))

(defn *of
  "Returns a NetworkInterface object given the network's identity.

  network-id - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface`"
  (^com.google.cloud.compute.deprecated.NetworkInterface [^com.google.cloud.compute.deprecated.NetworkId network-id]
    (NetworkInterface/of network-id)))

(defn get-subnetwork
  "Returns the identity of the subnetwork this interface applies to.

  returns: `com.google.cloud.compute.deprecated.SubnetworkId`"
  (^com.google.cloud.compute.deprecated.SubnetworkId [^NetworkInterface this]
    (-> this (.getSubnetwork))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface this]
    (-> this (.toString))))

(defn get-name
  "Returns the name of the network interface, generated by the service. For network devices, these
   are eth0, eth1, etc.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface this]
    (-> this (.getName))))

(defn get-network-ip
  "An optional IPv4 internal network address assigned by the service to the instance for this
   network interface.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface this]
    (-> this (.getNetworkIp))))

(defn get-access-configurations
  "Returns a list of access configurations for the network interface.

  returns: `java.util.List<com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig>`"
  (^java.util.List [^NetworkInterface this]
    (-> this (.getAccessConfigurations))))

(defn get-network
  "Returns the identity of the network this interface applies to.

  returns: `com.google.cloud.compute.deprecated.NetworkId`"
  (^com.google.cloud.compute.deprecated.NetworkId [^NetworkInterface this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkInterface this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkInterface this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the current network interface.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$Builder [^NetworkInterface this]
    (-> this (.toBuilder))))

