(ns com.google.cloud.compute.deprecated.NetworkInterface$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInterface$Builder]))

(defn set-network
  "Sets the identity of the network this interface applies to.

  network - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$Builder [^NetworkInterface$Builder this ^com.google.cloud.compute.deprecated.NetworkId network]
    (-> this (.setNetwork network))))

(defn set-subnetwork
  "Sets the identity of the subnetwork this interface applies to. Setting the subnetwork is not
   necessary when the network is in \"automatic subnet mode\".

  subnetwork - `com.google.cloud.compute.deprecated.SubnetworkId`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$Builder [^NetworkInterface$Builder this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork]
    (-> this (.setSubnetwork subnetwork))))

(defn set-access-configurations
  "Sets a list of access configurations for the network interface. Access configurations can be
   used to assign either a static or an ephemeral external IP address to Google Compute Engine
   instances. At the moment, network interfaces only support one access configuration.

  access-configurations - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$Builder [^NetworkInterface$Builder this ^java.util.List access-configurations]
    (-> this (.setAccessConfigurations access-configurations))))

(defn build
  "Creates a NetworkInterface object.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface`"
  (^com.google.cloud.compute.deprecated.NetworkInterface [^NetworkInterface$Builder this]
    (-> this (.build))))

