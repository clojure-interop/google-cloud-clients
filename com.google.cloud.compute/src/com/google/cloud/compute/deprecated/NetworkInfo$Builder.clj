(ns com.google.cloud.compute.deprecated.NetworkInfo$Builder
  "A builder for NetworkInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInfo$Builder]))

(defn ->builder
  "Constructor."
  (^NetworkInfo$Builder []
    (new NetworkInfo$Builder )))

(defn set-network-id
  "Sets the identity of the network.

  network-id - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.NetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInfo$Builder [^NetworkInfo$Builder this ^com.google.cloud.compute.deprecated.NetworkId network-id]
    (-> this (.setNetworkId network-id))))

(defn set-description
  "Sets an optional textual description of the network.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInfo$Builder [^NetworkInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-configuration
  "Sets the network configuration. Use StandardNetworkConfiguration to create a standard
   network with associated IPv4 range. Use SubnetNetworkConfiguration to create a
   network that could be divided into subnetworks, up to one per region, each with its own
   address range.

  configuration - `com.google.cloud.compute.deprecated.NetworkConfiguration`

  returns: `com.google.cloud.compute.deprecated.NetworkInfo$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInfo$Builder [^NetworkInfo$Builder this ^com.google.cloud.compute.deprecated.NetworkConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Creates a NetworkInfo object.

  returns: `com.google.cloud.compute.deprecated.NetworkInfo`"
  (^com.google.cloud.compute.deprecated.NetworkInfo [^NetworkInfo$Builder this]
    (-> this (.build))))

