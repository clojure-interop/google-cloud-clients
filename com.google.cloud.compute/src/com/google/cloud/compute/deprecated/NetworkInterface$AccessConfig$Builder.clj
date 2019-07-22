(ns com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInterface$AccessConfig$Builder]))

(defn set-name
  "Sets the name of the access configuration.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder [^NetworkInterface$AccessConfig$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-nat-ip
  "Sets an external IP address associated with this instance. Specify an unused static
   external IP address available to the project or leave this field undefined to use an IP
   from a shared ephemeral IP address pool. If you specify a static external IP address, it
   must live in the same region as the zone of the instance.

  nat-ip - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder [^NetworkInterface$AccessConfig$Builder this ^java.lang.String nat-ip]
    (-> this (.setNatIp nat-ip))))

(defn set-type
  "Sets the type of the access configuration. The only supported value is NetworkInterface.AccessConfig.Type.ONE_TO_ONE_NAT.

  type - `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder [^NetworkInterface$AccessConfig$Builder this ^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type type]
    (-> this (.setType type))))

(defn build
  "Creates an AccessConfig object.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig [^NetworkInterface$AccessConfig$Builder this]
    (-> this (.build))))

