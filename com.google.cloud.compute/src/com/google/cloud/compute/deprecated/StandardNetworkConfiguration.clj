(ns com.google.cloud.compute.deprecated.StandardNetworkConfiguration
  "A Google Compute Engine standard network configuration. This class allows users to create a
  network with its own address range. A network created with a StandardNetworkConfiguration
  does not support the creation of subnetworks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StandardNetworkConfiguration]))

(defn *of
  "Returns a StandardNetworkConfiguration object given the range of internal addresses
   that are legal on this network. ipRange must be a CIDR specification, for example:
   192.168.0.0/16.

  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.StandardNetworkConfiguration`"
  (^com.google.cloud.compute.deprecated.StandardNetworkConfiguration [^java.lang.String ip-range]
    (StandardNetworkConfiguration/of ip-range)))

(defn get-ip-range
  "Returns the range of internal IPv4 addresses that are legal on this network. This range is a
   CIDR specification, for example: 192.168.0.0/16.

  returns: `java.lang.String`"
  (^java.lang.String [^StandardNetworkConfiguration this]
    (-> this (.getIpRange))))

(defn get-gateway-address
  "Returns the gateway IPv4 address for this networks. This value is read only and is selected by
   Google Compute Engine, typically as the first usable address in ipRange.

  returns: `java.lang.String`"
  (^java.lang.String [^StandardNetworkConfiguration this]
    (-> this (.getGatewayAddress))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StandardNetworkConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StandardNetworkConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

