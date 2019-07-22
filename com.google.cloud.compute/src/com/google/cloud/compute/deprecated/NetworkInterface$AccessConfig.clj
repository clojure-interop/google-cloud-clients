(ns com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig
  "Access configuration for a Google Compute Engine instance's network interface. Objects of this
  class can be used to assign either a static or an ephemeral external IP address to Google
  Compute Engine instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInterface$AccessConfig]))

(defn *new-builder
  "Returns a builder for an AccessConfig object.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder []
    (NetworkInterface$AccessConfig/newBuilder )))

(defn *of
  "Returns an AccessConfig object given the static external IP address.

  nat-ip - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig [^java.lang.String nat-ip]
    (NetworkInterface$AccessConfig/of nat-ip))
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig []
    (NetworkInterface$AccessConfig/of )))

(defn get-name
  "Returns the name of the access configuration.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface$AccessConfig this]
    (-> this (.getName))))

(defn get-nat-ip
  "Returns an external IP address associated with this instance.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface$AccessConfig this]
    (-> this (.getNatIp))))

(defn get-type
  "Returns the type of network access configuration. The only supported value is NetworkInterface.AccessConfig.Type.ONE_TO_ONE_NAT.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type [^NetworkInterface$AccessConfig this]
    (-> this (.getType))))

(defn to-builder
  "Returns a builder for the current access configuration.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder [^NetworkInterface$AccessConfig this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkInterface$AccessConfig this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkInterface$AccessConfig this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkInterface$AccessConfig this ^java.lang.Object obj]
    (-> this (.equals obj))))

