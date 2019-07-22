(ns com.google.cloud.compute.deprecated.NetworkConfiguration
  "Base class for Google Compute Engine network configuration. Use StandardNetworkConfiguration to create a standard network with associated address range. Use
  SubnetNetworkConfiguration to create a network that supports subnetworks, up to one per
  region, each with its own address range."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkConfiguration]))

(defn get-type
  "Returns the network's type. This method returns NetworkConfiguration.Type.STANDARD for a standard networks
   with no subnetworks. This method returns NetworkConfiguration.Type.SUBNET for a network that supports the
   creation of subnetworks (either automatic or manual).

  returns: `com.google.cloud.compute.deprecated.NetworkConfiguration$Type`"
  (^com.google.cloud.compute.deprecated.NetworkConfiguration$Type [^NetworkConfiguration this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkConfiguration this]
    (-> this (.toString))))

