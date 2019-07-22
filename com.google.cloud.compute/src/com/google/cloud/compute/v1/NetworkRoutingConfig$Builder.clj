(ns com.google.cloud.compute.v1.NetworkRoutingConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkRoutingConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkRoutingConfig`

  returns: `com.google.cloud.compute.v1.NetworkRoutingConfig$Builder`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder [^NetworkRoutingConfig$Builder this ^com.google.cloud.compute.v1.NetworkRoutingConfig other]
    (-> this (.mergeFrom other))))

(defn get-routing-mode
  "The network-wide routing mode to use. If set to REGIONAL, this network's cloud routers will
   only advertise routes with subnets of this network in the same region as the router. If set
   to GLOBAL, this network's cloud routers will advertise routes with all subnets of this
   network, across regions.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkRoutingConfig$Builder this]
    (-> this (.getRoutingMode))))

(defn set-routing-mode
  "The network-wide routing mode to use. If set to REGIONAL, this network's cloud routers will
   only advertise routes with subnets of this network in the same region as the router. If set
   to GLOBAL, this network's cloud routers will advertise routes with all subnets of this
   network, across regions.

  routing-mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkRoutingConfig$Builder`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder [^NetworkRoutingConfig$Builder this ^java.lang.String routing-mode]
    (-> this (.setRoutingMode routing-mode))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkRoutingConfig`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig [^NetworkRoutingConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkRoutingConfig$Builder`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig$Builder [^NetworkRoutingConfig$Builder this]
    (-> this (.clone))))

